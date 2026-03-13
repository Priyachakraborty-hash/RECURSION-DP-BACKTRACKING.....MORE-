public class towerOfHanoi 
{
    //TOWER OF HANOI MAI 3 DISKS HAI AUR HUME MOVE KARNA HAI
    //We need to print the steps of moving the disks from source to the destination using the helper
    //but there are certain rules we need to follow for that
    //Move one disk at a time,heavy disk on light disk is not allowed,
    //A:Source,B:destination,C:helper//Expectation: TOH(N,A,B,C)
    //faith is TOH(N-1,A,C,B), where A:Src,C:dst,B:Help
    //move n disks from src to dst
    //TOH(N-1,C,B,A),C: src,B:Dst,A:hlper
    //i have taken photo in mobile
  public static void main(String[] args)
  {
  toh(3, 'A', 'B', 'C');

  }
  public static void toh(int n,char src,char dst,char hlp)
  {   //imagine src:A,DST:B,hlp:C,
      //yaad rakhna bas ki src,dst,hlp kya hai,like konse time mai kya move karna hai.
      //pehle source se helper par jaiga,fir helper se destination, fir source par jo n diska hai wo destination par.
       //iska ek formula hai ki kitna steps aaiga
       //see photos
      if(n==0)return;
        toh(n-1, src, hlp, dst);
        System.out.println("move "+n+" th disk from "+src+" to "+dst);
        toh(n-1, hlp, dst, src);

  }
}
