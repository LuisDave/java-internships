package com.exercise.test.testReferenceMemory;

public class DataDTO {
    private int index;

    // Constructor vacío
    public DataDTO() {}

    // Getter para el campo 'index'
    public int getIndex() {
        return index;
    }

    // Setter para el campo 'index'
    public void setIndex(int index) {
        this.index = index;
    }

    // Opcional: Método toString para facilitar la impresión
    @Override
    public String toString() {
        return "DataDTO{" +
                "index=" + index +
                '}';
    }
}

