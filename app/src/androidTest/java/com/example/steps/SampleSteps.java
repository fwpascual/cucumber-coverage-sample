package com.example.steps;

import com.example.android.testing.androidtestorchestratorsample.Calculator;

import io.cucumber.java.en.Given;

public class SampleSteps {

    @Given("sample step")
    public void sampleStep() {
        Calculator calculator = new Calculator();
        calculator.add(1,1);
    }
}
