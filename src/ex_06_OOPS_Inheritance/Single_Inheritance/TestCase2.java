package ex_06_OOPS_Inheritance.Single_Inheritance;

public class TestCase2 extends CommonToAll { // here TestCase2 is using CommonToAll methods by extending its behaviours
    void RunTC2() {
        StartBrowser();
        System.out.println("---TC2 Browser Started---");
        ReadFile();
        System.out.println("---TC2 Reading Input File---");
        Close_Browser();
        System.out.println("---TC2 Browser Closed---");
    }
}

