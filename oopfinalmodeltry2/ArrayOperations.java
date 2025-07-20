public class ArrayOperations{
    public static void main(String[] args){
        int[] numbers={45, 12, 78, 23, 67, 89, 34, 56};
        int max=numbers[0];
        int min =numbers[0];
        double sum=0;

        //find max
        for(int num:numbers){
            if(num>max){
                max=num;            
                }
            if(num<min){
                min=num;
            }
            sum+=num;   
        }

        //find min
       /* for(int num:numbers){
            if(num<min){
                min=num;
            }    
        }

        double sum=0;
        for(int num:numbers){
            sum+=num;
        }*/
        double avg=sum/numbers.length;


        System.out.println("Largest number: "+max);
        System.out.println("Minimum number: "+min);
        System.out.println(sum);
        System.out.println(avg);


    }
}