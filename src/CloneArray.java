
public class CloneArray {

	public static void main(String[] args) {
		
		int arr[]= {11,52,41,77};
		System.out.println("printing original array:");
		
		for(int i:arr)
		System.out.println(i);
		
		System.out.println("printing clone of the array:");
		int carr[]=arr.clone();
		
		for(int i:carr)
		System.out.println(i);
		
		System.out.println("are both equal?");
		System.out.println(arr==carr);
	}

}
