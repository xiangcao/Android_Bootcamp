package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText edit;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        LineItem item = (LineItem) getIntent().getSerializableExtra("toedititem");
        edit = (EditText) findViewById(R.id.editText);
        pos = item.getPos();
        edit.setText(item.getItem());
        edit.setSelection(edit.getText().length());
    }

    // ActivityNamePrompt.java -- launched for a result
    public void onSubmit(View v) {
        // Prepare data intent
        Intent data = new Intent();
        // Pass relevant data back as a result
        LineItem curItem = new LineItem(edit.getText().toString(), pos);
        data.putExtra("newItem", curItem);
        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response
        finish(); // closes the activity, pass data to parent
    }
}
