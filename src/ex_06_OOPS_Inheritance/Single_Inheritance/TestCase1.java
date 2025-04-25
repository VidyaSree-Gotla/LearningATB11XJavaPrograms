package ex_06_OOPS_Inheritance.Single_Inheritance;

public class TestCase1 extends CommonToAll{// here TestCase1 is using CommonToAll methods by extending its behaviours
    void RunTC1(){
        StartBrowser();
        System.out.println("---TC1 Browser Started---");
        OpenDB();
        System.out.println("----TC1 DB Connection Established---");
    }

}
