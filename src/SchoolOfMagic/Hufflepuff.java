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

    @Override
    public void printStudents() {
        for (int i = 3; i <= 5; i++) {
            System.out.println(person[i]);
        }
    }

    @Override
    public void compareStudents() {
        System.out.println(person[3].getFio() + " имеет очков "  + person[3].sumPoints());
        System.out.println(person[4].getFio() + " имеет очков "  + person[4].sumPoints());
        System.out.println(person[5].getFio() + " имеет очков "  + person[5].sumPoints());
        if (person[3].sumPoints() > person[4].sumPoints() && person[3].sumPoints() > person[5].sumPoints()) {
            System.out.println("Лучший ученик факультета " + person[3]);
        }
        else if (person[4].sumPoints() > person[5].sumPoints()) {
            System.out.println("Лучший ученик факультета " + person[4]);
        } else {
            System.out.println("Лучший ученик факультета " + person[5]);
        }

    }

    @Override
    public String toString() {
        return super.toString() + ", верность: " + getLoyalty() + ", честность: " + getHonesty() + ", трудолюбие: " + getIndustriousness();
    }
}
