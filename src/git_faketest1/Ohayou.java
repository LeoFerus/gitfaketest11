package git_faketest1;

public class Ohayou {

    String message;

    public Ohayou() {
        this("���Ϫ誦�������ު�");
    }

    public Ohayou(String message) {
        this.message = message;
    }

    public void say() {
        System.out.println(message);
    }

}
