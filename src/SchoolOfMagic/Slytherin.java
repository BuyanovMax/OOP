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

    @Override
    public void printStudents() {
        for (int i = 9; i <= 11; i++) {
            System.out.println(person[i]);
        }
    }

    @Override
    public void compareStudents() {
        System.out.println(person[9].getFio() + " имеет очков " + person[9].sumPoints());
        System.out.println(person[10].getFio() + " имеет очков " + person[10].sumPoints());
        System.out.println(person[11].getFio() + " имеет очков " + person[11].sumPoints());
        if (person[9].sumPoints() > person[10].sumPoints() && person[9].sumPoints() > person[11].sumPoints()) {
            System.out.println("Лучший ученик факультета " + person[9]);
        } else if (person[10].sumPoints() > person[11].sumPoints()) {
            System.out.println("Лучший ученик факультета " + person[10]);
        } else {
            System.out.println("Лучший ученик факультета " + person[11]);
        }

    }

    @Override
    public String toString() {
        return super.toString() + ", жажда власти: " + getLustForPower() + ", амбициозность: " + getAmbition() +
                ", решительность: " + getDetermination() + ", хитрость: " + getCunning() + ", находчивость: " + getResourcefulness();
    }
}
