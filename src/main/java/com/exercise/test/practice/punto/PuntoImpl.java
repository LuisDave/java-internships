package com.exercise.test.practice.punto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class PuntoImpl {

    private static final Logger logger = LogManager.getLogger(PuntoImpl.class);

    public void puntoCompare() {
        Punto p1 = new Punto(3.0, 4.0);
        Punto p2 = new Punto(3.0, 4.0);
        Punto p3 = new Punto(5.0, 6.0);

        // Log the points
        logger.info("Point 1: {}", p1);
        logger.info("Point 2: {}", p2);
        logger.info("Point 3: {}", p3);

        // Compare points
        logger.info("p1 equals p2: {}", p1.equals(p2)); // true
        logger.info("p1 equals p3: {}", p1.equals(p3)); // false

        // Use in a HashSet
        Set<Punto> puntos = new HashSet<>();
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);

        // The set should contain only two distinct points
        logger.info("Number of unique points in the set: {}", puntos.size());
    }
}
