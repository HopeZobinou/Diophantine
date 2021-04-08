/**
* Diophantine_HKZ
*
* This program checks if k equals the sum of X^3+Y^3+Z^3
* when k is 0-100 and the XYZ are -1000-1000.
*
* V0: 9/23/19 - Written by Hope Zobinou for FPHS
*/
                
public class Diophantine_HKZ
{
        
   public static void main(String[]args)
   { 
      int n=0;
      int K, X, Y, Z;
      int Ksum = 0;
      for(K = 0; K <= 100; K++)
      {
         for(X = -1000; X <= 1000; X++)
         {
            for(Y = -1000; Y <= 1000; Y++)
            {
               for(Z = -1000; Z <= 1000; Z++)
               {
                  Ksum = (X*X*X) + (Y*Y*Y) + (Z*Z*Z);

                  if(K == Ksum)
                  {
                     System.out.println("K: "+K+", X: "+X+", Y: "+Y+", Z: "+Z);
                     n++;
                     break;
                  }
                  if(X == 1000)
                  {
                     System.out.println("K: "+K+" Not found!");
                     break;
                  }
               }
               if((K == Ksum)||(X == 1000))
               {
                  break;
               }
            } 
            if((K == Ksum)||(X == 1000))
            {
               break;
            }
         
         }    
                
      }         
     System.out.println("n: "+n);
   } 
}