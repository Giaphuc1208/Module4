package org.example.sandwich.services.impl;


import org.example.sandwich.repositories.ISandwichRepository;
import org.example.sandwich.services.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SandwichService implements ISandwichService {
    @Autowired
    private ISandwichRepository sandwichRepo;

    @Override
    public String[] getAll() {
        return sandwichRepo.getAll();
    }
}