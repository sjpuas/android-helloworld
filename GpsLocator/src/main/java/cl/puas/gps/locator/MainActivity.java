package cl.puas.gps.locator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.inputText);
        Button btn = (Button) findViewById(R.id.responseButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResponseActivity.class);
                Bundle b = new Bundle();
                b.putString("name", editText.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }

}
