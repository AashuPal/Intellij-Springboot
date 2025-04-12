package in.aashu.FI;

import in.aashu.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FICar {
    @Autowired
    private Engine engine;

    public void drive(){
        engine.start();
        System.out.println("Engine started by using Field Injection");
    }
}
