package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton;
    Button mBottomButton;
    TextView mStoryTextView;
    int mStory;
    int mIndex;
    int mTop;
    int mBottom;
    int mAnswerIndex;
    int mStoryPath;
    int clickTop;
    int clickBottom;

    int mStoryIndex=1;

    private StoryProgress[] mStoryMainText = new StoryProgress[]{
            new StoryProgress(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryProgress(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryProgress(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryProgress(R.string.T4_End,0,0),
            new StoryProgress(R.string.T5_End,0,0),
            new StoryProgress(R.string.T6_End,0,0)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);
        mStoryTextView = findViewById(R.id.storyTextView);

        mStory = mStoryMainText[mIndex].getStoryID();
        mStoryTextView.setText(mStory);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Log.d("Destini","top button checking in");
                //mIndex++;
                topClick();
                updateStory();*/

                if(mStoryIndex==1||mStoryIndex==2){
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                } else if (mStoryIndex==3){
                    mStoryTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }//end if/else if
            }//end onClick
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Log.d("Destini","bottom button checking in");
                //mIndex++;
                updateStory();*/

                if(mStoryIndex==1){
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                } else if (mStoryIndex==2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                } else if (mStoryIndex==3){
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }//end if/elseif
            }//end onClick
        });

    }//end onCreate

    public void updateStory(){
        Log.d("Destini","mIndex is "+mIndex);
        mStory = mStoryMainText[mIndex].getStoryID();
        mStoryTextView.setText(mStory);
        mTop = mStoryMainText[mIndex].getResponseIDTop();
        mTopButton.setText(mTop);
        mBottom = mStoryMainText[mIndex].getResponseIDBottom();
        mBottomButton.setText(mBottom);

    }//end updateStory

    public void topClick() {
        clickTop++;
    }

}//end class
