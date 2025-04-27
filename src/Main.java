import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        byte a=67;
       short b=569;
       short c=-159;
       short d=27897;
       long e=987678965549L;
       double f=27.12;
       float g=2.786F;
       out.println("Значение переменной а=" +a+ " с целочисленным типом. ");
        out.println( "Значение переменной b=" +b+" с целочисленным типом. ");
        out.println("Значение переменной c=" +c+ " с целочисленным типом. ");
        out.println("Значение переменной d=" +d+ " с целочисленным типом. ");
        out.println("Значение переменной e=" +e+ " с целочисленным типом. ");
        out.println("Значение переменной f=" +f+ " тип с плавающей точкой.");
        out.println("Значение переменной g=" +g+ " тип с плавающей точкой.");
       byte lydmilaPavlovna = 23;
       byte annaSergyevna = 27;
       byte ekaterinaAndreevna = 30;
       short listovBumagi = 480;
       int uchenikov = listovBumagi/(lydmilaPavlovna+annaSergyevna+ekaterinaAndreevna);
       out.println("На каждого ученика расчитанно " +uchenikov+ " листов бумагши");
       int izgotovlenieButilok = 16;
       int timeMinute = 2;
       izgotovlenieButilok = izgotovlenieButilok/timeMinute;
       out.println("за 1 минуту изготовлено " + izgotovlenieButilok+ " бутылок");
       timeMinute = 20;
        izgotovlenieButilok = izgotovlenieButilok*timeMinute;
        out.println("за 20 минут изгатовлено " + izgotovlenieButilok+ " бутылок" );
        timeMinute = 60*24;
        out.println("В сутках " +timeMinute+ " минут");
        izgotovlenieButilok = 8*timeMinute;
        out.println("за 3 дня изготавливается " +izgotovlenieButilok+ " бутылок");
        timeMinute = 60*24*3;
        izgotovlenieButilok = 8*timeMinute;
        out.println("За 3 месяца изготавливается " +izgotovlenieButilok+ " бутылок");
    byte banokKraski = 120;
    int banokBeloyKrasky = 2;
    int banokKorichnevoyKrasky = 4;
    int klassov = banokKraski/(banokBeloyKrasky+banokKorichnevoyKrasky);
    banokBeloyKrasky = klassov*2;
    banokKorichnevoyKrasky = klassov*4;
    out.println("В школе где " +klassov+ " классов, нужно " +banokBeloyKrasky+ " баннок белой краски и " +banokKorichnevoyKrasky+ " баннок коричневой краски");
short banan = 5;
short bananPorcia = (short) (banan*80);
short milk = 200;
short milkPorcia = (short) (milk*105/100);
short plombir =2;
short plombirPorcia= (short) (plombir*100);
short eggs = 4;
short eggsPorcia = (short) (eggs*70);
short cocktailGramm = (short) (bananPorcia+milkPorcia+plombirPorcia+eggsPorcia);
float cocktailKilogramm = (float) cocktailGramm /1000;
out.println("Вес полученного спортзавтрака состовляет " +cocktailGramm+ " в граммах и " +cocktailKilogramm+ " в килограммах");
float racionSmall= 0.3F;
float racionBig=0.5F;
short daySmall= (short) (7/racionSmall);
short dayBig= (short) ((short) 7/racionBig);
short averagDay= (short) ((daySmall+dayBig)/2);
out.println("Спортсмену нужно скинуть 7 кг. Если спортсмен ежедневно будет худеть на 250 гр. понадобиться " +daySmall+ " дня, если" +
        " спортсмен ежедневно худеет на 500 гр. понадобитиься " +dayBig+ " дней, в среднем спортсмену " +
        "понадобиться " +averagDay+ " деней");
int masha=  67760;
int denis=  83690;
int kristina=  76230;
float mashaPromotion= (float) (masha/10);
float mashaSalary= masha+mashaPromotion;
float denisPromotion= (float) (denis/10);
float denisSalary= denis+denisPromotion;
float kristinaPromotion= (float) (kristina/10);
float kristinaSalary= kristina+kristinaPromotion;
out.println("Маша теперь получает "+mashaSalary+ " рублей. Годовой доход вырос  на " +mashaPromotion+ " .Денис" +
        " теперь получает " +denisSalary+ " рублей. Годовой доход вырос на " +denisPromotion+ " . Кристина" +
        "теперю получает " +kristinaSalary+ " рублей. Годовой доход вырос на" +kristinaPromotion);


    }
}