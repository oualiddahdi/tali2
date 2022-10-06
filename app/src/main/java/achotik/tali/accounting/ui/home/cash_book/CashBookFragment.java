package achotik.tali.accounting.ui.home.cash_book;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.FragmentCashBookBinding;

public class CashBookFragment extends Fragment {


    FragmentCashBookBinding mBinding;


    public CashBookFragment() {
        // Required empty public constructor
    }

    public static CashBookFragment newInstance() {
        return new CashBookFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mBinding = FragmentCashBookBinding.inflate(inflater, container, false);


        return mBinding.getRoot();

    }

}