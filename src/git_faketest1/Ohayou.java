package git_faketest1;

public class Ohayou {

    String message;

    public Ohayou() {
        this("안녕하세요");
    }

    public Ohayou(String message) {
        this.message = message;
    }

    public String say() {
        return message;
    }

}
