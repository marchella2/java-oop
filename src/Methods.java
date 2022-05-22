class CollegeStudent{
    // data member
    String name;
    String nim;

    // constructor
    CollegeStudent(String name, String nim){
        this.name = name;
        this.nim = nim;
    }

    // method without return and params
    void show(){
        System.out.println("Name: " + this.name);
        System.out.println("NIM: " + this.nim);
    }

    // method without return and with params
    void setName(String name){
        this.name = name;
    }

    // method with return and without params
    String getName(){
        return this.name;
    }

    String getNim(){
        return this.nim;
    }

    // method with return and params
    String sayHalo(String message){
        return message + " , my name is " + this.name;
    }
}

public class Methods {
    public static void main(String[] args) {
        CollegeStudent collegeStudent1 = new CollegeStudent("Acil", "12940231");
        // call show() method
        collegeStudent1.show();

        // call setName() method
        collegeStudent1.setName("Acel");
        collegeStudent1.show();

        System.out.println(collegeStudent1.getName());
        System.out.println(collegeStudent1.getNim());

        // call sayHalo() method
        String data = collegeStudent1.sayHalo("Hello");
        System.out.println(data);
    }

}
