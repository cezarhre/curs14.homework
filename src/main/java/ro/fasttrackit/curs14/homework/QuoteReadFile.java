package ro.fasttrackit.curs14.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class QuoteReadFile {

    private final String path;

    public QuoteReadFile(String path){
        this.path = path;
    }

    public List<Quote> getQuoteList() throws Exception {
        int id = 0;
        List<Quote> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(readQuoteFromLine(++id,line));
            }
        }
        return result;
    }

    public Quote readQuoteFromLine(int id, String line) {
        String[] tokens = line.split(Pattern.quote("~"));
        return new Quote(id, tokens[0], tokens[1]);
    }
}
