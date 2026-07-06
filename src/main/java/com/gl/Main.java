package com.gl;

import com.gl.Repository.AthleteRepository;
import com.gl.Service.AthleteService;
import com.gl.Service.EtudiantService;
import com.gl.Service.Tournoisservice;
import com.gl.config.AppConfig;
import com.gl.entities.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //AthleteService athleteService = new AthleteService(new AthleteRepository());
        //athleteService.afficherDateCompetition();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AthleteService athleteService = context.getBean(AthleteService.class);
        athleteService.afficherDateCompetition();
        EtudiantService etudiantService = context.getBean(EtudiantService.class);
        Etudiant e = new Etudiant();
        e.setPrenom("Pape");
        e.setNom("Thiaw");
        etudiantService.addEtudiant(e);
    }
}
