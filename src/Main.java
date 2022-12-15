public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("кара", 2, "Кара мышык");
        Cow cow = new Cow("ак", 5, "Маша");
        Dog dog = new Dog("боз", 2, "РЕКС");
        Sheep sheep = new Sheep("кара", 3, "Кара кой");
        Animal.animal();
        Pets.home();
        System.out.println(cat + " " + Gender.FEMALE + "\n" + cow + " " + Gender.MALE + "\n" + dog + "" + Gender.MALE + "\n" + sheep + " " + Gender.FEMALE);

    }
    }
