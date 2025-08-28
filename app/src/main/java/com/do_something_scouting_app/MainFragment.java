package com.do_something_scouting_app;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.do_something_scouting_app.databinding.MainFragmentBinding;

public class MainFragment extends Fragment {
    MainFragmentBinding binding;

    //this is the variable that tracks what number is on the example button
    int exampleButtonValue = 0;

    // empty constructor
    public MainFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = MainFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //This is an example of what code looks like to make a button increase every time you press it
        binding.exampleButton.setOnClickListener(view1 -> {
            //this line increases the value of the "exampleButtonValue" variable by 1
            exampleButtonValue++;
            //this line sets the text of the "exampleButton" to the "exampleButtonValue"
            binding.exampleButton.setText(String.valueOf(exampleButtonValue));
        });
    }
}
