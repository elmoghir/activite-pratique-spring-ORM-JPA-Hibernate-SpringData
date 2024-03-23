package org.activite;

import org.activite.entities.Patient;
import org.activite.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication {


    @Autowired
    private org.activite.repository.PatientRepository PatientRepository;
    public static void main(String[] Args)
    {
        SpringApplication.run(PatientApp.class, Args);
    }

    @Bean
    public CommandLineRunner start(PatientRepository PatientRepository){
        return  args -> {
            Patient p1 = new Patient();
            p1.setNom("P1");
            p1.setScore(100);
            p1.setDateNaissane(new Date());
            p1.setMalade(true);

            Patient p2 = Patient.builder()
                    .nom("p2")
                    .dateNaissane(new Date())
                    .score(100)
                    .malade(true).build();
            PatientRepository.save(p1);
            PatientRepository.save(p2);
        };
    }
}
