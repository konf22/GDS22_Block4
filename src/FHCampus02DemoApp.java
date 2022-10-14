public class FHCampus02DemoApp {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Susi", "Sorglos");
        
      /*  student1.setFirstName("Susi");
        student1.setLastName("Sorglos");
        student1.setNumber(1);
        student1.setUserName("ssorglos");*/

        System.out.println("student1.toString() = " + student1.toString());
        
        Student student2 = new Student(2, "Max", "Mustermann");
        student2.initialize(2, "Max", "Mustermann");
        System.out.println("student2.toString() = " + student2.toString());
        
        Student student3 = new Student(3, "Max1", "Doe");
        student3.setNumber(4);
        System.out.println("student3.toString() = " + student3.toString());
    }
}
