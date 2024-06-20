class Maths
{
   public static void main(String[]args)
   {
   int num=10,num1=20;
   char rate='+'; 
   switch(rate)
   {
   case'+':
     System.out.println("addition"+(num+num1));break;
   case'-':
     System.out.println("sub"+(num-num1));break;
    default:
      System.out.println("invalid");break;

   }
   }
}