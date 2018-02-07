# Custom Dialogs

A library to create beautiful customized dialogs in Android

This library helps you create dialogs and change their visuals as per your need in the android application.


:star:  `build support version used : 26.1.0 `

:star:  `Data Binding is used`

# Importing Istructions

Add this line in your `module level build.gradle` file

```
  compile ''
```

:exclamation:  `Make Sure Databinding is set to true in your project`

For this check this line in your `module level build.gradle` file

```
android {
    dataBinding {
        enabled = true
    }
    //
    // Other gradle instructions
    //
 }
    
```

# Usage Examples

* **CustomDialog.getInstantDialog(view.getContext(), CustomDialog.Type.SUCCESS_TYPE_DIALOG).show();**

![Instant Dialog Success Type](https://mobikul.com/wp-content/uploads/2018/01/success-instant-dialog.png)


* **CustomDialog.getInstantDialog(view.getContext(), CustomDialog.Type.WARNING_TYPE_DIALOG).show();**

![Instant Dialog Warning Type](https://mobikul.com/wp-content/uploads/2018/01/warning-instant-dialog.png)

* **CustomDialog.getInstantDialog(view.getContext(), CustomDialog.Type.ERROR_TYPE_DIALOG).show();**

![Instant Dialog Error Type](https://mobikul.com/wp-content/uploads/2018/01/error-instant-dialog.png)

* **final CustomDialog myCustomDialog = new CustomDialog(MainActivity.this).setType(CustomDialog.Type.NORMAL_TYPE_DIALOG);
  myCustomDialog.setTitleHeading("Normal Dialog");
  myCustomDialog.setSubTitle("This is A Normal Dialog Sample \nTitle text Size - 25 \nSubtitle Text size -16 \nYou can configure  upto two buttons as per your use case. \nThis dialog can not be cancelled without clicking buttons ");
  myCustomDialog.setTitleTextSize(25);
  myCustomDialog.setSubTitleTextSize(16);
  myCustomDialog.setButtonEnabled(true);
  myCustomDialog.setNegativeButtonEnabled(true);
  myCustomDialog.setDismissOnBackPress(false);
  myCustomDialog.setCanceledOnTouchOutside(false);
  myCustomDialog.setPositiveButtonText("+ve ButtonText");
  myCustomDialog.setNegativeButtonText("-ve Button Text");
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
          
  TextView textView = new TextView(myCustomDialog.getContext());
  textView.setText(R.string.more_views);
  textView.setTextSize(20);
  textView.setTextColor(Color.parseColor("#fcdf02"));
  
  myCustomDialog.addMoreViews(textView);
  
  myCustomDialog.show();**

![Custom Dialog Full Customised](https://mobikul.com/wp-content/uploads/2018/01/custom-dialog-fully-customized.png)


* **ColoredSimpleProgressDialog.getIntstantProgressDialog(view.getContext()).show();**

![Instant Progress Dialog](https://mobikul.com/wp-content/uploads/2018/01/progress-instant-dialog.png)

* **final ColoredSimpleProgressDialog coloredSimpleProgressDialog = new ColoredSimpleProgressDialog(this);
  coloredSimpleProgressDialog.setBackGroundDrawable(R.drawable.img_background);
  coloredSimpleProgressDialog.setTitleText("Set Title here");
  coloredSimpleProgressDialog.setProgressBarColor("#000000");
  coloredSimpleProgressDialog.setContentTextSizeInSP(15);
  coloredSimpleProgressDialog.setTextBackGroundColor("#d43756");
  coloredSimpleProgressDialog.setTitleAndContentSeparatorColor("#d43756");
  coloredSimpleProgressDialog.setText("Add Content here");
  coloredSimpleProgressDialog.getContentView().setTextColor(getResources().getColor(android.R.color.white));
  coloredSimpleProgressDialog.setCancelable(true);
  coloredSimpleProgressDialog.show();**

![Progress Dialog Customised](https://mobikul.com/wp-content/uploads/2018/01/progress-dialog-customised-new.png)

