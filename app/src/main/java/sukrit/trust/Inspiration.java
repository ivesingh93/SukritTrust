package sukrit.trust;


import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.MediaStore.Images;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Inspiration extends BaseActivity {
	private String[] navMenuTitles;
	private TypedArray navMenuIcons;
    String mon = "";
    String dat = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inspiration);
		navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);

		navMenuIcons = getResources()
				.obtainTypedArray(R.array.nav_drawer_icons);

		set(navMenuTitles, navMenuIcons);
        
        final TextView textView = (TextView)findViewById(R.id.facebook);
        final Button save = (Button)findViewById(R.id.save);
        final Button share = (Button)findViewById(R.id.share);
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);


        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.facebook.com/sukrit.org?ref=br_tf'>Like us on Facebook</a>";
        textView.setText(Html.fromHtml(text));


        String[] arr = {"January" , "February" , "March" , "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (month == 0){
            mon = arr[0];
        }else if (month == 1){
            mon = arr[1];
        }else if (month == 2){
            mon = arr[2];
        }else if (month == 3){
            mon = arr[3];
        }else if (month == 4){
            mon = arr[4];
        }else if (month == 5){
            mon = arr[5];
        }else if (month == 6){
            mon = arr[6];
        }else if (month == 7){
            mon = arr[7];
        }else if (month == 8){
            mon = arr[8];
        }else if (month == 9){
            mon = arr[9];
        }else if (month == 10){
            mon = arr[10];
        }else if (month == 11){
            mon = arr[11];
        }

        String[] arr_of_dates = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty_one", "twenty_two", "twenty_three", "twenty_four", "twenty_five", "twenty_six",
                "twenty_seven", "twenty_eight", "twenty_nine", "thirty", "thirty_one"};



        if (date == 1){
            dat = arr_of_dates[0];
        }else if (date == 2){
            dat = arr_of_dates[1];
        }else if (date == 3){
            dat = arr_of_dates[2];
        }else if (date == 4){
            dat = arr_of_dates[3];
        }else if (date == 5){
            dat = arr_of_dates[4];
        }else if (date == 6){
            dat = arr_of_dates[5];
        }else if (date == 7){
            dat = arr_of_dates[6];
        }else if (date == 8){
            dat = arr_of_dates[7];
        }else if (date == 9){
            dat = arr_of_dates[8];
        }else if (date == 10){
            dat = arr_of_dates[9];
        }else if (date == 11){
            dat = arr_of_dates[10];
        }else if (date == 12){
            dat = arr_of_dates[11];
        }else if (date == 13){
            dat = arr_of_dates[12];
        }else if (date == 14){
            dat = arr_of_dates[13];
        }else if (date == 15){
            dat = arr_of_dates[14];
        }else if (date == 16){
            dat = arr_of_dates[15];
        }else if (date == 17){
            dat = arr_of_dates[16];
        }else if (date == 18){
            dat = arr_of_dates[17];
        }else if (date == 19){
            dat = arr_of_dates[18];
        }else if (date == 20){
            dat = arr_of_dates[19];
        }else if (date == 21){
            dat = arr_of_dates[20];
        }else if (date == 22){
            dat = arr_of_dates[21];
        }else if (date == 23){
            dat = arr_of_dates[22];
        }else if (date == 24){
            dat = arr_of_dates[23];
        }else if (date == 25){
            dat = arr_of_dates[24];
        }else if (date == 26){
            dat = arr_of_dates[25];
        }else if (date == 27){
            dat = arr_of_dates[26];
        }else if (date == 28){
            dat = arr_of_dates[27];
        }else if (date == 29){
            dat = arr_of_dates[28];
        }else if (date == 30){
            dat = arr_of_dates[29];
        }else if (date == 31){
            dat = arr_of_dates[30];
        }


        ImageView mImage = (ImageView)findViewById(R.id.imageView1);
        final InputStream ims;

        try {
            PhotoViewAttacher mAttacher;
            ims = getAssets().open("Inspirations/"+mon+"/"+dat+".jpg");
            Drawable d = Drawable.createFromStream(ims, null);
            mImage.setImageDrawable(d);
            mAttacher = new PhotoViewAttacher(mImage);
            mAttacher.update();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BitmapDrawable drawable = (BitmapDrawable) mImage.getDrawable();
        final Bitmap bitmap = drawable.getBitmap();
        save.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SdCardPath") @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Image Saved To Gallery", Toast.LENGTH_LONG).show();
                ContentValues values = new ContentValues();
                values.put(Images.Media.DATE_ADDED, System.currentTimeMillis());
                values.put(Images.Media.DATE_TAKEN, System.currentTimeMillis());
                values.put(Images.Media.TITLE, dat+"_"+mon);
                values.put(Images.Media.DISPLAY_NAME, dat+"_"+mon);
                values.put(Images.Media.DESCRIPTION, "Image");
                values.put(Images.Media.MIME_TYPE, "image/jpg");


                Uri url = null;
                try {
                    url = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

                    if (bitmap != null) {
                        OutputStream imageOut = getContentResolver().openOutputStream(url);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 50, imageOut);
                        } finally {
                            imageOut.close();
                        }

                        long id = ContentUris.parseId(url);
                        Bitmap miniThumb = Images.Thumbnails.getThumbnail(getContentResolver(), id, Images.Thumbnails.MINI_KIND, null);
                        Matrix matrix = new Matrix();
                        float scaleX = 50f / miniThumb.getWidth();
                        float scaleY = 50f / miniThumb.getHeight();

                        matrix.setScale(scaleX, scaleY);

                        Bitmap thumb = Bitmap.createBitmap(miniThumb, 0, 0,
                                miniThumb.getWidth(),
                                miniThumb.getHeight(), matrix,
                                true
                        );

                        ContentValues valuess = new ContentValues(4);
                        values.put(Images.Thumbnails.KIND,Images.Thumbnails.MICRO_KIND);
                        values.put(Images.Thumbnails.IMAGE_ID,(int)id);
                        values.put(Images.Thumbnails.HEIGHT,thumb.getHeight());
                        values.put(Images.Thumbnails.WIDTH,thumb.getWidth());

                        Uri urll = getContentResolver().insert(Images.Thumbnails.EXTERNAL_CONTENT_URI, valuess);

                        try {
                            OutputStream thumbOut = getContentResolver().openOutputStream(urll);
                            thumb.compress(Bitmap.CompressFormat.JPEG, 100, thumbOut);
                            thumbOut.close();
                            return;
                        } catch (FileNotFoundException ex) {
                            return;
                        } catch (IOException ex) {
                            return;
                        }




                    } else {
                        getContentResolver().delete(url, null, null);
                        url = null;
                    }
                } catch (Exception e) {
                    if (url != null) {
                        getContentResolver().delete(url, null, null);
                        url = null;
                    }
                }







            }
        });


        share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String pathofBmp = Images.Media.insertImage(getContentResolver(), bitmap, dat+"_"+mon, null);
                Uri bmpUri = Uri.parse(pathofBmp);
                final Intent emailIntent1 = new Intent(    android.content.Intent.ACTION_SEND);
                emailIntent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                emailIntent1.putExtra(Intent.EXTRA_STREAM, bmpUri);
                emailIntent1.setType("image/png");
                startActivity(emailIntent1);
            }
        });



        //webview.loadUrl("file:///android_asset/Inspirations/"+mon+"/"+dat+".jpg");
        //		wallpaper.setOnClickListener(new View.OnClickListener() {
        //
        //			public void onClick(View v) {
        //
        //				WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        //				try {
        //					//InputStream ims = getAssets().open("eight.jpg");
        //					InputStream ims = getAssets().open("Inspirations/"+mon+"/"+dat+".jpg");
        //					myWallpaperManager.setStream(ims);
        //					//myWallpaperManager.setResource(R.drawable.eight);
        //				} catch (IOException e) {
        //					e.printStackTrace();
        //				}
        //
        //			}
        //		});
    }
}
