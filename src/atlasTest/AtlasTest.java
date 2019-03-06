package atlasTest;

import atlas.engine.AGame;
import atlas.engine.Engine;
import atlas.userInput.UserInput;

public class AtlasTest extends AGame {
	@Override
	protected void init() {
		Engine.showFPSinWindowTitle = true;
		this.setScene(new RegularScene());
		UserInput.disableCursor();
	}
}