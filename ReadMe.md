
Tech used in the project are -

Java 8
Maven
Junit
Cucumber and Gherkin
IDE used IntelliJ
Extent report
Appium
I have used the Page Object Model framework for setup of the project.

The resources folder includes, directories config for extent-config>xml ,errorshots will save the screenshots in case of test case failure and test data incldues properties file test data management.

The PageObjects includes activitiy page classes and they act as page repositories which store locators and actions.

The utils includes common function library and file paths

The test includes features directory to maintain feature files and scenario's,package stepDifinition includes corresponding step defs for feature file.

In Hooks ( located in Test section of the project ) - contains the methods to use before and after the tests.

In Run ( located in Test section of the project ) - to run the feature file and generate report

Being a Maven Project the dependencies will be imported automatically.

**The test can be run in 2 ways using the the Runner Configurations

Junit
Cucumber Feature
The test can also run through the command line using the following commands

mvn clean test

Improvements

Integrate it with Jenkins for regression runs as well as integrate with Browserstack or Saucelabs for compitablity testing.
