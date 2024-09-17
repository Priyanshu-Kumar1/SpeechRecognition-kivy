package org.example.myapp;

import org.kivy.android.PythonActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends PythonActivity {
    private SpeechRecognitionService speechRecognitionService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        speechRecognitionService = new SpeechRecognitionService(this);
    }

    // Expose this method to Python
    public void startSpeechRecognition() {
        speechRecognitionService.startSpeechRecognition();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            // Handle speech recognition results here
        }
    }
}
