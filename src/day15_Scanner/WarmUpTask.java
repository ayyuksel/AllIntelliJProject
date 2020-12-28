package day15_Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        int numOfPeople = 50;
        int crew =0;
        int passenger=0;

        switch (numOfPeople){
            case 50:
                crew =20;
                passenger=30;
                break;
            case 75:
                crew =25;
                passenger=50;
                break;
            case 100:
                crew=30;
                passenger=70;
                break;
            default:
                System.out.println("invalid number of people");
        }
        System.out.println("Crew: "+crew);
        System.out.println("Passenger: "+passenger);
    }
}
