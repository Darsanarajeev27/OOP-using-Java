public class QuickSort {
    public static void main(String[] args) {
        String[] names = {"Darsana","Anna","Jesa"};
        System.out.println("Original list is:");
        printArray(names);

        quickSort(names,0,names.length-1);

        System.out.println("Sorted list of names(ascending order): ");
        printArray(names);
    }
    static void quickSort(String[] arr, int low ,int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, 0,pi-1);
            quickSort(arr, pi+1, high );
        }
    }
    static int partition(String[] arr, int low, int high){
        String pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j].compareToIgnoreCase(pivot)<=0){
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static void printArray(String[] arr){
        for(String name:arr){
            System.out.println(name + " ");
        }
        System.out.println();
    }
    
}
