//Learning comments can be anywhere in a java code
//This code does not maintain the order of elements as order does not matter over here
//Problem can be twisted by asking to maintain the order
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(rb.readLine());
		while ( testcases-- != 0 ) {
		    int size = Integer.parseInt(rb.readLine());
		    int[] array = new int[size];
		    for(int i = 0 ; i < size ; i++) {
		        array[i] = Integer.parseInt(rb.readLine());
		    }
		    int firstPositiveIndex = 0;
		    int temp;
		    for(int i = 0; i < size ; i++){
		        if(array[i] < 0 && firstPositiveIndex == i)
		            firstPositiveIndex++;
		        else if(firstPositiveIndex < i && array[i] < 0){
		            temp = array[firstPositiveIndex];
		            array[firstPositiveIndex] = array[i];
		            array[i] = temp;
		            firstPositiveIndex++;
		        }
		    }
		    for(int i = 0; i < size; i++) {
		        System.out.print(array[i]+" ");
		    }
		}
	}
}
