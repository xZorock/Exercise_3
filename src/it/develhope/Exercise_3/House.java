package it.develhope.Exercise_3;

public class House {

    private String address;
    private int numberOfFloors;


    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;

        System.out.println("A new house was created - The address is " + address + " - The number of floors are " + numberOfFloors);

    }
}
