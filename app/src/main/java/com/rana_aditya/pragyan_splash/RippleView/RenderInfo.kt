package com.rana_aditya.pragyan_splash.RippleView

import android.graphics.Bitmap
import java.nio.FloatBuffer


internal data class RenderInfo(
    val vertexBuffer: FloatBuffer,
    var texcoordBuffer: FloatBuffer?,
    var programId: Int,
    var textureId: Int,
    val bgImage: Bitmap,
    var alpha: Float
)