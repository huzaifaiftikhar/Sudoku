package org.example.sudoku;

import android.content.Context;
import android.media.MediaPlayer;
/**
 * Created by Huzaifa on 07-Jun-17.
 */
public class Music {
    private static MediaPlayer mp = null;

    //start new song...stop the old one
    public static void play(Context context, int resource){
        stop(context);
        mp = MediaPlayer.create(context, resource);
        mp.setLooping(true);
        mp.start();
    }

    //stop the music
    public static void stop(Context context){
        if(mp!=null){
            mp.stop();
            mp.release();
            mp=null;
        }
    }
}
