public class ForEach {
    public static void main(String[] args) {


        String[] names = {
                "Yehezkiel", "Gultom", "Institut",
                "Teknologi", "Dan", "Bisnis", "PalComTech",
        };

        for (var i = 0; i <names.length; i++){
            System.out.println(names[i]);
        }



        System.out.println("=== FOR EACH ===");
        for (var name: names){
            System.out.println(name);
        }
    }
}
