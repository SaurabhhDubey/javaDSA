public class changeArray{
    public static void main(String[] args) {
        int [] arr= {34,45,34,54,56,3,7,9};
        
        for(int i =0 ; i<arr.length; i++){
            if(i%2 ==0)
            arr[i]=arr[i]+10;
            else
            arr[i]=arr[i]*2;
            System.err.print(arr[i]+" ");
    
        }
        
    }
}