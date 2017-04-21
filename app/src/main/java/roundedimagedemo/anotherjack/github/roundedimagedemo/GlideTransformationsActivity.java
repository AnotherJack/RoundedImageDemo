package roundedimagedemo.anotherjack.github.roundedimagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.CropCircleTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import roundedimagedemo.anotherjack.github.roundedimagedemo.utils.DensityUtil;

public class GlideTransformationsActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_transformations);
        image = (ImageView) findViewById(R.id.image);
        Glide.with(GlideTransformationsActivity.this)
                .load(R.drawable.test_img)
                .bitmapTransform(new RoundedCornersTransformation(this, DensityUtil.dip2px(this,10),0))
                .into(image);
    }
}
