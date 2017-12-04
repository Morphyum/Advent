package de.morphyum.advent.helper;

import java.util.Arrays;

public class Solver {
	public int solveCaptcha(int[] captcha) {
		int sum = 0;
		for (int i = 0; i < captcha.length - 1; i++) {
			if (captcha[i] == captcha[i + 1]) {
				sum += captcha[i];
			}
		}
		if (captcha[captcha.length - 1] == captcha[0]) {
			sum += captcha[0];
		}
		return sum;
	}

	public int solveCaptcha2(int[] captcha) {
		int sum = 0;
		for (int i = 0; i < captcha.length - 1; i++) {
			if (i + captcha.length / 2 < captcha.length) {
				if (captcha[i] == captcha[i + captcha.length / 2]) {
					sum += captcha[i];
				}
			} else {
				if (captcha[i] == captcha[i - captcha.length / 2]) {
					sum += captcha[i];
				}
			}
		}
		return sum;
	}

	public int solveChecksumRow(int[] checksumInput) {
		int diff = 0;
		int lowest = checksumInput[0];
		int highest = checksumInput[0];
		for (int i = 0; i < checksumInput.length; i++) {
			if (checksumInput[i] > highest) {
				highest = checksumInput[i];
			}
			if (checksumInput[i] < lowest) {
				lowest = checksumInput[i];
			}
		}
		diff = highest - lowest;
		return diff;
	}

	public int solveChecksumRow2(int[] checksumInput) {
		int diff = 0;
		for (int i = 0; i < checksumInput.length; i++) {
			for (int j = 1; j < checksumInput.length; j++) {
				if (checksumInput[i] > checksumInput[j]) {
					if ((checksumInput[i] % checksumInput[j]) == 0) {
						diff = checksumInput[i] / checksumInput[j];
					}
				} else if (checksumInput[i] < checksumInput[j]) {
					if ((checksumInput[j] % checksumInput[i]) == 0) {
						diff = checksumInput[j] / checksumInput[i];
					}
				}
			}
		}
		return diff;
	}
	
	public boolean solveDuplicate(String[] passphrase) {
		boolean valid = true;
		for(int i = 0; i < passphrase.length;i++) {
			for(int j = 1; j < passphrase.length; j++) {
				if(passphrase[i].equals(passphrase[j]) && i != j) {
					valid = false;
					break;
				}
			}
		}
		
		
		
		return valid;
		
	}
	
	public boolean solveAnagram(String[] passphrase) {
		boolean valid = true;
		for(int i = 0; i < passphrase.length;i++) {
			for(int j = 1; j < passphrase.length; j++) {
				char[] chars1 =  passphrase[i].toCharArray();
				char[] chars2 =  passphrase[j].toCharArray();
				Arrays.sort(chars1);
				Arrays.sort(chars2);
				String word1 = String.valueOf(chars1);
				String word2 = String.valueOf(chars2);
				if(word1.equals(word2) && i != j) {
					valid = false;
					break;
				}
			}
		}
		
		
		
		return valid;
		
	}
	
}
