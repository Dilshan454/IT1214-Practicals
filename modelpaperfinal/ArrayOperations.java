public class ArrayOperations{
    public static void main(String[] args){
        int[] numbers={45, 12, 78, 23, 67, 89, 34, 56};
        int max=numbers[0];
        int min=numbers[0];

        for(int num:numbers){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("Largest number:"+max);
        System.out.println("Minimum number: "+min);
    }
}