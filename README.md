# Library App

## Setup Instructions

### Prerequisites
- Java 17 or higher
- Maven 3.8 or higher
- MySQL database

### Steps to Run the Application
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd library_app
   ```
3. Create a `src/main/resources/application.properties` file based on the `application-sample.properties` file:
   ```bash
   cp src/main/resources/application-sample.properties src/main/resources/application.properties
   ```
   Update the placeholders (`<DB_HOST>`, `<DB_PORT>`, `<DB_NAME>`, `<DB_USERNAME>`, `<DB_PASSWORD>`) with your database details.

4. Build the project:
   ```bash
   mvn clean install
   ```
5. Run the application:
   ```bash
   java -jar target/library_app-0.0.1-SNAPSHOT.jar
   ```

### Notes
- Ensure that sensitive data like database credentials are not committed to the repository by using the `.gitignore` file.