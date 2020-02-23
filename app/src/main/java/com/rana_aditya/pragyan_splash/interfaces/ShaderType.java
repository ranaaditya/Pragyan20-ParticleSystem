package com.rana_aditya.pragyan_splash.interfaces;

import android.opengl.GLES20;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({GLES20.GL_VERTEX_SHADER, GLES20.GL_FRAGMENT_SHADER})
public @interface ShaderType {
}