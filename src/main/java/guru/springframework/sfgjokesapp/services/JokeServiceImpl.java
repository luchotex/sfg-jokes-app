package guru.springframework.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Luis
 * on 12/08/2018.
 */
@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String sayJoKe() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
