package achotik.tali.accounting.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.google.firebase.auth.FirebaseAuth;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.WelcomeScreenBinding;
import achotik.tali.accounting.ui.home.HomeScreen;
import achotik.tali.accounting.ui.register.PhoneAuthScreen;

public class WelcomeScreen extends AppCompatActivity {

    WelcomeScreenBinding mBinding;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.welcome_screen);



    }

    @Override
    protected void onStart() {
        super.onStart();

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (FirebaseAuth.getInstance().getCurrentUser() != null) {

                    Intent intent = new Intent(WelcomeScreen.this, HomeScreen.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                    startActivity(intent);

                }else {
                    Intent i = new Intent(WelcomeScreen.this, PhoneAuthScreen.class);
                    startActivity(i);

                }

            }

        },5000);


    }
}