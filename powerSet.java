import java.util.*;

public class powerSet {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(7);
		arr.add(11);
		
		powerSet(arr);
	}
	
	public static void powerSet(List<Integer> arr){
		
		System.out.println("The original array: \n"+ arr.toString());
		
		//The final power set that will contain every combination
		List<ArrayList> powerSet = new ArrayList<ArrayList>();
		
		//The total number of combinations
		int total = (int) Math.pow(2, arr.size());
		
		// loop through each value from 0 to 2^n
		for (int i = 0; i < total; i++){
			
			// our temporary set that we add to the power set
			ArrayList<Integer> tempSet = new ArrayList<Integer>();
			
			// convert the integer to binary
			String num = Integer.toBinaryString(i);
			
			// pad the binary number so 1 becomes 001 for example 
			while(num.length() < arr.size()){
				num = "0"+num;
			}
			
			// build the set that matches the 1's in the binary number
			for (int j = 0; j < num.length(); j++){
				if (num.charAt(j) == '1'){
					tempSet.add(arr.get(j));
				}
			}
			
			//Adding each of the subsets to the main set
			powerSet.add(tempSet);
		}
		System.out.println("\nThe power set of this array: \n"+powerSet.toString());
		
	}

}
