package net.d4y2k.jabkafx.particle;

import net.d4y2k.jabkafx.Config;

public class ParticlesManager {

	private final Particle[] particles = new Particle[Config.PARTICLES_COUNT];
	
	public ParticlesManager() {
		for (int i = 0; i < Config.PARTICLES_COUNT; i++) {
			particles[i] = ParticleFactory.create();
		}
	}
	
	public int getParticlesCount() {
		return particles.length;
	}
	
	public Particle getParticle(int index) {
		if (index >= particles.length) {
			return null;
		}

		return particles[index];
	}
	
	public void setParticle(int index, Particle particle) {
		if (index >= particles.length) {
			return;
		}
		
		particles[index] = particle;
	}

}
