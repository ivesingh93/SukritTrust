package sukrit.trust;

import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Publications extends BaseActivity {
	private String[] navMenuTitles;
	private TypedArray navMenuIcons;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.career_chart);
		navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);
		navMenuIcons = getResources().obtainTypedArray(R.array.nav_drawer_icons);
		set(navMenuTitles, navMenuIcons);
        String[] publicationsList = new String[] {"Videos", "Vadayi Vichaar Article", "Publication List", "Books (Punjabi)", "Books (Hindi)", "Books (English)"
        , "Basant Ki Vaar"};

        final ListView career = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.career_row, publicationsList);
        career.setAdapter(adapter);

        career.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Uri uri = Uri.parse("http://www.youtube.com/sukritofficial");
                    startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                }else if (position == 1){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.Articles");
                        Intent ourIntent = new Intent(Publications.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 2){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$PublicationList");
                        Intent ourIntent = new Intent(Publications.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 3){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$PunjabiBooks");
                        Intent ourIntent = new Intent(Publications.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 4){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$HindiBooks");
                        Intent ourIntent = new Intent(Publications.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 5){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$EnglishBooks");
                        Intent ourIntent = new Intent(Publications.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 6){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$BasantKiVaar");
                        Intent ourIntent = new Intent(Publications.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
