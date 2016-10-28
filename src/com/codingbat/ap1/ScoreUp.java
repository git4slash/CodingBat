package com.codingbat.ap1;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 28.10.16
 */
/*
The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers"
array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and
are the same length. Return the score for this array of answers, giving +4 for each correct answers, -1 for each
incorrect answers, and +0 for each blank answers.
*/
public class ScoreUp {
    public int scoreUp(String[] key, String[] answers) {
        final String blankAnswer = "?";
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            String answer = answers[i];
            if (answer.equals(blankAnswer)) {
                continue;
            } else if (answer.equals(key[i])) {
                score += 4;
            } else {
                score -= 1;
            }
        }
        return score;
    }
}
