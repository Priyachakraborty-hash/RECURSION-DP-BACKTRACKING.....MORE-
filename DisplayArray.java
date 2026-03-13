import java.util.*;

public class DisplayArray 
{
    public static void main(String[] args)
    {
        //int[] arr = {10,20,30,40,50,60};
        //reversedisplay(arr,0);
          //input for max of an array using recursion
          //int[] arr = {-10,-7,-9,-5};
          //System.out.println(maxOfArray(arr, 0));
          int[] arr = {1,3,7,2,2,5,2};
          System.out.println(lastIndexOfArray(arr, 0, 2));
          //int[] arr = {-10,-7,-9,-5};
    }
    public static void display(int[] arr,int index)
    {
        if(index==arr.length) return;
        System.out.print(arr[index]+" ");
        display(arr, index+1);
        
    }
    public static void reversedisplay(int[] arr,int index)
    {
        if(index==arr.length) return;
        reversedisplay(arr, index+1);
        System.out.print(arr[index]+" ");
              
    }
    //maximum of an array using recursion
    public static int maxOfArray(int[] arr,int index)
    {
        //ek bat yaad rakhna agar humara input mai minus ke numbers ho to -1 mat lena
        //qki agar -1 loge to wo array se return nahi karega wo -1 hi return karta rahega
        //eg: {-5,-10,-3} : ex op is -3, but we will get -1.
        //thats the reason why we are taking Integer.MIN_VALUE.
         if(index == arr.length) return Integer.MIN_VALUE;
         int rmax = maxOfArray(arr, index+1);
         return Math.max(rmax, arr[index]);
  
    }
    public static int firstIndexOfArray(int[] arr,int index,int data)
    {
      if(index == arr.length) return -1;
      if(arr[index] == data) return index;
      int rindex = firstIndexOfArray(arr,index+1,data);
      return rindex;
    }
    public static int lastIndexOfArray(int[] arr,int index,int data)
    {
        if(index == arr.length) return -1;
       int li = lastIndexOfArray(arr,index+1,data);
       if(li == -1)
       {
           if(arr[index] == data)
            li = index;
       }
    return li;


    }

}
