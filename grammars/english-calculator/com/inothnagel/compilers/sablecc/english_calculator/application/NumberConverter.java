package com.inothnagel.compilers.sablecc.english_calculator.application;

import com.inothnagel.compilers.sablecc.english_calculator.generated.node.TNumber;

/**
 * TODO: This is clearly still a dummy implementation waiting for a proper library.
 */
public class NumberConverter {

    public int toArabic(TNumber number) {
        switch (number.getText()) {
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
        }
        return 0;
    }
}
