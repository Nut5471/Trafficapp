package sdu.cs.sirichai.trafficapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutApp extends AppCompatActivity {
    //Explicit
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
    }

    public void clickback(View view) {
        finish();


    }//end clickback () Method

    public void playSound(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.sound);
        mediaPlayer.start();

    }//end playSound

    public void clickfacebook(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100003986617678"));
        startActivity(intent);
    }

    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0808058309"));
        startActivity(mobileIntent);


    }//end clickMobile

    public void clickMap(View view) {
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.776327, 100.510671(มหาวิทยาลัยสวนดุสิต)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);


    }//end clickMap
}//end class
