package day13_SwitchStatement;

public class Browser_Switch {
    public static void main(String[] args) {
        String browser = "Chrome";
        String selectedBrowser = "";

        switch (browser) {
            case "chrome ":
                selectedBrowser = "Chrome Browser";
                break;
            case "firefox":
                selectedBrowser = "firefox browser";
                break;
            case "opera":
                selectedBrowser = "opera browser";
                break;
            case "safari":
                selectedBrowser = "safari browser";
                break;
            case "edge":
                selectedBrowser = "edge browser";
                break;
            case "ie":
                selectedBrowser = "ie browser";
                break;
            default:
                selectedBrowser = "invalid browser";
        }
        System.out.println("selectedBrowser = " + selectedBrowser);
    }
}
