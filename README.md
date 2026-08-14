# 💳 Razorpay Payment Gateway Integration

A full-stack **Razorpay Payment Gateway Integration Web Application** built using **Java, Spring Boot, REST APIs, Razorpay Java SDK, HTML, CSS, and JavaScript**. The application accepts a payment amount, creates a Razorpay order through a Spring Boot REST API, and integrates Razorpay Checkout for online payment processing.

## 🚀 Features

- 💳 Razorpay Payment Gateway integration
- 💰 Dynamic payment order creation
- 🔗 RESTful API for creating Razorpay orders
- 🧮 Automatic conversion of INR to paise
- 🌐 Razorpay Checkout integration
- ⚡ Spring Boot REST API backend
- 🖥️ Simple and user-friendly payment interface
- 📦 Maven-based project
- 🔐 Razorpay API credentials loaded from application properties
- 🧪 Spring Boot test setup
- 🔄 Frontend and backend API integration

## 🛠️ Technologies Used

### Backend

- Java 21
- Spring Boot 4.1.0
- Spring Web MVC
- REST APIs
- Razorpay Java SDK 1.4.9
- Lombok

### Frontend

- HTML5
- CSS3
- JavaScript
- Razorpay Checkout.js

### Build & Tools

- Maven
- Git
- GitHub
- Postman
- VS Code / IntelliJ IDEA / Eclipse

## 🏗️ Project Architecture

```text
Razorpay Payment Integration
│
├── src/main/java
│   └── com.example.razorpay
│       ├── controller
│       │   └── UserController.java
│       │
│       ├── service
│       │   └── UserService.java
│       │
│       ├── entity
│       │   └── User.java
│       │
│       └── RazorpayApplication.java
│
├── src/main/resources
│   ├── application.properties
│   └── static
│       └── index.html
│
├── src/test
│   └── RazorpayApplicationTests.java
│
├── pom.xml
└── README.md
```

## 🔄 Application Flow

```text
User
  ↓
Enter Payment Amount
  ↓
HTML / JavaScript Frontend
  ↓
POST /payments
  ↓
UserController
  ↓
UserService
  ↓
RazorpayClient
  ↓
Razorpay Order Creation
  ↓
Razorpay Checkout
  ↓
Online Payment
```

## ⚙️ Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Razorpay-Payment-Integration-Spring-Boot.git
```

### 2. Navigate to the Project

```bash
cd Razorpay-Payment-Integration-Spring-Boot
```

### 3. Configure Razorpay Credentials

Create or update:

```text
src/main/resources/application.properties
```

Add your Razorpay credentials:

```properties
razorpay.key.id=your_razorpay_key_id
razorpay.key.secret=your_razorpay_key_secret
```

> ⚠️ **Security:** Never commit your Razorpay secret key to GitHub. Use environment variables or another secure configuration method for real projects.

### 4. Install Dependencies

Using Maven:

```bash
mvn clean install
```

Or on Windows:

```bash
mvnw.cmd clean install
```

### 5. Start the Application

Run the Spring Boot application:

```bash
mvn spring-boot:run
```

Or:

```bash
mvnw.cmd spring-boot:run
```

You can also run `RazorpayApplication.java` directly from your IDE.

### 6. Open the Application

The application serves the frontend from:

```text
src/main/resources/static/index.html
```

Open the application through the Spring Boot server and enter the payment amount.

## 📌 REST API

### Create Razorpay Payment Order

**Endpoint:**

```http
POST /payments
```

**Request Body:**

```json
{
  "amount": 500
}
```

**Description:**

The API receives the amount from the client and sends it to the service layer. The service converts the amount from INR to paise and creates an order using the Razorpay Java SDK.

### Example

For:

```text
₹500
```

The application sends:

```text
500 × 100 = 50000 paise
```

to Razorpay.

## 📋 API Flow

```text
POST /payments
        ↓
UserController
        ↓
userService.payment(amount)
        ↓
RazorpayClient
        ↓
orders.create()
        ↓
