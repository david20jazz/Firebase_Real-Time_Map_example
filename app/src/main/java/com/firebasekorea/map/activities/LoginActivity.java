package com.firebasekorea.map.activities;

import android.os.Bundle;

import com.firebasekorea.map.R;

/**
 * Created by namhoonkim on 25/02/2017.
 */

public class LoginActivity extends BaseActivity {
    private final String TAG = LoginActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    private void init() {

    }
}

