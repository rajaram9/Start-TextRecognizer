package sample.techjini.com.starttextrecognizer;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shweta on 2/9/17.
 */
public class FindTextOnImage extends Activity {
    private String selectedImagePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_text_on_image);

        Uri selectedImage = getIntent().getData();
        if (selectedImage != null) {
            selectedImagePath = PathUtils.getPath(this, selectedImage);
        }

        Bitmap imageWithTextBitmap = BitmapFactory.decodeFile(selectedImagePath);
        ((ImageView) findViewById(R.id.image)).setImageBitmap(imageWithTextBitmap);

        ((TextView) findViewById(R.id.text)).setText("something something will come");
    }
}
