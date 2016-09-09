# Serenity Sample Project
=================
[Serenity](https://github.com/serenity-bdd/serenity-core) is a tool that lets you use WebDriver-based unit or BDD tests to write more flexible and more reusable WebDriver-based tests, and also to generate documentation about your acceptance tests, including a narrative description of test, along with the corresponding screen shots, and also high-level summaries and aggregations of the test results
It provides support for running tests and advanced reporting by using BDD.

The sample project defines both a Gradle and Jenkins build to show both integrations

## Gradle

[![Build Status](https://martinreinhardt-online.de/jenkins/buildStatus/icon?job=Serenity/serenity_gradle_sample)](https://martinreinhardt-online.de/jenkins/view/Demos/job/Serenity/job/serenity_gradle_sample/)

To run the tests in a specific browser, e.g. chrome:

```
gradle clean test aggregate -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=/opt/dev/chromedriver
```

To use default webdriver:

```
gradle clean test
```

See example in Jenkins [here](https://martinreinhardt-online.de/jenkins/job/serenity_gradle_sample/).

A sample report can be viewed [here](https://martinreinhardt-online.de/jenkins/job/serenity_gradle_sample/ws/gradle/target/site/serenity/index.html).


## Maven

[![Build Status](https://martinreinhardt-online.de/jenkins/buildStatus/icon?job=Serenity/serenity_maven_sample)](https://martinreinhardt-online.de/jenkins/view/Demos/job/Serenity/job/serenity_maven_sample/)

```
mvn verify -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=/opt/dev/chromedriver
```

To use default webdriver:

```
mvn verify
```

See example in Jenkins [here](https://martinreinhardt-online.de/jenkins/view/Demos/job/Serenity/job/serenity_maven_sample).

A sample report can be viewed [here](https://martinreinhardt-online.de/jenkins/view/Demos/job/Serenity/job/serenity_maven_sample/Serenity_Report/.

