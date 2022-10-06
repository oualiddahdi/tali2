package achotik.tali.accounting.ui.home.dashboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.FragmentDashboardBinding;
import achotik.tali.accounting.databinding.FragmentSettingsBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashboardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DashboardFragment extends Fragment {

    FragmentDashboardBinding mBinding;

    Context mContext;

    public DashboardFragment() {
        // Required empty public constructor
    }

    public static DashboardFragment newInstance() {
        return new DashboardFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mBinding = FragmentDashboardBinding.inflate(inflater, container, false);

        mContext = getContext();


        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBinding.mTextMonth.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                mBinding.mTextMonth.setBackground(mContext.getResources().getDrawable(R.drawable.badge_shape_blue));
                mBinding.mTextMonth.setTextColor(mContext.getResources().getColor(R.color.white));

                mBinding.mTextToday.setBackground(null);
                mBinding.mTextToday.setTextColor(mContext.getResources().getColor(R.color.black));

                mBinding.mTextWeek.setBackground(null);
                mBinding.mTextWeek.setTextColor(mContext.getResources().getColor(R.color.black));


            }
        });

        mBinding.mTextToday.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                mBinding.mTextToday.setBackground(mContext.getResources().getDrawable(R.drawable.badge_shape_blue));
                mBinding.mTextToday.setTextColor(mContext.getResources().getColor(R.color.white));

                mBinding.mTextMonth.setBackground(null);
                mBinding.mTextMonth.setTextColor(mContext.getResources().getColor(R.color.black));

                mBinding.mTextWeek.setBackground(null);
                mBinding.mTextWeek.setTextColor(mContext.getResources().getColor(R.color.black));


            }
        });


        mBinding.mTextWeek.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                mBinding.mTextWeek.setBackground(mContext.getResources().getDrawable(R.drawable.badge_shape_blue));
                mBinding.mTextWeek.setTextColor(mContext.getResources().getColor(R.color.white));

                mBinding.mTextToday.setBackground(null);
                mBinding.mTextToday.setTextColor(mContext.getResources().getColor(R.color.black));

                mBinding.mTextMonth.setBackground(null);
                mBinding.mTextMonth.setTextColor(mContext.getResources().getColor(R.color.black));


            }
        });


    }

}