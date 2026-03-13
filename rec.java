class rec
{

    //the basic concept of recursion is basically, we have faith and expectation.
    //once we are good with faith, we can meet the expectation.
    //Agar recursion kabhi bhi result return karta hai toh usko either store kar lo ya fir use kar lo
    public  static void main(String[] args) 
    {   
        //fact
        // int n = 5;
        // int res = fact(n);
        // System.out.println(res);
        //pow
        //int x = 2,n=5;
        //System.out.println(powrec(x, n));
        // int x =2,n=32;
        // System.out.println(betterpow(x, n));
         //print zigzag
         printZigZag(3);
    }
    //finding factorial using recursion
    public static int fact(int n)
    {
       if(n==0)
       {
           return 1;
       }
    // int fnm1 = fact(n-1);
    // int fn = fnm1 * n;
    // return fn;
      return fact(n-1)* n;
    }
//finding power using recursion
public static int powrec(int x,int n)
{
    //this is linear approach, jitna n hai utne leveles tak jaiga
    //eg agar 2 to the po 5 hai toh 5 tak jaiga
    if(n==0)
    {
       return 1;
    }
    return powrec(x,n-1)*x;
}
public static long betterpow(long x, long n)
{
    //ye better approach hai, isme agar 2^32  hai toh wo 16 levels tak jake solve hoga
    //that means ye log(n) approach hai, means log base 2(32) levels mai ho jaiga chahe 1000000000 levels ho, java mai code fatega agar 1000000000 levels hai
    //recursion mai humesha
    if(n==0)
        {
           return 1;
        }
long firsthalf = betterpow(x,n/2);
long xn = firsthalf*firsthalf;
return n%2==0 ?xn:xn*x;


}
public static void printZigZag(int n)
{
    //call 1//pre area is somewhere before all the calls
    //call 2//in area is between all the calls
    //call 3//post area is after all the calls.
    if(n==0) return;
    System.out.println("Pre: "+n);
    printZigZag(n-1);
    System.out.println("In: "+n);
    printZigZag(n-1);
    System.out.println("Post: "+n);
}
}