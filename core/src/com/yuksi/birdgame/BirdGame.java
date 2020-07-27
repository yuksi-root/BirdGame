package com.yuksi.birdgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;

import java.util.Random;

public class BirdGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture background;
    Texture bird;
    Texture bird2;
    Texture textureArrays[];
    Texture ghostsArray[];
    Texture enemy1;
    Texture enemy2;
    Texture enemy3;
    Texture enemyw1;
    Texture enemyw2;
    Texture enemyw3;
    Texture enemyw4;
    Texture enemyw5;
    Texture enemyw6;
    Texture enemyw7;
    Texture enemyw8;
    Texture enemyw9;
    Texture enemyw10;
    Texture enemyw11;
    Texture enemyw12;
    Texture enemyw13;
    Texture enemyw14;
    Texture enemyw15;
    Texture enemyw16;
    Texture enemyw17;
    Texture enemyw18;
    Texture enemyw19;
    Texture enemyw20;
    Texture enemyw21;
    Texture enemyw22;
    Texture enemyw23;
    Texture enemyw24;
    Texture enemyw25;
    Texture enemyw26;
    Texture enemyw27;
    Texture enemyw28;
    Texture enemyw29;
    Texture enemyw30;
    Texture enemyw31;
    Texture enemyw32;
    Texture enemyw33;
    Texture enemyw34;
    Texture enemyw35;
    Texture enemyw36;
    Texture enemyw37;
    Texture enemyw38;
    Texture enemyw39;
    Texture enemyw40;
    Texture enemyw41;
    Texture enemyw42;
    Texture enemyw43;
    Texture enemyw44;
    Texture enemyw45;
    Texture enemyw46;
    Texture enemyw47;
    Texture enemyw48;
    Texture enemyw49;
    Texture enemyw50;
    Texture enemyw51;
    Texture enemyw52;
    Texture enemyw53;
    Texture enemyw54;
    Texture enemyw55;
    Texture enemyw56;
    Texture enemyw57;
    Texture enemyw58;
    Texture enemyw59;
    Texture enemyw60;
    Texture enemyw61;
    Texture enemyw62;
    Texture enemyw63;
    Texture enemyw64;
    Texture enemyw65;
    Texture enemyw66;
    Texture enemyw67;
    Texture enemyw68;
    Texture enemyw69;
    Texture enemyw70;
    Texture enemyw71;
    Texture enemyw72;
    Texture enemyw73;
    Texture enemyw74;
    Texture enemyw75;

    Texture enemy1a;
    Texture enemy2a;
    Texture enemy3a;
    Texture enemy4a;
    Texture enemy5a;
    Texture enemy1b;
    Texture enemy2b;
    Texture enemy3b;
    Texture enemy4b;
    Texture enemy5b;
    Texture enemy1c;
    Texture enemy2c;
    Texture enemy3c;
    Texture enemy4c;
    Texture enemy5c;

    float birdX = 0;
    float birdY = 0;
    int gameState = 0;
    float velocity = 0;
    float gravity = 0.4f;
    float enemyVelocity = 10;
    Random random;
    int score = 0;
    int scoredEnemy = 0;
    BitmapFont font;
    BitmapFont font2;

    Rectangle birdRect;

    ShapeRenderer shapeRenderer;

    int numberOfEnemy = 4;

    float[] enemyX = new float[numberOfEnemy];

    float[] enemyOffSet1 = new float[numberOfEnemy];
    float[] enemyOffSet2 = new float[numberOfEnemy];
    float[] enemyOffSet3 = new float[numberOfEnemy];

    float distance = 0;

    Circle[] enemyCircles1;
    Circle[] enemyCircles2;
    Circle[] enemyCircles3;

    Rectangle[] enemyRect1;
    Rectangle[] enemyRect2;
    Rectangle[] enemyRect3;

    int j;
    int g;

    float timeSeconds = 0f;
    float period = 0.00f;

    @Override
    public void create() {//setup
        batch = new SpriteBatch();

        enemyw1 = new Texture("wasp1.jpg");
        enemyw2 = new Texture("wasp2.jpg");
        enemyw3 = new Texture("wasp3.jpg");
        enemyw4 = new Texture("wasp4.jpg");
        enemyw5 = new Texture("wasp5.jpg");

        enemyw6 = new Texture("wasp6.jpg");
        enemyw7 = new Texture("wasp7.jpg");
        enemyw8 = new Texture("wasp8.jpg");
        enemyw9 = new Texture("wasp9.jpg");
        enemyw10 = new Texture("wasp10.jpg");

        enemyw11 = new Texture("wasp11.jpg");
        enemyw12 = new Texture("wasp12.jpg");
        enemyw13 = new Texture("wasp13.jpg");
        enemyw14 = new Texture("wasp14.jpg");
        enemyw15 = new Texture("wasp15.jpg");

        enemyw16 = new Texture("wasp16.jpg");
        enemyw17 = new Texture("wasp17.jpg");
        enemyw18 = new Texture("wasp18.jpg");
        enemyw19 = new Texture("wasp19.jpg");
        enemyw20 = new Texture("wasp20.jpg");

        enemyw21 = new Texture("wasp21.jpg");
        enemyw22 = new Texture("wasp22.jpg");
        enemyw23 = new Texture("wasp23.jpg");
        enemyw24 = new Texture("wasp24.jpg");
        enemyw25 = new Texture("wasp25.jpg");

        enemyw26 = new Texture("wasp26.jpg");
        enemyw27 = new Texture("wasp27.jpg");
        enemyw28 = new Texture("wasp28.jpg");
        enemyw29 = new Texture("wasp29.jpg");
        enemyw30 = new Texture("wasp30.jpg");

        enemyw31 = new Texture("wasp31.jpg");
        enemyw32 = new Texture("wasp32.jpg");
        enemyw33 = new Texture("wasp33.jpg");
        enemyw34 = new Texture("wasp34.jpg");
        enemyw35 = new Texture("wasp35.jpg");

        enemyw36 = new Texture("wasp36.jpg");
        enemyw37 = new Texture("wasp37.jpg");
        enemyw38 = new Texture("wasp38.jpg");
        enemyw39 = new Texture("wasp39.jpg");
        enemyw40 = new Texture("wasp40.jpg");

        enemyw41 = new Texture("wasp41.jpg");
        enemyw42 = new Texture("wasp42.jpg");
        enemyw43 = new Texture("wasp43.jpg");
        enemyw44 = new Texture("wasp44.jpg");
        enemyw45 = new Texture("wasp45.jpg");

        enemyw46 = new Texture("wasp46.jpg");
        enemyw47 = new Texture("wasp47.jpg");
        enemyw48 = new Texture("wasp48.jpg");
        enemyw49 = new Texture("wasp49.jpg");
        enemyw50 = new Texture("wasp50.jpg");

        enemyw51 = new Texture("wasp51.jpg");
        enemyw52 = new Texture("wasp52.jpg");
        enemyw53 = new Texture("wasp53.jpg");
        enemyw54 = new Texture("wasp54.jpg");
        enemyw55 = new Texture("wasp55.jpg");

        enemyw56 = new Texture("wasp56.jpg");
        enemyw57 = new Texture("wasp57.jpg");
        enemyw58 = new Texture("wasp58.jpg");
        enemyw59 = new Texture("wasp59.jpg");
        enemyw60 = new Texture("wasp60.jpg");

        enemyw61 = new Texture("wasp61.jpg");
        enemyw62 = new Texture("wasp62.jpg");
        enemyw63 = new Texture("wasp63.jpg");
        enemyw64 = new Texture("wasp64.jpg");
        enemyw65 = new Texture("wasp65.jpg");

        enemyw66 = new Texture("wasp66.jpg");
        enemyw67 = new Texture("wasp67.jpg");
        enemyw68 = new Texture("wasp68.jpg");
        enemyw69 = new Texture("wasp69.jpg");
        enemyw70 = new Texture("wasp70.jpg");

        enemyw71 = new Texture("wasp71.jpg");
        enemyw72 = new Texture("wasp72.jpg");
        enemyw73 = new Texture("wasp73.jpg");
        enemyw74 = new Texture("wasp74.jpg");
        enemyw75 = new Texture("wasp75.jpg");

        background = new Texture("back3.jpg");

        bird = new Texture("br1.jpg");
        bird2 = new Texture("br2.jpg");

        enemy1 = new Texture("wasp1.jpg");
        enemy2 = new Texture("wasp1.jpg");
        enemy3 = new Texture("wasp1.jpg");

        enemy1a = new Texture("g1a.jpg");
        enemy2a = new Texture("g2a.jpg");
        enemy3a = new Texture("g3a.jpg");
        enemy4a = new Texture("g4a.jpg");
        enemy5a = new Texture("g5a.jpg");

        enemy1b = new Texture("g1b.jpg");
        enemy2b = new Texture("g2b.jpg");
        enemy3b = new Texture("g3b.jpg");
        enemy4b = new Texture("g4b.jpg");
        enemy5b = new Texture("g5b.jpg");

        enemy1c = new Texture("g1c.jpg");
        enemy2c = new Texture("g2c.jpg");
        enemy3c = new Texture("g3c.jpg");
        enemy4c = new Texture("g4c.jpg");
        enemy5c = new Texture("g5c.jpg");

        j = 0;
        g = 0;
        ghostsArray = new Texture[]{enemy1, enemyw1,
                enemyw2,
                enemyw3,
                enemyw4,
                enemyw5,

                enemyw6,
                enemyw7,
                enemyw8,
                enemyw9,
                enemyw10,

                enemyw11,
                enemyw12,
                enemyw13,
                enemyw14,
                enemyw15,

                enemyw16,
                enemyw17,
                enemyw18,
                enemyw19,
                enemyw20,

                enemyw21,
                enemyw22,
                enemyw23,
                enemyw24,
                enemyw25, enemy2, enemyw26,
                enemyw27,
                enemyw28,
                enemyw29,
                enemyw30,

                enemyw31,
                enemyw32,
                enemyw33,
                enemyw34,
                enemyw35,

                enemyw36,
                enemyw37,
                enemyw38,
                enemyw39,
                enemyw40,

                enemyw41,
                enemyw42,
                enemyw43,
                enemyw44,
                enemyw45,

                enemyw46,
                enemyw47,
                enemyw48,
                enemyw49,
                enemyw50, enemy3, enemyw51,
                enemyw52,
                enemyw53,
                enemyw54,
                enemyw55,

                enemyw56,
                enemyw57,
                enemyw58,
                enemyw59,
                enemyw60,

                enemyw61,
                enemyw62,
                enemyw63,
                enemyw64,
                enemyw65,

                enemyw66,
                enemyw67,
                enemyw68,
                enemyw69,
                enemyw70,

                enemyw71,
                enemyw72,
                enemyw73,
                enemyw74,
                enemyw75,};
        textureArrays = new Texture[]{bird, bird, bird2};

        distance = Gdx.graphics.getWidth() / 2;//ejderler arası bosluk
        random = new Random();
        birdX = Gdx.graphics.getWidth() / 2 - bird.getHeight() * 4;//*4
        birdY = Gdx.graphics.getHeight() / 3;

        birdRect = new Rectangle();

        shapeRenderer = new ShapeRenderer();

        enemyCircles1 = new Circle[numberOfEnemy];
        enemyCircles2 = new Circle[numberOfEnemy];
        enemyCircles3 = new Circle[numberOfEnemy];

        enemyRect1 = new Rectangle[numberOfEnemy];
        enemyRect2 = new Rectangle[numberOfEnemy];
        enemyRect3 = new Rectangle[numberOfEnemy];

        font = new BitmapFont();
        font.setColor(Color.WHITE);
        font.getData().setScale(4);

        font2 = new BitmapFont();
        font2.setColor(Color.WHITE);
        font2.getData().setScale(6);

        for (int i = 0; i < numberOfEnemy; i++) {

            enemyOffSet1[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
            enemyOffSet2[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
            enemyOffSet3[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));

            while (Math.abs(enemyOffSet1[i] - enemyOffSet2[i]) < Gdx.graphics.getHeight() / 10 + 12) {
                enemyOffSet2[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                if (Math.abs(enemyOffSet1[i] - enemyOffSet2[i]) > Gdx.graphics.getHeight() / 10 + 12)
                    break;
            }
            while (Math.abs(enemyOffSet2[i] - enemyOffSet3[i]) < Gdx.graphics.getHeight() / 10 + 12 || Math.abs(enemyOffSet1[i] - enemyOffSet3[i]) < Gdx.graphics.getHeight() / 10 + 12) {
                enemyOffSet3[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                if (Math.abs(enemyOffSet2[i] - enemyOffSet3[i]) > Gdx.graphics.getHeight() / 10 + 12 && Math.abs(enemyOffSet1[i] - enemyOffSet3[i]) > Gdx.graphics.getHeight() / 10 + 12)
                    break;
            }


            enemyX[i] = Gdx.graphics.getWidth() - enemy1.getWidth() / 2 + i * distance;

            enemyRect1[i] = new Rectangle();
            enemyRect2[i] = new Rectangle();
            enemyRect3[i] = new Rectangle();


        }
    }

    @Override
    public void render() {//gameloop
        batch.begin();

        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());//arkaplan
        period = 0.1f;
        double periods = 0.000000000000000000001f;
        if (gameState == 1) {

            timeSeconds += Gdx.graphics.getRawDeltaTime();
            if (timeSeconds > period) {
                timeSeconds -= period;

                if (j >= 2)
                    j = 0;
                j++;

            }
            if (timeSeconds > periods) {
                if (g >= 77)
                    g = 0;
                g++;
            }


            if (enemyX[scoredEnemy] < birdX) {
                score++;

                if (scoredEnemy < numberOfEnemy - 1) {
                    scoredEnemy++;
                } else {
                    scoredEnemy = 0;
                }
            }

            if (Gdx.input.justTouched()) {
                velocity = -5;
            }

            for (int i = 0; i < numberOfEnemy; i++) {
                if (enemyX[i] < 0)//ekrandan dısarı cıkmaması için <0
                {
                    enemyX[i] = enemyX[i] + numberOfEnemy * distance;//*2


                    enemyOffSet1[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                    enemyOffSet2[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                    enemyOffSet3[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));

                    while (Math.abs(enemyOffSet1[i] - enemyOffSet2[i]) < Gdx.graphics.getHeight() / 10 + 12) {
                        enemyOffSet2[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                        if (Math.abs(enemyOffSet1[i] - enemyOffSet2[i]) > Gdx.graphics.getHeight() / 10 + 12)
                            break;
                    }
                    while (Math.abs(enemyOffSet2[i] - enemyOffSet3[i]) < Gdx.graphics.getHeight() / 10 + 12 || Math.abs(enemyOffSet1[i] - enemyOffSet3[i]) < Gdx.graphics.getHeight() / 10 + 12) {
                        enemyOffSet3[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                        if (Math.abs(enemyOffSet2[i] - enemyOffSet3[i]) > Gdx.graphics.getHeight() / 10 + 12 && Math.abs(enemyOffSet1[i] - enemyOffSet3[i]) > Gdx.graphics.getHeight() / 10 + 12)
                            break;
                    }

                    System.out.println("off1= " + enemyOffSet1[i]);
                    System.out.println("off2= " + enemyOffSet2[i]);
                    System.out.println("off3= " + enemyOffSet3[i]);


                } else {
                    enemyX[i] = enemyX[i] - enemyVelocity;
                }

                batch.draw(ghostsArray[g], enemyX[i], enemyOffSet1[i], Gdx.graphics.getWidth() / 10, Gdx.graphics.getHeight() / 10);
                batch.draw(ghostsArray[g], enemyX[i], enemyOffSet2[i], Gdx.graphics.getWidth() / 10, Gdx.graphics.getHeight() / 10);
                batch.draw(ghostsArray[g], enemyX[i], enemyOffSet3[i], Gdx.graphics.getWidth() / 10, Gdx.graphics.getHeight() / 10);

                float w = Float.valueOf(Gdx.graphics.getWidth() / 20);
                float h = Float.valueOf(Gdx.graphics.getHeight() / 13);

                enemyRect1[i] = new Rectangle(enemyX[i] + Gdx.graphics.getWidth() / 35, enemyOffSet1[i] + Gdx.graphics.getHeight() / 40, (w), h);
                enemyRect2[i] = new Rectangle(enemyX[i] + Gdx.graphics.getWidth() / 35, enemyOffSet2[i] + Gdx.graphics.getHeight() / 40, (w), h);
                enemyRect3[i] = new Rectangle(enemyX[i] + Gdx.graphics.getWidth() / 35, enemyOffSet3[i] + Gdx.graphics.getHeight() / 40, (w), h);


            }
            if (birdY > 0) {//velocity = hız//konum
                velocity = velocity + gravity;
                birdY = birdY - velocity;//zıplama
            } else {
                gameState = 2;
            }

        } else if (gameState == 0) {
            if (Gdx.input.justTouched()) {
                gameState = 1;
            }
        } else if (gameState == 2) {//oyunu tekrar baslat
            font2.draw(batch, "GAME OVER! Tap To Play Again!", 100, Gdx.graphics.getHeight() - 100);
            if (Gdx.input.justTouched()) {

                gameState = 1;

                birdY = Gdx.graphics.getHeight() / 3;

                for (int i = 0; i < numberOfEnemy; i++) {
                    enemyOffSet1[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                    enemyOffSet2[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                    enemyOffSet3[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));


                    while (Math.abs(enemyOffSet1[i] - enemyOffSet2[i]) < Gdx.graphics.getHeight() / 10 + 12) {
                        enemyOffSet2[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                        if (Math.abs(enemyOffSet1[i] - enemyOffSet2[i]) > Gdx.graphics.getHeight() / 10 + 12)
                            break;
                    }
                    while (Math.abs(enemyOffSet2[i] - enemyOffSet3[i]) < Gdx.graphics.getHeight() / 10 + 12 || Math.abs(enemyOffSet1[i] - enemyOffSet3[i]) < Gdx.graphics.getHeight() / 10 + 12) {
                        enemyOffSet3[i] = ((random.nextFloat()) * (Gdx.graphics.getHeight() - 200));
                        if (Math.abs(enemyOffSet2[i] - enemyOffSet3[i]) > Gdx.graphics.getHeight() / 10 + 12 && Math.abs(enemyOffSet1[i] - enemyOffSet3[i]) > Gdx.graphics.getHeight() / 10 + 12)
                            break;
                    }


                    enemyX[i] = Gdx.graphics.getWidth() - enemy1.getWidth() / 2 + i * distance;

                    enemyCircles1[i] = new Circle();
                    enemyCircles2[i] = new Circle();
                    enemyCircles3[i] = new Circle();

                    enemyRect1[i] = new Rectangle();
                    enemyRect2[i] = new Rectangle();
                    enemyRect3[i] = new Rectangle();


                }
                velocity = 0;//konumu sıfırla
                scoredEnemy = 0;
                score = 0;
            }
        }


        batch.draw(textureArrays[j], birdX, birdY, Gdx.graphics.getWidth() / 20, Gdx.graphics.getHeight() / 15);//my bird

        font.draw(batch, String.valueOf("Score: " + score), 100, 200);
        batch.end();

        float wid = Float.valueOf(Gdx.graphics.getWidth() / 20);
        float hed = Float.valueOf(Gdx.graphics.getHeight() / 18);
        float drgx = Float.valueOf(birdX - Gdx.graphics.getWidth() / 20);
        float drgy = Float.valueOf(birdY - Gdx.graphics.getHeight() / 20);
        birdRect.set(drgx + wid, drgy + hed, wid, hed);
        Gdx.graphics.getGL20().glEnable(GL20.GL_BLEND);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);

        for (int i = 0; i < numberOfEnemy; i++) {

            if (Intersector.overlaps(birdRect, enemyRect1[i]) || Intersector.overlaps(birdRect, enemyRect2[i]) || Intersector.overlaps(birdRect, enemyRect3[i])) {

                gameState = 2;
            }
        }

        Gdx.gl.glDisable(GL20.GL_BLEND);
    }


    @Override
    public void dispose() {

    }
}
