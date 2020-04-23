package tarea.demo;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tareaa {

    @Autowired
    MeterRegistry d;

    @GetMapping
    public String tarea(){
        d.counter("nueva metrica").
            increment();
        return "ya acabee";
    }
}




