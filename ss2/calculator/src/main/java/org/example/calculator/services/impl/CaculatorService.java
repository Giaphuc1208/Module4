package org.example.calculator.services.impl;


import org.example.calculator.repositories.impl.CaculatorRepository;
import org.example.calculator.services.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {

    @Autowired
    private CaculatorRepository caculatorRepository;

    @Override
    public double calculate(double firstNumber, double secondNumber, String item) {
        return caculatorRepository.caculator(firstNumber, secondNumber, item);
    }
}
