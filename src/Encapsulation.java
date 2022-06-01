import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 20;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2){
        this.diameter = jari2 * 2;
    }

    // getter
    public double getJari2(){
        return this.diameter / 2;
    }

    // getter
    public double getLuas(){
        return 3.14 * diameter * diameter / 4;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Data object1 = new Data();

        // read and write using public
        object1.intPublic = 10; // write
        System.out.println("Public : " + object1.intPublic); // read

        // read only (using getter)
        int number = object1.getIntPrivate();
        System.out.println("Getter : " + number);

        // write only (using setter)
        object1.setDoublePrivate(0.05);
        object1.display();

        // getter and setter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("Jari-jari: " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari-jari: " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());
    }
}
