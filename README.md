***********************
GitHub Actions Project
***********************

*********************
Author: Jason Kelly
Student No. L00194486
*********************

The aim of this project is to show how GitHub Actions can be used for testing. To run tests with Github Actions it gets the user to demonstrate learning of GitHub Actions on 
how it can prove to be a very useful DevOps tool in the automation of CI/CD pipelines. By using GitHub Actions to execute tests it also demonstrating on how applications can be
Built, Tested and Deployed very efficiently. Using GitHub Actions, Workflows need to be created and integrated into a project.
Another aim of this project is to demonstrate understanding of being able to configure GitHub Actions Workflows in order for them to carry out desired tasks.  

**Method**

    1. Research was carried out about Github Actions in how it can be used to automate CI/CD pipelines for DevOps.  
    2. Git was installed locally and a Github account was created
    3. A project was created using Java with Maven in a Java IDE and connected to GitHub
    4. A repository was created on Github and the Java project was pushed to the GitHub repository.
    5. In order for GitHub Actions to work a .github/workflows directory needed to be added to the project. 
    6. A workflow file was created in the .github/workflows. This workflow was created using a GitHub built in template designed for Java with Maven.
    7. The default workflow was edited in order for the file to work.
    8. Unit tests were created in the Java IDE and executed in the Java IDE before executing them with GitHub actions
    9. Extra Maven dependencies were added the Maven pom.xml file was edited to resolve issues that stopped the tests from executing in GitHub actions
    10. The unit tests were verified to be working on Push and Pull requests
    11. In order to simply the verification of the tests ran. A dashboard was added, so once the tests were executed a visual representation of the tests were present thus making the project more efficient as the user now doesn’t have to go searching for test results.
    12. A separate test results file was also generated.
