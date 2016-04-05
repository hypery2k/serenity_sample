Serenity Maven Sample
=================
[![Build Status](https://martinreinhardt-online.de/jenkins/buildStatus/icon?job=serenity_maven_sample)](https://martinreinhardt-online.de/jenkins/job/serenity_maven_sample/)

```
mvn verify -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=/opt/dev/chromedriver
```

To use default webdriver:

```
mvn verify
```

See example in Jenkins [here](https://martinreinhardt-online.de/jenkins/job/serenity_maven_sample/).

A sample report can be viewed [here](https://martinreinhardt-online.de/jenkins/job/serenity_maven_sample/ws/maven/target/site/serenity/index.html).
