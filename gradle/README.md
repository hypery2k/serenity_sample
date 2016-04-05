Serenity Galen Sample
=================
[![Build Status](https://martinreinhardt-online.de/jenkins/buildStatus/icon?job=serenity_gradle_sample)](https://martinreinhardt-online.de/jenkins/job/serenity_gradle_sample)

To run the tests in a specific browser, e.g. chrome:

```
gradle e2e aggregate -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=/opt/dev/chromedriver
```

To use default webdriver:

```
gradle e2e
```

See example in Jenkins [here](https://martinreinhardt-online.de/jenkins/job/serenity_gradle_sample/).

A sample report can be viewed [here](https://martinreinhardt-online.de/jenkins/job/serenity_gradle_sample/ws/gradle/target/site/serenity/index.html).


