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



    public static void compareStudents(Ravenclaw person ,Ravenclaw person1) {
        System.out.println(person.getFio() + " имеет очков " + person.sumPoints());
        System.out.println(person1.getFio() + " имеет очков " + person1.sumPoints());
        if (person.sumPoints() > person1.sumPoints()) {
            System.out.println("Лучший ученик на факультете: " + person.getFio());
        } else {
            System.out.println("Лучший ученик на факультете: " + person1.getFio());
        }


    }

    @Override
    public String toString() {
        return super.toString() + ", остроумность: " + getWit() + ", мудрость: " + getWisdom() + ", творчество: " + getFullOfCreativity() + ", ум:" + getMind();
    }
}
