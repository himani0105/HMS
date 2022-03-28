package com.example.hms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hms.databinding.FragmentBookAppointmentBinding;

public class BookAppointmentFragment extends Fragment {

    private FragmentBookAppointmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BookAppointmentViewModel bookAppointmentViewModel =
                new ViewModelProvider(this).get(BookAppointmentViewModel.class);

        binding = FragmentBookAppointmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBookAppointment;
        bookAppointmentViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}