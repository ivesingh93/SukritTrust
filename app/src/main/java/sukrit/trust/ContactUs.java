package sukrit.trust;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.webkit.WebView;

public  class ContactUs extends BaseActivity{
    private String[] navMenuTitles;
    private TypedArray navMenuIcons;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
        navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);

        navMenuIcons = getResources()
                .obtainTypedArray(R.array.nav_drawer_icons);

        set(navMenuTitles, navMenuIcons);
		WebView webview = (WebView) findViewById(R.id.webview);
		webview.loadUrl("file:///android_asset/contact.html");
		webview.getSettings().setBuiltInZoomControls(true);
	}
}