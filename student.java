public class student {
    //variable instans
    private int kredit, sks;
    private double ipk;
    private String nama, pointK;

    // Constructor
    public student(int kredit, int sks, double ipk, String nama, String pointK) {
        this.kredit = kredit;
        this.sks = sks;
        this.ipk = ipk;
        this.nama = nama;
        this.pointK = pointK;
    }

    // Getter methods
    public int getKredit() {
        return kredit;
    }

    public int getSks() {
        return sks;
    }

    public double getIpk() {
        return ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getPointK() {
        return pointK;
    }
}