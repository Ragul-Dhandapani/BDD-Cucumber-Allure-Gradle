# Cucumber With Allure Integration using Gradle

1. Do gradle clean build --refresh-dependencies <br>
2. Execute the gradle task "cucumber" with "gradle cucumber allureReport". The "cucumber" gradle task will perform internally "downloadAllure" task and its get downloaded in your project directory (.allure) <br>  


_**Note:**_ If you would like to integrate **CucumberWithSerenity** latest or above 2 version then you must have updated **allure-cucumber5jvm** plugin which is not yet released by allure team at this date (16/09/2020). 
