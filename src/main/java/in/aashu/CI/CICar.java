package in.aashu.CI;

import in.aashu.Engine;
import org.springframework.stereotype.Component;

@Component
public class CICar {
    private final Engine engine;

    public CICar(Engine engine) {
        this.engine = engine;

    }
    public void drive(){
        engine.start();
        System.out.println("Engine started by using Constructor");
    }
}
