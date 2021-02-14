package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
TextView mStoryText;
Button mTopBtn;
Button mBottomBtn;
int mTindex;
int mBindex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText=findViewById(R.id.storyTextView);
        mTopBtn=findViewById(R.id.buttonTop);
        mBottomBtn=findViewById(R.id.buttonBottom);
        final String []mTopBtnArr={getString(R.string.T3_Story),getString(R.string.T6_End)};
        final String []mBottomBtnArr={getString(R.string.T2_Story),getString(R.string.T4_End),getString(R.string.T5_End)};
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mStoryText.setText(mTopBtnArr[mTindex]);
            mTindex=mTindex+1;
            mTopBtn.setText(R.string.T3_Ans1);
            mBottomBtn.setText(R.string.T3_Ans2);
                if(mTindex==2){
                    mTopBtn.setVisibility(View.GONE);
                    mBottomBtn.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mTindex==1){
                    mBindex=2;
                }
                mStoryText.setText(mBottomBtnArr[mBindex]);
                mBindex=mBindex+1;

                mTopBtn.setText(R.string.T2_Ans1);
                mBottomBtn.setText(R.string.T2_Ans2);
                if(mBindex==2||mBindex==3){
                    mTopBtn.setVisibility(View.GONE);
                    mBottomBtn.setVisibility(View.GONE);
                }
            }
        });


    }
}
