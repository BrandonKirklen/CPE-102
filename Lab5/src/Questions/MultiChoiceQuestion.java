package Questions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 */
public class MultiChoiceQuestion extends Question {

    public  MultiChoiceQuestion(String question){
        super(question);
    }

    private ArrayList<String> answers = new ArrayList<>();
    private ArrayList<Integer> correctAnswers = new ArrayList<>();
    private int answersCount=1;
    private String answerList = "";

    public void addChoice(String answer, boolean correct){
        answers.add(answer);
        if ( correct ){
            correctAnswers.add(answersCount);
            super.setAnswer(Integer.toString(answersCount));
            answerList = answerList + answersCount + " ";
        }
        answersCount++;

    }

    @Override
    public void display() {
        super.display();
        for( int i=0; i < answers.size(); i++ )
        System.out.println(i+1 + ": " + answers.get(i));
    }

    @Override
    public boolean checkAnswer(String response){
        //System.out.println(response);
        //System.out.println(answerList);
        if ( response.length() % 2 == 1)
        {
            response = response + " ";
        }
        if ( response.equals(answerList) ){
            return true;
        }
        else {
            return false;
        }
    }
}
