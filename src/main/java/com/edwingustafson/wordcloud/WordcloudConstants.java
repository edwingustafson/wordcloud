package com.edwingustafson.wordcloud;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public interface WordcloudConstants {
    public static final String INPUT_FILE_PATH = "src/main/resources/input.txt";
    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;
    public static final int PADDING = 0;
    public static final String OUTPUT_FILE_PATH = "target/output.png";
    public static final Color TRANSPARENT = new Color(0, 0, 0, 0);
    public static final String FONT = "Noto Serif";
    public static final int MIN_WORD_LENGTH = 4;
    public static final int WORDS = 0x100;
    public static final List<String> STOP_WORDS = Arrays.<String>asList(
            "about",
            "across",
            "again",
            "all",
            "also",
            "and",
            "back",
            "been",
            "before",
            "came",
            "come",
            "could",
            "even",
            "from",
            "have",
            "him",
            "hump",
            "into",
            "it",
            "it’s",
            "itself",
            "know",
            "like",
            "made",
            "making",
            "many",
            "me",
            "more",
            "most",
            "myself",
            "oh",
            "only",
            "out",
            "over",
            "said",
            "than",
            "that",
            "the",
            "their",
            "them",
            "then",
            "there",
            "these",
            "they",
            "this",
            "though",
            "upon",
            "very",
            "was",
            "went",
            "were",
            "what",
            "when",
            "which",
            "while",
            "will",
            "with",
            "would",
            "you",
            "your",
            "way",
            "dummy"
    );
}
