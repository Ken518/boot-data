package com.example.bootdata.service;


import com.example.bootdata.entity.Pet;

import java.util.List;
import java.util.Map;

/**
 * user: ken
 * data: 2021/5/18 16:09
 */
public interface PetService {

    public int save (Pet pet)throws Exception;

    /*public int update(Pet pet);

    public int deleteById(int id);*/

    public List<Pet> getAllPet();

    /*public Pet getPetById(int id);

    public List<Map<String,Object>> getAllList();

    public Map<String,Object> getMapById(int id);*/

}
