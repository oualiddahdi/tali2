package achotik.tali.accounting.ui.register;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.PhoneAuthScreenBinding;
import achotik.tali.controller.CountryCodeSpinner;

public class PhoneAuthScreen extends AppCompatActivity {


    PhoneAuthScreenBinding mBinding;
    private String phoneCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.phone_auth_screen);

        mBinding.ccs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryCodeSpinner.CountryModel model = (CountryCodeSpinner.CountryModel) parent.getAdapter().getItem(position);
                Log.e("KetanRamani", ": " + model.getPhoneCode());
                phoneCode = model.getPhoneCode();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        mBinding.buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!mBinding.phoneNumber.getText().toString().equals("")) {

                    int data = Integer.parseInt(String.valueOf(mBinding.phoneNumber.length()));

                    if (data <= 9) {

                        Intent intent = new Intent(PhoneAuthScreen.this, OtpScreen.class);
                        intent.putExtra("phoneNumber", phoneCode + mBinding.phoneNumber.getText().toString());
                        startActivity(intent);

                    }

                }
            }
        });

    }
}