package SchoolOfMagic;

import java.util.Random;

public class Main {
    static Hogwards[] person;

    public static void main(String[] args) {
        students();
        person[0].printStudents();
        System.out.println();
        Gryffindor.compareStudents((Gryffindor) person[0], (Gryffindor) person[1]);
        System.out.println();
        Hufflepuff.compareStudents((Hufflepuff) person[3], (Hufflepuff) person[5]);
        System.out.println();
        Ravenclaw.compareStudents((Ravenclaw) person[7], (Ravenclaw) person[6]);
        System.out.println();
        Slytherin.compareStudents((Slytherin) person[10], (Slytherin) person[9]);
        System.out.println();
        Hogwards.compareAllStudents(person[0], person[8]);
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


}
