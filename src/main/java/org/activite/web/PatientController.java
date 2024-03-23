package org.activite.web;

import org.activite.entities.Patient;
import org.activite.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientController {
    @Autowired
    private PatientRepository PatientRepository;
    @GetMapping("/index")
    public String index()
    {
        return "patient";
    }
}
