package com.exercise.test.decorator;

public class DecoratorExample {
	
    public void exapleDecorator() {
        Text text = new PlainText("hello");
        System.out.println(text.format());

        Text upperCaseText = new UpperCaseDecorator(text);
        System.out.println(upperCaseText.format());
    }
}
