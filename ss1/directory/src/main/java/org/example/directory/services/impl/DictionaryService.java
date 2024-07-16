package org.example.directory.services.impl;


import org.example.directory.repositories.IDictionaryRepository;
import org.example.directory.services.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {

    @Autowired
    private IDictionaryRepository dictionaryRepository;


    @Override
    public String translate(String word) {
        return dictionaryRepository.translate(word);
    }
}
