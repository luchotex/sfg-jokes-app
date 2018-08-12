package guru.springframework.sfgjokesapp.controllers;

import guru.springframework.sfgjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Luis
 * on 12/08/2018.
 */
@Controller
public class JokeController {

    public static final String CHUCK_NORRIS_VIEW = "chuckNorris";
    private JokeService jokeServiceImpl;

    public JokeController(JokeService jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeServiceImpl.sayJoKe());

        return CHUCK_NORRIS_VIEW;
    }


}
