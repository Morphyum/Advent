package de.morphyum.advent.day3;

public class SpiralField {
	private int x;
	private int y;
	private int content;
	
	public SpiralField(int x, int y, int content){
		this.x = x;
		this.y = y;
		this.content = content;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}
}
