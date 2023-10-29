package week1.day1;

public class EdgeBrowser {
    public static void main(String[] args) {
        
        Browser1 browser = new Browser1();

        String browserName = browser.launchBrowser("Edge");
        browser.loadUrl();

       
        System.out.println("Browser Name: " + browserName);
    }
}