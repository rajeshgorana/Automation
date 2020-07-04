echo # karatetest - API


`mvn clean test -Dtest=DemoRunner`
mvn test -Dcucumber.options="--tags @test" -Dtest=DemoRunner
mvn test -Dkarate.options="--tags ~@ignore classpath:features" -Dtest=DemoRunner
mvn test -Dkarate.options="--tags ~@ignore" -Dtest=DemoRunner

        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
            </plugin>
        </plugins>
        
        
        <testResources>
            <testResource>
                <directory>src/test/java</directory>
                <excludes>
                    <exclude>**/*.java</exclude>
                </excludes>
            </testResource>
        </testResources>
        
        
        
        https://github.com/damianszczepanik/cucumber-reporting
        https://www.coder.work/article/874426
        
        
        
        yml:
        https://github.com/vgaidarji/ci-matters/blob/f38cb9be105e346466567842b8507a5c6b210a59/SHIPPABLE.md
        
        
        parallel+cucumber_reporting:
        https://github.com/intuit/karate/blob/master/karate-demo/src/test/java/demo/DemoTestParallel.java#L43
        
        