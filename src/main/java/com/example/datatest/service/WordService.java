package com.example.datatest.service;

import com.example.datatest.model.Word;
import com.example.datatest.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {
    @Autowired
    WordRepository wordRepository;

    @Value("${data.word.test}")
    String test;

    public Word saveWord(Word word) {
        return wordRepository.save(word);
    }

    public List<Word> saveWords(List<Word> words) {
        return wordRepository.saveAll(words);
    }

    public List<Word> getWords() {
        System.out.println(test);
        return wordRepository.findAll();
    }

    public Word getWordById(Integer id) {
        return wordRepository.findById(id).orElse(null);
    }

    public Word getWordByName(String name) {
        return wordRepository.findWordByWord(name);
    }

    public Word getWordByMeaning(String meaning) {
        return wordRepository.findWordByMeaning(meaning);
    }

    public String deleteWord(Integer id) {
        wordRepository.deleteById(id);
        return "word" + id + "is removed!!";
    }

    public Word updateWord(Word word) {
        Word existingWord = wordRepository.findById(word.getId()).orElse(null);
        existingWord.setWord(word.getWord());
        existingWord.setMeaning(word.getMeaning());
        existingWord.setType(word.getType());
        existingWord.setExample(word.getExample());
        return wordRepository.save(existingWord);
    }
}
