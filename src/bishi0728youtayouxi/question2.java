package bishi0728youtayouxi;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        double d1 = 0;
        double d2 = 0;
        for (int i = 0; i < 21; i++) {
            d1 = d1 + Math.pow(2, i) * Integer.parseInt(s1.substring(21 - i, 21 - i + 1));
            d2 = d2 + Math.pow(2, i) * Integer.parseInt(s2.substring(21 - i, 21 - i + 1));
        }
        for (int i = 1; i < 11; i++) {
            d1 = d1 + Math.pow(2, -i) * Integer.parseInt(s1.substring(21 + i, 21 + i + 1));
            d2 = d2 + Math.pow(2, -i) * Integer.parseInt(s2.substring(21 + i, 21 + i + 1));
        }
        d1 = d1 * Math.pow(-1, Integer.parseInt(s1.substring(0, 1)));
        d2 = d2 * Math.pow(-1, Integer.parseInt(s2.substring(0, 1)));
        //System.out.println(d1);
        //System.out.println(d2);
        double dres = d1 * d2;
        //System.out.println(dres);
        int zhengshu = Math.abs((int) dres);
        double xiaoshu = Math.abs(dres % 1);
        //System.out.println(xiaoshu);
        StringBuilder res = new StringBuilder(dres >= 0 ? "0" :"1");
        StringBuilder resZhengshu = new StringBuilder();
        if (Math.abs(dres) >= 2097151) {
            resZhengshu.append("111111111111111111111");
        } else {
            while (zhengshu > 0) {
                if (zhengshu % 2 == 0) {
                    resZhengshu.append("0");
                    zhengshu /= 2;
                } else {
                    resZhengshu.append("1");
                    zhengshu /= 2;
                }
            }
        }
        int length = resZhengshu.length();
        StringBuilder zero = new StringBuilder();
        for (int i = 0; i < 21 - length; i++) {
            zero.append("0");
        }
        res.append(zero);
        res.append(resZhengshu);
        StringBuilder resXiaoshu = new StringBuilder();
        for (int j = 0; j < 10; j++) {
            if (xiaoshu * 2 >= 1) {
                xiaoshu *= 2;
                xiaoshu -= 1;
                resXiaoshu.append("1");
            } else {
                xiaoshu *= 2;
                resXiaoshu.append("0");
            }
        }
        res.append(resXiaoshu);
        double ddres = 0;
        for (int i = 0; i < 21; i++) {
            ddres = ddres + Math.pow(2, i) * Integer.parseInt(res.substring(21 - i, 21 - i + 1));
        }
        for (int i = 1; i < 11; i++) {
            ddres = ddres + Math.pow(2, -i) * Integer.parseInt(res.substring(21 + i, 21 + i + 1));
        }
        ddres = ddres * Math.pow(-1, Integer.parseInt(res.substring(0, 1)));
        System.out.println(res);
        //System.out.println(String.format("%.10f", ddres));;
        if (ddres > Double.parseDouble(String.format("%.10f", ddres))) {
            System.out.println(String.format("%.10f", ddres));
        } else {
            System.out.println(ddres);
        }

    }
}
