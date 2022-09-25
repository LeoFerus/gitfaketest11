package git_faketest1;

public class Ohayou {

    String message;

    public Ohayou() {
        this("ªªªÏªèª¦ª´ª¶ª¤ªÞª¹");
    }

    public Ohayou(String message) {
        this.message = message;
    }

    public void say() {
        System.out.println(message);
    }

}
