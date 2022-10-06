package achotik.tali.accounting.ui.home.credit_book.suppliers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.FragmentCreditBookBinding;
import achotik.tali.accounting.databinding.FragmentCreditSuppliersBinding;
import achotik.tali.accounting.databinding.FragmentDashboardBinding;


public class CreditSuppliersFragment extends Fragment {


    FragmentCreditSuppliersBinding mBinding;

    public CreditSuppliersFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mBinding = FragmentCreditSuppliersBinding.inflate(inflater, container, false);

        mBinding.mButtonAddSuppliers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext(), AddSuppliersActivity.class);
                startActivity(i);


            }
        });


        return mBinding.getRoot();

    }
}