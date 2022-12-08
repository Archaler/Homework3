public class Main {
    public static void main(String[] args) {


        int x = 3;
        byte y = 4;
        short z = 5;
        long d = 6771;
        float f = 1.788f;
        double e = 1.99;
        System.out.println("Значение переменной x с типом int" + " равно " + x);
        System.out.println("Значение переменной y с типом byte" + " равно " + y);
        System.out.println("Значение переменной z с типом short" + " равно " + z);
        System.out.println("Значение переменной d с типом long" + " равно " + d);
        System.out.println("Значение переменной f с типом float" + " равно " + f);
        System.out.println("Значение переменной x с типом double" + " равно " + e);

        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        int lvl = 10;
        boolean truOrFalce = lvl >= 30;
        short k = 569;
        int l = -159;
        long h = 27897;
        byte g = 67;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(truOrFalce);
        System.out.println(k);
        System.out.println(l);
        System.out.println(h);
        System.out.println(g);
   int schoolClass1 = 23;
   int schoolClass2 = 27;
   int schoolClass3 = 30;
   int paper = 480;
   int paperOne = paper / (schoolClass1 + schoolClass2 + schoolClass3);
   System.out.println("На каждого ученика рассчитано " + paperOne + " листов бумаги");

   int bottleOneMinute = 8;
   int every20 = bottleOneMinute * 20;
   int everyDay = bottleOneMinute * 24 * 60;
   int every3Day = bottleOneMinute * 24 * 60 * 3;
   int everyMounth = bottleOneMinute * 24 * 60 * 30;

   System.out.println("За 20 минут машины произвела бутылок " + every20 + " штук");
        System.out.println("За 24 часа машины произвела бутылок " + everyDay + " штук");
        System.out.println("За 3 дня машины произвела бутылок " + every3Day + " штук");
        System.out.println("За месяц машины произвела бутылок " + everyMounth + " штук");

        int total = 120;
        int whiteOneClass = 2;
        int brownOneClass = 4;
        int totalOneClass = whiteOneClass + brownOneClass;
        int totalClass = total / totalOneClass;
        int whiteBank = totalClass * whiteOneClass;
        int brownBank = totalClass * brownOneClass;
                System.out.println("В школе, где " + totalClass +  " классов, нужно " + whiteBank + " банок белой краски и " + brownBank + " банок коричневой краски.");

        byte banan = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;

        int mBanana = banan * 5;
        int mMilk = milk * 2;
        int mIceCream = iceCream * 2;
        int mEggs = eggs * 4;

        int blender = mBanana + mEggs + mIceCream + mMilk;
        int kgBlender = blender / 1000;
        System.out.println(kgBlender + " кг");

        int mass = 7000;
        int slow = 250;
        int faster = 500;
        int daysSlow = mass / slow;
        int datsFaster = mass / faster;
        System.out.println(daysSlow + " дней по 250 грамм");
        System.out.println(datsFaster + " дней по 500 грамм");

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        double up = 1.1;
            double upMasha = masha * up;
            double upDenis = denis * up;
            double upKris = kris * up;
                double diffMasha = upMasha - masha;
                double diffDenis = upDenis - denis;
                double diffKris = upKris - kris;
                    System.out.println("Маша теперь получает " + upMasha + " рублей. Годовой доход вырос на " + diffMasha +" рублей");
        System.out.println("Денис теперь получает " + upDenis + " рублей. Годовой доход вырос на " + diffDenis +" рублей");
        System.out.println("Кристина теперь получает " + upKris + " рублей. Годовой доход вырос на " + diffKris +" рублей");





    }
}