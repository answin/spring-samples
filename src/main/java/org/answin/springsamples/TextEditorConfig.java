package org.answin.springsamples;

import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor(){
        return new TextEditor();
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }

}
