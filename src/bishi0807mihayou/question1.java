package bishi0807mihayou;

public class question1 {
    public static void main(String[] args) {

    }

    public static String duizhan(int vshengming, int vgongji, int vfangyu, int vsudu, int vbeidong, int qshengming, int qchushishengming, int qgongji, int qfangyu, int qsudu, int qbeidong, int huihe) {
        if (vshengming <= 0) {
            return "Kalpas yame te!";
        } else if (qshengming <= 0) {
            return "I love V2V forever!";
        }
        if (vshengming < 31 && vbeidong > 0) {
            vshengming += 20;
            vgongji += 15;
            vbeidong--;
            qshengming += 20;
        }
        if (vsudu > qsudu) {
            if (huihe % 3 == 0) {
                qshengming -= (vgongji - qfangyu);
            }
        }
        return null;
    }
}
