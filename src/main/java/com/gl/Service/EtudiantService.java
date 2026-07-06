package com.gl.Service;

import com.gl.Repository.EtudiantRepository;
import com.gl.entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {


    private EtudiantRepository etudiantRepository;
    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public void addEtudiant(Etudiant etudiant){
        etudiantRepository.save(etudiant);
    }
    public List<Etudiant> getEtudiants(){
       return etudiantRepository.findAll();
    }

    public void deleteEtudiant(Integer id){
        etudiantRepository.deleteById(id);
    }
    public void editEtudiant(Etudiant etudiant){
        etudiantRepository.save(etudiant);
    }

}

