package com.exercise.test.practice.punto;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method to set new coordinates
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Override the toString method for string representation
    @Override
    public String toString() {
        return "Punto(" + "x=" + x + ", y=" + y + ")";
    }

    // Override the equals method to check the equality of two points
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Punto punto = (Punto) obj;
        return Double.compare(punto.x, x) == 0 && Double.compare(punto.y, y) == 0;
    }

    // Override the hashCode method to ensure that equal objects have the same hashcode
    @Override
    public int hashCode() {
        return java.util.Objects.hash(x, y);
    }
}
