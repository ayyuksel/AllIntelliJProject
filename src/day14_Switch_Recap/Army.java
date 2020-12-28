package day14_Switch_Recap;

public class Army {
    public static void main(String[] args) {
        String citizen = "USA";
        boolean isResident = true;
        boolean isAlien = false;
        boolean hasHighSchoolDiploma = true;
        int age = 30;
        int numberOfDependants = 3;
        if (citizen == "USA" || isResident || isAlien) {
            if (age >= 17 && age <= 34) {
                if (hasHighSchoolDiploma) {
                    if(numberOfDependants<=2) {
                        System.out.println("you are qualified for the army");
                    }else{
                        System.err.println("you must have less 2 dependants");
                    }
                } else {
                    System.err.println("you must have high school diploma");
                }

            } else {
                System.err.println("you must be between 17 to 34");
            }

        } else {
            System.err.println("You must be U.S citizen or a resident or alien");
        }


    }
}
