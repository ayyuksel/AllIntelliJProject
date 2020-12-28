package day12_NestedIf;

public class AgeGroups {

        public static void main(String[] args) {
            int age = 35;
            String ageGroups = "";

            if(age >= 1 && age <= 2){ // it becomes false when age  >= 3
                ageGroups = "infant";
            }else if(age >= 3 && age <= 5){ // age <= 5,  becomes false when age >= 6
                ageGroups = "Toddler";
            }else if(age >= 6 && age <= 9){ // age <= 9, becomes false when age >= 10
                ageGroups = "Kid";
            }else if( age >= 10 && age <= 12){ // age <= 12, becomes false when age >= 13
                ageGroups = "Pre-Teen";
            }else if( age >= 13 && age <= 17){ // age <= 17, becomes false when age >= 18
                ageGroups = "Teenager";
            }else if( age >= 18 && age <= 20 ){ // age <= 20, becomes false when age >= 21
                ageGroups = "Young Adult";
            }else if( age >= 21 && age <= 39 ){ // age <= 39, becomes false when age >= 40
                ageGroups = "Adult";
            }else if(age >= 40 && age <= 49){ // age <= 49, becomes false when age >= 50
                ageGroups = "Young Middle-Aged Adult";
            }else if(age >= 50 && age <= 54){ // age <= 54, becomes false when age >= 55
                ageGroups = "Middle Aged Adult";
            }else if(age  >= 55 && age <= 64){ //age <= 64, becomes false when age >= 65
                ageGroups = "Very Young Senior Citizen";
            }else if(age >= 65 && age <= 74){ // age <= 74, becomes false when age >= 75
                ageGroups = "Young Senior Citizen";
            }else if(age >= 75 && age <= 84){ // age <= 84, becomes false when age >= 85
                ageGroups =" Senior Citizen";
            }else{
                ageGroups = "Old Senior Citizen";
            }

            System.out.println(ageGroups);




        }

}



