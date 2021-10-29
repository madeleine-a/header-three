package se.mad.poc.headerthree;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.atg.lib.stacklog.annotation.LogStack;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/", produces = APPLICATION_JSON_VALUE)
@Slf4j
public class Controller {

    @PostMapping("mailbox")
    @LogStack
    public String postData(@RequestBody Model model) {
        return "{ \"value\": \"Fick den\"}";
    }

}
