package sukrit.trust;


import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PublicationsTab extends Activity {

    static int x ;

    public static class PublicationList extends Activity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            TouchImageView img = new TouchImageView(this);
            img.setImageResource(R.drawable.publication_list);
            img.setMaxZoom(4f);
            setContentView(img);
        }
    }

    public static class Medical extends Activity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            TouchImageView img = new TouchImageView(this);
            img.setImageResource(R.drawable.plus_two_medical);
            img.setMaxZoom(4f);
            setContentView(img);
        }
    }
    public static class NonMedical extends Activity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            TouchImageView img = new TouchImageView(this);
            img.setImageResource(R.drawable.plus_two_non_medical);
            img.setMaxZoom(4f);
            setContentView(img);
        }
    }
    public static class Commerce extends Activity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            TouchImageView img = new TouchImageView(this);
            img.setImageResource(R.drawable.plus_two_commerce);
            img.setMaxZoom(4f);
            setContentView(img);
        }
    }

    public static class Arts extends Activity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            TouchImageView img = new TouchImageView(this);
            img.setImageResource(R.drawable.plus_two_arts);
            img.setMaxZoom(4f);
            setContentView(img);
        }
    }

    public static class Tenth extends Activity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            TouchImageView img = new TouchImageView(this);
            img.setImageResource(R.drawable.after_ten);
            img.setMaxZoom(4f);
            setContentView(img);
        }
    }
    public static class IasOfficer extends Activity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            TouchImageView img = new TouchImageView(this);
            img.setImageResource(R.drawable.ias_officer);
            img.setMaxZoom(4f);
            setContentView(img);
        }
    }
    public static class PunjabiBooks extends ListActivity{
        String[] booksList = new String[] {"Gurmukh Soch", "Chitthi Likhi", "Kalgidhar Te Assi", "Nit Navaa Niroya",
                "Savvar-Samund (C.D. Sehat)", "Sadaa Mann Chaao - Bhaag - 1", "Sadaa Mann Chaao - Bhaag - 2 (Mann Chaao Bhaiya",
                "Jeevan Jhalkaa - Bhai Samund Singh Ji",
                "Sukha Di Manni (Sukhmani Saahib - Swaal Jawaab",
                "Anand Bhaiya (Anand Saahib Swaal-Jawaab",
                "Rehraas Pargaas", "Sukrit Sidhaant Te Vihaar (HB)", "Bateeh Sulakhnni",
                "Baani Kantth - Sadaa Baikuntth", "Rehraas Te Sohila - Sawaal Jawaab",
                "Prernnatmak Painti (Board)", "Kirat Calendar", "Jap Pargaas",
                "Ik Sikh Unaan Vich", "Dukh Bhanjan Tera Naam Ji", "Jivan Badal Gaye",
                "Asa Di Vaar"
        };
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, booksList));
        }
        @Override
        protected void onListItemClick(ListView l, View v, int position, long id) {
            // TODO Auto-generated method stub
            super.onListItemClick(l, v, position, id);
            Object o = this.getListAdapter().getItem(position);
            String keyword = o.toString();

            for(int i = 0; i < booksList.length; i ++){
                if(keyword.equals(booksList[i])){
                    x = i;
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$WebActivity");
                        Intent ourIntent = new Intent(PunjabiBooks.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static class HindiBooks extends ListActivity{
        String[] booksList = new String[] {"Ek Sikhay Unan Me", "Sadaa Mann Chaao", "Punjabi Seekhe"};
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, booksList));
        }
        @Override
        protected void onListItemClick(ListView l, View v, int position, long id) {
            // TODO Auto-generated method stub
            super.onListItemClick(l, v, position, id);
            Object o = this.getListAdapter().getItem(position);
            String keyword = o.toString();

            for(int i = 0; i < booksList.length; i ++){
                if(keyword.equals(booksList[i])){
                    x = 23 + i;
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$WebActivity");
                        Intent ourIntent = new Intent(HindiBooks.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static class EnglishBooks extends ListActivity{
        String[] booksList = new String[] {"Jap Ji Gems", "Rehraas Gems", "Divine Pills",
                "A letter to Sikh Student", "Spirited Sikh Women", "A Sikh in Greece",
                "Work is more Fun than Fun"};
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, booksList));
        }
        @Override
        protected void onListItemClick(ListView l, View v, int position, long id) {
            // TODO Auto-generated method stub
            super.onListItemClick(l, v, position, id);
            Object o = this.getListAdapter().getItem(position);
            String keyword = o.toString();

            for(int i = 0; i < booksList.length; i ++){
                if(keyword.equals(booksList[i])){
                    x = 26 + i;
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$WebActivity");
                        Intent ourIntent = new Intent(EnglishBooks.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static class BasantKiVaar extends ListActivity{
        String[] basant = new String[] {"Audio", "Basant Ki Vaar Folder - Page 1", "Basant Ki Vaar Folder - Page 2"};

        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, basant));
        }
        @Override
        protected void onListItemClick(ListView l, View v, int position, long id) {
            // TODO Auto-generated method stub
            super.onListItemClick(l, v, position, id);
            Object o = this.getListAdapter().getItem(position);
            String keyword = o.toString();

            if(position == 0){
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=DtFnRcuswfo");
                startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
            }else if(position == 1){
                Uri uri = Uri.parse("http://sukrit.org/Security-Sockets-Layer/imagess/Basant%20ki%20vaar_11.png");
                startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
            }else if(position == 2){
                Uri uri = Uri.parse("http://sukrit.org/Security-Sockets-Layer/imagess/Basant%20ki%20vaar%2012.png");
                startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
            }
        }
    }
    public static class AnnualReport extends Activity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.webview);
            WebView webview = (WebView) findViewById(R.id.webview);
            webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Annual%20Report%20PDF.pdf");
            webview.getSettings().setJavaScriptEnabled(true);

        }
    }

    public static class WebActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.webview);
            WebView webview = (WebView) findViewById(R.id.webview);
            TextView txt = (TextView)findViewById(R.id.txt);
            TextView txt1 = (TextView)findViewById(R.id.txt);
            Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/gurbaniwebthick.ttf");
            txt.setTypeface(customFont);
            Typeface customFont1 = Typeface.createFromAsset(getAssets(), "fonts/Times New Roman.ttf");
            txt.setTypeface(customFont);

            webview.getSettings().setJavaScriptEnabled(true);
            webview.getSettings().setBuiltInZoomControls(true);
            if(x == 0){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/gurmukh%20soch%20pdf.pdf");
                txt.setText("gurmuK soc");
            }else if ( x == 1){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Chitthi%20Likhi.pdf");
                txt.setText("ic~TI ilKI");
            }else if ( x == 2){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Kalgidhar%20Te%20Asi.pdf");
                txt.setText("klgIDr qy AsIN");
            }else if ( x == 3){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Nit%20Nava%20Niroa.pdf");
                txt.setText("inq nvw inroAw");
            }else if ( x == 4){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Swarsamundbook.PDF");
                txt.setText("sv`r-smuMd (sI.fI. sihq)");
            }else if ( x == 5){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/SMC.pdf");
                txt.setText("sdw min cwau - Bwg-1");
            }else if ( x == 6){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/SMC-1.pdf");
                txt.setText("sdw min cwau - Bwg-2 (min cwau BieAw)");
            }else if ( x == 7){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Final%20Bhai%20Samund%20Singh%20Ji.pdf");
                txt.setText("jIvn JlkW - BweI smuMd isMG jI");
            }else if ( x == 8){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Sukhan%20Di%20Mani.pdf");
                txt.setText("suKW dI mxI (suKmnI swihb - svwl jvwb)");
            }else if ( x == 9){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Anand%20Sahib%20Swa.pdf");
                txt.setText("AnMd BieAw (AnMd swihb svwl-jvwb)");
            }

            else if ( x == 10){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Rehras%20Table%20Calendar%20Pdf..pdf");
                txt.setText("rhrwis prgwis");
            }else if ( x == 11){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Sukrit%20Sidhant%20Te%20Vihar.pdf");
                txt.setText("suikRq isDWq qy ivhwr (eyc bI)");
            }else if ( x == 12){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/32%20Sulakhni.pdf");
                txt.setText("bqIh sulKxI");
            }else if ( x == 13){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Bani%20Kanth%20Sdaa%20Baikunth%20P.pdf");
                txt.setText("bwxI kMT - sdw bYkuMT");
            }else if ( x == 14){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Rehraas%20Swal%20Jw.pdf");
                txt.setText("rhrwis qy soihlw - suAwl jvwb");
            }else if ( x == 15){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Penti%20Final.jpg");
                txt.setText("pRyrxwqmk pYNqI (borf)");
            }else if ( x == 16){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Kirat%20Calender%20-%20Pbi.pdf");
                txt.setText("ikrq kYlMfr");
            }else if ( x == 17){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Jap%20Pargaas%20Pbi.pdf");
                txt.setText("jpu prgwis");
            }else if ( x == 18){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Ik%20Sikh%20Unaan%20Me.pdf");
                txt.setText("ie`k is`K XUnwn ivc");
            }else if ( x == 19){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Dukh%20Bhajan%20Sahib.pdf");
                txt.setText("duK BMjn qyrw nwm jI");
            }else if ( x == 20){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Jivan%20Badal%20gye%20Unicode.pdf");
                txt.setText("jIvn bdl gey");
            }else if ( x == 21){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Asa%20di%20vaar%20for%20web.pdf");
                txt.setText("Awsw dI vwr");
            }else if ( x == 22){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Sikh%20in%20greece%20Hindi%20Pdf.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("Ek Sikhay Unan Me");
            }else if ( x == 23){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Sdaa%20Man%20Chao%20H.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("Sadaa Mann Chaao");
            }else if ( x == 24){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Punjabi%20Seekhen%20H.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("Punjabi Seekhe");
            }else if(x == 25){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Japji%20Sahib%20Gems.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("Jap Ji Gems");
            }else if ( x == 26){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Rehras%20Gems%20pdf.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("Rehraas Gems");
            }else if ( x == 27){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pub/Divine%20Pills%20Correct%20pdf.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("Divine Pills");
            }else if ( x == 28){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/A%20letter%20to%20Sikh%20Student.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("A letter to Sikh Student");
            }else if ( x == 29){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/Spirited%20Sikh%20Women.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("Spirited Sikh Women");
            }else if ( x == 30){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/English.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("A Sikh in Greece");
            }else if ( x == 31){
                webview.loadUrl("https://docs.google.com/gview?embedded=true&url=http://sukrit.org/pdf/WMFTF.pdf");
                txt1.setTypeface(customFont1);
                txt1.setText("Work is More fun Than Fun");
            }
        }
    }

}