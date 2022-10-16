package {{package_name}}.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        glue = "{{package_name}}.stepDefinitions",
        features = "src/test/resources/features"
)

public class RunnerTest {
}
