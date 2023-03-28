package SchoolOfMagic;

public class Hufflepuff extends Hogwards {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int transgression, int power, String fio, int industriousness, int loyalty, int honesty) {
        super(fio, power, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public int sumPoints() {
        int sum = getTransgression() + getPower() + getHonesty() + getIndustriousness() + getLoyalty();
        return sum;
    }


    public static void compareStudents(Hufflepuff person, Hufflepuff person1) {
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
        return super.toString() + ", верность: " + getLoyalty() + ", честность: " + getHonesty() + ", трудолюбие: " + getIndustriousness();
    }
}
