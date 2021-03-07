package smallville7123.apps.circularbuffer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import smallville7123.apps.circularbuffer.databinding.ActivityMainBinding;
import smallville7123.circularbuffer.UndoRedoCircularBuffer;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final UndoRedoCircularBuffer circularBuffer = new UndoRedoCircularBuffer(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(circularBuffer.toString());
    }
}