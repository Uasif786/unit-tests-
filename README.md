# unit-tests-
Author: Umar Asif

Reflections
How can I ensure that my code, program, or software is functional and secure?
To ensure that my code is functional and secure, I use thorough unit testing, input validation, and proper error handling. In this project, I wrote JUnit tests for each major service (ContactService, TaskService, AppointmentService) to verify that objects were correctly added, updated, and deleted, and that invalid data (like null fields or past dates) was properly rejected. I also ensure that sensitive operations, such as updating or deleting entries, are protected through validation checks. Regular testing helps catch vulnerabilities early and guarantees that functionality stays consistent over time.

How do I interpret user needs and incorporate them into a program?
I interpret user needs by carefully reviewing and translating the provided project requirements into specific functionality within the code. For example, the customer requested that IDs must be unique, fields must not be null, and strings must have certain length constraints. I reflected these needs directly in the object constructors and service methods with validations. By writing unit tests based on user stories and requirements, I ensure that the application behavior matches user expectations.

How do I approach designing software?
I approach designing software by first breaking down the project requirements into smaller, manageable components (classes and services). I focus on building each piece to meet one clear responsibility, following principles like encapsulation and single-responsibility. I then develop unit tests in parallel to ensure that each component works correctly on its own. I also think ahead about scalability and maintainability — using in-memory data structures now, but writing flexible methods that could later adapt to database integration if needed. Keeping the design modular and simple makes debugging and future improvements much easier.
