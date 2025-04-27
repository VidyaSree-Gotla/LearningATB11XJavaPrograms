package Tasks;

public class Task013_27_March_OddOrEven_Array {
    public static void main(String[] args) {
        int[] numbers = {23,45,21,68,35,88};
        System.out.println("Even Numbers in array are: ");
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i]+" ");
            }
        }
        System.out.println("Odd Numbers in array are: ");
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]%2 !=0){
                System.out.println(numbers[i]);
            }

        }

    }
}
