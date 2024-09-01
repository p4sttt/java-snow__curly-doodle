package net.d4y2k.jabkafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.d4y2k.jabkafx.particle.ParticlesManager;

public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
		ParticlesManager particlesManager = new ParticlesManager();

		Canvas canvas = new Canvas(Config.WIDTH, Config.HEIGHT);
    	GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
    	graphicsContext.setFill(Color.web("0xffffff", 0.92));
    	
    	ParticlesTimer timer = new ParticlesTimer(particlesManager, graphicsContext);
    	timer.start();

    	Pane pane = new Pane(canvas);
        Scene scene = new Scene(pane, Config.WIDTH, Config.HEIGHT);
        scene.setFill(Color.TRANSPARENT);
        
        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (Config.EXIT_KEY_COMBINATION.match(event)) {
                stage.close(); 
            }
        });
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}