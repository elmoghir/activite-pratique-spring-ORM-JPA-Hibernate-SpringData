package org.activite;


import org.activite.entities.Patient;
import org.activite.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PatientApp implements CommandLineRunner {
    @Autowired
    private PatientRepository PatientRepository;
    public static void main(String[] Args)
    {
        SpringApplication.run(PatientApp.class, Args);
    }

    @Override
    public void run(String... args) throws Exception {
       PatientRepository.save(new Patient(null,"Patien A", new Date(), true,3));
        PatientRepository.save(new Patient(null,"Patien b", new Date(), true,3));
        PatientRepository.save(new Patient(null,"Patien c", new Date(), true,3));
        List<Patient> patients = PatientRepository.findAll();
        patients.forEach(p->{
            System.out.println(p.toString());
        });
        Patient patient = PatientRepository.findById(Long.valueOf(2)).get();
        System.out.println("*****************************************************************************");
        System.out.println(patient.getId());
        System.out.println(patient.getNom());
        System.out.println(patient.getDateNaissane());
        System.out.println(patient.getScore());
        System.out.println("*******************************************************************************");
        PatientRepository.delete(patient);

    }
}
