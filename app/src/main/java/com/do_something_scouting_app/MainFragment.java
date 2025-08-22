package com.do_something_scouting_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.do_something_scouting_app.databinding.MainFragmentBinding;

public class MainFragment extends Fragment {
    MainFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = MainFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
