package net.d4y2k.jabkafx;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Screen;

public class Config {
	
	public static final double WIDTH = Screen.getPrimary().getBounds().getWidth();
	public static final double HEIGHT = Screen.getPrimary().getBounds().getHeight();
	public static final int FPS = 48;

	public static final int PARTICLES_COUNT = 600;
	
	public static final int BOUNDS_OFFSET = 10;
	
	public static final double MIN_VELOCITY = 5;
	public static final double MAX_VELOCITY = 8;
	
	public static final double MIN_SIZE = 5;
	public static final double MAX_SIZE = 8;
	
	public static final double MIN_DELTAX_AMPLITUDE = 10;
	public static final double MAX_DELTAX_AMPLITUDE = 20;
	
	public static final KeyCombination EXIT_KEY_COMBINATION = new KeyCodeCombination(KeyCode.Z, KeyCombination.CONTROL_DOWN);

	private Config() {
	}

}
