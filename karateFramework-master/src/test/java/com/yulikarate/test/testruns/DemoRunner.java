package com.yulikarate.test.testruns;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
//import com.intuit.karate.testng.KarateRunner;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Karate.class)

// way1: yes
//@CucumberOptions(features = "classpath:features",format={"pretty","html:reports","json:report.json"})

// way2: yes
//@KarateOptions(features = "classpath:features", tags = "~@ignore")


// way3:
@CucumberOptions(
        features = {"classpath:features"},
        tags = {"@t1"},
        format={"pretty","html:target/yulireports","json:target/yulireport.json"},
        monochrome = true
)


//public class DemoRunner extends KarateRunner {
//
//}

public class DemoRunner {

}