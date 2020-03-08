package org.johnwick182;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleService {

    public String greeting(String name) {
        return "hello " + name;
    }
}
