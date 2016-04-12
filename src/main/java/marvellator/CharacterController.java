package marvellator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    /* API */
    @RequestMapping(value = "api/characters", method = RequestMethod.GET)
    public String characters() {
        return "List of characters";
    }

    @RequestMapping(value = "api/character/{id}", method = RequestMethod.POST)
    public String setAsFavorite(@PathVariable int id) {
        return "Character set as favorite. Its id is: " + id;
    }

    @RequestMapping(value = "/api/ranking", method = RequestMethod.GET)
    public String ranking() {
        return "Ranking of users";
    }

    /* FRONT END */
    @RequestMapping(value = "characters", method = RequestMethod.GET)
    public String charactersPage() {
        return "Characters Page";
    }

    @RequestMapping(value = "/ranking", method = RequestMethod.GET)
    public String rankingPage() {
        return "Ranking Page";
    }
}
