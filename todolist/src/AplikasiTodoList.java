public class AplikasiTodoList {

    public static String[] model= new String[10];

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        for (var i = 0; i < model.length; i++){
            String todo = model[i];
            var no = i +1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todo List";
        showTodoList();
    }

    /**
     * Menambahkan todo ke List
     */
    public static void addTodoList(String todo){
        //cek apakah model penuh
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i]==null){
                //model masih ada yang kosong
                isFull = false;

                break;
            }
        }
        //jika penuh, kita resize ukuran array 2x lipat
        if (isFull) {
            var temp = model;
            model = new String[model.length *2];

            //menyimpan data kedalam model yang baru dari
            //model temporary yang lama
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }


        // tambahkan ke posisi yang data arraynya null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo ke. " + i);
        }

        showTodoList();
    }

    /**
     * Menghapus todo dari List
     */
    public static boolean removeTodoList(Integer number){
        //logic meremove todo didalam listnya
        if ((number - 1) >= model.length) {
            return false;
        }else if (model[number-1] == null) {
            return false;
        }else {
            for (int i = (number-1); i < model.length; i++) {
                if (i == (model.length-1)){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }


    /**
     * Menampilkan view todo List
     */
    public static void viewShowTodoList(){

    }

    /**
     * Menampilkan view menambahkan todo List
     */
    public static void viewAddTodoList(){

    }

    /**
     * Menampilkan view menghapus todo List
     */
    public static void viewRemoveTodoList(){

    }

}
