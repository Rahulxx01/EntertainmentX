package in.connectitude.entertainmentx;

/**
 * Created by RAHUL YADAV on 15-03-2018.
 */

public class Movie {

    private String mMovieTitle;
    private String mMovieReleaseDate;
    private String mMoviePlotSynopsis;
    private Double mMovieVoteAverage;
    private String mMoviePosterPath;

    public Movie(String movieTitle,String movieReleaseDate,String moviePlotSynopsis,String moviePosterPath,Double movieVoteAverage){
        mMovieTitle = movieTitle;
        mMovieReleaseDate = movieReleaseDate;
        mMoviePlotSynopsis = moviePlotSynopsis;
        mMoviePosterPath = moviePosterPath;
        mMovieVoteAverage = movieVoteAverage;
    }

    public Double getmMovieVoteAverage() {
        return mMovieVoteAverage;
    }

    public String getmMoviePlotSynopsis() {
        return mMoviePlotSynopsis;
    }

    public String getmMoviePosterPath() {
        return mMoviePosterPath;
    }

    public String getmMovieReleaseDate() {
        return mMovieReleaseDate;
    }

    public String getmMovieTitle() {
        return mMovieTitle;
    }
}
