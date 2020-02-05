package com.game.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("api/game")
public class GameController {

    @GetMapping("multiplication/random")
    @ResponseBody
    public String random()
    {
        Random rand = new Random();
        int int1 = rand.nextInt(100);
        int int2 = rand.nextInt(100);
        return int1 + "*" + int2;
    }

    @PostMapping("multiplication/results")
    @ResponseBody
    public Boolean result(String multiplication, int userAnswer)
    {
        String[] temp = multiplication.split("\\*");
        int multi1 = Integer.parseInt(temp[0]);
        int multi2 = Integer.parseInt(temp[1]);

        int actual = multi1 * multi2;
        System.out.println(multiplication + " " + userAnswer);

        return actual == userAnswer;
    }




}
