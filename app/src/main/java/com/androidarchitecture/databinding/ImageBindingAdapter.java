package com.androidarchitecture.databinding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import com.androidarchitecture.R;
import com.androidarchitecture.data.remote.ApiConstants;

public final class ImageBindingAdapter {

    @BindingAdapter(value = "url")
    public static void loadImageUrl(ImageView view, String url) {
        if (url != null && !url.equals(""))
            Picasso.with(view.getContext())
                    .load(ApiConstants.IMAGE_ENDPOINT_PREFIX + url)
                    .placeholder(R.drawable.placeholder)
                    .into(view);
    }

}
