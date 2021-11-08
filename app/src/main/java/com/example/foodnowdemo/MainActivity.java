package com.example.foodnowdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    FrameLayout frameLayout;
    HomeFragment homeFragment;
    OrderFragment orderFragment;
    ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.layoutContainer);
        tabLayout = findViewById(R.id.tabLayout);

        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("Home");
        firstTab.setIcon(R.drawable.ic_baseline_home_24);
        tabLayout.addTab(firstTab);

        TabLayout.Tab secondTab = tabLayout.newTab();
        secondTab.setText("Order");
        secondTab.setIcon(R.drawable.ic_baseline_receipt_24);
        tabLayout.addTab(secondTab);

        TabLayout.Tab thirdTab = tabLayout.newTab();
        thirdTab.setText("Profile");
        thirdTab.setIcon(R.drawable.ic_baseline_perm_identity_24);
        tabLayout.addTab(thirdTab);

        TabLayout.OnTabSelectedListener listener = new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new HomeFragment();
                        break;
                    case 1:
                        fragment = new OrderFragment();
                        break;
                    case 2:
                        fragment = new ProfileFragment();
                        break;
                }

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.layoutContainer, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
//        tabLayout.setOnTabSelectedListener(listener);

        tabLayout.setOnTabSelectedListener(this);

        homeFragment = new HomeFragment();
        orderFragment = new OrderFragment();
        profileFragment = new ProfileFragment();

        displayFragment(homeFragment);
    }

    private void createTabs() {
    }

    private void displayFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.layoutContainer, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }
}