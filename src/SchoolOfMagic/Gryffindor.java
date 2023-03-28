package SchoolOfMagic;

public class Gryffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int transgression, int power, String fio, int nobility, int honor, int bravery) {
        super(fio, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public int sumPoints() {
        int sum = getBravery() + getTransgression() + getPower() + getHonor() + getNobility();
        return sum;
    }

    @Override
    public void printStudents() {
        for (int i = 0; i <= 2; i++) {
            System.out.println(person[i]);
        }
    }

    @Override
    public void compareStudents() {
        System.out.println(person[0].getFio() + " имеет очков " + person[0].sumPoints());
        System.out.println(person[1].getFio() + " имеет очков " + person[1].sumPoints());
        System.out.println(person[2].getFio() + " имеет очков " + person[2].sumPoints());
        if (person[0].sumPoints() > person[1].sumPoints() && person[0].sumPoints() > person[2].sumPoints()) {
            System.out.println("Лучший ученик факультета " + person[0]);
        }
        else if (person[1].sumPoints() > person[2].sumPoints()) {
            System.out.println("Лучший ученик факультета " + person[1]);
        } else {
            System.out.println("Лучший ученик факультета " + person[2]);
        }

    }


    @Override
    public String toString() {
        return super.toString() + ", благородство:  " + getNobility() + ", храбрость: " + getBravery() + ", честь: " + getHonor();
    }
}

