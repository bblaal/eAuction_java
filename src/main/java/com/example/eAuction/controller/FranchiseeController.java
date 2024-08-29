package com.example.eAuction.controller;

import com.example.eAuction.model.Franchisee;
import com.example.eAuction.service.FranchiseeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/franchisee/api/v1")
public class FranchiseeController {

    @Autowired
    FranchiseeService franchiseeService;

    @GetMapping("/franchisees/{franchiseeId}")
    private Optional<Franchisee> getFranchiseeById(@PathVariable("franchiseeId") String franchiseeId){
        return franchiseeService.getFranchiseeById(franchiseeId);
    }

    @GetMapping("/franchisees")
    private Iterable<Franchisee> getAllFranchisees(){
        return franchiseeService.getAllFranchisee();
    }

    @PostMapping("/addFranchisee")
    private String saveFranchisee(@RequestBody Franchisee franchisee){

        return franchiseeService.addFranchisee(new Franchisee(

                        franchisee.getFranchiseeId(),
                        franchisee.getFranchiseeName(),
                        franchisee.getBalance(),
                        franchisee.getFranchiseeEmail(),
                        franchisee.getFranchiseeContact(),
                        franchisee.getPassword()
                )
        );
    }
}
