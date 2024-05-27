class main {


    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setPassword("12345");
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
        System.out.println(myObj.getPassword());

        Person student = new Person("John Doe", "Bingham university", "pass123", "123456");
        Person staff = new Person("Bingham university", "Jane Doe", "pass456",9902);

        System.out.println(student);
        System.out.println(staff);

        Physics physics = new Physics();
        float velocity = physics.calculateVelocity(200.0f, 10);
        System.out.println("Velocity: " + velocity + " m/s");
    }
}
