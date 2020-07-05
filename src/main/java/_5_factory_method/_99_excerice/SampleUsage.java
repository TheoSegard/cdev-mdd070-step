package _5_factory_method._99_excerice;

import _5_factory_method._99_excerice.implementation.GifReader;
import _5_factory_method._99_excerice.implementation.JpegReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SampleUsage {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\theo\\Documents\\COURS\\DesignPattern\\EVAL_step\\cdev-mdd070-step\\src\\main\\java\\_5_factory_method\\_99_excerice\\test.gif");

        ImageReaderFactory imageReaderFactory = new ImageReaderFactory(inputStream);
        imageReaderFactory.loadImage();
    }
}
