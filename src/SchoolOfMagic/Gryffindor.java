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



    public static void compareStudents(Gryffindor person ,Gryffindor person1) {
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
        return super.toString() + ", благородство:  " + getNobility() + ", храбрость: " + getBravery() + ", честь: " + getHonor();
    }
}

