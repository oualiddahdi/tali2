package achotik.tali.accounting.ui.home.credit_book.suppliers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.ActivityAddSuppliersBinding;

public class AddSuppliersActivity extends AppCompatActivity {


    ActivityAddSuppliersBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_add_suppliers);

        mBinding.mImageClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}