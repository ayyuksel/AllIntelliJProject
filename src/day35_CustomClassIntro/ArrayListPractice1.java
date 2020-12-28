package day35_CustomClassIntro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {


        String[] countryNames = {"Andorra", "United Arab Emirates", "Afghanistan", "Turkey", "United States", " Antigua and Barbuda", "Albania", "Colombia", "Venezuela", "Panama", "United Kingdom", "Mexico ", "United States"};
        ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNames));//by default it will takes as an array Arrays.asList convert ot collection

        System.out.println(countries.size());
        countries.removeIf(p->p.length()>=10);//p each is string element
        System.out.println("countries = " + countries);

        System.out.println("==============================================");

        LocalDate [] arr1 = {//LocalDate is not primitive data type
                //that why it can be store in ArrayList
                LocalDate.of(2010,11,23),
                LocalDate.of(2011,11,23),
                LocalDate.of(2013,11,23),
                LocalDate.of(2014,11,23),
                LocalDate.of(2015,11,23),
                LocalDate.of(2016,11,23),
                LocalDate.of(2017,11,23),
                LocalDate.of(2018,11,23),
                LocalDate.of(2019,11,23),
                LocalDate.of(2020,11,23),

        };
        LocalDate d1 = LocalDate.of(2016,8,15);//remove date before
        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(arr1));
        dates.removeIf(p->p.isBefore(d1));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd-yyyy, EEE");
      for(LocalDate each: dates){
          System.out.println(each.format(df));
      }




    }
}
