package com.springboot.lottery.controller;

import com.springboot.lottery.model.WinningNumbers;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LotteryController {

    private final List<WinningNumbers> winningNumbers = new ArrayList<>();

    @PostMapping("/winning-numbers")
    public void addWinningNumbers(@Valid @RequestBody WinningNumbers numbers) {
        winningNumbers.add(numbers);
        System.out.println(winningNumbers);
    }
}
