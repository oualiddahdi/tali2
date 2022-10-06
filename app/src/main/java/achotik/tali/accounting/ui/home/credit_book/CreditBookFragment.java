package achotik.tali.accounting.ui.home.credit_book;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.FragmentCreditBookBinding;
import achotik.tali.accounting.databinding.FragmentDashboardBinding;
import achotik.tali.accounting.ui.home.credit_book.customers.CreditCustomersFragment;
import achotik.tali.accounting.ui.home.credit_book.suppliers.CreditSuppliersFragment;


public class CreditBookFragment extends Fragment {

    Fragment fragment = null;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    FragmentCreditBookBinding mBinding;
    Context mContext;

    public CreditBookFragment() {
        // Required empty public constructor
    }

    public static CreditBookFragment newInstance() {
        return new CreditBookFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mBinding = FragmentCreditBookBinding.inflate(inflater, container, false);

        mContext = getContext();

        mBinding.mTextCustomers.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                mBinding.mTextCustomers.setBackground(mContext.getResources().getDrawable(R.drawable.badge_shape_blue));
                mBinding.mTextCustomers.setTextColor(mContext.getResources().getColor(R.color.white));

                mBinding.mTextSuppliers.setBackground(null);
                mBinding.mTextSuppliers.setTextColor(mContext.getResources().getColor(R.color.black));


                loadFragments(new CreditCustomersFragment());


            }
        });

        mBinding.mTextSuppliers.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                mBinding.mTextSuppliers.setBackground(mContext.getResources().getDrawable(R.drawable.badge_shape_blue));
                mBinding.mTextSuppliers.setTextColor(mContext.getResources().getColor(R.color.white));


                mBinding.mTextCustomers.setBackground(null);
                mBinding.mTextCustomers.setTextColor(mContext.getResources().getColor(R.color.black));

                loadFragments(new CreditSuppliersFragment());


            }
        });

        loadFragments(new CreditCustomersFragment());


        return mBinding.getRoot();

    }

    private void loadFragments(Fragment fragment){

        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();


    }
}