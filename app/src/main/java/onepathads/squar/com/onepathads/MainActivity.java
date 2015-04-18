package onepathads.squar.com.onepathads;

import com.mopub.mobileads.MoPubActivity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

  ImageView ivAdsView;

  Button btnShowAds;

  Button btnHideAds;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ivAdsView = (ImageView) findViewById(R.id.imageView);
    btnShowAds = (Button) findViewById(R.id.btnShowAds);
    btnHideAds = (Button) findViewById(R.id.btnHideAds);
    btnShowAds.setOnClickListener(this);
    btnHideAds.setOnClickListener(this);
    ivAdsView.setOnClickListener(this);


  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.imageView:
        break;
      case R.id.btnShowAds:

        break;
      case R.id.btnHideAds:
    }
  }
}
