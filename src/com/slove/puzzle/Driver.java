package com.slove.puzzle;

public class Driver {

	public static void main(String[] args) {
		int [][] view = new int[][]{{ 0,6,0 , 0,0,0 , 0,4,0}
									,{0,0,7 , 3,0,6 , 8,0,0}
									,{1,0,0 , 0,0,0 , 0,0,2}
									
									,{0,0,9 , 7,3,2 , 5,0,0}
									,{0,2,0 , 0,0,0 , 0,3,0}
									,{0,0,5 , 6,4,8 , 1,0,0}
									
									,{2,0,0 , 0,0,0 , 0,0,3}
									,{0,0,3 , 9,0,5 , 2,0,0}
									,{0,7,0 , 0,0,0 , 0,9,0}};
		
	
		Horizontal horizontal = new Horizontal(view);
		Vertical vertical = new Vertical(view);
		System.out.println(horizontal.toString());
		System.out.println(vertical.toString());
		counter(view);
	}
	
	public static void counter(int [][] array){
		int [] result = new int[9];
		for(int i = 0; i < 9 ; i++){
			for (int j = 0 ; j < 9 ; j++){
				if (array[i][j] != 0){
					result[array[i][j]-1]++;
				}
			}
		}
		
		for (int k = 0 ; k < 9 ; k++){
			System.out.println(result[k]);
		}
	}

}
