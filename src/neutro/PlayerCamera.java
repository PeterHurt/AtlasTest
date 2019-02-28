package neutro;

import atlas.objects.Camera;
import atlas.userInput.Keys;
import atlas.userInput.UserInput;

public class PlayerCamera extends Camera {
	public void update(float interval) {
		float camRot = (float) (this.getRotation().y/180*Math.PI);
		if(UserInput.keyDown(Keys.KEY_W)) {
			this.getPosition().x += 10*interval*Math.cos(camRot);
			this.getPosition().z += 10*interval*Math.sin(camRot);
		}
		if(UserInput.keyDown(Keys.KEY_S)) {
			this.getPosition().x -= 10*interval*Math.cos(camRot);
			this.getPosition().z -= 10*interval*Math.sin(camRot);
		}
		if(UserInput.keyDown(Keys.KEY_A)) {
			this.getPosition().x += 10*interval*Math.sin(camRot);
			this.getPosition().z -= 10*interval*Math.cos(camRot);
		}
		if(UserInput.keyDown(Keys.KEY_D)) {
			this.getPosition().x -= 10*interval*Math.sin(camRot);
			this.getPosition().z += 10*interval*Math.cos(camRot);
		}
//		if(UserInput.getDisplVec()) {
//			this.getRotation().x -= 60*interval;
//		}
//		if(UserInput.keyDown(Keys.KEY_DOWN)) {
//			this.getRotation().x += 60*interval;
//		}
//		if(UserInput.keyDown(Keys.KEY_LEFT)) {
//			this.getRotation().y -= 60*interval;
//			System.out.print(this.getRotation().y);
//		}
//		if(UserInput.keyDown(Keys.KEY_RIGHT)) {
//			this.getRotation().y += 60*interval;
//		}
		this.getRotation().y += UserInput.getDisplVec().x/20;
		this.getRotation().x += UserInput.getDisplVec().y/20;
	}
}