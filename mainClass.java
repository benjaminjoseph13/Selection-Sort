import java.util.Scanner;
public class mainClass {

        final static int size = 10;
        public static int[] number = new int[size];

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Number");

        for(int x=0;x<=9;x++){
            System.out.print("Number "+ (x+1) + ": ");
            number[x] = input.nextInt();
        }

        System.out.println("\n(BUBBLE SORTING)");
        bubbleSort bubble = new bubbleSort(number);
        bubble.Ascending();
        bubble.Descending();

        System.out.println("\n\n(INSERTION SORT)");
        insertionSort insert = new insertionSort(number);
        insert.Ascending();
        insert.Descending();

        System.out.println("\n\n(SELECTION SORT)");
        selectionSort select = new selectionSort(number);
        select.Ascending();
        select.Descending();
    }
}
