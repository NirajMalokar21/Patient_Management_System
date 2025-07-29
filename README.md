# Patient Management System (Microservices Architecture)

This is a backend-focused Patient Management System developed using Java Spring Boot and a modern cloud-native microservices architecture. The project simulates a production-grade environment with containerized services, secure communication, API gateway routing, and local cloud emulation.

## Technologies Used

- **Java Spring Boot** – Core service development (Patient Service, Auth Service, etc.)
- **Docker** – Containerization of services for isolated and scalable deployment
- **Swagger (OpenAPI)** – API documentation and testing
- **gRPC & Kafka** – Inter-service communication (gRPC for synchronous, Kafka for async events)
- **JWT Authentication** – Secure authentication via token-based system
- **API Gateway** – Central routing for all microservices
- **Spring Boot Testing** – Integration and unit testing
- **Localstack** – Emulation of AWS services:
  - ECS for container orchestration
  - RDS for relational data persistence
  - VPC for networking
  - MSK for Kafka cluster emulation

## What I Learned

- Designed a **scalable microservices architecture** using Spring Boot and Docker.
- Implemented **secure, token-based authentication** with JWT and an Auth Service.
- Gained hands-on experience with **inter-service communication** using gRPC and Kafka.
- Configured **API Gateway** to route traffic and centralize access management.
- Wrote **integration and unit tests** using Spring Boot testing libraries.
- Simulated real-world cloud infrastructure using **Localstack** with ECS, RDS, MSK, and VPC setups.
- Documented and validated APIs using **Swagger**.

## Getting Started

1. Clone the repo:
   git clone https://github.com/yourusername/patient-management-system.git
   cd patient-management-system

2. Start the docker container
  docker-compose up --build

Niraj Malokar

Project for learning & demonstration purposes.
