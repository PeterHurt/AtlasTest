package neutro;

import atlas.engine.AGame;
import atlas.engine.Engine;
import atlas.userInput.UserInput;

public class Neutro extends AGame {
	@Override
	protected void init() {
		Engine.showFPSinWindowTitle = true;
		this.setScene(new RegularScene());
		UserInput.disableCursor();
	}
}