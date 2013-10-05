package cl.puas.gps.locator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by sjpuas on 05-10-13.
 */
public class ResponseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reponse);

        TextView textView = (TextView) findViewById(R.id.responseText);
        Bundle bundle = this.getIntent().getExtras();
        textView.setText("Hola" + bundle.getString("name"));
    }

}
