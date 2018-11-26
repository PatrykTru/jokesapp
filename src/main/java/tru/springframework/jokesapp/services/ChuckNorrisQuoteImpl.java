package tru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteImpl extends ChuckNorrisQuotes implements ChuckNorrisQuoteService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
