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
       out.println("Значение переменной а с целочисленным типом равно " +a+ ".");
        out.println( "Значение переменной b= с целочисленным типом равно " +b+".");
        out.println("Значение переменной c с целочисленным типом равно " +c+ ".");
        out.println("Значение переменной d с целочисленным типом равног " +d+ ".");
        out.println("Значение переменной e с целочисленным типом равно " +e+ ".");
        out.println("Значение переменной f тип с плавающей точкой равно " +f+ ".");
        out.println("Значение переменной g тип с плавающей точкой равно " +g+ ".");
       byte lydmilaPavlovna = 23;
       byte annaSergyevna = 27;
       byte ekaterinaAndreevna = 30;
       short listovBumagi = 480;
       int uchenikov = listovBumagi/(lydmilaPavlovna+annaSergyevna+ekaterinaAndreevna);
       out.println("На каждого ученика расчитанно " +uchenikov+ " листов бумагши");
       int izgotovlenieButilok = 16;
       byte timeMinute = 2;
       izgotovlenieButilok = izgotovlenieButilok/timeMinute;
       out.println("за 1 минуту изготовлено " + izgotovlenieButilok+ " бутылок");
       timeMinute = 20;
       int izgotovlenieButilokMinute = izgotovlenieButilok*timeMinute;
        out.println("за 20 минут изгатовлено " + izgotovlenieButilokMinute+ " бутылок" );
       int timeDay = 60*24;
        int izgotovlenieButilokDay = 8*timeDay;
        out.println("за сутки изготавливается " +izgotovlenieButilokDay+ " бутылок");
        izgotovlenieButilokDay = 3*8*timeDay;
        out.println("за 3 дня изготавливается " +izgotovlenieButilokDay+ " бутылок");
       int timeMonth = 60*24*30;
        izgotovlenieButilok = 8*timeMonth;
        out.println("За 3 месяца изготавливается " +izgotovlenieButilok+ " бутылок");
    byte banokKraski = 120;
    int banokBeloyKrasky = 2;
    int banokKorichnevoyKrasky = 4;
    int klassov = banokKraski/(banokBeloyKrasky+banokKorichnevoyKrasky);
    banokBeloyKrasky = klassov*2;
    banokKorichnevoyKrasky = klassov*4;
    out.println("В школе где " +klassov+ " классов, нужно " +banokBeloyKrasky+ " баннок белой краски и " +banokKorichnevoyKrasky+ " баннок коричневой краски");
byte banan = 5;
short bananPorcia = (short) (banan*80);
short milk = 200;
short milkPorcia = (short) (milk*105/100);
byte plombir =2;
short plombirPorcia= (short) (plombir*100);
byte eggs = 4;
short eggsPorcia = (short) (eggs*70);
short cocktailGramm = (short) (bananPorcia+milkPorcia+plombirPorcia+eggsPorcia);
float cocktailKilogramm = (float) cocktailGramm /1000;
out.println("Вес полученного спортзавтрака состовляет " +cocktailGramm+ " в граммах и " +cocktailKilogramm+ " в килограммах");
byte loseWeight=7;
float racionSmall= 0.25F;
float racionBig=0.5F;
short daySmall= (short) (loseWeight/racionSmall);
short dayBig= (short) ((short) loseWeight/racionBig);
short averagDay= (short) ((daySmall+dayBig)/2);
out.println("Спортсмену нужно скинуть 7 кг. Если спортсмен ежедневно будет худеть на 250 гр. понадобиться " +daySmall+ " дня, если" +
        " спортсмен ежедневно худеет на 500 гр. понадобитиься " +dayBig+ " дней, в среднем спортсмену " +
        "понадобиться " +averagDay+ " деней");
int masha=  67760;
int denis=  83690;
int kristina=  76230;
byte procent= 10;
int mashaPromotion=  (masha/procent);
int mashaSalary= masha+mashaPromotion;
int denisPromotion= (denis/procent);
int denisSalary= denis+denisPromotion;
int kristinaPromotion= (kristina/procent);
int kristinaSalary= kristina+kristinaPromotion;
out.println("Маша теперь получает "+mashaSalary+ " рублей. Годовой доход вырос  на " +mashaPromotion+ " .Денис" +
        " теперь получает " +denisSalary+ " рублей. Годовой доход вырос на " +denisPromotion+ " . Кристина" +
        "теперь получает " +kristinaSalary+ " рублей. Годовой доход вырос на " +kristinaPromotion);


    }
}