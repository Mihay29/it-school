import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        sortArrays();
        int[] intArray = {1, 2, 3};
        int [] zeroArray = new int[4];
        String[] stringArray = {"Ala ","Bala", "Portocala"};
        String[] fiveStringArray = new String[5];


        //System.out.println(Arrays.toString(zeroArray));
        //System.out.println(Arrays.toString(fiveStringArray));

        String[] arrayWithNewAndFixed = new String[] {"Ala","Bala","Portocala"};

    }

    private static void  sortArrays() {
        String[] cities = {"Iasi","Bucuresti","Cluj"};
        System.out.println("Unsorted cities");
        System.out.println(Arrays.toString(cities));

        //String a = "Hello";
        //String b = "Hello";

        //System.out.println("Comparing strings");
        //System.out.println(b.compareTo(a));

        Arrays.sort(cities);
        System.out.println("Natural sorted citites");
        System.out.println(Arrays.toString(cities));

        Arrays.sort(cities, (o1, o2) -> Character.valueOf(o1.charAt(0)).compareTo( o2.charAt(0)));
        System.out.println("Reversed natural order of cities");
        System.out.println(Arrays.toString(cities));
    }

    //private static void method (String a, int...args);

}
