package atlasTest;

import atlas.engine.Engine;
import atlas.engine.Window;

public class Main {
	public static void main(String[] args) {
		Window window = new Window("Space Man",1280,720,true);
		AtlasTest game = new AtlasTest();
		//Game, Window, Fixed Updates, Max Frame Rate
		Engine engine = new Engine(game, window, 20, 120);
		engine.start();
	}
}