import java.util.ArrayList;

public class ListInplDemo {

    public static void main(String[] args) {
        arrayListDemo();
    }

    private static void arrayListDemo() {

        ArrayList arrayList = new ArrayList();
        arrayList.add("ionutz");
        arrayList.add("baur");
        arrayList.add("it-school");
        arrayList.remove("baur");

        System.out.println(arrayList);

        ArrayList<Integer> intlist = new ArrayList<>();
        intlist.add(12);
        intlist.add(7);


    }
}
