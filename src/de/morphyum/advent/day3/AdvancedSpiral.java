package de.morphyum.advent.day3;

import java.util.ArrayList;

public class AdvancedSpiral {
	private ArrayList<SpiralField> fields;
	boolean stop = false;
	
	public ArrayList<SpiralField> getFields() {
		return fields;
	}

	public AdvancedSpiral(int numberOfFields) {
		fields = new ArrayList<SpiralField>();
		int x = 0;
		int y = 0;
		int m = 1;
		String direction = "right";

		SpiralField firstfield = new SpiralField(x, y, 1);
		fields.add(firstfield);
		x++;

		for (int i = 0; i < numberOfFields -1; i++) {
			if(stop == true){
				break;
			}
			SpiralField tempfield = new SpiralField(x, y, sumNeighbors(x, y));
			fields.add(tempfield);
			
			if (direction.equals("right")) {
				if (x + 1 <= m) {
					x++;
				} else {
					direction = "up";
					y++;
				}
			} else if (direction.equals("up")) {
				if (y + 1 <= m) {
					y++;
				} else {
					direction = "left";
					x--;
				}
			} else if (direction.equals("left")) {
				if (x - 1 >= -m) {
					x--;
				} else {
					direction = "down";
					y--;
				}
			} else if (direction.equals("down")) {
				if (y - 1 >= -m) {
					y--;
				} else {
					direction = "right";
					x++;
					m++;
				}
			}

		}
		
	}

	private int sumNeighbors(int x, int y) {
		int sum = 0;
		for(SpiralField field : fields){
			if((field.getX() == x+1 || field.getX() == x-1 || field.getX() == x)){
				if((field.getY() == y+1 || field.getY() == y-1 || field.getY() == y)){
					sum += field.getContent();
				}
			}
		}
		if(sum > 325489){
			System.out.println(sum);
			stop = true;
		}
		return sum;
	}

}
