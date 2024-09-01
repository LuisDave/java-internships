package com.exercise.test.practice.punto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PuntoHijoImpl {
	 private static final Logger logger = LogManager.getLogger(PuntoHijoImpl.class);

	public void childPoint() {
		PuntoHijo puntoHijo = new PuntoHijo();

		// Log the coordinates of the child point
		logger.info("Child Point: {}", puntoHijo);

		// Verify the coordinates
		logger.info("x: {}", puntoHijo.getX());
		logger.info("y: {}", puntoHijo.getY());
	}
}
