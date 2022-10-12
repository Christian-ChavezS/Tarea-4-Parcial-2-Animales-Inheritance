package oop.parcial2;

import java.util.LinkedList;
import java.util.List;
import oop.parcial2.*;


public class Main {
    public static void main(String []args){

        List<Animal> animales = new LinkedList<Animal>();

        animales.add(new Ave());

        animales.add(new Aguila());
        animales.add(new Halcon());
        animales.add(new Condor());

        animales.add(new Pez());

        animales.add(new Trucha());
        animales.add(new Tilapia());
        animales.add(new Salmon());

        animales.add(new Mamifero());

        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Raton());

        for(Animal animal : animales)
        {
            System.out.println(animal.toString());
        }



    }


}
