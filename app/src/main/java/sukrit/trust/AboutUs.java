package sukrit.trust;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutUs extends BaseActivity {
	private String[] navMenuTitles;
	private TypedArray navMenuIcons;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.career_chart);
		navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);
		navMenuIcons = getResources().obtainTypedArray(R.array.nav_drawer_icons);
		set(navMenuTitles, navMenuIcons);
        String[] aboutList = new String[] {"Why Sukrit", "Sukrit at a Glance", "Five Projects", "Five Skills",
                "Sukrit in SGGS"};
        final ListView about = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.career_row, aboutList);
        about.setAdapter(adapter);

        about.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.AboutUsTab$WhySukrit");
                        Intent ourIntent = new Intent(AboutUs.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 1){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.AboutUsTab$SukritGlance");
                        Intent ourIntent = new Intent(AboutUs.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 2){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.AboutUsTab$FiveProjects");
                        Intent ourIntent = new Intent(AboutUs.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 3){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.AboutUsTab$FiveSkills");
                        Intent ourIntent = new Intent(AboutUs.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 4){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.AboutUsTab$SukritSGGS");
                        Intent ourIntent = new Intent(AboutUs.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
