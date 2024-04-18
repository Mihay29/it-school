public class PersonConstructor {

    public static void main(String[] args) {
        Person ionutz = new Person("Baur", 194255257895222195L );
        System.out.println(ionutz.getLastName());
        System.out.println(ionutz.getCnp());

        String lastName = ionutz.getLastName();
        long cnp = ionutz.getCnp();

        System.out.println(lastName);
        System.out.println(cnp);

        System.out.println("printing from another methot");
        printStuff(ionutz);
    }

    static void printStuff(Person aPerson) {
        System.out.println(aPerson.getCnp());
        System.out.println(aPerson.getLastName());
        System.out.println(aPerson.getAge());

    }
}
