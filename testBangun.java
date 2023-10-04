public class testBangun {
    public static void main (String[] args){

        bangunRuang Balok = new bangunRuang();


        bangunRuang.setPanjang (Integer.parseInt("5"));
        bangunRuang.setLebar(Integer.parseInt("3"));
        bangunRuang.setTinggi(Integer.parseInt("4"));

        int Panjang= bangunRuang.getPanjang();
        int Lebar= bangunRuang.getLebar();
        int Tinggi= bangunRuang.getTinggi();

        //System.out.println(bangunRuang.Panjang);

        System.out.println("Bangun Ruang: "+ Balok.getPanjang() * Balok.getLebar() * Balok.getTinggi());
    }
}