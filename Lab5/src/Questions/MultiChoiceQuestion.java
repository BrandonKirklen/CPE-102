package Questions;

import java.util.ArrayList;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 */
public class MultiChoiceQuestion extends Question {

    public  MultiChoiceQuestion(String question){
        super(question);
    }

    private ArrayList<String> answers = new ArrayList<>();
    private ArrayList<Integer> correctAnswers = new ArrayList<>();
    private int answersCount=0;

    public void addChoice(String answer, boolean correct){
        answers.add(answer);
        answersCount++;
        if ( correct ){
            correctAnswers.add(answer.indexOf(answer));
            super.setAnswer(Integer.toString(answersCount));
        }
    }

    @Override
    public void display() {
        super.display();
        for( int i=0; i < answers.size(); i++ )
        System.out.println(i + ": " + answers.get(i));
    }

    @Override
    public boolean checkAnswer(String response){
        Integer.parseInt(response);

        return false;
    }
}
