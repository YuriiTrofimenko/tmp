package org.tyaa.demo.java.testing.gradle;

import java.util.ArrayList;
import java.util.List;

public class Generator implements IGenerator {
    @Override
    public List<Character> generate(char startChar, char endChar) {
        if (startChar > endChar) {
            throw new IllegalArgumentException(
                String.format(
                    "startChar must be equal to or less than endChar but %s > %s",
                    startChar,
                    endChar
                )
            );
        }
        char currentCharacter = startChar;
        List<Character> characters = new ArrayList<>();
        while (currentCharacter <= endChar) {
            characters.add(currentCharacter++);
        }
        return characters;
    }
}
