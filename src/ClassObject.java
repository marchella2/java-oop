// Create a new class as a template
class Mahasiswa{
    // Create an attribute
    String name;
    String nim;
    String major;
    double ipk;
    int age;
}

public class ClassObject {
    public static void main(String[] args) {
        // Create an object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.name = "Acellll";
        mahasiswa1.nim = "129401212";
        mahasiswa1.major = "Computer Science";
        mahasiswa1.ipk = 4.0;
        mahasiswa1.age = 18;

        System.out.println(mahasiswa1.name);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.major);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.age);
    }
}
