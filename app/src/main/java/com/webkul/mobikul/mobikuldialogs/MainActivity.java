package com.webkul.mobikul.mobikuldialogs;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.webkul.mobikul.mobikuldialoglibrary.ColoredSimpleProgressDialog;
import com.webkul.mobikul.mobikuldialoglibrary.CustomDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCustomDialog(View view) {
        final CustomDialog myCustomDialog = new CustomDialog(MainActivity.this).setType(CustomDialog.Type.NORMAL_TYPE_DIALOG);
        myCustomDialog.setTitleHeading("Normal Dialog");
        myCustomDialog.setSubTitle("This is A Normal Dialog Sample \nTitle text Size - 25 \nSubtitle Text size -16 \nYou can configure  upto two buttons as per your use case. \nThis dialog can not be cancelled without clicking buttons ");
        myCustomDialog.setTitleTextSize(25);
        myCustomDialog.setSubTitleTextSize(16);
        myCustomDialog.setPositiveButtonEnabled(true);
        myCustomDialog.setNegativeButtonEnabled(true);
        myCustomDialog.setDismissOnBackPress(false);
        myCustomDialog.setPositiveButtonText("+ve ButtonText");
        myCustomDialog.setNegativeButtonText("-ve Button Text");
        myCustomDialog.setButtonsOrientation(LinearLayout.VERTICAL);
        myCustomDialog.setButtonsGravity(Gravity.CENTER);
        myCustomDialog.setButtonTextColor(Color.WHITE);
        myCustomDialog.setPositiveButtonClickListener(new CustomDialog.CustomDialogButtonClickListener() {
            @Override
            public void onClick(CustomDialog customDialog) {
                myCustomDialog.dismiss();
                CustomDialog.getInstantDialog(myCustomDialog.getContext(), CustomDialog.Type.SUCCESS_TYPE_DIALOG).setTitleHeading("You clicked +ve Button").setSubTitle("").show();
            }
        });
        myCustomDialog.setNegativeButtonClickListener(new CustomDialog.CustomDialogButtonClickListener() {
            @Override
            public void onClick(CustomDialog customDialog) {
                myCustomDialog.dismiss();
                CustomDialog.getInstantDialog(myCustomDialog.getContext(), CustomDialog.Type.WARNING_TYPE_DIALOG).setTitleHeading("You clicked -ve Button").setSubTitle("").show();
            }
        });
        myCustomDialog.setCanceledOnTouchOutside(false);

        TextView textView = new TextView(myCustomDialog.getContext());
        textView.setText(R.string.more_views);
        textView.setTextSize(20);
        textView.setTextColor(Color.parseColor("#fcdf02"));
        myCustomDialog.addMoreViews(textView);

        myCustomDialog.show();
    }

    public void onClickDefaultProgressDialog(View view){
        ColoredSimpleProgressDialog coloredSimpleProgressDialog = new ColoredSimpleProgressDialog(MainActivity.this);
        coloredSimpleProgressDialog.setCanceledOnTouchOutside(true);
        coloredSimpleProgressDialog.setCancelable(true);
        coloredSimpleProgressDialog.show();
    }

    public void showSuccessInstantDialog(View view) {
        CustomDialog.getInstantDialog(view.getContext(), CustomDialog.Type.SUCCESS_TYPE_DIALOG).show();
    }

    public void showErrorInstantDialog(View view) {
        CustomDialog.getInstantDialog(view.getContext(), CustomDialog.Type.ERROR_TYPE_DIALOG).show();
    }

    public void showWarningInstantDialog(View view) {
        CustomDialog.getInstantDialog(view.getContext(), CustomDialog.Type.WARNING_TYPE_DIALOG).show();
    }

    public void onClickColoredSimpleProgressDialog(View view) {
        final ColoredSimpleProgressDialog coloredSimpleProgressDialog = new ColoredSimpleProgressDialog(this);
        coloredSimpleProgressDialog.setBackGroundDrawable(R.drawable.img_background);
        coloredSimpleProgressDialog.setTitleText("Set Title here");
        coloredSimpleProgressDialog.setProgressBarColor("#000000");
        coloredSimpleProgressDialog.setContentTextSizeInSP(15);
        coloredSimpleProgressDialog.setTextBackGroundColor("#d43756");
        coloredSimpleProgressDialog.setTitleAndContentSeparatorColor("#d43756");
        coloredSimpleProgressDialog.setText("Add Content here");
        coloredSimpleProgressDialog.getContentView().setTextColor(getResources().getColor(android.R.color.white));
        coloredSimpleProgressDialog.setCancelable(true);
        coloredSimpleProgressDialog.showTitle(false);
        coloredSimpleProgressDialog.show();
    }

    public void onClickInstantProgressDialog(View view){
        ColoredSimpleProgressDialog.getIntstantProgressDialog(view.getContext()).show();

    }

}
