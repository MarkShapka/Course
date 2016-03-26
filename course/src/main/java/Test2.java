import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Mark on 14.03.2016.
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File img = new File("c://test.png");
        BufferedImage image = ImageIO.read(img);
        int width = image.getWidth();
        int height = image.getHeight();
        System.out.println("Size the picture is: " + width + " * " + height);

        int[][] arr = new int[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                //Color color = new Color(image.getRGB(j, i));

                arr[j][i] =image.getRGB(i,j);
                System.out.println(arr[j][i]);

            }
        }

        for (int i = 0; i < height; i++) {
            //System.out.println("Str"+ (i+1));
            for (int j = 0; j < width; j++) {
                System.out.println(arr[j][i]);
            }


        }
    }
}
