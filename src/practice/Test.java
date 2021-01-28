package practice;

public class Test {

    public static int arrChallenge(int [] arr){
        int mean;
        int mode;
        int sum = 0;


        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        mean = sum / arr.length;

        mode = arr[arr.length/2-1];
        System.out.println(mean);
        System.out.println("MODE *******");
        System.out.println(mode);

        if(mean == mode) {
            return 1;
        } else {return 0;}

    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,6,2};
        System.out.println(arrChallenge(arr));


    }


}
