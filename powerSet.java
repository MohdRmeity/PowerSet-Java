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
		
		
		for (int i = 0; i < total; i++){
			ArrayList<Integer> tempSet = new ArrayList<Integer>();
			
			String num = Integer.toBinaryString(i);
			
			// adding 0 to 1, 
			while(num.length() < arr.size()){
				num = "0"+num;
			}
			
			for (int j = 0; j < num.length(); j++){
				if (num.charAt(j) == '1'){
					tempSet.add(arr.get(j));
				}
			}
			//System.out.println(tempSet.toString());
			powerSet.add(tempSet);
		}
		System.out.println(powerSet.toString());
		
	}

}
