package com.example.hms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hms.databinding.FragmentViewAppointmentBinding;

public class ViewAppointmentFragment extends Fragment {

    private FragmentViewAppointmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewAppointmentViewModel viewAppointmentViewModel =
                new ViewModelProvider(this).get(ViewAppointmentViewModel.class);

        binding = FragmentViewAppointmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textViewAppointment;
        viewAppointmentViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}