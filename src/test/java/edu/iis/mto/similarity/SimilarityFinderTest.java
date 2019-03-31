package edu.iis.mto.similarity;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimilarityFinderTest {

    @Test public void calculateJackardSimilarityShouldReturnZeroComaThreeAsResult() {

        int[] seq1 = {1,2,3,6,8};
        int[] seq2 = {1,2,4,5,6,7,9,10};

        SearcherDubler searcher = new SearcherDubler();
        SimilarityFinder similarityFinder = new SimilarityFinder(searcher);

        double expectedResult = 0.3;

        assertThat(similarityFinder.calculateJackardSimilarity(seq1, seq2), Matchers.is(expectedResult));
    }

    @Test public void calculateJackardSimilarityForTwoDifferentSeqsShouldReturnZeroAsResult() {

        int[] seq1 = {1,2,3,4,5};
        int[] seq2 = {6,7,8};

        SearcherDubler searcher = new SearcherDubler();
        SimilarityFinder similarityFinder = new SimilarityFinder(searcher);

        double expectedResult = 0;

        assertThat(similarityFinder.calculateJackardSimilarity(seq1, seq2), Matchers.is(expectedResult));
    }


}
