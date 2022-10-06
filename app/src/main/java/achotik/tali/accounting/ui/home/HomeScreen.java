package achotik.tali.accounting.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import achotik.tali.accounting.R;
import achotik.tali.accounting.ui.home.cash_book.CashBookFragment;
import achotik.tali.accounting.ui.home.credit_book.CreditBookFragment;
import achotik.tali.accounting.ui.home.dashboard.DashboardFragment;
import achotik.tali.accounting.ui.home.settings.SettingsFragment;

public class HomeScreen extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener{


    BottomNavigationView bottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        bottomNavigation = findViewById(R.id.bottomNavigation);

        loadFragments(new DashboardFragment());
        bottomNavigation.setOnNavigationItemSelectedListener(this);


    }


    private void loadFragments(Fragment fragment){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item0:

                loadFragments( new DashboardFragment());

                return true;

            case R.id.item1:

                loadFragments(new CreditBookFragment());

                return true;

            case R.id.item2:

                loadFragments(new CashBookFragment());

                return true;


            case R.id.item3:

                loadFragments(new SettingsFragment());

                return true;


        }
        return  false;

    }

    @Override
    public void onBackPressed() {

        if (bottomNavigation.getSelectedItemId() == R.id.item0){

//
//            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//            alertDialogBuilder.setTitle(this.getString(R.string.Faster));
//            alertDialogBuilder.setIcon(R.mipmap.arabic_logo);
//            alertDialogBuilder.setMessage(this.getResources().getString(R.string.close));
//            alertDialogBuilder.setCancelable(true);
//
//            alertDialogBuilder.setPositiveButton(this.getResources().getString(R.string.ok), new DialogInterface.OnClickListener() {
//
//                @Override
//                public void onClick(DialogInterface arg0, int arg1) {
//                    finish();
//                }
//            });
//
//            alertDialogBuilder.setNeutralButton(this.getResources().getString(R.string.retreat), new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    dialog.dismiss();
//                }
//            });
//            alertDialogBuilder.show();


        }else {
          //  bottomNavigation.setSelectedItemId(R.id.navigation_home);
        }

    }

}