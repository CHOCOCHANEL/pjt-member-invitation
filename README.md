# pjt-member-invitation
[BE Pro] Mini Project for Spring Boot where member group invitation link can be sent

### 📁Executable Jar📂
👉👉You can download mini-0.0.1-SNATSHOT.jar [HERE](https://drive.google.com/file/d/1FUTCg8_i2OKUKKTeobFZ6eIosl3HS8cF/view?usp=share_link).👈👈 <br>

### Mini Technology Challenge 
##### [Member invitation link creation function]
1. Introduction<br>
🔷 Implement “member invitation link creation function”.<br>
🔷 Implements “Calls for Challenge”<br>
🔷 Features If functional requirements and technical requirements are not met, code level evaluation will not be performed.<br>
🔷 Evaluate your code with the “Code Level Evaluation Items” below<br>
🔷 Please submit the API specification for the “Member Invitation Link Creation Function”.<br><br>

2. Request for assignment function<br>
* Invitation of participants<br>
🔷 Group managers can join and invite groups.<br>
🔷 When inviting a member, a temporary member is created in the DB and an invitation link is created.<br>
🔷 When creating a member, the member's name, phone number, and email address are required values.<br>

* Invitation<br>
🔷 Invited members can join the group through the group invitation link.<br>
🔷 Activates temporary members and closes the invitation link when completing the invitation link.<br>
🔷 The invitation link expires after one use.<br><br>

### 🛠Technical Specification💻
✅ Java21<br>
✅ Gradle 8.4 (Gradle-based project)<br>
✅ Spring Boot <br>
✅ Dependencies<br>
```
 1) Spring Web
 2) Spring Data JPA
 3) H2 Database (In-memory)
 4) Lombok
 5) JUnit5
```
✅ Please freely select the HTTP Method of the API.<br>
✅ Please freely define error response and error code.<br>
✅ External libraries and open source can be used 
> (however, please clearly indicate the open source used and the purpose of use in the README file.)<br><br>

🔶 \[Incompleted] Assignment functional requirements are implemented/processed on the server (backend)<br>

### 📗Documentations📘
1) [API Documentation](https://documenter.getpostman.com/view/20944788/2s9YR86EZn)
2) [Entity Relation Diagram](https://drawsql.app/teams/team-chanel/diagrams/be-pro-mini)

![1018  ERD  mini drawsql app](https://github.com/CHOCOCHANEL/pjt-member-invitation/assets/22478698/b5a94cdd-9456-4ced-9781-1a0ffd8e6247)
