package DSA.Array;
import java.util.*;
public class BuyAndSellStocks {
    public static int Stocks(int Price[]){
        int BuyPrice=Integer.MAX_VALUE; // +Infinity
        int MaxProfit=0;
        for (int i=0;i<Price.length;i++){
            if (BuyPrice<Price[i]){
                int Profit=Price[i]-BuyPrice;
                MaxProfit=Math.max(Profit,MaxProfit);
            }
            else {
                BuyPrice=Price[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int Price[]={7,1,5,3,6,4};
        System.out.println("Max Profit Price Stock = "+Stocks(Price));
    }
}
