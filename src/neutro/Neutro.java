package neutro;

import atlas.engine.AGame;
import atlas.engine.Engine;

public class Neutro extends AGame {

	@Override
	protected void init() {
	// TODO Add game logic
		Engine.showFPSinWindowTitle = true;
		this.setScene(new RegularScene());
	}

}