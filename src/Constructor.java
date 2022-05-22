// Class without constructor
class Polos{
    String dataString;
    int dataInteger;
}

// Class with constructor
class Student{
    String name;
    String nim;
    String major;

    // Declare constructor
//    Student(){
//        System.out.println("This is constructor");
//    }

    // Constructor with parameter
    Student(String addNama, String addNim, String addMajor){
        name = addNama;
        nim = addNim;
        major = addMajor;

        System.out.println(name);
        System.out.println(nim);
        System.out.println(major);
    }

}

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student("Acel", "12345678", "Computer Science");
    }
}
