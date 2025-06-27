import java.util.*;
public class SortingAlgo {
    static int a[] = {86,12,34,54,76,11,90,45};
    public static void main(String args[]){
        // inserctionSort();
        // bubbleSort();
        // selectionSort();
        // mergSort();
        // quickSort();
    }

    static void display(){
        for(int i : a){
            System.out.print(i+" ");
        }
    }


    static void quickSort(){
        quick(a,0,a.length-1);
        display();
    }
    static void quick(int a[], int l, int h){
        if(l<h){
            int pivote = quickSortLogice(a,l,h);
            quickSortLogice(a,l,pivote);
            quickSortLogice(a,pivote+1,h);
        }
    }
    static int quickSortLogice(int a[], int l, int h){
        int p = a[l];
        int i = l, j = h;
        while(i<j){
            while(a[i]<=p && i<h){
                i+=1;
            }
            while(a[j]>=p && j>l){
                j-=1;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i];
        a[l] = a[j];
        a[j] = temp;
        return j;
    }


    static void mergSort(){
        int n = a.length;
        merg(a,0,n-1);
        display();
    }

    static void merg(int a[], int l,int h){
        if(l<h){
            int m  = (l+h)/2;
            merg(a,0,m);
            merg(a, m+1, h);
            mergSortLogic(a,0,m,m+1,h);
        }
    }
    static void mergSortLogic(int a[], int l, int mid1, int mid2, int h){
        int i = l, j = mid2, k = 0;
        int temp[] = new int[h-l+1];
        while(i<=mid1 && j<=h){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }
            else{
                temp[k++] = a[j++];
            }
        }
        while(i<=mid1){
            temp[k++] = a[i++];
        }
        while(j<=h){
            temp[k++] = a[j++];
        }
        for(i=l,k=0;i<=h;i++,k++){
            a[i]=temp[k];
        }
    }


    static void selectionSort(){
        int n = a.length;
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
        display();
    }

    static void bubbleSort(){
        int n = a.length;
        boolean x = false;
        for(int i=0;i<n-1;i++){
            x = true;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    x = false;
                }
            }
            if(x == true){
                break;
            }
        }
        display();

    }

    static void inserctionSort(){
        int n = a.length;
        for(int i=0;i<n;i++){
            int max = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[max]){
                    max = j;
                }
            }
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
        }
        display();
    }
}
