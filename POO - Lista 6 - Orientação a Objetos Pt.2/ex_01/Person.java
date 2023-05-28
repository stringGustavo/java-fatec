public class Person {
    private String name;
    private int age;
    private double height;

    public Person () {
        name = "undefined";
        age = 0;
        height = 0.0;
    }

    public void setName (String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setAge (int age) {
        if(age >= 0) {
            this.age = age;
        }
    }

    public void setHeight (double height) {
        if(height >= 0) {
            this.height = height;
        }
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public double getHeight () {
        return height;
    }

    public void birthday (boolean birth) {
        if(birth) {
            this.age += 1;
        }
    }
}
