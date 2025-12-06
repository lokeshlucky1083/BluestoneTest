package java_Learning;

public class maxnumbers {

	public static void main(String[] args) {
		int[] nums = {45, 6, 90, 23, 21, 17, 34};
		findmax(nums);
	}

	private static void findmax(int[] arr) {
		if(arr == null || arr.length == 0) {
			System.out.println("Array is empty!");
			return;
		}
		
		int max = arr[0];
		for(int i =1; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Largest number: " +max);
		
	}

}
