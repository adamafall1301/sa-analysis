package tech.ada.sa.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.sa.records.Sa;

import java.util.List;

@RestController
@RequestMapping(path = "sa", produces = MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping
    public List<Sa> search(){
        return List.of(new Sa(1, "Good vides", 1));
    }
}
