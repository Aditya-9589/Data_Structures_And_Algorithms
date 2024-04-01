public class P7 {
    public static void main(String[] args) {

        int arr1[] ={1, 3, 3, 4, 5, 6, 7, 8, 9 ,10};
        int evenArray[] = new int[10];
        int oddArray[] = new int[10];

        for(int i = 0; i < arr1.length; i++ ) {
            if(i % 2 == 0) {
                evenArray[i] = arr1[i];
            }
            else {
                oddArray[i] = arr1[i];
            }
        }
        //  print array of even elements
        for(int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        //print array of odd elements
        for(int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}