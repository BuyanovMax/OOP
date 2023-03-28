package SchoolOfMagic;

import SchoolOfMagic.*;

import java.util.Random;

public abstract class Hogwards {
    static Hogwards[] person;
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


    public static void main(String[] args) {
        students();
        System.out.println(person.toString());


    }

    public static void students() {
        person = new Hogwards[]{
                new Gryffindor(random(), random(), "Гарри Поттер", random(), random(), random()),
                new Gryffindor(random(), random(), "Гермиона Грейнджер", random(), random(), random()),
                new Gryffindor(random(), random(), "Рон Уизли ", random(), random(), random()),
                new Hufflepuff(random(), random(), "Захария Смит", random(), random(), random()),
                new Hufflepuff(random(), random(), "Седрик Диггори", random(), random(), random()),
                new Hufflepuff(random(), random(), "Джастин Финч-Флетчли", random(), random(), random()),
                new Ravenclaw(random(), random(), "Чжоу Чанг", random(), random(), random(), random()),
                new Ravenclaw(random(), random(), "Падма Патил", random(), random(), random(), random()),
                new Ravenclaw(random(), random(), "Маркус Белби", random(), random(), random(), random()),
                new Slytherin(random(), random(), "Драко Малфой", random(), random(), random(), random(), random()),
                new Slytherin(random(), random(), "Грэхэм Монтегю", random(), random(), random(), random(), random()),
                new Slytherin(random(), random(), "Грегори Гойл", random(), random(), random(), random(), random())
        };
    }


    public static int random() {
        Random random = new Random();
        int i = random.nextInt(1, 100);
        return i;
    }

    public String toString() {
        return "Hogwards" +
                getFio() + ", сила заклинаний: " + getPower() + ", умение трансгрессировать: " + getTransgression();
    }

    public abstract void printStudents();

    public abstract void compareStudents();

    public abstract int sumPoints();

    public int sumTwoPoints() {
        int sum = 0;
        for (int i = 0; i < person.length; i++) {
            sum = person[i].power + person[i].transgression;
        }
        return sum;
    }

    public void compareAllStudents(Hogwards person1,Hogwards person2) {
        if (person1.sumTwoPoints() > person2.sumPoints()) {
            System.out.println(person1.getFio() + " обладает большей силой магии чем " + person2.getFio());
        } else {
            System.out.println(person2.getFio() + " обладает большей силой магии чем " + person1.getFio());
        }
    }
}