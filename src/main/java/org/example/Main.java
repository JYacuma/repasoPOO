package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //persona con constructor vacio

        Persona p1 = new Persona();

        p1.setNombres("Juanito");
        p1.setEdad(35);
        p1.setGenero("Masculino");

        //persona con constructor con parametros

        Persona p2 = new Persona("Juliana",23,"femenino");

        //mostrar persona

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }


}