package me.andersonmelo.aprendaingles.activity;

import android.print.PrinterId;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import me.andersonmelo.aprendaingles.R;
import me.andersonmelo.aprendaingles.fragment.BichosFragment;
import me.andersonmelo.aprendaingles.fragment.NumerosFragment;
import me.andersonmelo.aprendaingles.fragment.VogaisFragment;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLaout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Aprenda Inglês");

        smartTabLaout = findViewById(R.id.smartTabLayout);
        viewPager = findViewById(R.id.viewpager);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add("Bichos", BichosFragment.class)
                .add("Números", NumerosFragment.class)
                .add("Vogais", VogaisFragment.class)
                .create()
        );

        viewPager.setAdapter( adapter );
        smartTabLaout.setViewPager( viewPager );

    }
}
