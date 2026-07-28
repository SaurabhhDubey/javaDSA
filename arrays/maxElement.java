public class maxElement{
    public static void main(String[] args) {
        int [] arr= {34,3434,2,34,3,3344,54,45,45};
        int max=arr[0];
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.err.println("maximum element is : "+max);
    }
}