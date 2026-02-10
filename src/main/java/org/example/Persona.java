package org.example;

public class Persona {
    //Atributos
    private String nombres;
    private int edad;
    private String genero;

    // Constructores

    public Persona() {
    }

    public Persona(String nombres, int edad, String genero) {
        this.nombres = nombres;
        this.edad = edad;
        this.genero = genero;
    }

    // Get-Set


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public int calcularpasos(){
        return 0;
    }

    public double calcularsalario(){
        return 0.0;
    }
}
