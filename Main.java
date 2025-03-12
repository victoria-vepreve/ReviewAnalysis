import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Review[] reviews = {
            new Review(4, "Good! Thx"),
            new Review(3, "OK site"),
            new Review(5, "Good! Thx"),
            new Review(2, "Good! Thx"),
            new Review(3, ""),
        };
        ReviewAnalysis r = new ReviewAnalysis(reviews);
        System.out.println("Average Rating: "+ r.getAverageRating());
        System.out.println("Comments: "+ r.collectComments());
       

    }
}

