package cc.sogutucu;

public class Bekle {
    private static final int sure = 700;

    public static void bekle() {
        try {
            Thread.sleep(sure);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
