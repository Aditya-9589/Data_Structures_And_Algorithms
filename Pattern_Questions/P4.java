import java.util.Scanner;

class main {

    static void pattern4(int n) {
        // This is the outer loop which will loop for the rows.

        for(int i = 1; i <= n; i++) {
            // This is the inner loop which loops for the columns
            // no. of columns = row number for each line here.
            // Here, we print numbers from 1 to the row number
            // instead of stars in each row.
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // As soon as numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Here, we have taken the value of n as 5.
        // int n = 5;
        // pattern3(n);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eneter the value of n: ");
        int n = scanner.nextInt();

        scanner.close();

        // In Java, when you use a Scanner object to read input 
        // from the user via System.in, it's important to close 
        // the Scanner object after you've finished using it. 
        // The close() method is used to release the resources 
        // held by the Scanner object, including the underlying 
        // input stream (System.in in this case). This ensures 
        // that system resources are properly managed and prevents 
        // potential resource leaks.

        pattern4(n);
        
    }
}
 