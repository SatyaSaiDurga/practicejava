public class person {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public void Person(String name, int age) {
        this.name = name;
        setAge(age); // Using setter for initial validation
    }
 
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        
        // Accessing the name and age using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
        // Modifying the age using setter
        person.setAge(35);
        System.out.println("Updated Age: " + person.getAge());
        
        // Attempting to set an invalid age
        person.setAge(-5); // This will print an error message
    }
}
