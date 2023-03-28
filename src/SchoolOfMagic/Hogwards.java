package SchoolOfMagic;

import SchoolOfMagic.*;

import java.util.Random;

public class Hogwards {
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


    public String toString() {
        return "Hogwards " +
                getFio() + ", сила заклинаний: " + getPower() + ", умение трансгрессировать: " + getTransgression();
    }

    public void printStudents() {
        System.out.println(toString());
    }


    public int sumPoints() {
        return power + transgression;
    }

    public static void compareAllStudents(Hogwards person1, Hogwards person2) {
        if (person1.sumPoints() > person2.sumPoints()) {
            System.out.println(person1.getFio() + " обладает большей силой магии чем " + person2.getFio());
        } else {
            System.out.println(person2.getFio() + " обладает большей силой магии чем " + person1.getFio());
        }
    }


}