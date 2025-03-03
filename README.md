## Procedure for Creating GitHub Account & Deploying Project with Maven<br><br>
# 1. Create GitHub Account<br>
Go to https://github.com<br>
Click on Sign Up<br>
Enter Username, Email Address, and Password<br>
Click Create Account<br>
Verify your email<br><br>
#2. Create GitHub Repository<br>
Login to GitHub<br>
Click on New Repository<br>
Enter Repository Name<br>
Choose Public or Private<br>
Click Create Repository<br><br>
#3. Upload Project to GitHub Using Maven<br>
Install Git on your system<br>
Open Terminal or Command Prompt inside your project folder<br>
Type the following commands:<br><br>
<code>
git init  <br>
git remote add origin <repository_link>  <br>
git add .  <br>
git commit -m "Initial Commit"  <br>
git push origin main <br> 
</code><br>
#4. Configure Maven for Deployment<br>
Add Maven Deploy Plugin in pom.xml<br>
Configure GitHub repository details in pom.xml<br>
Example Plugin:<br>
<code>
<plugin><br>
    <groupId>org.apache.maven.plugins</groupId><br>
    <artifactId>maven-deploy-plugin</artifactId><br>
    <version>2.8.2</version><br>
</plugin>
</code><br><br>
#5. Build & Deploy Project Using Maven<br>

Run the command:<br>
<code>
mvn clean install  <br>
</code>
Deploy project using:<br>
<code>
mvn deploy 
</code><br><br>
#6. Output<br>
After deployment, the project will be hosted on GitHub<br>
URL will be generated for project access<br>
