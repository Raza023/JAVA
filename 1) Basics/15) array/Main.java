
public class Main {
    public static void main(String[] args) {

        String []strArr =new String[6];
        for (int i = 0; i < strArr.length; i++) {
            if(i==0)
            {
                strArr[i] = i+1+"st";
            }
            else if(i==1)
            {
                strArr[i] = i+1+"nd";
            }
            else if(i==2)
            {
                strArr[i] = i+1+"rd";
            }
            else
            {
                strArr[i] = i+1+"th";
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]+"\t");
        }

        System.out.println();

        int []intArr = new int[3];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i+1;
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+"\t");
        }

        System.out.println();

        double []dblArray = new double[3];
        for (int i = 0; i < dblArray.length; i++) {
            dblArray[i] = (double)i+1;
        }

        for (int i = 0; i < dblArray.length; i++) {
            System.out.print(dblArray[i]+"\t");
        }
    }
}