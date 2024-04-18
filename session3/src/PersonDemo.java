public class PersonDemo {

    public static void main(String[] args) {
        Person ionutz = new   ();
        Person gabriel = new Person();
        Person laura = new Person();

        System.out.println(ionutz.getLastName());

        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());

        ionutz.setFirstName("Ionutz");
        ionutz.setAge(32);
        ionutz.setCnp(194255257895222195L);

        System.out.println("Results after setting prop");
        System.out.println(ionutz.getFirstName());
        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());

         String ionutzFirstName = ionutz.getFirstName();
         System.out.println("Persons first name is :" + ionutzFirstName);
    }
}
