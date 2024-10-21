public class ZooAnimal {

    private String name;
    private String type;
    private int age;
    private boolean hungry; // attribute, fields, or state

    // null constructor
    /*
     Constructor provides information about, and access to,
     a single constructor for a class.
     sets the initial state of the class
     */
    public ZooAnimal() {
        name = "Bob";
        type = "wild animal";
        age = 5;
        hungry = true;
    }


    // constructor overloading
    // overloaded constructor
    // call this constructor
    public ZooAnimal(String name, String type, int age, boolean hungry) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungry = hungry;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    } // end of setName

    public void setType(String type) {
        this.type = type;
    } // end of setName


    public void setAge(int age) {
        this.age = age;
    } // end of setName


    public void isHungry(boolean hungry) {
        this.hungry = hungry;
    }

    // getters
    public String getName() {
        return name;
    } // end of getName

    public String getType() {
        return type;
    } // end of getName

    public int getAge() {
        return age;
    } // end of getName

    public boolean isHungry() {
        return hungry;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nAge: " + age + "\nHungry: " + hungry;
    }

    public static void main(String[] args) {
        ZooAnimal animal1 = new ZooAnimal();
        ZooAnimal animal2 = new ZooAnimal("Leo", "Lion", 3, false);

        System.out.println(animal1);
        System.out.println("--------------------");
        System.out.println(animal2);
    }
}

    
    
    
    