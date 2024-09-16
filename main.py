from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.button import Button
from kivy.uix.label import Label
from jnius import autoclass

class SpeechRecognitionApp(App):
    def build(self):
        layout = BoxLayout(orientation='vertical')
        self.label = Label(text="Press the button to start speech recognition")
        self.button = Button(text="Start Speech Recognition")
        self.button.bind(on_press=self.start_speech_recognition)

        layout.add_widget(self.label)
        layout.add_widget(self.button)

        # Access the MainActivity and initialize it
        self.PythonActivity = autoclass('org.kivy.android.PythonActivity')
        self.activity = self.PythonActivity.mActivity

        return layout

    def start_speech_recognition(self, instance):
        # Call the Java method to start speech recognition
        self.activity.startSpeechRecognition()

if __name__ == '__main__':
    SpeechRecognitionApp().run()
