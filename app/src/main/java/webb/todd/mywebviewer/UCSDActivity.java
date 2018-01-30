package webb.todd.mywebviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UCSDActivity extends AppCompatActivity {

    final static String UCSD_URL = "https://extension.ucsd.edu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsd);

        WebView view = (WebView) findViewById( R.id.ucsdWebView );
        view.loadUrl( UCSD_URL );
    }
}
