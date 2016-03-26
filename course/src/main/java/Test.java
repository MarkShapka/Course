import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Mark on 14.03.2016.
 */
public class Test {
    public static void main(String[] args) throws IOException{
        File img = new File("c://test.png");
        BufferedImage image = ImageIO.read(img);
        int width = image.getWidth();
        int height = image.getHeight();
        System.out.println("Size the picture is: "+ width + " * "+height);

        int[][]arr = new int[width][height];
        for (int i = 0; i <height ; i++) {
            for (int j = 0; j <width ; j++) {
                Color color = new Color(image.getRGB(j,i));
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                //red
                if (red == 140 && green == 58 && blue == 29){
                    arr[j][i] = 1;
                }
                //yellow
                if (red == 92 && green == 92 && blue == 75){
                    arr[j][i] = 2;
                }
                //white
                if (red == 255 && green == 255 && blue == 255){
                    arr[j][i] = 3;
                }
                //black
                if (red == 0 && green == 0 && blue == 0){
                    arr[j][i] = 4;
                }
                //gray
                /*if (red == 0 && green == 0 && blue == 0){
                    arr[j][i] = 5;
                }*/
                //green
                /*if (red == 0 && green == 0 && blue == 0){
                    arr[j][i] = 6;
                }*/
                //blue
                /*if (red == 0 && green == 0 && blue == 0){
                    arr[j][i] = 7;
                }*/
            }
        }

        for (int i = 0; i < height ; i++) {
            //System.out.println("Str"+ (i+1));
            for (int j = 0; j < width ; j++) {

                if (j==0){
                    System.out.println("Str"+ (i+1));
                    System.out.print("L(10)G3("+arr[j][i]+")");
                }
                else if (j==9){
                    System.out.print("G3("+arr[j][i]+")_\\");
                }
                else if (j==120){
                    System.out.print("_G3("+arr[j][i]+")");
                }
                else if (j==129){
                    System.out.print("G3("+arr[j][i]+")-2\\");
                }
                else if (j!=9 &&j!=129 && (j+1)%10==0){
                    System.out.print("G3("+arr[j][i]+")-3\\");
                }
                else if (j!=120 && j!=0 && (j+1)%10!=0){
                    System.out.print("G3("+arr[j][i]+")");
                }
                else if (j==width-1){
                    System.out.print("G3("+arr[j][i]+")");
                }
            }

            System.out.print("Zh<//////-eL(1)wC1cgG0(11)DR0L(11)ZcG2(1)-4L(2)wC1chG0(12)DR0L(12)ZcZfG2(2)-3L(3)wC1ceG0(13)DR0L(13)ZgG2(3)-4L(4)wC1cfG0(14)DR0L(14)ZdG2(4)-4L(5)wC1csG0(15)DR0L(15)ZcZfG2(5)-3L(6)wC1cuG0(16)DR0L(16)ZgZfG2(6)-3L(7)wC1ccG0(17)DR0L(17)ZeZfG2(7)");
            System.out.println();
            System.out.println();
        }

        /*Frame frame = new Frame("test picture");
        frame.setSize(300,300);
        frame.setVisible(true);
        */

        /*int[][] arrOut = new int[width][height];
        for (int i = 0; i <height ; i++) {
            for (int j = 0; j <width ; j++) {
                Color colorOut = new Color(image.getRGB(j,i))
                if (arr[j][i] == 1){
                    arrOut[j][i] =
                }
            }
        }*/

    }
    /*public void paint(Graphics g){
        g.drawImage()
    }*/
}
