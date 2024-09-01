package net.d4y2k.jabkafx.particle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Particle {

	private double x;
	private double y;
	
	private final double size;
	private final double velocity;
	
	private double time;
	private final double deltaTime;
	
	private double deltaX;
	private final double amplitude;

}
