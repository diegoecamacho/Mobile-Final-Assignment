package com.iansmathew.dragblocks.shapes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.iansmathew.dragblocks.DragBlocks;

/**
 * Created by iansm on 2018-04-14.
 */

public class BaseShape {
    DragBlocks game;

    //Member properties
    private Texture texture;
    private Sprite sprite;
    private Vector2 startPos;

    public BaseShape(DragBlocks _game, Vector2 _spawnPos, String _fileName)
    {
        game = _game;

        texture = new Texture(_fileName);
        sprite = new Sprite(texture);

        startPos = _spawnPos;
        setPosition(startPos.x, startPos.y);;
    }

    public Sprite getSprite()
    {
        return sprite;
    }

    public void setPosition(float _x, float _y)
    {
        float x = _x - texture.getWidth() / 2.f;
        float y = _y - texture.getHeight() / 2.f;

        sprite.setPosition(x, y);
    }

    public void resetPosition()
    {
        setPosition(startPos.x, startPos.y);
    }

    public void draw(SpriteBatch batch)
    {
        sprite.draw(batch);
    }

    public void update(float deltaTime)
    {

    }

    public void dispose()
    {
        texture.dispose();
    }
}
