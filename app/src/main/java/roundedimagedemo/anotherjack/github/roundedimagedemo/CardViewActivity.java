package roundedimagedemo.anotherjack.github.roundedimagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class CardViewActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        image = (ImageView) findViewById(R.id.image);

        Glide.with(CardViewActivity.this)
                .load(R.drawable.test_img)
                .into(image);
    }
}
