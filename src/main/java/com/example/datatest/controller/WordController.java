package com.example.datatest.controller;

import com.example.datatest.model.Word;
import com.example.datatest.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RestController
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class WordController {

    @Autowired
    WordService wordService;

    @GetMapping(path = "/getWordList")
    public List<Word> findAllProducts() {
        return wordService.getWords();
    }

    @GetMapping(path = "/getWordById/{id}")
    public Word findWordById(@PathVariable("id") Integer id) {
        return wordService.getWordById(id);
    }

    @PostMapping("/addWord")
    public Word addWord(Word word) {
        return wordService.saveWord(word);
    }
}

