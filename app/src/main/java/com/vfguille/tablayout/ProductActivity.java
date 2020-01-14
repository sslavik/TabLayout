package com.vfguille.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class ProductActivity extends AppCompatActivity {

    // VIEWS
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    // ADAPTER
    ProductFragmentAdapter productFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        // INSTANCIAMOS EL ADAPTER
        productFragmentAdapter = new ProductFragmentAdapter(getSupportFragmentManager());

        // INSTANCIAR VISTAS
        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);

        // CAMBIAMOS EL TOOLBAR
        getSupportActionBar().hide();
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);


        // Funcionamiento del tablayout
        tabLayout.setupWithViewPager(viewPager);
    }
}
