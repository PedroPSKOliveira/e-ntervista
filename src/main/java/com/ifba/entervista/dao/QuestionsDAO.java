package com.ifba.entervista.dao;

import com.ifba.entervista.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsDAO extends JpaRepository<Questions, Long> {

    Questions findQuestionsById(long id);

    List<Questions> findAll();

    void deleteById(Long id);

}
