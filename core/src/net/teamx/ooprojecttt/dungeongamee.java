package net.teamx.ooprojecttt;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import net.teamx.ooprojecttt.gamescreens.screens;

public class dungeongamee extends Game {
	public SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new screens(this));//setscreen trong extends game
	}

	@Override
	public void render () {
		super.render();
	}
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
    }
	
}
