💳 Razorpay Payment Gateway Integration

A full-stack Razorpay Payment Gateway Integration Web Application built using Java, Spring Boot, REST APIs, Razorpay SDK, HTML, CSS, and JavaScript. The application allows users to enter a payment amount, create a Razorpay order through a REST API, and initiate online payments using the Razorpay Checkout interface.

🚀 Features
💳 Razorpay Payment Gateway integration
💰 Create payment orders dynamically
🔗 RESTful API for payment order creation
🧮 Automatic conversion of INR to paise
🌐 Razorpay Checkout integration
⚡ Spring Boot REST API backend
🖥️ Simple and user-friendly payment interface
✅ Request validation and exception handling
🔐 Secure API credential configuration
📦 Maven-based project setup
🔄 Frontend-backend API integration
🛠️ Technologies Used
Backend
Java 21
Spring Boot
Spring Web
REST APIs
Razorpay Java SDK
Lombok
Frontend
HTML5
CSS3
JavaScript
Razorpay Checkout
Build & Tools
Maven
Git
GitHub
VS Code / IntelliJ IDEA
Postman
🏗️ Project Architecture
Razorpay Payment Integration Project
│
├── Frontend
│   ├── HTML
│   ├── CSS
│   └── JavaScript
│       └── Razorpay Checkout
│
├── Backend
│   └── Spring Boot
│       ├── Controller
│       ├── Service
│       └── Model
│
└── Payment Gateway
    └── Razorpay
        └── Razorpay Java SDK
🔄 Application Flow
User
  ↓
Enter Payment Amount
  ↓
Frontend
  ↓
REST API
  ↓
Spring Boot Controller
  ↓
Service Layer
  ↓
Razorpay SDK
  ↓
Create Razorpay Order
  ↓
Razorpay Checkout
  ↓
Online Payment
⚙️ Installation & Setup
1. Clone the Repository
git clone https://github.com/your-username/Razorpay-Payment-Integration-Spring-Boot.git
2. Navigate to the Project
cd Razorpay-Payment-Integration-Spring-Boot
3. Configure Razorpay Credentials

Create an application.properties file and configure your Razorpay credentials:

razorpay.key.id=your_razorpay_key_id
razorpay.key.secret=your_razorpay_key_secret

⚠️ Important: Never commit your Razorpay secret key or other sensitive credentials to GitHub. Use environment variables or a secure configuration method.

4. Install Dependencies

Using Maven:

mvn clean install
5. Start the Application

Run the Spring Boot application:

mvn spring-boot:run

Or run the main Spring Boot application class directly from your IDE.

6. Open the Application

Open the frontend in your browser and enter the amount you want to pay. The application will create a Razorpay order and open the Razorpay Checkout interface.

📌 Payment Operations

The application supports the following payment operations:

Operation	Description
Create Order	Creates a new Razorpay payment order
Convert Amount	Converts INR amount into paise
Checkout	Opens Razorpay Checkout
Payment	Allows the user to complete the online payment
API Integration	Connects frontend with Spring Boot REST APIs
🔌 REST API
Create Payment Order

Endpoint:

POST /payments

Request:

{
  "amount": 500
}

Description:

Accepts the payment amount and creates a Razorpay order using the Razorpay Java SDK.

🎯 Learning Outcomes

Through this project, I strengthened my skills in:

Spring Boot application development
REST API development
Razorpay Payment Gateway integration
Payment order creation
Java backend development
Service and controller layer implementation
Frontend-backend integration
JSON request and response handling
Maven project management
API testing using Postman
Secure handling of application credentials
📸 Screenshots

Add screenshots of your application here.

screenshots/
├── home.png
├── payment-page.png
├── razorpay-checkout.png
└── payment-success.png
🔮 Future Enhancements
Payment signature verification
Payment success/failure handling
Transaction history
Database integration for storing transactions
User authentication and authorization
Refund functionality
Webhook integration
Payment status tracking
Deployment using cloud platforms
👨‍💻 Author

Intiyaz T

Java Full Stack Developer | Spring Boot | REST API | MERN Stack

⭐ If you like this project

Give this repository a ⭐ and feel free to explore the source code!
