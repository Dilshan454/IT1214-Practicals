public class ArrayOperations{
    public static void main(String[] args){
        double[] arr={12.5, 45.8, 23.1, 67.9, 34.2, 89.7, 56.3, 78.4, 91.6, 25.8};

        double max=findMax(arr);
        double min=findMin(arr);
        double avg=findAvg(arr);

        System.out.println("largest number: "+max);
        System.out.println("minimum number: "+min);
        System.out.println("average: "+avg);

    }

    public static double findMax(double[] ar){
        double max=ar[0];
        for(double num:ar){
            if(num>max){
                max=num;
            }
        }
        return max;
        
    }

    public static double findMin(double[] ar){
        double min=ar[0];
        for(double num:ar){
            if(num<min){
                min=num;
            }
        
        }
        return min;
    }

    public static double findAvg(double[] ar){
        double sum=0;
        for(double num:ar){
            sum+=num;
        }
        return sum/ar.length;
    }
}