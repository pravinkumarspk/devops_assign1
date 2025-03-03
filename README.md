**Procedure for Creating GitHub Account & Deploying Project with Maven
**
**1. Create GitHub Account
**
Go to https://github.com
Click on Sign Up
Enter Username, Email Address, and Password
Click Create Account
Verify your email
**2. Create GitHub Repository
**
Login to GitHub
Click on New Repository
Enter Repository Name
Choose Public or Private
Click Create Repository
**3. Upload Project to GitHub Using Maven
**
Install Git on your system
Open Terminal or Command Prompt inside your project folder
Type the following commands:
git init  
git remote add origin <repository_link>  
git add .  
git commit -m "Initial Commit"  
git push origin main  
**4. Configure Maven for Deployment
**
Add Maven Deploy Plugin in pom.xml
Configure GitHub repository details in pom.xml
Example Plugin:
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-deploy-plugin</artifactId>
    <version>2.8.2</version>
</plugin>
**5. Build & Deploy Project Using Maven
**
Run the command:
mvn clean install  
Deploy project using:
mvn deploy  
6. Output
After deployment, the project will be hosted on GitHub
URL will be generated for project access
