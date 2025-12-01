Online job portal

objective of the Online Job Portal project is to create a web-based application where job seekers can find and apply for job opportunities, and employers can post job openings and search for potential candidates. The platform aims to streamline the recruitment process and make it more efficient for both job seekers and employers.

Features :-

User Registration and Authentication Job Seeker Dashboard Employer Dashboard Admin Panel Setup:- Before you begin, ensure you have the following installed: 1.JDK 17 or higher 2.MySQL Database 3.Maven Installation Clone this repository to your local machine:

Set up the database:

Install MySQL and create a new database called online job portal. Run the create_tables.sql script to create necessary tables. Configure the database connection:

Edit the DBConnection.java file in the util package to set your database credentials (username, password, URL). Run the project:

Open the project in your preferred IDE (IntelliJ IDEA or Eclipse). Build and run the project.

Technologies Used

Java (JDK 17) MySQL (for database) JDBC (for database connectivity) Maven (for dependency management)

Database Schema

The project uses the following tables: Users: Job Seekers Employers Job Postings: Jobs Applications: Job Applications Admin Management: Admins

##Installation JDK (Java Development Kit) Setup:

The Java Development Kit (JDK) is a software development kit used to develop Java applications. It contains everything you need to compile, debug, and run Java applications, including the Java Runtime Environment (JRE) and the necessary development tools.

Steps to Install JDK: Download JDK:

Visit the official Oracle website: JDK Downloads or use OpenJDK from AdoptOpenJDK. Choose the appropriate version for your operating system (Windows, macOS, or Linux). Install JDK:

Run the installer and follow the on-screen instructions. On Windows, ensure that you check the option to Add Java to PATH during installation. Verify JDK Installation:

Open the command prompt (Windows) or terminal (macOS/Linux). Type the following command to check if JDK is installed correctly: bash Copy code java -version If the installation is successful, you should see the installed version of Java. Set JAVA_HOME (Optional):

You may need to set the JAVA_HOME environment variable to the JDK installation directory. This is often necessary for IDEs and build tools like Maven or Gradle. For Windows: Right-click This PC -> Properties -> Advanced system settings -> Environment Variables. Add a new system variable JAVA_HOME with the value as the directory path of your JDK installation (e.g., C:\Program Files\Java\jdk-11.0.x). IDE (Integrated Development Environment) Setup: An IDE (Integrated Development Environment) is a software that provides comprehensive facilities to computer programmers for software development. IDEs typically include features like code completion, debugging, and version control integration.

For this project, you can use IntelliJ IDEA or Eclipse as the IDE.

IntelliJ IDEA Setup: Download IntelliJ IDEA:

Visit the official website: IntelliJ IDEA Downloads. Choose the Community edition (free) and download it for your operating system. Install IntelliJ IDEA:

Run the installer and follow the instructions for your platform. Configure JDK in IntelliJ IDEA:

Open IntelliJ IDEA and go to File -> Project Structure -> Project. In the Project SDK section, click Add SDK and select the path to your JDK installation directory. Create a New Project:

Once JDK is set up, you can create a new project by selecting File -> New Project. Choose Java as the project type, and follow the steps to set up your project. Eclipse Setup: Download Eclipse:

Visit the official Eclipse website: Eclipse Downloads. Download the Eclipse IDE for Java Developers version. Install Eclipse:

Run the downloaded installer and follow the installation instructions. Configure JDK in Eclipse:

Open Eclipse and go to Window -> Preferences -> Java -> Installed JREs. Click Add and select the path to your JDK installation directory. Create a New Java Project:

Click on File -> New -> Java Project to create a new project. Choose a project name, and the IDE will automatically set up the project structure for you.

FRONTEND

Features:

User Registration and Authentication:

Job seekers and employers can register and create accounts.

Secure login system with encrypted passwords.

Job Seeker Dashboard:

Profile creation with the ability to upload resumes.

Search and filter job listings by various criteria such as category, location, and experience level.

Apply for jobs directly through the portal.

Track application status and history.

Employer Dashboard:

Create and manage company profiles.

Post job openings with detailed job descriptions.

Search for potential candidates using filters such as skills and experience.

View and manage applications received for job postings.

Admin Panel:

Manage user accounts (both job seekers and employers).

Approve or reject job postings to maintain platform quality.

Monitor overall platform activities and ensure smooth operation.

Technologies Used Frontend:

HTML, CSS, JavaScript: To create a responsive and interactive user interface.

JSP (JavaServer Pages): For generating dynamic web pages.

Backend:

Java (Servlets and JSP): For server-side logic and handling user requests.

Spring Boot: To simplify the development of web applications and provide a robust framework.

Database:

MySQL: To store and manage user data, job postings, and applications.

Build Tool:

Maven: For project management, dependency management, and build automation.

Web Server:

Apache Tomcat: For deploying and running the web application.

Project Structure: expensify-Expense-Tracker/Frontend │ ├── Login.html # Login form HTML template ├── Register.html # Registration form HTML template ├── style.css # Custom CSS file for styling the forms ├── form-validation.js # JavaScript file for form validation and error handling └── README.md # Project description and setup instructions

##Technologies Used: Frontend:

HTML, CSS, JavaScript: To create a responsive and interactive user interface.

JSP (JavaServer Pages): For generating dynamic web pages.

Backend:

Java (Servlets and JSP): For server-side logic and handling user requests.

Spring Boot: To simplify the development of web applications and provide a robust framework.

Database:

MySQL: To store and manage user data, job postings, and applications.

Build Tool:

Maven: For project management, dependency management, and build automation.

Web Server:

Apache Tomcat: For deploying and running the web application.

##HOW TO RUN THE PROJECT: Follow these steps to run the project locally on your system:

1.Navigate to the project folder:

2.Open Login.html or Register.html in your browser.

FINAL REVIEW

Review Item Status Remarks

Project Requirements Verified ✅ All requirements implemented.

Code Review Completed ✅ Code is clean and follows standards.

Functionality Tests Conducted ✅ All features tested and working.

Unit Testing Completed ✅ Tests pass; no critical failures.

UI/UX Review Completed ✅ UI is responsive and user-friendly.

Database Integration Verified ✅ Schema optimized.

Deployment Readiness Confirmed ✅ Successfully deployed locally.

License

This project is licensed under the MIT License.
