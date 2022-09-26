package odev02.methods;

public class Main {
	public static void main(String[] args) {
		//int[] numberrs = new int[] {1, 2, 3, 4, 6, 7, 8};
		
		findNumber(new int[] {1,22,3, 7});
	}
	
	public static void findNumber(int[] numbers) {
		int find = 5;
		boolean hasIt = false;
		
		for(int num : numbers) {
			if(num == find) {
				hasIt = true;
				break;
			}
		}
		
		if(hasIt) {
			System.out.println("has the number");
		} else {
			System.out.println("doesn't have it");
		}
	}
}
