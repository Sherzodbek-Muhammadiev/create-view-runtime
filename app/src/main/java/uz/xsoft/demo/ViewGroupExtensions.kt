package uz.xsoft.demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

/**
 * Created by Sherzodbek Muhammadiev on 09.09.2020.
 */

fun ViewGroup.inflate(@LayoutRes resId: Int): View {
    val view = LayoutInflater.from(context).inflate(resId, this, false)
    addView(view)
    return view
}

fun ViewGroup.inflate(@LayoutRes resId: Int, block: View.() -> Unit): View{
    val view = inflate(resId)
    block(view)
    return view
}