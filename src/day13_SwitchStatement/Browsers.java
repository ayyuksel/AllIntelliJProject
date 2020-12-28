package day13_SwitchStatement;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "chrome";


        boolean valid = browserName=="chrome" || browserName =="firefox" || browserName=="opera"
                || browserName =="safari" || browserName=="edge" || browserName=="ie";


        if(valid){
            if (browserName == "chrome") {

                System.out.println("Chrome browser is selected");
            }else if(browserName=="firefox"){
                System.out.println("firefox browser is selected");
            }else if(browserName == "opera"){
                System.out.println("opera browser is selected");
            }else if(browserName=="safari"){
                System.out.println("safari browser is selected");
            }else if(browserName=="edge"){
                System.out.println("edge browser is selected");
            }else {
                System.out.println("ie browser is selected");
            }




        }else {
            System.out.println("No such a browser");
        }







    }
}
