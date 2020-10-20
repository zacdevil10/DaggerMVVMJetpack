package uk.co.zac_h.daggermvvmjetpack.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String?) {
    if (!url.isNullOrBlank()) Glide.with(view.context).load(url).into(view)
}