package de.morphyum.advent.helper;

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
}
