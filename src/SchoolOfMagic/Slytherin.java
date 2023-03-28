package SchoolOfMagic;

public class Slytherin extends Hogwards {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(int transgression, int power, String fio, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fio, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int sumPoints() {
        int sum = getTransgression() + getPower() + getCunning() + getAmbition() + getDetermination() + getLustForPower();
        return sum;
    }



    public static void compareStudents(Slytherin person ,Slytherin person1) {
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
        return super.toString() + ", жажда власти: " + getLustForPower() + ", амбициозность: " + getAmbition() +
                ", решительность: " + getDetermination() + ", хитрость: " + getCunning() + ", находчивость: " + getResourcefulness();
    }
}
