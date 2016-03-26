import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

/**
 * Created by Mark on 13.01.2016.
 */
public class MyClass {
    public static void main(String[] args) throws IOException{

        File img = new File("C:/draco2.png");
        BufferedImage image = ImageIO.read(img);

        int width = image.getWidth();
        int height = image.getHeight();

        System.out.println(width + " "+ height);

        int[][] arr = new int[width][height];
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width ; j++) {
                int x = j;
                int y = i;
                Color c = new Color(image.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();

                //red
                if (red == 255 && green == 0 && blue == 0){
                    arr[x][y]= 1;
                }
                //yellow
                else if (red == 255 && green == 255 && blue == 19){
                    arr[x][y]= 2;
                }
                //white
                else if (red == 255 && green == 255 && blue == 255){
                    arr[x][y]= 3;
                }
                //black
                else if (red == 0 && green == 0 && blue == 0){
                    arr[x][y]= 4;
                }
                /*//gray
                else if (red == 67 && green == 57 && blue == 58){
                    arr[x][y]= 6;
                }*/
                /*//green
                else if (red == 0 && green == 255 && blue == 0){
                    arr[x][y]=5;
                }*/
                //System.out.println(c);

            }

        }
        /*for (int i = 0; i < height; i++) {
            System.out.println("str"+ (i+1));
            for (int j = 0; j < width; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }*/

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

    }

}
