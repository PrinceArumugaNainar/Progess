package Revision;

import java.util.HashMap;
import java.util.Map;

public class Week1counts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {10, 20, 10, 30, 20, 10};
		
		
		Map<Integer,Integer>frequency=new HashMap<>();
		
		
		for(int i : arr)
		{
			frequency.put(i, frequency.getOrDefault(i, 0)+1);
		}

		
		System.out.println("teh frequency of elments of array are: "+frequency);
	}

}
