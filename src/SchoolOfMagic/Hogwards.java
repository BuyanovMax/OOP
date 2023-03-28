package SchoolOfMagic;

import SchoolOfMagic.*;

import java.util.Random;

public abstract class Hogwards {
    private String fio;
    public int power;
    public int transgression;


    public Hogwards(String fio, int power, int transgression) {
        this.power = power;
        this.transgression = transgression;
        this.fio = fio;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public static int random() {
        Random random = new Random();
        int i = random.nextInt(1, 100);
        return i;
    }

    public String toString() {
        return "Hogwards " +
                getFio() + ", сила заклинаний: " + getPower() + ", умение трансгрессировать: " + getTransgression();
    }

    public void printStudents(){
        System.out.println(toString());
    }

//    public abstract void compareStudents();

    public abstract int sumPoints();




}