package de.morphyum.advent.day3;

import java.awt.Point;
import java.util.ArrayList;

public class Spiral {
	private ArrayList<Point> fields;

	public ArrayList<Point> getFields() {
		return fields;
	}

	public Spiral(int numberOfFields) {
		fields = new ArrayList<Point>();
		int x = 0;
		int y = 0;
		int m = 1;
		String direction = "right";
		for (int i = 0; i < numberOfFields; i++) {
			Point temppoint = new Point(x, y);
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
			
			fields.add(temppoint);
		}
	}

}
