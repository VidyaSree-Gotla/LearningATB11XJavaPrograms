package ex_18_ENUM;

public enum Project_URLs{
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    Project_URLs(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
