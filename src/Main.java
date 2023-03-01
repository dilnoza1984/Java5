import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for (Integer number : num) {
            if (number % 2 == 0)
                System.out.println(number);
            }
        }
    }
