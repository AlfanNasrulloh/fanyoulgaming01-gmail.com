public class tester{
    public static void main(String[] args) {
        // Membuat objek source dengan contructor
        student source = new student(120, 121, 4, "Alfan", "A");

        // Mengakses data menggunakan getter methods
        System.out.println("Nama: " + source.getNama());
        System.out.println("IPK: " + source.getIpk());
        System.out.println("SKS: " + source.getSks());
        System.out.println("Kredit: " + source.getKredit());
        System.out.println("Point: " + source.getPointK());
    }
}
