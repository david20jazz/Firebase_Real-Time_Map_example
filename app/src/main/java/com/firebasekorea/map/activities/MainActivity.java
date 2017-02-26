package com.firebasekorea.map.activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.TextView;

import com.firebasekorea.map.R;
import com.firebasekorea.map.fragments.NaverMapFragment;
import com.firebasekorea.map.utils.ToastUtil;
import com.nhn.android.maps.NMapActivity;
import com.nhn.android.maps.NMapView;

/**
 * Created by namhoonkim on 25/02/2017.
 */

public class MainActivity extends BaseActivity {
    private final String TAG = MainActivity.class.getSimpleName();


    private long pressTime = 0;

    /* View Component */
    private TextView mLongitudeTextView;
    private TextView mLatitudeTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setTitle("Firebase Real-Time Map Example");

        init();
    }

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() > pressTime + 2000) {
            pressTime = System.currentTimeMillis();
            ToastUtil.makeShortToast(MainActivity.this, "뒤로가기 버튼을 한 번 더 누르면 종료됩니다.");
        }
        else {
            finishAffinity();
        }
    }

    private void init() {
        mLongitudeTextView = (TextView) findViewById(R.id.main_longitude);
        mLatitudeTextView = (TextView) findViewById(R.id.main_latitude);
    }

    public void updateGeoPoint(double longitude, double latitude) {
        mLongitudeTextView.setText("경도 : " + longitude);
        mLatitudeTextView.setText("위도 : " + latitude);
    }
}
