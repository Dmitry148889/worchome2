public class Main {
    public static void main(String[] args) {

        byte a=67;
       short b=569;
       short c=-159;
       short d=27897;
       long e=987678965549L;
       double f=27.12;
       float g=2.786F;
       byte lydmilaPavlovna = 23;
       byte annaSergyevna = 27;
       byte ekaterinaAndreevna = 30;
       short listovBumagi = 480;
       int uchenikov = listovBumagi/(lydmilaPavlovna+annaSergyevna+ekaterinaAndreevna);
       System.out.println("На каждого ученика расчитанно " +uchenikov+ " листов бумагши");
       int izgotovlenieButilok = 16;
       int timeMinute = 2;
       izgotovlenieButilok = izgotovlenieButilok/timeMinute;
       System.out.println("за 1 минуту изготовлено " + izgotovlenieButilok+ " бутылок");
       timeMinute = 20;
        izgotovlenieButilok = izgotovlenieButilok*timeMinute;
        System.out.println("за 20 минут изгатовлено " + izgotovlenieButilok+ " бутылок" );
        timeMinute = 60*24;
        System.out.println("В дне " +timeMinute+ " минут");
        izgotovlenieButilok = 8*timeMinute;
        System.out.println("за 3 дня изготавливается " +izgotovlenieButilok+ " бутылок");
        timeMinute = 60*24*3;
        izgotovlenieButilok = 8*timeMinute;
        System.out.println("За 3 месяца изготавливается " +izgotovlenieButilok+ " бутылок");
    byte banok = 120;
    int banokBeloyKrasky = 2;
    int banokKorichnevoyKrasky = 4;
    int klassov = banok/(banokBeloyKrasky+banokKorichnevoyKrasky);
    banokBeloyKrasky = klassov*2;
    banokKorichnevoyKrasky = klassov*4;
    System.out.println("В школе где " +klassov+ " классов, нужно " +banokBeloyKrasky+ " баннок белой краски и " +banokKorichnevoyKrasky+ " баннок коричневой краски");



                   System.out.println("Hello, World111!");

    }
}