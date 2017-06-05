package com.example.hp.chinesetry;

/**
 * Created by HP on 6/5/2017.
 */

public class QuizLibrary {
    public static String mQuestions [] = {
            "Which of these characters means 'man'?",
            "Which of these characters means 'son'?",
            "'爸爸' means : ",
            "'再见‘ means : ",
            "When your see your friend you greet him with :"

    };


    private String mChoices [][] = {
            {"男(nan)", "女(nu)", "儿子(er-zi)"},
            {"再见（zaijian)", "儿子（er-zi)", "你（ni)"},
            {"Mom", "hello", "Dad"},
            {"Bye", "hello", "Thank you"},
            {"你好（nihao)", "再见（zaijain)", "他们（tamen)"}

    };



    private String mCorrectAnswers[] = {"男(nan)", "儿子（er-zi)", "Dad", "Bye", "你好（nihao)"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String Choice0 = mChoices[a][0];
        return Choice0;
    }

    public String getChoice2(int a) {
        String Choice1 = mChoices[a][1];
        return Choice1;
    }

    public String getChoice3(int a) {
        String Choice2 = mChoices[a][2];
        return Choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

