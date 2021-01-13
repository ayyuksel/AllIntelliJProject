package Office_Hours.Practice_11_25_2020;

public class MethodPractice {
    public static void main(String[] args) {
        divisibleBy3Between1To100();
        divisibleBy3(50,50);
        grade(-50);
        grade(100);
        eligibleToVote(25,true);
        eligibleToVote(15,true);
        eligibleToVote(24,false);
    }

    public static void divisibleBy3Between1To100(){
        for (int i=1; i<=100; i++){
            if(i%3!=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void divisibleBy3(int start, int end){
        if(end<=start){
            System.out.println("Invalid numbers");
            return;//exit current method
        }
        for (int i=start; i<=end; i++){
            if(i%3!=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

    }


    public static void grade(int score){
        if(score<0 || score>100){
            System.out.println("invalid score");
            return;//exit the current only method
        }
        char grade=(score>=90)?'A' :(score>=80)? 'B' :(score>=70)?'C' :(score>=60)?'D':'F';

        switch (grade){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
        }


    }


    public static void eligibleToVote(int age, boolean isUSCitizen){
        if(age<18){
            System.out.println("You must be at least 18 years old");
            return;
        }

        if(isUSCitizen==false){
            System.out.println("You must be Us citizen");
            return;
        }
        System.out.println("You are eligible to vote");
    }





}
