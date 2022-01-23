package ro.fasttrackit.curs14.homework;

import java.util.List;

public class QuoteMain {
    public static void main(String[] args) throws Exception {
        QuoteReadFile quoteRead = new QuoteReadFile("files/quotes.txt");
        List<Quote> quotes = quoteRead.getQuoteList();
        System.out.println(quotes);
        System.out.println();
        QuoteServices quoteServices = new QuoteServices(quotes);

        System.out.println(quoteServices.getAllQuotes());
        System.out.println();
        System.out.println(quoteServices.getQuotesForAuthor("Buddha"));
        System.out.println();
        System.out.println(quoteServices.getAuthors());
        quoteServices.setFavouriteQuote(5200);
        System.out.println();
        System.out.println(quoteServices.getFavourite());
        System.out.println(quoteServices.getRandomQuote(5345));
        }
    }

