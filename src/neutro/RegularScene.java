package neutro;

import atlas.engine.Scene;
import atlas.graphical.Texture;
import atlas.objects.Entity;
import atlas.objects.entityComponents.*;
import atlas.utils.Loader;

public class RegularScene extends Scene {
	
	Entity fern = null;
	Entity sphere = null;
	PlayerCamera c = null;

	@Override
	public void cleanup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fixedUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void init() {
		ClassLoader cl = this.getClass().getClassLoader();
		try {
			Mesh fernMesh = Loader.getMesh(cl, "model.obj");
			fernMesh.setRenderBothSides(true);
			Texture fernTexture = Loader.getTexture(cl, "texture.png");
			fern = new Entity(fernMesh); 
			fern.setMaterial(new Material(fernTexture));
			fernTexture.setAtlasSize(2);
			this.addEntity(fern);
			fern.setPosition(20, -5, 0);
			fern.setSelectedTextureAtlas(2);
		} catch (Exception fern) {
			// TODO Auto-generated catch block
			fern.printStackTrace();
		}
//		try {
//			Mesh sphereMesh = Loader.getMesh(cl, "Sphere_265_128.obj");
//			sphereMesh.setRenderBothSides(true);
//			//Texture sphereTexture = Loader.getTexture(cl, "texture.png");
//			sphere = new Entity(sphereMesh); 
//			//sphere.setMaterial(new Material(sphereTexture));
//			//sphereTexture.setAtlasSize(2);
//			this.addEntity(sphere);
//			sphere.setPosition(20, -5, 10);
//			sphere.setSelectedTextureAtlas(2);
//		} catch (Exception sphere) {
//			sphere.printStackTrace();
//		}
		this.cameras.clear();
		c = new PlayerCamera();
		this.cameras.add(c);
		//UserInput.disableCursor();
	}

	@Override
	public void update(float interval) {
		c.update(interval);
	}
}