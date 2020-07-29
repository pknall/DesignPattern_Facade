package com.applications.world.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * http://www.design-patterns-stories.com/patterns/Facade/
 * 
 * Tokenizer, tokenize input string into tokens.
 *
 */
public class Tokenizer {

    public static List<String> tokenize(String source) {

        ArrayList<String> tokens = new ArrayList<String>();

        StringTokenizer stringTokenizer = new StringTokenizer(source);
        while (stringTokenizer.hasMoreElements()) {
            tokens.add((String) stringTokenizer.nextElement());
        }
        return tokens;
    }
}