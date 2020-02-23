package com.rana_aditya.pragyan_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.rana_aditya.pragyan_splash.particlesys.ParticleSystemRenderer;

public class test extends AppCompatActivity {

    GLSurfaceView mGlSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        final ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        final ConfigurationInfo configurationInfo = activityManager.getDeviceConfigurationInfo();
        final boolean supportsEs2 = configurationInfo.reqGlEsVersion >= 0x20000;
        if (supportsEs2) {
            Log.d("OPENGL",String.valueOf(supportsEs2));

            mGlSurfaceView=findViewById(R.id.gl_surface_view);
            mGlSurfaceView.setEGLContextClientVersion(2);

            // Set the renderer to our demo renderer, defined below.
            ParticleSystemRenderer mRenderer = new ParticleSystemRenderer(mGlSurfaceView);
            mGlSurfaceView.setRenderer(mRenderer);
            mGlSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);

        }
        else {
            Toast.makeText(this,"SORRY",Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    protected void onPause() {
        super.onPause();
        mGlSurfaceView.onPause();
    }


    @Override
    protected void onResume() {
        super.onResume();
        mGlSurfaceView.onResume();
    }


}
