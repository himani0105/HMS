package com.example.hms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hms.databinding.FragmentPrescriptionBinding;

public class PrescriptionFragment extends Fragment {

    private FragmentPrescriptionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PrescriptionViewModel prescriptionViewModel =
                new ViewModelProvider(this).get(PrescriptionViewModel.class);

        binding = FragmentPrescriptionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPrescription;
        prescriptionViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}