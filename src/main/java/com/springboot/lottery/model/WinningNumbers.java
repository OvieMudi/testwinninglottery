package com.springboot.lottery.model;

import jakarta.validation.constraints.NotEmpty;

import java.util.Arrays;

public class WinningNumbers {

    @NotEmpty
    private int[] numbers;

    public WinningNumbers() {
    }

    public WinningNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "{numbers:" + Arrays.toString(numbers) + '}';
    }
}
