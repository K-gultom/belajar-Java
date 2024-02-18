public class MethodVariableArgument {
    public static void main(String[] args) {
         int[] values = {80, 55, 55, 88};

        sayCongrats("kiel", values);

        ucapanSelamat("Andi", 80,100,55,77);
    }

    // tanpa menggunakan method variable argument
    static  void sayCongrats(String name, int[] values){
        var total = 0;
        for ( var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    //dengan menggunakan method variable argument
    static  void ucapanSelamat(String name, int... values){
        var total = 0;
        for ( var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
