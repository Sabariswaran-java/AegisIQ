# AegisIQ
# 🚀 AegisIQ
### AI-Powered Industrial Asset Monitoring & Predictive Maintenance Platform

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![HTML](https://img.shields.io/badge/Frontend-HTML%20%7C%20CSS%20%7C%20JavaScript-orange)
![License](https://img.shields.io/badge/License-MIT-green)

---

# 📌 Overview

AegisIQ is an AI-powered Industrial Asset Monitoring and Predictive Maintenance Platform designed to help organizations monitor critical assets in real time, detect potential failures, and improve maintenance planning.

The platform provides a centralized dashboard for monitoring asset health, tracking maintenance activities, and generating intelligent alerts to reduce downtime and improve operational efficiency.

---

# 🎯 Problem Statement

Industrial organizations often face challenges such as:

- Unexpected equipment failures
- High maintenance costs
- Lack of real-time monitoring
- Manual maintenance tracking
- Increased operational downtime

These issues reduce productivity and increase business risk.

---

# 💡 Solution

AegisIQ provides a smart monitoring platform that enables organizations to:

- Monitor industrial assets in real time
- Track asset health
- Manage maintenance schedules
- View system status through dashboards
- Receive intelligent alerts
- Improve operational efficiency

---

# ✨ Key Features

## 👤 User Management

- Secure Login
- User Authentication

## 🏭 Asset Management

- Add Assets
- Update Assets
- Delete Assets
- View Asset Information

## 📊 Monitoring Dashboard

- Asset Status
- CPU Usage
- Memory Usage
- Health Indicators

## 🔧 Maintenance Management

- Maintenance Records
- Maintenance Scheduling
- Maintenance History

## 🚨 Intelligent Alerts

- Warning Status
- Critical Status
- Health Notifications

---

# 🏗️ System Architecture

```
                +----------------------+
                |      Frontend        |
                | HTML • CSS • JS      |
                +----------+-----------+
                           |
                    REST API Calls
                           |
                +----------v-----------+
                |     Spring Boot      |
                | Business Logic/API   |
                +----------+-----------+
                           |
                    PostgreSQL Database
                           |
                +----------v-----------+
                |      pgAdmin         |
                +----------------------+
```

---

# 🛠️ Technology Stack

## Frontend

- HTML5
- CSS3
- JavaScript

## Backend

- Java
- Spring Boot
- REST API

## Database

- PostgreSQL
- pgAdmin

## Tools

- Git
- GitHub
- Postman
- VS Code
- Spring Tool Suite

---

# 📁 Project Structure

```
AegisIQ/
│
├── frontend/
│
├── backend/
│
├── database/
│   ├── schema.sql
│   └── sample_data.sql
│
├── README.md
│
└── .gitignore
```

---

# ⚙️ Installation

## Clone Repository

```bash
git clone https://github.com/Sabariswaran-java/AegisIQ.git
```

---

## Backend

```
Import backend into Spring Tool Suite

Run Spring Boot Application
```

---

## Database

1. Open PostgreSQL
2. Create Database

```
aegisiq
```

3. Open pgAdmin

4. Execute

```
database/schema.sql
```

---

## Frontend

Simply open

```
frontend/index.html
```

or use Live Server.

---

# 📡 REST API

Example Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /api/assets | Get All Assets |
| GET | /api/assets/{id} | Get Asset |
| POST | /api/assets | Add Asset |
| PUT | /api/assets/{id} | Update Asset |
| DELETE | /api/assets/{id} | Delete Asset |

---

# 🗄️ Database

Main Tables

- Users
- Assets
- Maintenance
- Alerts

---

# 📸 Screenshots

Add project screenshots here.

Example

```
screenshots/

dashboard.png

login.png

assets.png

monitoring.png
```

---

# 🎥 Demo Video


```

```

---

# 📈 Future Enhancements

- AI Failure Prediction
- Predictive Maintenance using Machine Learning
- Cloud Deployment
- IoT Sensor Integration
- Mobile Application
- Email & SMS Alerts
- Analytics Dashboard

---

# 👨‍💻 Team

**Team Name**

Team Aegis

**College**

Mangayarkarasi College of Engineering

---

# 🏆 Hackathon

This project was developed as part of a Hackathon to demonstrate an AI-powered solution for Industrial Asset Monitoring and Predictive Maintenance.

---

# 📄 License

This project is developed for educational and hackathon purposes.

---

# ⭐ Support

If you like this project,

⭐ Star this repository on GitHub.

---

## Thank You

**AegisIQ**

AI-Powered Industrial Asset Monitoring & Predictive Maintenance Platform
