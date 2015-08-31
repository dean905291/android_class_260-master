package com.example.simpleui;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by DeanH on 8/31/15.
 */
public class Utils {

    public static void  writeFile(Context context, String filename, String text) {
        try {
            FileOutputStream fos = context.openFileOutput(filename, Context.MODE_APPEND);
            fos.write(text.getBytes());
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    public static String readFile(Context context, String filename){

        try {
            FileInputStream fis = context.openFileInput(filename);
            byte[] buffer = new byte[1024];
            fis.read(buffer);
            fis.close();

            return new String(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

}
