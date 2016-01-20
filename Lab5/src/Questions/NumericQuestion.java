package Questions;

/**
 * Created by Brandon Kirklen on 5/12/2015.
 * Creates new question type
 */
public class NumericQuestion extends Question{
    private double correctResponse;

    public NumericQuestion(String question){
        super(question);
    }

    public void setAnswer(double correctResponse) {
        this.correctResponse = correctResponse;
    }

    @Override
    public boolean checkAnswer(String response) {
        return correctResponse == Double.parseDouble(response) ||
                correctResponse - Double.parseDouble(response) <= 0.01;
    }
}
