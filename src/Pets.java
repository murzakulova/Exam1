public abstract class Pets extends Animal {
    private int age;
    private String name;
    public Pets(String colour, int age, String name) {
        super(colour);
        this.age = age;
        this.name = name;
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
