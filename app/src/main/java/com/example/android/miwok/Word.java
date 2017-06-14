package com.example.android.miwok;

/**
 * Created by User on 5/21/2017.
 */

/**
 *{@Link Word} represents vocabulary word that the user wants to learn.
 *It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Private integer variable for the image resource ID - Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Private integer variable for the audio resource ID - Audio resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *  @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param number_one
     * @param numberOne
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int number_one, int numberOne, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param imageResourceId  is the drawable resource ID for the image associated with the word
     *
     * @param audioResourceId  is the audio resource ID for the audio associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Method to return the integer image resource ID - Return the image resource ID of the word.
     */
    public int getImageResourceId() {return mImageResourceId;}


    /**
     *  Returns whether or not there is an image for this word.
     */
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }

    /**
     *  Returns whether or not there is an audio for this word.
     */
        public int getAudioResourceId() {return  mAudioResourceId;}
}
