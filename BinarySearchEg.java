public class BinarySearchEg {
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first+last)/2;
        while(first<=last){
            if(arr[mid]>key){
                last = mid-1;
            }
            else if(arr[mid]==key){
                System.out.println("Element found at "+mid);
                break;
            }
            else{
                first = mid+1;
            }
            mid = (first+last)/2;
        }
        if(first>last)
            System.out.println("Element not found");
    } 

        public static void main(String args[]){
            int arr[] = {10,3,8,11,4,9};
            int key = 4;
            int last = arr.length;
            binarySearch(arr,0,last,key);
        }
    
    
}
