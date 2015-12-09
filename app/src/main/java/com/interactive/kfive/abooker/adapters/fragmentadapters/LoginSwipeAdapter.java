package com.interactive.kfive.abooker.adapters.fragmentadapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.interactive.kfive.abooker.fragments.AbLanding;
import com.interactive.kfive.abooker.fragments.AbLogin;
import com.interactive.kfive.abooker.fragments.AbRegister;

import java.util.ArrayList;

/**
 * Created by kfive on 12/6/2015.
 */
public class LoginSwipeAdapter extends FragmentStatePagerAdapter {

    LoginSwipeHelper loginSwipeHelper;
    public LoginSwipeAdapter(FragmentManager fm) {
        super(fm);
         loginSwipeHelper = new LoginSwipeHelper();
    }

    @Override
    public Fragment getItem(int position) {
        return loginSwipeHelper.getFragment(position);

    }

    @Override
    public int getCount() {
        return loginSwipeHelper.fragmentCount();
    }
}

class LoginSwipeHelper{
    public ArrayList FragmentList;

    public LoginSwipeHelper()
    {
        FragmentList = new ArrayList();
        AbLanding abLanding = new AbLanding();
        AbLogin abLogin = new AbLogin();
        AbRegister abRegister = new AbRegister();
       // UserRegisterView userregisterview = new UserRegisterView();
        FragmentList.add(abRegister);
        FragmentList.add(abLanding);
        FragmentList.add(abLogin);


    }

    public int fragmentCount()
    {
        return FragmentList.size();
    }

    public Fragment getFragment(int i)
    {
        return (Fragment)FragmentList.get(i);
    }
}
