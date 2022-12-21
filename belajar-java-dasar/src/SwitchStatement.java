import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
/*
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Wow, Anda lulus dengan Baik");
                break;
            case "B":
                System.out.println("");
                break;
            case "C":
                System.out.println("Nilai Anda cukup Baik");
                break;
            case "D":
                System.out.println("Maaf, Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");

        }
        ///versi Switch Lamda
        switch (nilai){
            case "A" -> System.out.println("Wow, Anda lulus dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        ///versi Switch Lamda tanpa Yield
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow, Anda lulus dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);




        ///versi Switch Lamda dengan Yield
        ucapan = switch (nilai) {
            case "A" : yield  "Wow, Anda lulus dengan Baik";
            case "B", "C" : yield  "Nilai Anda Cukup Baik";
            case "D" : yield  "Anda Tidak Lulus";
            default:
                yield  "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan pilihan Anda : ");
        String input = scanner.nextLine();


        String nilaiA;
        switch (input){
            case "A" -> nilaiA = "Selamat Anda Lolos";
            case "B" -> nilaiA = "Selamat Anda Lolos";
            case "C" -> nilaiA = "Selamat Anda Lolos";
            case "D" -> nilaiA = "Selamat Anda Lolos";
            default -> {
                nilaiA = "Anda Salah memasukkan Nomor Anda";
            }

        }
        System.out.println(nilaiA);



    }
}
