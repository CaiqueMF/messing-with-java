package entity;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Player extends Entity{

    GamePanel gp;
    KeyHandler keyH;

    public final int screenX;
    public final int screenY;
    public BufferedImage up3, up4, down3, down4, left3, left4, right3, right4;

    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        screenX = gp.screenWidth/2-(gp.tileSize/2);
        screenY = gp.screenHeight/2-(gp.tileSize/2);

        solidArea = new Rectangle(15,27,18,15);

        setDefaultValues();
        getPlayerImage();
        spriteNumber = 2;

    }
    public void setDefaultValues (){
        worldX = gp.tileSize*32;
        worldY = gp.tileSize*38;
        speed = 4;
        direction = "down";
    }

    public void getPlayerImage(){
    try {
        up1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_up_1.png")));
        up2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_up_2.png")));
        up3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_up_3.png")));
        up4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_up_4.png")));
        down1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_down_1.png")));
        down2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_down_2.png")));
        down3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_down_3.png")));
        down4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_down_4.png")));
        left1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_left_1.png")));
        left2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_left_2.png")));
        left3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_left_3.png")));
        left4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_left_4.png")));
        right1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_right_1.png")));
        right2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_right_2.png")));
        right3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_right_1.png")));
        right4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/mage_right_2.png")));

    }catch (IOException e){
        e.printStackTrace();
    }

    }

    public void update(){
        if (keyH.upPressed || keyH.downPressed || keyH.leftPressed || keyH.rightPressed){
            if(keyH.upPressed){
                direction = "up";
            }
            else if(keyH.downPressed){
                direction = "down";
            }else if(keyH.leftPressed){
                direction = "left";
            } else if (keyH.rightPressed) {
                direction = "right";
            }

            //check for collision
            colissionOn = false;
            gp.cChecker.CheckTile(this);
            //if collision is false you can move
            if(!colissionOn){
                switch (direction){
                    case "up":
                        worldY-=speed;
                        spriteCounter++;
                        break;
                    case "down":
                        worldY+=speed;
                        spriteCounter++;
                        break;
                    case "left":
                        worldX-=speed;
                        spriteCounter++;
                        break;
                    case "right":
                        worldX+=speed;
                        spriteCounter++;
                        break;
                }
            }

            if (spriteCounter>=8){
                spriteNumber = (spriteNumber%4)+1;
                spriteCounter= 0;
            }
        }

    }
    public void draw(Graphics2D g2){
        //g2.setColor(Color.white);
        //g2.fillRect(x,y,gp.tileSize, gp.tileSize);
        BufferedImage image = null;
        switch (direction){
            case "up":
                if(spriteNumber == 1){
                    image = up1;
                }
                if(spriteNumber == 2){
                    image = up2;
                }
                if(spriteNumber == 3){
                    image = up3;
                }
                if(spriteNumber == 4){
                    image = up4;
                }

                break;
            case "down":
                if(spriteNumber == 1){
                    image = down1;
                }
                if(spriteNumber == 2){
                    image = down2;
                }
                if(spriteNumber == 3){
                    image = down3;
                }
                if(spriteNumber == 4){
                    image = down4;
                }
                break;
            case "left":
                if(spriteNumber == 1){
                    image = left1;
                }
                if(spriteNumber == 2){
                    image = left2;
                }
                if(spriteNumber == 3){
                    image = left3;
                }
                if(spriteNumber == 4){
                    image = left4;
                }
                break;
            case "right":
                if(spriteNumber == 1){
                    image = right1;
                }
                if(spriteNumber == 2){
                    image = right2;
                }
                if(spriteNumber == 3){
                    image = right3;
                }
                if(spriteNumber == 4){
                    image = right4;
                }
                break;

        }
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}
