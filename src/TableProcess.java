import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

/**
 * Created by better on 2014/10/4.
 */
public class TableProcess implements Runnable {
    public void print(Mat m) {
        System.out.println("m = " + m.dump());
    }
    public void print(String s) {
        System.out.println(s);
    }

    private String getImgPath(String imgName) {
        return getClass().getResource("img/" + imgName).getPath().substring(1);
    }
    @Override
    public void run() {
        try {
            Mat image = Highgui.imread(getImgPath("table2.jpg"));

            Highgui.imwrite("D:/table3.jpg", image);

            print("Finished");
        } catch (Exception e) {
            print( "Error" );
        } finally {
        }
    }
}
