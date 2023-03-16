package Advance_Java.Searching_Algo;


// Best- case complexity = O (1) occurs when the search element is present at the first
//element in the search array.

//Worst- case complexity = O (n) occurs when the search element is not present in the
//set of elements or array.

//Average complexity = O (n) is referred to when the element is present somewhere
//in the search array
class Lsearch{
    public static int search(int[] arr, int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr=  {1,2,3,4,5,6,7,8,9,10};
        int key = 7;
        int res =Lsearch.search(arr,key);
        System.out.println(res);

    }
}
