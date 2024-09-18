from googletrans import Translator


# Initialize the translator
translator = Translator()

def translate(text, src='auto', target_language='en'):
    translation = translator.translate(text, src= src, dest=target_language)
    print(f"Detected source language: {translation.src}")
    return translation.text



if __name__ == '__main__':
    print(translate('urulaikkizhangu 1 kilo irukku', target_language='en'))
