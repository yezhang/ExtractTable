import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by better on 2014/10/4.
 */
public class Main {


    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new TableProcess());
        exec.shutdown();
    }
}
