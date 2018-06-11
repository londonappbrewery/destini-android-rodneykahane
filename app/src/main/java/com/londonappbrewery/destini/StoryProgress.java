package com.londonappbrewery.destini;

public class StoryProgress {

    private int mStoryID;
    private int mResponseID;

    public StoryProgress(int storyTextID) {

        mStoryID = storyTextID;

    }//end StoryProgress

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getAnswerID() {
        return mResponseID;
    }

    public void setAnswerID(int answerID) {
        mResponseID = answerID;
    }
}
