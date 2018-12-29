package com.example.dominik.uberpaczka.validators_patterns;

import android.support.design.widget.TextInputLayout;

/**
 * Created by marek on 21.12.2018.
 */

public class NameValidator extends AbstractValidator {


    private String patternString="[a-zA-Z0-9\\._\\-]{3,}";

    public NameValidator() {
    }

    public NameValidator(TextInputLayout textInputLayout, String message, String messageIfBlank) {
        super(textInputLayout, message, messageIfBlank);
        compilePattern(patternString);
    }
}
