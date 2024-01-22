package main;

public class Hedgehog {
    String name;
    int age;

    public Hedgehog(){
        name = "Pikseli" ;
        age = 5;

    }
    public void speak(String teksti) {

        System.out.println(name+teksti);
        
    }
}
