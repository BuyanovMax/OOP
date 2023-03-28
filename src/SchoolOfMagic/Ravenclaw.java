package SchoolOfMagic;

public class Ravenclaw extends Hogwards {

    private int mind;
    private int wisdom;
    private int wit;
    private int fullOfCreativity;

    public Ravenclaw(int transgression, int power, String fio, int mind, int wisdom, int wit, int fullOfCreativity) {
        super(fio, power, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    public int sumPoints() {
        int sum = getTransgression() + getPower() + getMind() + getWit() + getWisdom() + getFullOfCreativity();
        return sum;
    }

    @Override
    public void printStudents() {
        for (int i = 6; i <= 8; i++) {
            System.out.println(person[i]);
        }
    }

    @Override
    public void compareStudents() {
        System.out.println(person[6].getFio() + " имеет очков "  + person[6].sumPoints());
        System.out.println(person[7].getFio() + " имеет очков "  + person[7].sumPoints());
        System.out.println(person[8].getFio() + " имеет очков "  + person[8].sumPoints());
        if (person[6].sumPoints() > person[7].sumPoints() && person[6].sumPoints() > person[8].sumPoints()) {
            System.out.println("Лучший ученик факультета " + person[6]);
        }
        else if (person[7].sumPoints() > person[8].sumPoints()) {
            System.out.println("Лучший ученик факультета " + person[7]);
        } else {
            System.out.println("Лучший ученик факультета " + person[8]);
        }

    }

    @Override
    public String toString() {
        return super.toString() + ", остроумность: " + getWit() + ", мудрость: " + getWisdom() + ", творчество: " + getFullOfCreativity() + ", ум:" + getMind();
    }
}
