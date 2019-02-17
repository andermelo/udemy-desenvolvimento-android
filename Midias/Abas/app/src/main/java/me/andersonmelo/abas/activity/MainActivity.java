package me.andersonmelo.abas.activity;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import me.andersonmelo.abas.R;
import me.andersonmelo.abas.fragment.EmAltaFragment;
import me.andersonmelo.abas.fragment.HomeFragment;
import me.andersonmelo.abas.fragment.InscricoesFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.viewPagerTab);

        //Aplica configurações na Action Bar
        getSupportActionBar().setElevation(0); //Retirar sombra
        getSupportActionBar().setTitle("Youtube");

        //Configurar abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add("Home", HomeFragment.class )
                .add("Inscrições", InscricoesFragment.class)
                .add("Em alta", EmAltaFragment.class)
                .create()

        );
        viewPager.setAdapter( adapter);
        smartTabLayout.setViewPager( viewPager );

    }
}
