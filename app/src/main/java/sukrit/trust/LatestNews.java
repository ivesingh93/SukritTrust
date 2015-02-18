package sukrit.trust;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class LatestNews extends BaseActivity {
    private String[] navMenuTitles;
    private TypedArray navMenuIcons;
	private WebView webView;
	private ImageButton prev, next;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.latestnews);

        navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);

        navMenuIcons = getResources()
                .obtainTypedArray(R.array.nav_drawer_icons);

        set(navMenuTitles, navMenuIcons);
		webView = (WebView) findViewById(R.id.webview);
		prev = (ImageButton)findViewById(R.id.prev);
		next = (ImageButton)findViewById(R.id.next);
		
		//webView.loadUrl("http://www.sukrit.org/latest-news-sukrit-trust.php");
		webView.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
		startWebView("http://www.sukrit.org/latest-news-sukrit-trust.php");
		webView.getSettings().setBuiltInZoomControls(true);
		webView.getSettings().setLoadWithOverviewMode(true);
		webView.getSettings().setUseWideViewPort(true);

		prev.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if(webView.canGoBack()){
					webView.goBack();
				}
			}
		});
		next.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if(webView.canGoForward()){
					webView.goForward();
				}
			}
		});
	}
	@SuppressLint("SetJavaScriptEnabled")
	private void startWebView(String url) {
		webView.setWebViewClient(new WebViewClient() {      
			ProgressDialog progressDialog;
			public boolean shouldOverrideUrlLoading(WebView view, String url) {              
				view.loadUrl(url);
				return true;
			}

			public void onLoadResource (WebView view, String url) {
				if (progressDialog == null) {
					progressDialog = new ProgressDialog(LatestNews.this);
					progressDialog.setMessage("Loading...");
					progressDialog.show();
				}
			}
			public void onPageFinished(WebView view, String url) {
				try{
					if (progressDialog.isShowing()) {
						progressDialog.dismiss();
						progressDialog = null;
					}
				}catch(Exception exception){
					exception.printStackTrace();
				}
			}

		}); 
		webView.getSettings().setJavaScriptEnabled(true); 
		webView.loadUrl(url);


	}

}
