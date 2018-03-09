// else를 쓰지않고도 분기할 수 있음 : 코드 지저분하게 만들지않기
public class BanElse {
    private static final boolean DONE = true;
    private static boolean status;

    static void beforeChange() {
        if (status == DONE) {
            doSomething();
        } else {
            // 다른 코드
        }
    }

    static void afterChange() {
        if (status == DONE) {
            doSomething();
            return;
        }

        doElseSomething();
    }

    static void doSomething() {

    }

    static void doElseSomething() {

    }
}
