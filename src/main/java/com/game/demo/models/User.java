package com.game.demo.models;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "UserMy")
@Data
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    @Column(name = "UserID")
    String userId;

    @Column(name = "AttemptID")
    int attemptNo;

    @Column(name = "Multiplication")
    String multiplication;

    @Column(name = "UserAnswer")
    int userAnswer;

    @Column(name = "Result")
    Boolean result;

    User(){

    }

}
