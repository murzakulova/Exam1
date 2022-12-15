public class Dog extends Pest{
    public Dog(String colour, int age, String name) {
        super(colour, age, name);

    }

    @Override
    public String toString() {
        return "Dog{}" + super.toString();
    }
}


