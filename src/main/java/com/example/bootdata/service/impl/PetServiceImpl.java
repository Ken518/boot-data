package com.example.bootdata.service.impl;
import com.example.bootdata.dao.PetDao;
import com.example.bootdata.dao.PetMapper;
import com.example.bootdata.entity.Pet;
import com.example.bootdata.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * user: ken
 * data: 2021/5/18 16:09
 */
@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetMapper dao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(Pet pet) throws Exception {
        dao.save(pet);
        dao.save(pet);
        return 1;
    }

 /*   @Override
    public int update(Pet pet) {
        return dao.update(pet);
    }

    @Override
    public int deleteById(int id) {
        return dao.deleteById(id);
    }*/

    @Override
    public List<Pet> getAllPet() {
        return dao.getAllPet("");
    }

   /* @Override
    public Pet getPetById(int id) {
        return dao.getPetById(id);
    }

    @Override
    public List<Map<String, Object>> getAllList() {
        return dao.getAllList();
    }

    @Override
    public Map<String, Object> getMapById(int id) {
        return dao.getMapById(id);
    }*/
}
