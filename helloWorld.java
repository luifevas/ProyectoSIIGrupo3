import java.io.*;
public class suma
{
   public static void main (String [] args)
   {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader (isr);
      try
      {
         System.out.print("Sumando 1 : ");
         int s1 = Integer.parseInt(br.readLine());
         System.out.print("Sumando 2 : ");
         int s2 = Integer.parseInt(br.readLine());
         int suma=s1+s2;
         System.out.println ("La suma es " + s1 + "+" + s2 +"="+ suma);
	 resta();
	 multiplicacion();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   public void resta(){
       System.out.print("Primer numero: ");
       int n1 = Integer.parseInt(br.readLine());
       System.out.print("Segundo numero: ");
       int n2 = Integer.parseInt(br.readLine());
       int resta = n1 - n2; 
       System.out.println("La resta " + n1 + " - " + n2 + " = " + resta);
   }

   
   public static void multiplicacion(){
	System.out.print("Primer numero: ");
       int n1 = Integer.parseInt(br.readLine());
       System.out.print("Segundo numero: ");
       int n2 = Integer.parseInt(br.readLine());
       int multiplicacion = n1 * n2; 
       System.out.println("La multiplicacion es: "   + multiplicacion);
   }

}
