public class Main {
    public static void main(String[] args) {
        byte apple = 67;
        System.out.println("Значение переменной apple с типом byte равно " + apple);
        short book = 569;
        System.out.println("Значение переменной book с типом short равно " + book);
        int cat = 27897;
        System.out.println("Значение переменной cat с типом int равно " + cat);
        long dog = 987678965549L;
        System.out.println("Значение переменной dog с типом long равно " + dog);
        float zero = 2.786f;
        System.out.println("Значение переменной zero с типом float равно " + zero);
        double quote = 27.12;
        System.out.println("Значение переменной quote с типом double равно " + quote);

        short allPage = 480;
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int onePage = allPage / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика рассчитано " + onePage + " листов бумаги");

        byte bottle = 16;
        byte time = 2;
        int capacity = bottle / time;
        int capacityTwentyMinute = capacity * 20;
        System.out.println("За 20 минут машина произвела " + capacityTwentyMinute + " штук бутылок");
        int our = time * 30;
        int dayNight = our * 24;
        int capacityDayNight = capacity * dayNight;
        System.out.println("За сутки машина произвела " + capacityDayNight + " штук бутылок");
        int threeDay = dayNight * 3;
        int capacityThreeDay = capacity * threeDay;
        System.out.println("За три дня машина произвела " + capacityThreeDay + " штук бутылок");
        int oneMonth = dayNight * 30;
        int capacityOneMonth = capacity * oneMonth;
        System.out.println("За 1 месяц машина произвела " + capacityOneMonth + " штук бутылок");

        byte whitePaint = 2;
        byte brownPaint = 4;
        byte allPaint = 120;
        int oneClass = whitePaint + brownPaint;
        int classAtSchool = allPaint / oneClass;
        int allWhitePaint = classAtSchool * whitePaint;
        int allBrownPaint = classAtSchool * brownPaint;
        System.out.println("В школе, где " + classAtSchool + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");

        byte banana = 5;
        byte weightOneBanana = 80;
        int weightFiveBanana = banana * weightOneBanana;
        byte oneHundredMilk = 105;
        int weightMilk = oneHundredMilk * 2;
        byte weightIceCream = 100;
        int iceCream = weightIceCream * 2;
        byte weightEgg = 70;
        int egg = weightEgg * 4;
        int weightAll = weightFiveBanana + weightMilk + weightIceCream + weightEgg;
        float weightInKg = weightAll / 1000f;
        System.out.println(weightInKg);

        short weightG = 7 * 1000;
        int dayA = weightG / 250;
        int dayB = weightG / 500;
        int averageDay = (dayA + dayB) / 2;
        System.out.println(averageDay);

        int mashaBefore = 67760;
        float mashaAfter = mashaBefore * 1.1f;
        float mashaDifference = mashaAfter - mashaBefore;
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        int denisBefore = 83690;
        float denisAfter = denisBefore * 1.1f;
        float denisDifference = denisAfter - denisBefore;
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        int kristinaBefore = 76230;
        float kristinaAfter = kristinaBefore * 1.1f;
        float kristinaDifference = kristinaAfter - kristinaBefore;
        System.out.println("Кристина теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");



    }

}