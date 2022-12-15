public abstract class Pest extends Animal {
    private int age;
    private String name;

    public Pest(String colour, int age, String name) {
        super(colour);
        this.age = age;
        this.name = name;
    }

    public Pest(String colour) {
        super(colour);
    }

    public static void home() {
        System.out.println("Animals who live in house");
    }

    @Override
    public String toString() {
        return "Pets{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}



