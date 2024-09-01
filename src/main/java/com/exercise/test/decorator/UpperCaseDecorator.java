package com.exercise.test.decorator;

public class UpperCaseDecorator implements Text {

    private Text text;

    public UpperCaseDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text.format().toUpperCase();
    }
}