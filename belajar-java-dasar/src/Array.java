public class Array {
    public static void main(String[] args) {
        //cara membuat String pada Java
        String [] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Hai";
        stringArray[1] = "Yehezkiel";
        stringArray[2] = "Gultom";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String [] stringArray2 = new String[3];

        String[] namaNama = {
                "Hai", "Yehezkiel", "Gultom"
        };

        Long[] arrayLong = new Long[]{
                1l, 12l, 4l, 2l, 4l
        };
        System.out.println(arrayLong[2]);

        arrayLong[1] = null;

        System.out.println(arrayLong.length);
        System.out.println(arrayLong[1]);

        String [][] members = {
                {"Hai", "Yehezkiel", "Gultom"},
                {"Woi", "Members"},
                {"Joni"}
        };
        System.out.println(members[0][2]);
        System.out.println(members[1][0]);
    }
}
