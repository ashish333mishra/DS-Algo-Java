import java.io.*;
public class Main
{
	public static void main (String[] args)
	 {
	 try
	 {
	 BufferedReader rb=new BufferedReader(new InputStreamReader(System.in));
	 int t=Integer.parseInt(rb.readLine());
	 while(t--!=0)
	 {
	 int size = Integer.parseInt(rb.readLine());
	 String[] arr = rb.readLine().split(" ");
	 int[] ar = new int[arr.length];
	 for(int i = 0; i < size; i++){
	     ar[i] = Integer.parseInt(arr[i]);
	 }
	 System.out.println(ar.length);
	 int startIndex = 0,endIndex = size-1;
	 int temp;
	 while(startIndex < endIndex) {
	     temp = ar[startIndex];
	     ar[startIndex] = ar[endIndex];
	     ar[endIndex] = temp;
	     startIndex++;
	     endIndex--;
	 }
	 for(int i = 0;i < size;i++){
	     System.out.print(ar[i]+" ");
	 }
	 System.out.println();
	 }
	 
	 }
	 catch(Exception e)
	 {
	 
	 }
}
}
