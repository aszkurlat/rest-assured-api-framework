# REST API Test Automation Framework

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![REST Assured](https://img.shields.io/badge/REST_Assured-008D62?style=for-the-badge&logo=testing&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF7F00?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A22?style=for-the-badge&logo=apachemaven&logoColor=white)

## About the Project
This repository contains a mini-framework for API test automation, specifically designed to test the **Reqres.in API** (https://reqres.in). It is written in Java utilizing the REST Assured library.

The primary objective of this project is to demonstrate an understanding of backend testing by automating basic CRUD (Create, Read, Update, Delete) operations. It includes comprehensive server response validation, checking status codes, HTTP headers, and JSON body content.

## Technologies Used
* **Java** - core programming language
* **REST Assured** - for sending HTTP requests and validating responses
* **TestNG** - used as the test runner and for managing assertions
* **Maven** - for build automation and dependency management
* **JSONPath** - for parsing and extracting data from JSON responses

## Project Structure
The framework follows the Separation of Concerns principle to ensure the code remains clean, scalable, and easy to maintain:

* `src/test/java/tests/` - Contains test classes (e.g., `UserTests.java`). Test configuration and execution are managed using TestNG annotations like `@BeforeClass` and `@Test`.
* `src/test/java/payloads/` - Stores request bodies (e.g., `UserPayload.java`). This separates test data and payload construction from the core test logic, keeping tests readable.
* `src/test/java/utils/` - Contains reusable helper methods (e.g., `ReusableMethods.java` for JSON parsing) that can be utilized across various test cases to maintain the DRY (Don't Repeat Yourself) principle.

## How to Run
To execute the test suite locally, clone this repository and use Maven:

1. Open your terminal or command prompt.
2. Navigate to the root directory of the project.
3. Run the following Maven command:
   ```bash
   mvn clean test