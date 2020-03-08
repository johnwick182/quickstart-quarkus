package org.johnwick182;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleService {

    @ConfigProperty(name = "greeting.name")
    String nameConfig;


    public String greeting(String name) {
        return "hello " + name;
    }

    public String nameConfig() {
        return nameConfig;
    }

}
