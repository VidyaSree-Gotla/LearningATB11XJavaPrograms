package ex_06_OOPS_Inheritance.Single_Inheritance;

//This is the Parent Class which contains some common methods and will be Used by other classed as per their need.

public class CommonToAll {
    void StartBrowser(){
        System.out.println("Starting the browser");
    }
    void ReadFile(){
        System.out.println("Reading Input File");
    }
    void OpenDB(){
        System.out.println("Opening new connection to DataBase");
    }
    void Close_Browser(){
        System.out.println("Closing the Browser");
    }
}
