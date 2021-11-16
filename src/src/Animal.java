public class Animal implements Comparable<Animal>{
    private String name;
    private String desc;
    private String type;
    private int age;

    public Animal(String name, String desc, String type, int age) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " the " + desc + " " + type + ", age " + age;
    }

    @Override
    public int compareTo(Animal otherAnimal) {
        return this.name.compareTo(otherAnimal.name);
    }
}
