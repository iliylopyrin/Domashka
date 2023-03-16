public class Main {
    public static void main(String[] args){

        int adults = 9;    // взрослые
        int pensioners = 5;    // пенсионеры
        int childrens = 11;// дети

        //по одному человеку
        int adult = 1;
        int pensioner = 1;
        int children = 1;

        // сумма
        double pensionerSum = 0;
        int  adultSum = 0;
        double childrenSum = 0;

       // само задание:
        // найти сколько стоит билет, и посчитать сумму билетов

        // билеты
        int adultsBillet = 70;
        double childrenBillet = 70 - adultsBillet * 0.5;
        double pensionerBillet = 70 - adultsBillet * 0.3;



        // циклы
        while ( adults >= adult ){
            adultSum = adultSum + adultsBillet;
            adult ++;
        }
        while (pensioner<= pensioners) {
            pensionerSum = pensionerSum + pensionerBillet;
            pensioner ++;


        }
        while (children <= childrens ) {
            childrenSum = childrenSum + childrenBillet;
            children ++;


        }
        // ну и сама суть
        System.out.println(adultsBillet + " " + "за взрослого");
        System.out.println(pensionerBillet + " " + "за пенсионера");
        System.out.println(childrenBillet + " " + "за ребенка");
        double sum = adultSum + childrenSum + pensionerSum;

        System.out.println(sum);



    }
}
