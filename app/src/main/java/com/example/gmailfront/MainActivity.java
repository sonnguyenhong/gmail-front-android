package com.example.gmailfront;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    String[] items = { "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?",
            "Edurila.com\n$19 Only (First 10 spots) - Bestselling... Are you looking to Learn Web Designing?" };

    Integer[] thumbnails = {R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail,
            R.drawable.gmail};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomIconLabelAdapter adapter = new CustomIconLabelAdapter(this, R.layout.custom_row_icon_label, items, thumbnails);
        setListAdapter(adapter);
    }
}