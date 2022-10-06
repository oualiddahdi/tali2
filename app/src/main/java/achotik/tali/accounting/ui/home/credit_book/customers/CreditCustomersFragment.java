package achotik.tali.accounting.ui.home.credit_book.customers;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.FragmentCreditBookBinding;
import achotik.tali.accounting.databinding.FragmentCreditCustomersBinding;
import achotik.tali.accounting.databinding.FragmentDashboardBinding;


public class CreditCustomersFragment extends Fragment {


    FragmentCreditCustomersBinding mBinding;

    public CreditCustomersFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mBinding = FragmentCreditCustomersBinding.inflate(inflater, container, false);

        mBinding.mButtonAddCustomers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext(), AddCustomersActivity.class);
                startActivity(i);


            }
        });

        return mBinding.getRoot();

    }
}