package Questions;


import java.util.ArrayList;


/**
 * Created by Brandon Kirklen on 5/12/2015.
 * Difference type of question
 */
public class ChoiceQuestion extends Question {
    private ArrayList<String> answers = new ArrayList<>();
    private ArrayList<Integer> correctAnswers = new ArrayList<>();
    private int answersCount=0;
    public ChoiceQuestion(String question)
    {
        super(question);
    }

    public void addChoice(String answer, boolean correct){
        answers.add(answer);
        answersCount++;
        if ( correct ){
            correctAnswers.add(answer.indexOf(answer));
            super.setAnswer(Integer.toString(answersCount));
        }
    }

    @Override
    public String toString() {
        return "Choice" + super.toString() + "[choices=" + answers + "]";
    }
}
