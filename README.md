# 🚀 AI-Powered Government Exam Guidance System

An intelligent full-stack web application designed to help students prepare for government exams like **MPSC, UPSC, SSC** using structured resources and AI-powered guidance.

---

## 🧠 Features

- 🔐 **Secure Authentication**
  - JWT-based authentication & authorization using Spring Security
  - Protected APIs and session handling

- 📚 **Exam Preparation Resources**
  - Access to previous year papers
  - Study materials and video resources
  - Exam notifications

- 🤖 **AI-Powered Assistant**
  - Integrated with Gemini API
  - Provides personalized study plans
  - Real-time doubt solving and guidance

- 💬 **Chat Interface (ChatGPT-like UI)**
  - Clean and modern React UI
  - Interactive AI conversation experience

- ⚙️ **Backend APIs**
  - RESTful APIs using Spring Boot
  - Modular and scalable architecture

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Security (JWT)
- Hibernate / JPA
- MySQL

### Frontend
- React.js
- Axios
- React Router

### AI Integration
- Google Gemini API

---

## 🔗 API Collection (Postman)

👉 Test all APIs here:  
https://web.postman.co/workspace/My-Workspace~37547954-b7e9-42fb-8dde-d1b452f2127d/collection/40716741-6106839f-adf9-4bb2-a4b1-54da0fff1301?action=share&source=copy-link&creator=40716741

---

## 🔐 Authentication Flow

1. User registers → `/auth/register`
2. User logs in → `/auth/login`
3. Backend returns JWT token
4. Frontend stores token in `localStorage`
5. Token is sent in headers:

## ⚙️ Setup Instructions

### 🔧 Backend (Spring Boot)

1. Clone the repository:
```bash
git clone https://github.com/Ganesh0031/exam-ai-project.git
cd exam-ai-project
spring.datasource.url=jdbc:mysql://localhost:3306/ai
spring.datasource.username=root
spring.datasource.password=your_password

gemini.api.key=YOUR_GEMINI_API_KEY
gemini.api.url=https://generativelanguage.googleapis.com/v1/models/gemini-1.5-flash:generateContent
mvn spring-boot:run
