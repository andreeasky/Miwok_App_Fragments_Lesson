package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    //Handles playback of all the sound files
    private MediaPlayer mMediaPlayer;

    //This listener gets triggered when the {@link MediaPlayer} has completed playing the audio file.
    //
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mMediaPlayer) {
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                releaseMediaPlayer();
                Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();

                if (i == 0) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_where_are_you_going);
                    mMediaPlayer.start();
                }
                if (i == 1) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_what_is_your_name);
                    mMediaPlayer.start();
                }
                if (i == 2) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_my_name_is);
                    mMediaPlayer.start();
                }
                if (i == 3) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_how_are_you_feeling);
                    mMediaPlayer.start();
                }
                if (i == 4) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_im_feeling_good);
                    mMediaPlayer.start();
                }
                if (i == 5) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_are_you_coming);
                    mMediaPlayer.start();
                }
                if (i == 6) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_yes_im_coming);
                    mMediaPlayer.start();
                }
                if (i == 7) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_im_coming);
                    mMediaPlayer.start();
                }
                if (i == 8) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_lets_go);
                    mMediaPlayer.start();
                }
                if (i == 9) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_come_here);
                    mMediaPlayer.start();
                }
            }
        });
    }

        @Override
        protected void onStop(){
            super.onStop();
            releaseMediaPlayer();
        }

        /**
        * Clean up the media player by releasing its resources.
        */
        private void releaseMediaPlayer() {
            // If the media player is not null, then it may be currently playing a sound.
            if (mMediaPlayer != null) {
                // Regardless of the current state of the media player, release its resources
                // because we no longer need it.
                mMediaPlayer.release();

                // Set the media player back to null. For our code, we've decided that
                // setting the media player to null is an easy way to tell that the media player
                // is not configured to play an audio file at the moment.
                mMediaPlayer = null;
        }
    }
}



