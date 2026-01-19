class Student {
    // variables
    int id;
    String name;
    int age;

    // method to display details
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // main method
    public static void main(String[] args) {
        // object creation
        Student s1 = new Student();

        // assigning values
        s1.id = 101;
        s1.name = "PrashantJha";
        s1.age = 20;

        // method call
        s1.displayDetails();
    }
}