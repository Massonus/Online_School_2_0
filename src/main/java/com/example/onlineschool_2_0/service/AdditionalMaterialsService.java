package com.example.onlineschool_2_0.service;

import com.example.onlineschool_2_0.entity.AdditionalMaterials;
import com.example.onlineschool_2_0.repositories.AdditionalMaterialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdditionalMaterialsService {

    private AdditionalMaterialsRepo additionalMaterialsRepo;
    @Autowired
    public AdditionalMaterialsService(AdditionalMaterialsRepo additionalMaterialsRepo) {
        this.additionalMaterialsRepo = additionalMaterialsRepo;
    }
    public void saveMaterials(final AdditionalMaterials additionalMaterials) {
        additionalMaterialsRepo.save(additionalMaterials);
    }

    public List<AdditionalMaterials> getMaterials() {
        return additionalMaterialsRepo.findAll();
    }

    public Optional<AdditionalMaterials> getMaterialsId(final long id) {
        return additionalMaterialsRepo.findById(id);
    }

    public void deleteMaterials(final AdditionalMaterials additionalMaterials) {
        additionalMaterialsRepo.delete(additionalMaterials);
    }

}
