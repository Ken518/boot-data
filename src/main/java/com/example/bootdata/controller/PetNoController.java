package com.example.bootdata.controller;

import com.example.bootdata.entity.Pet;
import com.example.bootdata.entity.R;
import com.example.bootdata.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * user: ken
 * data: 2021/5/18 16:11
 */
@RestController
public class PetNoController {

    @Autowired
    PetService service;


    /*@GetMapping (value = "/pet/{id}",produces = "application/json;charset=utf-8")
    public R getPetById(@PathVariable Integer id){

        Pet pet2 = service.getPetById(id);

        return R.ok(pet2);
    }*/

    @GetMapping (value = "/pets",produces = "application/json;charset=utf-8")
    public R getPets(Pet pet){

        List<Pet> allPet = service.getAllPet();

        return R.ok(allPet);
    }

    @PostMapping("/pet/add")
    public R addPet(@RequestBody Pet pet){

        System.out.println("pet = " + pet);

        try {
            int result = service.save(pet);
            if(result>0){
                return R.ok(pet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return R.error(588,"新增失败");
    }


}
