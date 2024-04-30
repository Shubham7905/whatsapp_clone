package com.shubh856.whatsappclone.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.shubh856.whatsappclone.R;
import com.shubh856.whatsappclone.databinding.ActivityLoginBinding;
import com.shubh856.whatsappclone.viewmodel.MyViewModel;

public class LoginActivity extends AppCompatActivity {

    MyViewModel viewModel;
    ActivityLoginBinding activityLoginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        activityLoginBinding.setVModel(viewModel);

    }
}