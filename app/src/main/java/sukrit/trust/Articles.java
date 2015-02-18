package sukrit.trust;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Articles extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		WebView webview = (WebView)findViewById(R.id.webview);
		webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://www.sukrit.org/pdf/vadeyai-vichar.pdf");
		webview.getSettings().setJavaScriptEnabled(true);
	}

	
}
