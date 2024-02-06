public class TernaryOperator {
    public static void main(String[] args) {


        var nilai = 70;
        String ucapan;


        ///kode If tanpa Ternary Operator
//        if (nilai > 75){
//            ucapan = "Selamat Anda Lulus";
//        } else {
//            ucapan = "Silahkan Coba Lagi";
//        }
//        System.out.println(ucapan);

        ///Kode yang memakai Ternary Operator
        String ucapan2 = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ucapan2);

    }
}
