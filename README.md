# pjt-member-invitation
[BE Pro] Mini Project for Spring Boot where member group invitation link can be sent

### ◆◆◆ Mini Technology Challenge ◆◆◆
##### [Member invitation link creation function]
1. Introduction
🔷 Implement “member invitation link creation function”.
🔷 Implements “Calls for Challenge”
🔷 Features If functional requirements and technical requirements are not met, code level evaluation will not be performed.
🔷 Evaluate your code with the “Code Level Evaluation Items” below
🔷 Please submit the API specification for the “Member Invitation Link Creation Function”.

2. Request for assignment function
1) Invitation of participants
🔷 Group managers can join and invite groups.
🔷 When inviting a member, a temporary member is created in the DB and an invitation link is created.
🔷 When creating a member, the member's name, phone number, and email address are required values.

2) invitation
🔷 Invited members can join the group through the group invitation link.
🔷 Activates temporary members and closes the invitation link when completing the invitation link.
🔷 The invitation link expires after one use.

### 🛠Technical Specification💻
✅ Java21
✅ Gradle 8.4 (Gradle-based project)
✅ Spring Boot 
✅ Dependencies
 1) Spring Web
 2) Spring Data JPA
 3) H2 Database (In-memory)
 4) Lombok
 5) JUnit5
✅ Please freely select the HTTP Method of the API.
✅ Please freely define error response and error code.
✅ External libraries and open source can be used (however, please clearly indicate the open source used and the purpose of use in the README file.)

🔶 \[Incompleted] Assignment functional requirements are implemented/processed on the server (backend)

### 📗Documentation📘
1) [API Documentation](https://documenter.getpostman.com/view/20944788/2s9YR86EZn)
2) [Entity Relation Diagram](https://drawsql.app/teams/team-chanel/diagrams/be-pro-mini)
![1018  ERD  mini drawsql app](https://github.com/CHOCOCHANEL/pjt-member-invitation/assets/22478698/c2ee1466-2ab0-4e5d-8c5a-63001783441a)
