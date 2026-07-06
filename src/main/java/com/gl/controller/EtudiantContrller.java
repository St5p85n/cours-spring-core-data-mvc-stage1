package com.gl.controller;

import com.gl.Service.EtudiantService;
import com.gl.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiant")
public class EtudiantContrller {
    @Autowired
    private EtudiantService etudiantService;
    @GetMapping
    public List<Etudiant> getEtudiant() {
        return etudiantService.getEtudiants();
    }

    @PostMapping
    public void addEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.addEtudiant(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable("id") Integer id) {
        etudiantService.deleteEtudiant(id);
    }
    @PutMapping
    public void updateEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.addEtudiant(etudiant);
    }


}
