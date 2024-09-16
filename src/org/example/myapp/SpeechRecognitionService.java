package org.example.myapp;

import android.content.Context;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.util.Log;

public class SpeechRecognitionService {
    private static final int REQUEST_CODE = 100;
    private Context context;

    public SpeechRecognitionService(Context context) {
        this.context = context;
    }

    public void startSpeechRecognition() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speak now");

        if (intent.resolveActivity(context.getPackageManager()) != null) {
            ((MainActivity) context).startActivityForResult(intent, REQUEST_CODE);
        } else {
            Log.e("SpeechRecognition", "No speech recognition activity found");
        }
    }
}
