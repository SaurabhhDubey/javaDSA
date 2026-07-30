public class reverseArray{
    public static void main(String[] args) {
        int[] arr = {3,4,2,53,67,34,67,23};
        int n = arr.length;
        int i =0 , j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.err.print(ele+" ");
        }
    }
}