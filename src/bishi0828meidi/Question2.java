package bishi0828meidi;

public class Question2 {
    public static void main(String[] args) {

    }
    public double maxProfit (double[] prices) {
        // write code here
        double minPrice = Double.MAX_VALUE;
        double maxShouyi = 0;
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            if (price - minPrice > maxShouyi) {
                maxShouyi = price - minPrice;
            }
        }
        return maxShouyi;
    }
}
