package org.example.sandwich.repositories.impl;

import org.example.sandwich.repositories.ISandwichRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SandwichRepository implements ISandwichRepository {


    @Override
    public String[] getAll() {
        return new String[] {"Lettuce", "Tomato", "Mustard", "Sprouts"};
    }
}
