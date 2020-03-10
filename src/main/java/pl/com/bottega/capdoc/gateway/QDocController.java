package pl.com.bottega.capdoc.gateway;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.bottega.capdoc.preparation.DoCreateQDocDraft;
import pl.com.bottega.capdoc.preparation.PreparationFacade;

@RestController
public class QDocController {

    PreparationFacade preparationFacade;

    @PostMapping("/drafts")
    void create(DoCreateQDocDraft command) {
        preparationFacade.handle(command);
    }

}
