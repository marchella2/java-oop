class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Reference {
    public static void main(String[] args) {
        Buku dataBuku1 = new Buku("Filosofi Teras", "Henry Manampiring");
        dataBuku1.display();

        // Show address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(dataBuku1));
        System.out.println(addressBuku1);

        // assignment object
        Buku dataBuku2 = dataBuku1;
        dataBuku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(dataBuku2));
        System.out.println(addressBuku2);

        // dataBuku1 and dataBuku2 has same reference
        dataBuku2.judul = "Teras Filosofi";
        dataBuku1.display();
        dataBuku2.display();

        // insert object into method
        fungsi(dataBuku2);
        dataBuku1.display();
        dataBuku2.display();

    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(addressDataBuku);
        dataBuku.penulis = "Henry";
    }
}
