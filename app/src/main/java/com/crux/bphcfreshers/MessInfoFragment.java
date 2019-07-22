package com.crux.bphcfreshers;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MessInfoFragment extends Fragment {

    private TextToSpeech myTTS;
    private FloatingActionButton messInfoButton;
    private SpeechRecognizer mySpeechRec;
    Calendar calendar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_messinfo, null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        messInfoButton = view.findViewById(R.id.messInfoButton);

        messInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1);
                mySpeechRec.startListening(intent);
            }
        });
        initializeTextToSpeech();
        initializeSpeechRec();
    }

    private void initializeSpeechRec() {
        if (SpeechRecognizer.isRecognitionAvailable(getContext())) {
            mySpeechRec = SpeechRecognizer.createSpeechRecognizer(getContext());
            mySpeechRec.setRecognitionListener(new RecognitionListener() {
                @Override
                public void onReadyForSpeech(Bundle params) {
                }

                @Override
                public void onBeginningOfSpeech() {
                }

                @Override
                public void onRmsChanged(float rmsdB) {

                }

                @Override
                public void onBufferReceived(byte[] buffer) {

                }

                @Override
                public void onEndOfSpeech() {
                }

                @Override
                public void onError(int error) {

                }

                @Override
                public void onResults(Bundle results) {
                    List<String> resultsArr = results.getStringArrayList(
                            SpeechRecognizer.RESULTS_RECOGNITION
                    );
                    processResult(resultsArr.get(0));
                }

                @Override
                public void onPartialResults(Bundle partialResults) {

                }

                @Override
                public void onEvent(int eventType, Bundle params) {

                }
            });
        }
    }

    private void processResult(String command) {
        command = command.toLowerCase();
        Toast.makeText(getContext(), command, Toast.LENGTH_SHORT).show();
//        if (command == "today" || command == "today's") {
            if (command.equals("breakfast")) {
                convertTextToSpeech("shit");
            } else if (command.equals("lunch")) {
                convertTextToSpeech("shit");
            } else if (command.equals("snacks")) {
                convertTextToSpeech("shit");
            } else if (command.equals("dinner")) {
                convertTextToSpeech("shit");
            } else {
                convertTextToSpeech("Wrong Input");
            }
//        }

    }

    public void initializeTextToSpeech() {
        myTTS = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (myTTS.getEngines().size() == 0) {
                    Toast.makeText(getContext(), "No TTS Engine Found", Toast.LENGTH_SHORT).show();
                } else {
                    myTTS.setLanguage(Locale.US);
                    convertTextToSpeech("Which meal's menu would u like to know about today?");
                }
            }
        });
    }

    private void convertTextToSpeech(String text) {
        myTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null,null);
    }

    @Override
    public void onPause() {
        super.onPause();
        myTTS.shutdown();
    }
}
