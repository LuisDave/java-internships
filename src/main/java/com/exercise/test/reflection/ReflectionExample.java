package com.exercise.test.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	
	public void exampleRefeltion() throws Exception {
        // Create an instance of Person
        Person person = new Person("John", 30);

        // Get the Person class
        Class<?> personClass = person.getClass();
        
        //All private attributes
        Field[] campos = personClass.getDeclaredFields();
        // Imprime el nombre y valor de cada campo
        for (Field campo : campos) {
            campo.setAccessible(true); // Permite acceso a campos privados
            Object valor = campo.get(person); // Obtén el valor del campo
            System.out.println("Campo (via reflection): " + campo.getName() + " - Valor: " + valor);
        }
        //All private methods
        Method[] metodos = personClass.getDeclaredMethods();
        for (Method metodo : metodos) {
            System.out.println("Método (via reflection): " + metodo.getName());
        }

        // Access the private field 'name'
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true);
        String name = (String) nameField.get(person);
        System.out.println("Name (via reflection): " + name);

        // Access and invoke the private method 'printPerson'
        Method printPersonMethod = personClass.getDeclaredMethod("printPerson");
        printPersonMethod.setAccessible(true);
        System.out.println("method private (via reflection): ");
        printPersonMethod.invoke(person);
    }

}
