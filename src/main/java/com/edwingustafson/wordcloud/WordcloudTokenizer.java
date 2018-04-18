package com.edwingustafson.wordcloud;

import com.kennycason.kumo.nlp.tokenizer.WordTokenizer;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class WordcloudTokenizer implements WordTokenizer {
    private static final Logger log = LogManager.getLogger(WordcloudTokenizer.class);

    public WordcloudTokenizer() {}

    @Override
    public List<String> tokenize(final String sentence) {
        return Arrays.asList(sentence.replaceAll("[_“”]+", "" ).toLowerCase().split("\\s+"));
    }
}
