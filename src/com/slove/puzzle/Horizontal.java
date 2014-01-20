package com.slove.puzzle;

public class Horizontal {
	
	private int [][] horizontalView = null;
	
	private static int horizontal = 9;
	
	private static int verticl = 9;
	
	public Horizontal(int [][] inputView) {
		
		horizontalView = new int[horizontal][verticl];
		insertToHorizontal(inputView);
	}
	
	private void insertToHorizontal(int [][] inputView) {
		
		for (int i = 0 ; i < verticl ; i++ ){
			 horizontalView[i] = inputView[i];
		}
	}
	
	public int [] getRow(int rowNumber) {
		return horizontalView[rowNumber];
	}
	
	public int getNumber(int rowNumber,int colomNumber) {
		return horizontalView[rowNumber][colomNumber];
	}
	
	public void setNumber(int rowNumber,int colomNumber,int value) {
		
		int checkPosition  = horizontalView[rowNumber][colomNumber];
		if (checkPosition == 0){
			
			horizontalView[rowNumber][colomNumber] = value;
		}else {
			
			System.out.println("Can't put number here, It already have " + String.valueOf(checkPosition));
		}
	}
	
	public int [][] getHorizontal(){
		return horizontalView;
	}

	@Override
	public String toString() {
		
		String out = "";
		for (int i = 0 ; i < verticl; i++){
			for (int j = 0 ; j < horizontal ; j++){
				out += String.valueOf(horizontalView[i][j]) + " ";
			}
			out += "\n";
		}		
		return out;
	}
	
}
