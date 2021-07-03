package javaprograms;

public class ArrayInMethod {
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) 
				min=arr[i];
			
		}
		System.out.println(min);

	}
	public static void main(String[] args) {
//		int arr[]= {4,2,7,5,8,9};
//		Anonymous array
		min(new int[]{4,2,7,5,8,9});
//		min(arr);

	}

}
