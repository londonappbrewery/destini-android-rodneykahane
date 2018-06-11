package com.londonappbrewery.destini;

public class StoryProgress {

    private int mStoryID;
    private int mResponseIDTop;
    private int mResponseIDBottom;

    public StoryProgress(int storyTextID, int responseTop, int responseBottom) {

        mStoryID = storyTextID;
        mResponseIDTop = responseTop;
        mResponseIDBottom = responseBottom;

    }//end StoryProgress

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getResponseIDTop() {
        return mResponseIDTop;
    }

    public void setResponseIDTop(int responseIDTop) {
        mResponseIDTop = responseIDTop;
    }

    public int getResponseIDBottom() {
        return mResponseIDBottom;
    }

    public void setResponseIDBottom(int responseIDBottom) {
        mResponseIDBottom = responseIDBottom;
    }
}//end class

