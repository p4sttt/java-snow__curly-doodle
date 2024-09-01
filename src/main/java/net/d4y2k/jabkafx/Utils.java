package net.d4y2k.jabkafx;

import java.util.Random;

public class Utils {
	
	private static final Random random = new Random();
	
	public static double getRandomDoubleFromRange(double start, double end) {
		return start + random.nextDouble() * (end - start);
	}
	
	public static double gerRandom() {
		return random.nextDouble();
	}
	
	public static double calcDeltaXUltimate(double time) {
		return Math.sin(1.2 * time) + Math.cos(0.3 * time) + Math.cos(1.1 * time) + Math.cos(0.8 * time);
	}

}
