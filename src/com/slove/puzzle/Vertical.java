package com.slove.puzzle;

public class Vertical {
	
	private int [][] verticalView = null;
	
	private static int horizontal = 9;
	
	private static int verticl = 9;
	
	public Vertical(int [][] inputView) {
		
		verticalView = new int[horizontal][verticl];
		insertToVertical(inputView);
	}
	
	private void insertToVertical(int [][] inputView) {
		
		for (int i = 0 ; i < verticl ; i++) {
			
			for (int j = 0 ; j < horizontal ; j++) {
				
				verticalView[j][i] = inputView[i][j];
				
			}
		}
	}
	
	public int [][] getVerticl(){
		return verticalView;
	}
	
	@Override
	public String toString() {
		
		String out = "";
		for (int i = 0 ; i < verticl; i++){
			for (int j = 0 ; j < horizontal ; j++){
				out += String.valueOf(verticalView[i][j]) + " ";
			}
			out += "\n";
		}		
		return out;
	}
	

}
