public class searchingAndSorting {

    ////Linear Search
    // static void linearSearch(int arr[], int searchFor) {
    //     int atIndex = -1;
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] == searchFor) {
    //             atIndex = i;
    //         }
    //     }
    //     if(atIndex > -1) {
    //         System.out.println("Number found at index: "+atIndex);
    //     } else {
    //         System.out.println("Number not found!");
    //     }
    // }


    ////Binary Search
    //// NOTE: in order to use binary Search array should be sorted array
    // static void binarySearch(int arr[], int val) {
    //     int left = 0;
    //     int right = arr.length-1;
    //     int mid = (left+right)/2;
        
    // while(left <= right){

    //     if(val < arr[mid]){
    //         right = mid-1;
    //     } else if(val > arr[mid]) {
    //         left = mid + 1;
    //     } else {
    //         System.out.println("Value found at index: "+mid);
    //         return;
    //     }
    //     mid = (left+right)/2;
    // }

    // if(left > right) {
    //         System.out.println("Value not found!");
    //     }

    // }


    ////print array function
    static void printArray(int arr[]) {
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }


                                       // //Sorting
    // //Bubble Sort
    // static void bubbleSort(int arr[]) {
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=1; j<arr.length-i; j++) {
    //             if(arr[j-1] > arr[j]) {
    //                 arr[j-1] = arr[j-1] + arr[j];
    //                 arr[j] = arr[j-1] - arr[j];
    //                 arr[j-1] = arr[j-1] - arr[j];
    //             }
    //         }
    //     }
    // }


    //Selection Sort
    static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
    }


    public static void main(String[] args) {
    
    int sortedArr[] = {-1,0,1,56,67,100};
    int unsortedArr[] = {2,6,2,234,1,0,-23,6};

                    //Searching 
    //Linear Search
    // linearSearch(sortedArr, 90);
    
    // //Binary Search
    // binarySearch(sortedArr, 1);

                                    // //Sorting
    // //Bubble Sort
    // bubbleSort(unsortedArr);
    //array afterSorting
    printArray(unsortedArr);

    //Selection Sort
    selectionSort(unsortedArr);
    //arrayAfterSorting
    System.out.println("\nunsorted array after sorting: ");
    printArray(unsortedArr);
    }
}
