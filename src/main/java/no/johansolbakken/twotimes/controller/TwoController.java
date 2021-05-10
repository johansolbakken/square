package no.johansolbakken.twotimes.controller;

import no.johansolbakken.twotimes.Model.Two;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

    @GetMapping("/square")
    public Two two(@RequestParam(value="number", defaultValue = "0") double number) {
        return new Two(number*number);
    }
}
