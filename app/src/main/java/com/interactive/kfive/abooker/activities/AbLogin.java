package com.interactive.kfive.abooker.activities;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import com.interactive.kfive.abooker.R;
import com.interactive.kfive.abooker.adapters.fragmentadapters.LoginSwipeAdapter;
import com.interactive.kfive.abooker.fragments.AbLanding;
import com.interactive.kfive.abooker.fragments.AbRegister;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class AbLogin extends AppCompatActivity
        implements AbLanding.OnFragmentInteractionListener,
        com.interactive.kfive.abooker.fragments.AbLogin.OnFragmentInteractionListener,
        AbRegister.OnFragmentInteractionListener{

    //viewpager
    ViewPager viewPager;
    //fragmentpager helper
    LoginSwipeAdapter loginSwipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ab_login);
        viewPager = (ViewPager)findViewById(R.id.pager);
        loginSwipeAdapter = new LoginSwipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(loginSwipeAdapter);
        viewPager.setCurrentItem(1);


    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
