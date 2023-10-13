package hello.core.lifecycle;


public class Url {

    private String newUrl;

    public Url() {
        setNewUrl("naver.com");
    }

    public String getNewUrl() {
        return newUrl;
    }

    private void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }
}
