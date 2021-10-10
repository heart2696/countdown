package com.example.countdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.countdown.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private int count = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(v -> start());
    }
    private void start(){
        count--;
        if(count==0){
            binding.text.setVisibility(View.GONE);
            binding.image.setImageResource(R.drawable.unnamed);
            binding.button.setVisibility(View.GONE);
            return;
        }
        String message= String.format("%d번만 더 눌러보세요", count);
        binding.text.setText(message);
    }
}