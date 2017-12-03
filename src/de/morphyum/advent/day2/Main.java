package de.morphyum.advent.day2;

import java.util.ArrayList;

import de.morphyum.advent.helper.Solver;

public class Main {
	static int[] test1 = {1640,590,93,958,73,1263,1405,1363,737,712,1501,390,68,1554,959,79};
	static int[] test2 = {4209,128,131,2379,2568,2784,2133,145,3618,1274,3875,158,1506,3455,1621,3799};
	static int[] test3 = {206,1951,2502,2697,2997,74,76,78,1534,81,2775,2059,3026,77,2600,3067};
	static int[] test4 = {373,1661,94,102,2219,1967,1856,417,1594,75,100,2251,2200,1825,1291,1021};
	static int[] test5 = {57,72,51,1101,1303,60,1227,421,970,1058,138,333,1320,1302,402,1210};
	static int[] test6 = {4833,5427,179,3934,4533,5124,4832,2088,94,200,199,1114,4151,1795,208,3036};
	static int[] test7 = {759,876,110,79,1656,1691,185,544,616,312,757,1712,92,97,1513,1683};
	static int[] test8 = {1250,1186,284,107,1190,1233,573,1181,1041,655,132,547,395,146,119,515};
	static int[] test9 = {505,1726,79,180,86,1941,1597,1785,1608,1692,968,1177,94,184,91,31};
	static int[] test10 = {1366,2053,1820,1570,70,506,53,415,717,1263,82,366,74,1255,2020,1985};
	static int[] test11 = {2365,5585,2285,4424,5560,3188,3764,187,88,223,1544,5023,4013,5236,214,196};
	static int[] test12 = {1487,1305,1359,1615,6579,2623,4591,150,5030,188,146,4458,5724,5828,1960,221};
	static int[] test13 = {3114,688,3110,334,1921,153,4083,131,2234,3556,3573,3764,127,919,3293,104};
	static int[] test14 = {1008,78,1196,607,135,1409,296,475,915,157,1419,1304,153,423,163,704};
	static int[] test15 = {235,4935,4249,3316,1202,221,1835,380,249,1108,1922,5607,4255,238,211,3973};
	static int[] test16 = {1738,207,179,137,226,907,1468,1341,1582,1430,851,213,393,1727,1389,632};
	
	static int[] e1 = {5,9,2,8};
	static int[] e2 = {9,4,7,3};
	static int[] e3 = {3,8,6,5};
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<int[]> rowInputs = new ArrayList<int[]>();
		rowInputs.add(test1);
		rowInputs.add(test2);
		rowInputs.add(test3);
		rowInputs.add(test4);
		rowInputs.add(test5);
		rowInputs.add(test6);
		rowInputs.add(test7);
		rowInputs.add(test8);
		rowInputs.add(test9);
		rowInputs.add(test10);
		rowInputs.add(test11);
		rowInputs.add(test12);
		rowInputs.add(test13);
		rowInputs.add(test14);
		rowInputs.add(test15);
		rowInputs.add(test16);
		
		ArrayList<Row> rows = new ArrayList<>();
		for(int[] i : rowInputs){
			Row temprow = new Row(i);
			rows.add(temprow);
		}
		
		Solver solver = new Solver();
		
		int checksum = 0;
		for(Row r : rows){
			checksum += solver.solveChecksumRow(r.getNumbers());
		}
		System.out.println(checksum);
		
		checksum = 0;
		for(Row r : rows){
			checksum += solver.solveChecksumRow2(r.getNumbers());
		}
		System.out.println(checksum);
	}
}