Razorpay Order
```

## 🧩 Main Components

### UserController

The controller exposes the payment endpoint:

```text
POST /payments
```

It receives the payment amount and passes it to the service layer.

### UserService

The service layer:

- Reads Razorpay API credentials.
- Creates a `RazorpayClient`.
- Converts INR to paise.
- Sets the currency as INR.
- Creates a Razorpay order.
- Returns the Razorpay order response.

### User Entity

The `User` class contains the payment amount:

```java
private int amount;
```

Lombok `@Data` is used for generating standard methods.

### index.html

The frontend:

- Accepts the payment amount.
- Uses Razorpay Checkout.js.
- Sends a request to the backend.
- Receives the Razorpay order.
- Opens the Razorpay Checkout window.

## 💳 Payment Operations

| **Operation** | **Description** |
|---|---|
| Create Order | Creates a Razorpay payment order |
| Convert Amount | Converts INR into paise |
| Set Currency | Uses INR as the payment currency |
| Checkout | Opens Razorpay Checkout |
| Payment | Allows the user to complete the payment |
| API Integration | Connects frontend with Spring Boot backend |

## 🧪 Testing

The project contains a Spring Boot test class:

```text
src/test/java/com/example/razorpay/RazorpayApplicationTests.java
```

You can run tests using:

```bash
mvn test
```

Or:

```bash
mvnw.cmd test
```

API testing can also be performed using Postman.

### Postman Example

**Method:**

```text
POST
```

**URL:**

```text
http://localhost:8080/payments
```

**Body → raw → JSON:**

```json
{
  "amount": 500
}
```

> Change the port if your `application.properties` uses a different server port.

## ⚠️ Important Frontend Configuration

The current frontend file in the project contains a request to:

```text
http://localhost:9099/createOrder
```

while the Spring Boot controller exposes:

```text
POST /payments
```

Therefore, the frontend request should be updated to match the backend endpoint before using the complete payment flow.

For example:

```javascript
fetch("/payments", {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify({
        amount: Number(amount)
    })
})
```

This keeps the frontend and backend API paths consistent.

## 🎯 Learning Outcomes

Through this project, I strengthened my skills in:

- Java backend development
- Spring Boot application development
- REST API development
- Razorpay Payment Gateway integration
- Razorpay Java SDK
- Payment order creation
- Controller-Service architecture
- JSON request and response handling
- Frontend-backend integration
- JavaScript Fetch API
- Maven project management
- API testing using Postman
- Secure handling of API credentials

## 📸 Screenshots

Add screenshots of your application here:

```text
screenshots/
├── home.png
├── payment-page.png
├── razorpay-checkout.png
└── payment-success.png
```

Example:

```markdown
![Payment Page](screenshots/payment-page.png)

![Razorpay Checkout](screenshots/razorpay-checkout.png)
```

## 🔮 Future Enhancements

- Payment signature verification
- Payment success and failure handling
- Database integration for storing transactions
- Transaction history
- User authentication and authorization
- Refund functionality
- Razorpay webhook integration
- Payment status tracking
- Better validation and exception handling
- Environment variable configuration
- Deployment using AWS or other cloud platforms

## 🔐 Security Recommendations

For production use:

- Do not hard-code Razorpay credentials.
- Do not upload `application.properties` containing real secrets.
- Use environment variables for API keys.
- Use Razorpay signature verification after payment.
- Validate the payment amount on the server.
- Add proper exception handling.
- Store transaction details securely.

## 📁 Project Structure

```text
razorpay
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.razorpay
│   │   │       ├── controller
│   │   │       │   └── UserController.java
│   │   │       ├── entity
│   │   │       │   └── User.java
│   │   │       ├── service
│   │   │       │   └── UserService.java
│   │   │       └── RazorpayApplication.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       │   └── index.html
│   │       └── templates
│   │
│   └── test
│       └── java
│           └── com.example.razorpay
│               └── RazorpayApplicationTests.java
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## 👨‍💻 Author

**Intiyaz T**

Java Full Stack Developer | Spring Boot | REST APIs | MERN Stack

## ⭐ If You Like This Project

If you find this project useful, give the repository a ⭐ and feel free to explore the source code!

---

**Note:** This project is intended for learning and demonstration purposes. Use Razorpay test credentials while developing and testing the application.
