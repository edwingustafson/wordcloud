package com.edwingustafson.wordcloud;

import static com.edwingustafson.wordcloud.WordcloudConstants.*;

import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.bg.RectangleBackground;
import com.kennycason.kumo.font.FontWeight;
import com.kennycason.kumo.font.KumoFont;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.font.scale.SqrtFontScalar;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.palette.ColorPalette;
import lombok.val;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.IOException;

@Service
public class WordcloudService {
    private static final Logger log = LogManager.getLogger(WordcloudService.class);

    public void run() throws IOException {
        val frequencyAnalyzer = new FrequencyAnalyzer();
        frequencyAnalyzer.setWordTokenizer(new WordcloudTokenizer());
        frequencyAnalyzer.setWordFrequenciesToReturn(WORDS);
        frequencyAnalyzer.setMinWordLength(MIN_WORD_LENGTH);
        frequencyAnalyzer.setStopWords(STOP_WORDS);

        val wordFrequencies = frequencyAnalyzer.load(INPUT_FILE_PATH);
        val dimension = new Dimension(WIDTH, HEIGHT);
        val wordCloud = new WordCloud(dimension, CollisionMode.RECTANGLE);

        wordCloud.setPadding(PADDING);
        wordCloud.setBackground(new RectangleBackground(dimension));
        wordCloud.setBackgroundColor(Color.BLACK);

        val colorPalette = new ColorPalette(Color.GREEN);
        wordCloud.setColorPalette(colorPalette);

        wordCloud.setKumoFont(new KumoFont(FONT, FontWeight.BOLD));

        wordCloud.setFontScalar(new LinearFontScalar(10, 200));
        wordCloud.build(wordFrequencies);
        wordCloud.writeToFile(OUTPUT_FILE_PATH);
    }
}
