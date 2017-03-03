package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by Intel on 01/03/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude=magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getmTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }


}
