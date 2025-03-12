import java.util.ArrayList;
public class ReviewAnalysis{
    private Review[] allReviews;
    double sum = 0;
    public ReviewAnalysis(Review[] reviews){
        allReviews = reviews;
    }

    public double getAverageRating(){
        for (Review r : allReviews) sum += r.getRating();
        return sum / allReviews.length;
    }

    public ArrayList<String> collectComments(){
        ArrayList<String> comments = new ArrayList<String>();
        for (int i = 0; i < allReviews.length; i++){
            String s = i + "-" + allReviews[i].getComment();
            String last = s.substring(s.length()-1);
            if (!last.equals(".") && !last.equals("!"));
            s += ".";
            if (s.indexOf("!") > 0) comments.add(s);
        }
        return comments;
    }
}