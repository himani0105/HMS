package com.example.hms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hms.ViewReceiptViewModel;
import com.example.hms.databinding.FragmentViewReceiptBinding;

public class ViewReceiptFragment extends Fragment{

    private FragmentViewReceiptBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewReceiptViewModel viewReceiptViewModel =
                new ViewModelProvider(this).get(ViewReceiptViewModel.class);

        binding = FragmentViewReceiptBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textViewReceipt;
        viewReceiptViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}



