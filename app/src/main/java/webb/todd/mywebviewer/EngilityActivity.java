package webb.todd.mywebviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class EngilityActivity extends AppCompatActivity {

    final static String ENGILITY_URL = "https://www.youtube.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engility);

        WebView view = (WebView) findViewById( R.id.engilityWebView );
        view.loadUrl( ENGILITY_URL );

    }
}
