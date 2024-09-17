from deep_translator import GoogleTranslator

def translate(text, target_language):
    translation = GoogleTranslator(source='auto', target=target_language).translate(text)
    return translation

