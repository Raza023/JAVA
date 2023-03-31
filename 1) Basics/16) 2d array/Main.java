


public class Main {
    public static void main(String[] args) {
        int [][]myArray = new int[3][4];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j]=i+j+1;
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        int [][]secondArray = {           //jagged array
            {1,2,3},
            {1,2,3,4},
            {3,4,5,6}
        };

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
