package hello.core.selfTest;


public class Hello {

    private String lang;

    public Hello() {
        System.out.println("Hello.Hello");
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
