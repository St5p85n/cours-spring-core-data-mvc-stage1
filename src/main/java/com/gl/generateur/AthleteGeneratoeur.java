package com.gl.generateur;

import com.gl.entities.Athlete;
import com.gl.entities.AthleteDTO;
import org.springframework.stereotype.Component;

@Component
public class AthleteGeneratoeur {
    public AthleteDTO toDTO(Athlete athlete) {
        AthleteDTO at = new AthleteDTO();
        at.setNom(athlete.getNom());
        at.setPrenom(at.getPrenom());
        at.setId(athlete.getId());
        return at;
    }
}
