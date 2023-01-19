public class ForLoop {
    public static void main(String[] args) {
        int a,b;

        for (a = 1; a <= 5; a++){
            for (b = 1; b <= a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Below is Materi Pak Eko Khanedy
//        var counter = 1;
//        for (;counter <= 10;){
//            System.out.println("Perulangan " + counter);
//            counter++;
//        }