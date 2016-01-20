package Quiz;

/**
 * Created by Brandon Kirklen on 5/11/2015.
 */
public class Quiz implements Measurable{
    private double score;
    private String letterGrade;

    @Override
    public double getMeasure() {
        return score;
    }

    public Quiz (double score, String letterGrade){
        this.score = score;
        this.letterGrade = letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getLetterGrade() {
        return letterGrade;
    }
}
