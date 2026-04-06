Finance Dashboard

A full-stack Finance Dashboard application built using Spring Boot that helps users track income, expenses, and view financial summaries in a clean and efficient way.

 Features

1. Add income and expense records

2. View financial summary (total income, expenses, balance)

3. Categorize transactions (Food, Travel, Salary, etc.)

4. Secure APIs with authentication (JWT-based)

5. Lightweight in-memory database (H2) for quick setup


 Tech Stack

Backend: Java, Spring Boot

Security: Spring Security + JWT

Database: H2 (in-memory)

Build Tool: Maven


 Project Structure
finance-dashboard/
│
├── src/main/java/com/example/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   └── security/
│
├── src/main/resources/
│   ├── application.properties
│
├── pom.xml
└── README.md


 How to Run
1. Clone the repository
git clone https://github.com/YOUR_USERNAME/finance-dashboard.git
cd finance-dashboard
2. Run the application
mvn spring-boot:run


 API Endpoints
➤ Add Record
POST /records?amount=100&type=INCOME&category=Food
➤ Get All Records
GET /records
➤ Get Summary
GET /dashboard/summary


 Sample Output
{
  "totalIncome": 5000,
  "totalExpense": 2000,
  "balance": 3000
}


 Authentication

Uses JWT-based authentication

Secure endpoints using Spring Security



 Future Enhancements

Add frontend (React / Next.js)

Add persistent database (MySQL / PostgreSQL)

Add charts & analytics

Export reports (PDF/Excel)

 Author

Nikhil Meena
