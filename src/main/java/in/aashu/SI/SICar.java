package in.aashu.SI;

import ch.qos.logback.core.net.SyslogOutputStream;
import in.aashu.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SICar {
    private Engine engine;
    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Engine started by using Setter");
    }
}
