import java.util.*;
class SearchingAlgo{
    static int a[] = {5,1,6,4,9,7,12};
    static int key = 9;
    public static void main(String args[]){
        // linearSearch();
        binarySearch();
    }

    static void binarySearch(){
        Arrays.sort(a);
        int low = 0;
        int high = a.length-1;
        int mid = (low+high)/2;
        boolean x = false;
        while(low<high){

            if(a[mid] == key){
                x = true;
                break;
            }
            else if(a[mid] > key){
                high = mid - 1;
            }
            else if(a[mid] < key){
                low = mid + 1;
            }
            mid = (low+high)/2;
        }
        if(x){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }


    static void linearSearch(){
        boolean x = false;
        for(int i=0;i<a.length;i++){
            if(a[i] == key){
                x = true;
                break;
            }
        }
        if(x){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}