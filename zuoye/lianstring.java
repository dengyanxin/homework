import java.util.*;
public class lianstring{
	public static void main(String[] arges){
		int [] a={1,5,10,6};
		int [] b = Arrays.copyOf(a,5);
		Arrays.sort(a);
		for(int s:a){
			System.out.print(s+"\t");
		}
		//System.out.println(Arrays.binarySearch(a,10));
		//System.out.println(Arrays.binarySearch(a,0,4,5));
	}
}