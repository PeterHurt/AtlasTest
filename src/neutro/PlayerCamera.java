package neutro;

import atlas.objects.Camera;
import atlas.userInput.Controller;
import atlas.userInput.Keys;
import atlas.userInput.UserInput;

public class PlayerCamera extends Camera {
	public void update(float interval) {
		Controller controller = UserInput.getControllers().get(0);
		float camRot = (float) (this.getRotation().y/180*Math.PI);
		//controller - left stick - movement
		if(Math.abs(controller.getLeftJoyStickVert())>0.1) {
			this.getPosition().x -= 10*interval*Math.cos(camRot)*controller.getLeftJoyStickVert();
			this.getPosition().z -= 10*interval*Math.sin(camRot)*controller.getLeftJoyStickVert();
		}
		if(Math.abs(controller.getLeftJoyStickHorz())>0.1) {
			this.getPosition().x -= 10*interval*Math.sin(camRot)*controller.getLeftJoyStickHorz();
			this.getPosition().z += 10*interval*Math.cos(camRot)*controller.getLeftJoyStickHorz();
		}
		//controller - right stick - rotation
		if(Math.abs(controller.getRightJoyStickHorz())>0.1) {
			this.getRotation().y += controller.getRightJoyStickHorz()*2;
		}
		if(Math.abs(controller.getRightJoyStickVert())>0.1) {
			this.getRotation().x += controller.getRightJoyStickVert()*2;
		}
		//WASD directions
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