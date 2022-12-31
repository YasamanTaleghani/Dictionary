package com.example.datatest.repository;

import com.example.datatest.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Integer> {
    Word findWordByWord(String name);
    Word findWordByMeaning(String meaning);
}
