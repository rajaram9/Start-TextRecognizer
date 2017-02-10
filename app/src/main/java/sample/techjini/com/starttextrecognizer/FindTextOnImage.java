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

//        TextRecognizer textRecognizer = new TextRecognizer.Builder(this).build();

//        Frame frame = new Frame.Builder().setBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sample)).build();
//        SparseArray<TextBlock> items = textRecognizer.detect(frame);
//        StringBuilder stringBuilder = new StringBuilder();

//        for (int i = 0; i < items.size(); ++i) {
//            TextBlock item = items.valueAt(i);
//            if (item != null && item.getValue() != null) {
//                stringBuilder.append(item.getValue());
//                Log.d("Processor", "Text detected! " + item.getValue());
//            }
//        }

        ((TextView) findViewById(R.id.text)).setText("something something will come");
    }
}
