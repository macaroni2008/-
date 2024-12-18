package mevsha;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        info(season);
        printAll();
    }
    public static void info (Season season){
        switch(season){
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
        }
    }
    public static void printAll(){
        for (Season season : Season.values()) {
            System.out.println(season.name() + " - " + season.getDescription() + " Средняя температура: "+ season.getAvgTemp() + " Среднее количество осадков: " + season.getAvgPrec());
        }
    }
}