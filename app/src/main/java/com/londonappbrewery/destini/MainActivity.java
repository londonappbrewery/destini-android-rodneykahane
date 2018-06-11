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

    private StoryProgress[] mStoryMainText = new StoryProgress[]{
            new StoryProgress(R.string.T1_Story),
            new StoryProgress(R.string.T2_Story),
            new StoryProgress(R.string.T3_Story),
            new StoryProgress(R.string.T1_Ans1),
            new StoryProgress(R.string.T1_Ans2),
            new StoryProgress(R.string.T2_Ans1),
            new StoryProgress(R.string.T2_Ans2),
            new StoryProgress(R.string.T3_Ans1),
            new StoryProgress(R.string.T3_Ans2),
            new StoryProgress(R.string.T4_End),
            new StoryProgress(R.string.T5_End),
            new StoryProgress(R.string.T6_End)
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
                Log.d("Destini","top button checking in");
                mIndex++;
                mAnswerIndex = mIndex+3;
                updateStory();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini","bottom button checking in");
            }
        });

    }//end onCreate

    public void updateStory(){

        mStory = mStoryMainText[mIndex].getStoryID();
        mStoryTextView.setText(mStory);
        mTop = mStoryMainText.

    }//end updateStory
}//end class
