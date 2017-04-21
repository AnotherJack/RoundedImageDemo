package roundedimagedemo.anotherjack.github.roundedimagedemo;

import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import roundedimagedemo.anotherjack.github.roundedimagedemo.utils.DensityUtil;

public class RoundedBitmapActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rounded_bitmap);
        image = (ImageView) findViewById(R.id.image);
        Glide.with(RoundedBitmapActivity.this)
                .load(R.drawable.test_img)
                .asBitmap()
                .into(new BitmapImageViewTarget(image){
                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable rbd = RoundedBitmapDrawableFactory.create(getResources(), resource);
//                        rbd.setCircular(true); //设置为圆形
                        rbd.setCornerRadius(DensityUtil.dip2px(RoundedBitmapActivity.this,10));//此方法以px为单位，要进行转换
                        image.setImageDrawable(rbd);
                    }
                });

    }
}
