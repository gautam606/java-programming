public class p3_1 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE; // lowest price seen so far
        int maxProfit = 0;                // best profit found so far

        for (int price : prices) {
            
            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;


            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }
}
