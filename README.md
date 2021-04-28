# JDI Nova project template
For run new UI test automation just download and open this project
Powered by [JDI Nova](https://github.com/jdi-testing/jdi-nova) and Selenium
# Instruction:
1. Download template and unpack in appropriate folder<br>
2. Open project in IDE (for example IntelliJIdea)<br>
3. For running demo tests:<br>
    * Maven: just use "mvn clean install" command http://pix.my/o/fkSH1s?1547398376
    * IDE: run by click on "example" folder in src/test and select "Run tests" http://pix.my/o/SJtkya?1547398292
4. Logs: Observe test run results in Console log
http://pix.my/o/CEtiOQ?1547398216 <br>
or in /target/.logs folder
5. Recommendations of using template for your project:
    * Place your test scenarios at **src/test/java/.../tests** folder
    * Place your PageObjects at **src/main/java/.../pages** folder
    * Rename JDISite.java class to name of your application and place here all your pages
    * Place your Business entities (like Product or User or Card) at  **src/main/java/.../entities** folder
    * Place your test data at **src/test/java/.../test/data** folder
    * Place your States (preconditions like userLoggedIn() or user-on-some-page or at some-state) at **src/test/java/.../states** folder
6. Don't forget to:
    * To rename namespaces in **src/test/java/** and **src/main/java/** to name of your project
    * To correct pom file details (change to your project name and details)
7. TestNg Retry and before after listeners: You can also modify rules of retry tests (now it is 0 retries for each test (retryLimit = 0))
and actions before/after all tests (now it prints test name and result) at **src/test/java/.../testng** folder
