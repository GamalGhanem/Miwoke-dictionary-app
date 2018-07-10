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
    private  int imageSource;


    /*
    constructor to define both translations of the word.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
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
}
