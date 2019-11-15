package demo;

import java.util.Arrays;

public class demo {
	
	public static void main(String[] args) {
		int[] ids = new int[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.print(ids[i]+",");
		}
		
		for(int i:ids) {
			System.out.print(i + ",");
		}
		System.out.print(Arrays.toString(ids));
		
		
	}
}