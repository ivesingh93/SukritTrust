package sukrit.trust;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutUsTab extends Activity {

	

	public static class WhySukrit extends Activity{

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.webview);
			WebView webview = (WebView) findViewById(R.id.webview);
			webview.loadUrl("file:///android_asset/why_sukrit.html");
			webview.getSettings().setBuiltInZoomControls(true);
		}

	}

	public static class SukritGlance extends Activity{

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.webview);
			WebView webview = (WebView) findViewById(R.id.webview);
			webview.loadUrl("file:///android_asset/sukrit_glance.html");
			webview.getSettings().setBuiltInZoomControls(true);
		}
	}

	public static class FiveProjects extends Activity{

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.webview);
			WebView webview = (WebView) findViewById(R.id.webview);
			webview.loadUrl("file:///android_asset/five_projects.html");
			webview.getSettings().setBuiltInZoomControls(true);
		}
	}

	public static class FiveSkills extends Activity{
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			TouchImageView img = new TouchImageView(this);
	        img.setImageResource(R.drawable.five_skills);
	        img.setMaxZoom(4f);
	        setContentView(img);
			
		}
	}

	public static class SukritSGGS extends Activity{
		 
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			
			TouchImageView img = new TouchImageView(this);
	        img.setImageResource(R.drawable.sukrit_sggs);
	        img.setMaxZoom(4f);
	        setContentView(img);
		}
	}

}