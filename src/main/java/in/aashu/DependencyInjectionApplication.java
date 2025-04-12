package in.aashu;

import in.aashu.CI.CICar;
import in.aashu.FI.FICar;
import in.aashu.SI.SICar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(DependencyInjectionApplication.class, args);
        SICar si = run.getBean(SICar.class);
        si.drive();

        CICar ci = run.getBean(CICar.class);
        ci.drive();

        FICar fi = run.getBean(FICar.class);
        fi.drive();
    }

}
