package com.example.android.miwok;

/**
 * Created by Gamal Ghanem on 7/8/2018.
 */

public class Word {
    /*
    defines the default translation of the word.
     */
    private String defaultTranslation;

    /*
    defines the Miwok translation of the word
     */
    private String miwokTranslation;

    /*
    defines the source of the image
     */
    private  int imageSource = -1;

    /*
    defines the source of the audio
     */
    private int audioSourceID;


    /*
    constructor to define both translations and the associated of the word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int img, int audioResource) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageSource = img;
        this.audioSourceID = audioResource;
    }

    /*
    constructor to define both translations of the phrase.
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResource) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioSourceID = audioResource;
    }

    /*
    returns the default translation of the word.
     */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    /*
    returns Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    /*
    returns the source of the image
     */
    public int getImageSource() {
        return imageSource;
    }


    /*
    returns the resource ID of the audio
     */
    public int getAudioSourceID() {
        return audioSourceID;
    }


    /*
    returns true if it has an image
    and false otherwise
     */
    public boolean hasImage() {
        if (imageSource == -1) {
            return false;
        }
        return true;
    }
}
