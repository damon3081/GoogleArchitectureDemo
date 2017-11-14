package google.architecture.util;

import android.databinding.BindingAdapter;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by dxx on 2017/11/13.
 */

public class BindingUtils {

    @BindingAdapter("bind:image")
    public static void loadImage(SimpleDraweeView image, String uri){
        if(image!=null){
            image.setImageURI(uri);
        }
    }

}