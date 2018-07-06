package mineSweeper_01;

import java.util.ArrayList;

public class Field {
	public static Square [][] Square1;
	public static ArrayList<Integer> numbers;

	public Field() {
		numbers = new ArrayList<Integer>();
		Square1 = new Square[8][8];

		for (int i = 0; i < 10; i++) {
			int location = ((int) (Math.random() * 64));

			if (numbers.contains(location)) { // if the arraylist contains a bomb at the same spot
				i--;
			} else {
				numbers.add(location);
			}
			int fat = numbers.get(i);
			int row = fat / 8;
			int column = fat % 8;
			Square1[row][column] = new Bomb(0);

		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (Square1[i][j] != new Bomb(0)) {
					Square1[i][j] = new Square(bombNumber(i,j));
				}
				
			}

		}
		
	}

	public static int bombNumber(int x, int y) {
		int counter = 0;
		for (int d = x - 1; d <= x + 1; d++) {
			for (int i = y - 1; i <= y + 1; i++) {
				
				if (Square1 [d][i] == new Bomb()) {
					counter++;
				}
				
//				for (int yo = 0; yo < 10; yo++) {
//					int fatCat = numbers.get(yo);
//					
//					
//					int row = fatCat / 8;
//					int column = fatCat % 8;
//					
//					if()
//				}
			}
		}
		
		return counter;

	}

}
