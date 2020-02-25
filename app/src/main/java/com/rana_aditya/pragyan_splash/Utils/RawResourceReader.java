package com.rana_aditya.pragyan_splash.Utils;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RawResourceReader {

    /**
     * Reads a raw resource text file into a String
     * @param context
     * @param resId
     * @return
     */
    @Nullable
    public static String readTextFileFromRawResource(@NonNull final Context context,
                                                     @RawRes final int resId) {

        final BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(context.getResources().openRawResource(resId))
        );
        String line;
        final StringBuilder body = new StringBuilder();

        try {
            while ((line = bufferedReader.readLine()) != null) {
                body.append(line).append('\n');
            }
        } catch (IOException e) {
            return null;
        }

        return body.toString();
    }
}