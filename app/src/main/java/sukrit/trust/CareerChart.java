package sukrit.trust;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CareerChart extends BaseActivity {
	private String[] navMenuTitles;
	private TypedArray navMenuIcons;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.career_chart);
		navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);
		navMenuIcons = getResources().obtainTypedArray(R.array.nav_drawer_icons);
		set(navMenuTitles, navMenuIcons);
        String[] careerList = new String[] {"After +2 Medical", "After +2 Non-Medical", "After +2 Commerce", "After +2 Arts", "After 10th",
                "I wish to be an IAS Officer"};
        final ListView career = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.career_row, careerList);
        career.setAdapter(adapter);

        career.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$Medical");
                        Intent ourIntent = new Intent(CareerChart.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 1){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$NonMedical");
                        Intent ourIntent = new Intent(CareerChart.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 2){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$Commerce");
                        Intent ourIntent = new Intent(CareerChart.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 3){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$Arts");
                        Intent ourIntent = new Intent(CareerChart.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 4){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$Tenth");
                        Intent ourIntent = new Intent(CareerChart.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }else if (position == 5){
                    try{
                        Class ourClass = Class.forName("sukrit.trust.PublicationsTab$IasOfficer");
                        Intent ourIntent = new Intent(CareerChart.this, ourClass);
                        startActivity(ourIntent);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
