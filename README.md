# ClearTrip-Test
                                                        Project Document

Introduction
         Software applications are written as web-based applications to be run in an Internet browser. In order to optimize testing, it is important that we understand the applications and limitations of Automated testing. Selenium is a set of different software tools each with a different approach to supporting test automation. The entire suite of tools results in a rich set of testing functions specifically geared to the needs of testing of web applications of all types. These operations are highly flexible, allowing many options for locating UI elements and comparing expected test results against actual application behavior.

Selenium IDE
           Selenium IDE is used to develop Selenium Testcases.  Selenium IDE is an easy-to-use tool from the Selenium Test Suite that can even be used by someone new to developing automated test cases for their web applications. Selenium IDE allows a user or a test case developer to create the test cases and test suites and edit it later as per their requirements. The development environment also provides the capability of converting test cases to different programming languages. The selenium IDE has several features like Speed Control, Run, Run All, Pause. The IDE has increased its library of commands, especially concerning the Control Flow conditional logic commands , if, else if, else, times, do, repeat if, while, end.

Benefits of using Selenium IDE
           It is very easy to install and use and It also has more built-in help features and it shows the documentation on the selected or entered command. It helps in debugging by displaying the information and error messages. It allows us to set breakpoints, insert commands and comments wherever necessary. It also provides good support for extensions. It helps in exporting tests that can be executed in Selenium RC and WebDriver. 

Drivers in Selenium
           We can create any no.of. test cases using the Selenium Framework. To run those test cases we need external support in the form of drivers. We can run those test cases directly using these drivers. In WebDriver, test scripts can be developed using any of the supported programming languages and can be run directly in most modern web browsers. Selenium uses drivers specific to each browser in order to establish a secure connection with the browser without revealing the internal logic of the browser's functionality. In this we use chrome Driver for Google chrome browser and gecko Driver for firefox browser.

Maven
       Maven is a project management and comprehensive tool, through a file. We will add jar files by using the pom.xml by adding the dependencies into it. The POM file consists of dependencies, developers, plugin lists, plugin configuration, resources in it. By using  Maven we can build any number of projects into output types like the JAR, WAR etc

Maven Dependencies
 Selenium java
       Selenium is a beneficial tool because it is not only open source but also a portable software testing framework for web applications that support multiple languages like Java and Python.Selenium test scripts  can be coded in any of the supported programming languages and can be run directly in most modern web browsers.

 TestNG
         TestNG is one of the most widely used open source testing frameworks used in the automation testing suite. TestNG is a very important framework when we are developing the framework from scratch level. Testng  provides you control over the test cases and execution of the test cases.
  
Selenium Chrome-Driver
         ChromeDriver is a separate executable that Selenium WebDriver uses to control Chrome. It is maintained by the Chromium team with help from WebDriver contributors. Every Chrome session will use a single driver  service, which is started the first time a driver Instance.

 Poi-ooxml
          Apache POI provides Java API for manipulating various file formats based on the Office Open XML (OOXML). Apache POI is able to handle both XLS and XLSX formats of spreadsheets. Most commonly used components of apache-poi are HSSF, XSSF, HSLF.       
 
Commons-io
          The Apache Commons IO are the components of the Apache Commons which are derived from Java API and provide various utility classes for common operations for File IO covering a wide range of use cases.  It provides various utility classes for common operations for File IO covering a wide range of use cases. 
           
Selenium-Server
        Selenium RC is an important component in the Selenium test suite. It is a testing framework that enables a QA or a developer to write test cases in any programming language in order to automate UI tests for web applications against any HTTP website.
                 
 Log4j
          Log4j is an open source logging framework. By using log4j logging behavior can be controlled by editing a configuration file only without touching the application  and can be used to store the Selenium Automation flow logs. 
      
Locators 
      Locators are used to find the Web Elements in the webpage. We use these Locators to access the HTML elements. There are different types of locators. In this project we have used Xpath and CSS Locators.

X-path
       XPath stands for XML Path. It’s a query language that helps identify elements from an XML document. 

CSS Selector
       Most HTML pages are styled using Cascading style sheet classes, also known as CSS. Identifying the various elements on a page based on styles requires you to select the respective classes needed.

Page Object Model
             Page Object Model is a design pattern, popularly used in test automation that creates an Object Repository for web UI elements. This Page class will have the WebElements of that web page and it also contains Page methods which perform operations on those WebElements. We can also reuse this class in all the scripts using that element. In future, if there is a change in the web element, we need to make the change in just 1 class file. We will have different packages like page objects and pages in it. 

Singleton class
        A singleton class is a class that can have only one object (an instance of the class) at a time. After the first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. I had used the singleton class structure to read the property file and return the instance in the project wherever necessary.

chrome Options class
          While Automating websites doesn’t allow the automation to be carried out. To ignore that we are using chrome options. chrome options class is used to manipulate various properties of Chrome driver. Desired Capabilities class provides a set of key-value pairs to modify individual properties of web drivers such as browser name, browser platform, etc.

Dataproviders
            The DataProviders in TestNG are another way to pass the parameters in the test function, the other one being TestNG parameters. DataProviders pass different values to the TestNG Test Case in a single execution and in the form of Testng Annotations. 

Listeners
            Testing multiple pages at the same time, We use listeners to check whether the test is pass or fail. We use Testng Listeners for this purpose. We use ITest Listener in it. ITest Listener has several Methods like OnStart, OnFinish, OnTestSuccess, OnTestFailure, OnTestSkipped etc.

Extent Reports
             Testng has inbuilt Report, but we use extent report to generate upon the user convenient path. It consists of a Boolean flag which indicates that the new report should be generated or the existing report should be overwritten. It is more customizable than the HTML report.

Switch to NewTab
           While automating we will find a change of control from one page to the other page. In that scenario the driver will not change it’s control from current tab to the new Tab. To change the driver control from one tab to another tab we will switch to a new tab method.

Switch to NewFrame
          In this scenario, a new Frame window will be popped up over the screen. In this the driver will not change its control to that new frame. So, we must change the driver control from the current page to the popped-up window.

Scroll by visibility of Element
        Scroll by visibility of Element is used to find the element by Scrolling through the Webpage. This function will scroll the page until the element is found by the driver. Javascript executor is used to locate the element. This method executes JavaScript in the context of the currently selected frame or window in selenium.

Browser Factory
         Factory is a Design Pattern, It is used when we need to create an object that shares a common implementation. In this context about browser creation, it will use methods like create(), close(), getdriver(). We must create a factory to instantiate the correct browser. On the diagram, you can see an enumeration to support browser creation.

SendKeys Method
         Sendkeys is a method in Selenium that allows QAs to type content automatically into an editable field while executing any tests for forms. These fields are web elements that can be identified using locators like element id, name, class name etc.

Pop-up Blocking
           Pop-Up Blocking is used to block the pop-ups which are popping up in the Webpage during the time of Automation. We use options keywords to block those popups appearing during the time of automation.

Waits
     Waits are commands which are used in the automation of a website. During the automation we may face some time lag for loading the web elements. We can counter those issues by implementing the waits concepts. We have used three different waits they are Implicit wait, Explicit Wait, Fluent wait.

Implicit Wait
           Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception. Once this time is set, WebDriver will wait for the element before the exception occurs. We can specify the time period to wait. Implicit wait increases test script execution time. 

Explicit Wait
          In Explicit Wait the WebDriver is directed to wait until a certain condition occurs before proceeding with executing the code. Explicit wait can be applied to the specific elements like visibilityOfElementLocated() etc. We can specify the time period to wait.





