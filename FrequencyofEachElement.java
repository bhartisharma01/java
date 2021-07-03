package javaprograms;

public class FrequencyofEachElement {

	public static void main(String[] args) {
		int arr[]= {1,2,8,3,2,2,2,5,1};
		int frq[]=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					 //To avoid counting same element again  
					frq[j]=visited;
				}
			}
			if(frq[i] !=visited) {
				frq[i]=count;
			}
		}
		System.out.println("Element    |        Frequency");
		System.out.println("-------------------------------");
for(int k=0;k<frq.length;k++) {
	if(frq[k] !=visited) {
	
		System.out.println(arr[k]+"         |            "+ frq[k]);
	}
}
}
}
