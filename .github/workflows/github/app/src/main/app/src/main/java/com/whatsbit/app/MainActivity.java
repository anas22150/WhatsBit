
package com.whatsbit.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("WhatsBit");
        title.setTextSize(34);
        title.setTextColor(Color.rgb(20, 150, 90));
        title.setGravity(Gravity.CENTER);

        TextView welcome = new TextView(this);
        welcome.setText("Welcome to WhatsBit!");
        welcome.setTextSize(20);
        welcome.setGravity(Gravity.CENTER);

        EditText message = new EditText(this);
        message.setHint("Write a message...");
        message.setSingleLine(true);

        Button send = new Button(this);
        send.setText("Send");

        send.setOnClickListener(v ->
            welcome.setText("Demo: " + message.getText().toString())
        );

        layout.addView(title);
        layout.addView(welcome);
        layout.addView(message);
        layout.addView(send);

        setContentView(layout);
    }
}
