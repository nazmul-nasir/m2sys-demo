package com.m2sys.demo.view.input;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.m2sys.demo.BR;
import com.m2sys.demo.R;
import com.m2sys.demo.ViewModelProviderFactory;
import com.m2sys.demo.databinding.FragmentInputBinding;
import com.m2sys.demo.view.base.BaseFragment;

import javax.inject.Inject;

public class InputFragment extends BaseFragment<FragmentInputBinding, InputViewModel> implements InputNavigator {
    public static final String TAG = InputFragment.class.getSimpleName();
    @Inject
    ViewModelProviderFactory factory;
    private InputViewModel inputViewModel;

    public static InputFragment newInstance() {
        Bundle args = new Bundle();
        InputFragment fragment = new InputFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_input;
    }

    @Override
    public InputViewModel getViewModel() {
        inputViewModel = ViewModelProviders.of(this, factory).get(InputViewModel.class);
        return inputViewModel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inputViewModel.setNavigator(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inputViewModel.init();
    }

    @Override
    public void showMessage(String message) {
        hideKeyboard();
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
