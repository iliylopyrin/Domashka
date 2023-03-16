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
        int adultsBilet = 70;
        double childrenBilet = 70 - adultsBilet * 0.5;
        double pensionerBilet = 70 - adultsBilet * 0.3;



        // циклы
        while ( adults >= adult ){
            adultSum = adultSum + adultsBilet;
            adult ++;
        }
        while (pensioner<= pensioners) {
            pensionerSum = pensionerSum + pensionerBilet;
            pensioner ++;


        }
        while (children <= childrens ) {
            childrenSum = childrenSum + childrenBilet;
            children ++;


        }
        // ну и сама суть
        System.out.println(adult + "за ребенка");

        double sum = adultSum + childrenSum + pensionerSum;

        System.out.println(sum);



    }
}