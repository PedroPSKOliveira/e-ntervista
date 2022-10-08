package com.ifba.entervista.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class QuestionModel {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static Integer id;

    @Column(name = "question", nullable = false)
    private String question;

    public QuestionModel(String question) {
        this.question = question;
    }


    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
