package net.d4y2k.jabkafx;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import net.d4y2k.jabkafx.particle.Particle;
import net.d4y2k.jabkafx.particle.ParticleFactory;
import net.d4y2k.jabkafx.particle.ParticlesManager;

public class ParticlesTimer extends AnimationTimer {

	public static final long NANOS_PER_FRAME = 1_000_000_000 / Config.FPS;

	private final ParticlesManager particlesManager;
	private final GraphicsContext gc;

	private long lastUpdate = 0L;

	public ParticlesTimer(ParticlesManager particlesManager, GraphicsContext gc) {
		this.particlesManager = particlesManager;
		this.gc = gc;
	}

	@Override
	public void handle(long now) {
		if (now - lastUpdate < NANOS_PER_FRAME)
			return;

		lastUpdate = now;
		gc.clearRect(0, 0, Config.WIDTH, Config.HEIGHT);
		
		for (int i = 0; i < particlesManager.getParticlesCount(); i++) {
			Particle particle = particlesManager.getParticle(i);

			updateParticle(particle);
			renderParticle(particle);
			
			if (particle.getY() > Config.HEIGHT + Config.BOUNDS_OFFSET) {
				particlesManager.setParticle(i, ParticleFactory.create());
	        }
		}
	}

	private void updateParticle(Particle particle) {	
		particle.setY(particle.getY() + particle.getVelocity());
		particle.setTime(particle.getTime() + particle.getDeltaTime());
		particle.setDeltaX(Utils.calcDeltaXUltimate(particle.getTime()) * particle.getAmplitude());
	}

	public void renderParticle(Particle particle) {
		gc.fillOval(particle.getX() + particle.getDeltaX(), particle.getY(), particle.getSize(), particle.getSize());
	}

}
