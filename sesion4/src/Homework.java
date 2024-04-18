public class Homework {

    public static void main(String[] args) {
//        calculator( 8, 9);
//        areaOfRectangle( 10, 14);
//        verificaDacaNumraulEstePozitiv (3);
//        verificaDacaNumraulEstePozitiv( -7);
//        verificaAdevartSauFals( true, false);
//        verificaAdevartSauFals( true ,true );
        incrementBy1( 4);
//    Pisica pisica1 = new Pisica();
//        Pisica pisica2 = new Pisica();
//        Pisica pisica3 = new Pisica("titi",4);
//    System.out.println();
//    pisica1.setNume("jery");
//        pisica2.setNume("tom");
//        pisica2.setVarsta(5);
//    System.out.println(pisica2.toString("Pisica2"));
//    System.out.println(pisica3.toString("a3ia"));


    }

    private static void calculator(int x,int y){
        int suma = x + y;
        System.out.println("suma numerelor este = "+ suma);
        int diferenta = x - y;
        System.out.println("diefernta " + diferenta);
        int inmultirea = x * y;
        System.out.println( "inmultirea " + inmultirea);
        int impartirea = x / y;
        System.out.println( "impartirea " + impartirea);
        System.out.println( x / y);
        double impartirea2 = 0.88;
        double impartirea3 = (double) x / y;
        System.out.println( "impartirea " + impartirea3);

    }
    private static void areaOfRectangle(int latura,int lungime){
        System.out.print( "aria dreptunghiului este " );
        System.out.println(lungime* latura );

    }

    private static void verificaDacaNumraulEstePozitiv(int numar){

        if (numar > 0 ){
            System.out.println(numar + " numarul este pozitiv");
            System.out.println(numar + " numarul este pozitiv");
        } else {
            System.out.println(numar + " numarul nu este pozitiv");
        }

    }
    private static void verificaAdevartSauFals (boolean a ,boolean b){
        if ( a == b){
            System.out.println( "primitivele sunt la fel ");
        }else {
            System.out.println( " Nu sunt la fel ");
        }
    }

    private static void incrementBy1 (int a ){
        int c =a -1;
        for(int i = 0; i < 10; i++) {
            a++;
            System.out.println(a +"  ");
           // System.out.println(i);

        }
        System.out.println( "decrementare " + c--);
    }
}
