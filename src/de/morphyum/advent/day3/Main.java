package de.morphyum.advent.day3;

public class Main {

	static int input = 325489;

	public static void main(String[] args) throws Exception {
		Spiral spiral = new Spiral(325489);
		double x = spiral.getFields().get(spiral.getFields().size()-1).getX();
		double y = spiral.getFields().get(spiral.getFields().size()-1).getY();
		System.out.println(Math.abs(x) + Math.abs(y));
		
		AdvancedSpiral spiral2 = new AdvancedSpiral(325489);
	}
}
