import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Lütfen Kaç elemanlı liste gireceğinizi belirtiniz : ");
        int arrleng = input.nextInt();
        int[] arr = new int[arrleng];

        for (int i = 0;i<arrleng;i++){
            System.out.print("Lütfen " + (i+1) + ". elemanı giriniz : " );
            arr[i] = input.nextInt();
        };
        Arrays.sort(arr);
        System.out.println("Sıralaması : " + Arrays.toString(arr));
    }
}