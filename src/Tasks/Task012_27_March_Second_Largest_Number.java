package Tasks;

public class Task012_27_March_Second_Largest_Number {
    public static void main(String[] args) {
        int[] number = {21,45,13,42,56};
        //int max=number[0];
        for(int i =0;i< number.length-1;i++){
            for (int j=i+1;j< number.length;j++){
                int temp = 0;
                if (number[j] < number[i]) {

                    // Swapping
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

            System.out.println(number[1]);


    }
}
