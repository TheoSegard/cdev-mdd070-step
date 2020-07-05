package _5_factory_method._99_excerice;

import _5_factory_method._99_excerice.implementation.GifReader;
import _5_factory_method._99_excerice.implementation.JpegReader;

import java.awt.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class ImageReaderFactory extends ImageUtil{
    private InputStream inputStream;

    public ImageReaderFactory(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public Image loadImage() {
        if(getImageType(inputStream).equals(ImageType.GIF)) {

            return new GifReader(inputStream).loadImage();
        } else if(getImageType(inputStream).equals(ImageType.JPEG)){

            return new JpegReader(inputStream).loadImage();
        }
        return null;
    }
}
