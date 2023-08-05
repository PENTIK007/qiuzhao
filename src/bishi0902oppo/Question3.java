package bishi0902oppo;

public class Question3 {
    public static void main(String[] args) {

    }
    public long tourismRoutePlanning (int scenicspot) {
        // write code here
        if (scenicspot == 1) {
            return 1;
        }
        if (scenicspot == 2) {
            return 2;
        }
        long res = tourismRoutePlanning(scenicspot - 1) + tourismRoutePlanning(scenicspot - 2);
        return res;
    }
}
