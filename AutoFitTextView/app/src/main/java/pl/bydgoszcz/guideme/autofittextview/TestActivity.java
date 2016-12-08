package pl.bydgoszcz.guideme.autofittextview;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class TestActivity extends Activity {
    private AutoFitTextView autoFitTextView;
    protected TextView textView1;
    protected LinearLayout linearLayout;
    protected ScrollView scrollView;
    protected boolean created;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_layout);

        textView1 = (TextView) findViewById(R.id.textView1);
        linearLayout = (LinearLayout) findViewById(R.id.textLayout);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        super.onCreate(savedInstanceState);
        autoFitTextView = AutoFitTextView.with(scrollView, linearLayout);
        textView1.setText(Html.fromHtml(getString(R.string.long_text_1)));
        Button button = (Button)findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(Html.fromHtml(getString(R.string.long_text_1)));
            }
        });
        button = (Button)findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(Html.fromHtml(getString(R.string.long_text_2)));
            }
        });
        button = (Button)findViewById(R.id.button_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(Html.fromHtml(getString(R.string.long_text_3)));
            }
        });
        button = (Button)findViewById(R.id.button_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(Html.fromHtml(getString(R.string.long_text_4)));
            }
        });
        created = true;
    }

    @Override
    protected void onDestroy() {
        autoFitTextView.recycle();
        super.onDestroy();
    }
}