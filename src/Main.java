public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        //задание 1
        double dog = 8;
        double cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задание 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задание 3

        dog =  dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задание 4

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задание 5

        double frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //задание 6

        var sportsmanOne = 78.2;
        var sportsmanTwo = 82.7;
        var weightSportsmans = sportsmanTwo + sportsmanOne;
        System.out.println(weightSportsmans);
        //задание 7

        var differenceWeight = sportsmanTwo%sportsmanOne;//остаток от деления
        System.out.println(differenceWeight);
        var diffWeight = sportsmanTwo - sportsmanOne;
        System.out.println(diffWeight);
        //задание 8

        var hours = 640;
        var hoursMans = 8;

        var allMans = hours/hoursMans;
        System.out.println(allMans);

        allMans = allMans + 94;
        var allHours = allMans * hoursMans;
        System.out.println("Если в компании работает " + allMans + " человек, то всего " + allHours + " часов работы может быть поделено между сотрудниками");
        //переменные часть 2
        //задание 1

        int oneInt = 10;
        System.out.println(oneInt);
        double oneDouble = 20.33;
        System.out.println(oneDouble);
        float oneFloat = 20.34f;
        System.out.println(oneFloat);
        char symbol = 'C';
        System.out.println(symbol);
        short oneShort = 100;
        System.out.println(oneShort);
        long oneLong = 10000l;
        System.out.println(oneLong);
        byte oneByte = 99;
        System.out.println(oneByte);
        //задание 2

        float twoFloat = 27.12f;
        long twoLong = 987_678_965_549l;
        byte twoByte = 2;
        int twoInt = 786;
        boolean twoBoolean = false;
        short twoShort = 569;
        short freeShort = -159;
        int freeInt = 27897;
        byte freeByte = 67;
        //задание 3

        int liudmilaPavlovnaChildren = 23;
        int annaSergeevnaChildren = 27;
        int ekaterinaAndreevnaChildren = 30;
        int allPaper = 480;
        int paperPerChild = allPaper/(liudmilaPavlovnaChildren+annaSergeevnaChildren+ekaterinaAndreevnaChildren);
        System.out.println("На каждого ученика рассчитано " + paperPerChild + " листов бумаги");
        //задание 4

        int bottle = 16;
        int time = 2;
        int bottlePerMinute = bottle/time;
        System.out.println(bottlePerMinute);//1 minute
        int bottlePerTwelveMinute = bottlePerMinute*20;
        System.out.println("За 20 минут машина произвела " + bottlePerTwelveMinute + " штук"); //20 minutes
        int timeInOneDay = 60*24;
        int bottlePerOneDay = bottlePerMinute*timeInOneDay;
        System.out.println("За один день машина произвела " + bottlePerOneDay + " штук");//one day
        int bottlePerFreeDays = bottlePerOneDay*3;
        System.out.println("За 3 дня машина произвела " + bottlePerFreeDays + " штук");//3 days
        int bottlePerOneMonth = bottlePerOneDay*30;
        System.out.println("За 30 дней машина произвела " + bottlePerOneMonth + " штук");//30 days
        //задание 5

        int repairSchoolDye = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int countClass = repairSchoolDye/(whitePerClass+brownPerClass);
        int whiteDye = countClass*whitePerClass;
        int brownDye = countClass*brownPerClass;
        System.out.println("В школе, где " + countClass + " классов, нужно " + whiteDye + " банок белой краски и " + brownDye +" коричневой краски");
        //задание 6

        int bananas = 5;
        int oneBananasWeight = 80;
        int oneHungredMilk = 2;
        int hundredGramsMilkWeight = 105;
        int iceCream = 2;
        int oneIceCreamWeight = 100;
        int eggs = 4;
        int oneEggWeight = 70;

        int allWeightBananas = bananas*oneBananasWeight;
        int allWeightMilk = oneHungredMilk*hundredGramsMilkWeight;
        int allWeightIceCream = iceCream*oneIceCreamWeight;
        int allWeightEggs = eggs*oneEggWeight;
        int allWeight = allWeightBananas+allWeightMilk+allWeightIceCream+allWeightEggs;
        System.out.println(allWeight + " грамм");
        double allWeightInKg = (allWeight/1000);
        System.out.println(allWeightInKg + " килограмм");
        //задание 7

        int weight = 7;
        int weightInGrams = 7*1000;
        int weightPerDayLow = 250;
        int weightPerDayHigh = 500;
        int daysForSlim = weightInGrams/weightPerDayLow;
        System.out.println(daysForSlim + " дней потребуется, если спортсмен будет худеть на " + weightPerDayLow + " грамм.");
        int daysForSlimHigh = weightInGrams/weightPerDayHigh;
        System.out.println(daysForSlimHigh + " дней потребуется, если спортсмен будет худеть на " + weightPerDayHigh + " грамм.");
        //задание 8

        double mashaCash = 67760;
        double denisCash = 83690;
        double kristinaCash = 76230;

        double plusCashMasha = mashaCash+(mashaCash*0.1);
        System.out.println("Маша теперь получает " +(int) (plusCashMasha)+ " рублей. " + "Годовой доход вырос на " + (((int)(plusCashMasha*12))-(int)((mashaCash*12))) + " рублей");

        double plusDenisCash = denisCash+(denisCash*0.1);
        System.out.println("Денис теперь получает " +(int) (plusDenisCash)+ " рублей. " + "Годовой доход вырос на " + (((int)(plusDenisCash*12))-(int)((denisCash*12))) + " рублей");

        double plusKristinaCash = kristinaCash+(kristinaCash*0.1);
        System.out.println("Кристина теперь получает " +(int) (plusKristinaCash)+ " рублей. " + "Годовой доход вырос на " + (((int)(plusKristinaCash*12))-(int)((kristinaCash*12))) + " рублей");










    }
}