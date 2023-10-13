package hello.core.selfTest;

public class Hi {

    private final Hello hello;

    public Hi(Hello hello) {
        this.hello = hello;
        System.out.println("Hi.Hi");
    }

    public String getHi() {
        return hello.getLang();
    }
}
