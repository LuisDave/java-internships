package com.exercise.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.exercise.test.palindrome.streams.PalindromeCheck;
import com.exercise.test.testReferenceMemory.ExampleReference;

public class App {
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void main(String[] args) {
		logger.info("**Java internships**");
//		PracticeMap practice = new PracticeMap();
//		practice.demonstrateMapUsage();
//
//		UseSingleton singleton = new UseSingleton();
//		singleton.loggerExample();
//
//		PuntoImpl puntoImpl = new PuntoImpl();
//        puntoImpl.puntoCompare();
//
//		PuntoHijoImpl puntoHijoImpl = new PuntoHijoImpl();
//		puntoHijoImpl.childPoint();
//
//		NumberValidator validatorNumber = new NumberValidator();
//		validatorNumber.validateRange();
//		validatorNumber.validateNumMax();
//		validatorNumber.validateNumMaxOfTen();
//		
//		EqualityVsIdentity equalityVsIdentity = new EqualityVsIdentity();
//		equalityVsIdentity.checkPrimitiveIntEqualityAndIdentity();
//		
//		ExampleVar obj1 = new ExampleVar();
//		ExampleVar obj2 = new ExampleVar();
//		ExampleVar obj3 = new ExampleVar();
//
//		 // Access the static variable through the class
//        logger.info("Number of instances created: {}", ExampleVar.getInstanceCount());
//		
//		WordCounterImpl wordCounterImpl = new WordCounterImpl();
//		wordCounterImpl.textCounter();
//		
//		PalindromeImpl pal = new PalindromeImpl();
//		pal.validPalindrome();
//		
//		ReflectionExample reflectionExample = new ReflectionExample();
//		try {
//			reflectionExample.exampleRefeltion();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		WeatherDemo weatherDemo = new WeatherDemo();
//		weatherDemo.whater();
//		
//		PalindromeCheck palindromeCheck = new PalindromeCheck();
//		palindromeCheck.exaplesStreamsAnyMatch();
		
		ExampleReference exampleReference = new ExampleReference();
		exampleReference.exaple();
	}
}
