package net.d4y2k.jabkafx.particle;

import net.d4y2k.jabkafx.Config;
import net.d4y2k.jabkafx.Utils;

public class ParticleFactory {

	public static Particle create() {
		return Particle.builder()
				.x(Utils.getRandomDoubleFromRange(-Config.BOUNDS_OFFSET, Config.BOUNDS_OFFSET + Config.WIDTH))
				.y(Utils.getRandomDoubleFromRange(-Config.BOUNDS_OFFSET, 0))
				.size(Utils.getRandomDoubleFromRange(Config.MIN_SIZE, Config.MAX_SIZE))
				.velocity(Utils.getRandomDoubleFromRange(Config.MIN_VELOCITY, Config.MAX_VELOCITY))
				.deltaX(Utils.getRandomDoubleFromRange(Config.MIN_DELTAX_AMPLITUDE, Config.MAX_DELTAX_AMPLITUDE))
				.amplitude(Utils.getRandomDoubleFromRange(Config.MIN_DELTAX_AMPLITUDE, Config.MAX_DELTAX_AMPLITUDE))
				.time(Utils.getRandomDoubleFromRange(0, 2 * Math.PI)).deltaTime(Utils.getRandomDoubleFromRange(0, 0.08))
				.build();
	}

	private ParticleFactory() {
	}

}
