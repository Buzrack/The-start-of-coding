import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class rates {

    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

    public static void meow() {

        int precide;
        int array[] = new int[5];
        
        for(int i = 0; i < 5; i++) {
            array[i] = rand.nextInt(150);
            System.out.println(array[i]);
        }

        System.out.println("press 1 to print sorted array");
        precide = scan.nextInt();

        if(precide == 1){
            Arrays.sort(array);
            for(int j = 0; j < 5; j++) {
                System.out.println(array[j]);
        
            }
        }  
    }

    public static void main(String[] args) {
        meow();
    }

}