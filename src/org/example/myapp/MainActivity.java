package org.example.myapp;

import org.kivy.android.PythonActivity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;

public class MainActivity extends PythonActivity {
    private SpeechRecognitionService speechRecognitionService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        speechRecognitionService = new SpeechRecognitionService(this);
    }

    public void startSpeechRecognition() {
        speechRecognitionService.startSpeechRecognition();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            // Handle speech recognition results here
            Log.d("SpeechRecognition", "Speech recognition results received.");
        }
    }
}
