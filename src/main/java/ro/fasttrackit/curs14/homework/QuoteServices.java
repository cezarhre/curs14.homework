package ro.fasttrackit.curs14.homework;

import java.util.*;

public class QuoteServices {

    private final List<Quote> quotes = new ArrayList<>();

    public QuoteServices(List<Quote> quotes) {
        this.quotes.addAll(quotes != null
                ? quotes
                : Collections.emptyList());
    }

    public List<String> getAllQuotes(){
        List<String> result = new ArrayList<>();
        for(Quote element : quotes){
            result.add(element.getQuote());
        }
        return result;
    }

    public List<Quote> getQuotesForAuthor(String author){
        List<Quote> result = new ArrayList<>();
        for(Quote element : quotes){
            if(author == null || element.getAuthor().equals(author)){
                result.add(element);
            }
        }
        return result;
    }

    public List<String> getAuthors(){
        List<String> result = new ArrayList<>();
        for(Quote element : quotes){
            result.add(element.getAuthor());
        }
        return result;
    }

    public void setFavouriteQuote(int id) {
        for (Quote element : quotes) {
            if (element.getId() == id) {
                element.setFavourite(true);
            }
        }
    }

    public List<Quote> getFavourite(){
        List<Quote> result = new ArrayList<>();
        for(Quote element : quotes){
            if(element.isFavourite()){
                result.add(element);
            }
        }
        return result;
    }

    public List<String> getRandomQuote(int maxBound){
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(maxBound);
        List<String> result = new ArrayList<>();
        for(Quote element : quotes){
            if(element.getId() == randomNumber){
                result.add(element.getQuote());
            }
        }
        return result;
    }
}