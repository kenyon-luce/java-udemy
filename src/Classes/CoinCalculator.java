package Classes;
import java.util.Arrays;

public class CoinCalculator {
    public static void main(String[] args){
        int amount = 1; 
        int[] values = {1, 3, 5};
        
        Arrays.sort(values);

        int coins = 0;

        do{
            int i = 1;
            coins += 1;
            if(amount >= values[values.length - i]) {
                amount -= values[values.length - i];
            } else {
                i += 1; 
                amount -= values[values.length - i];
            } 
        } while (amount > 0);

        System.out.println(coins + " coins have been used!");
    }
}
