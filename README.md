User Information Registration Service

This service acts as the destination for user information after successful user authentication.

1. Functionality:

    The service receives authenticated user data from the JA_USER_INFO_HTTP service. This data is assumed to have been sent via a WebClient call initiated by JA_USER_INFO_HTTP.
    The service processes the received user information and stores it in a persistent manner 
2. Testing:

    You can test the functionality of this service by making a direct HTTP request to http://localhost:8081/appName2/addUserInfo (note: this is for testing purposes only, actual usage would involve the JA_USER_INFO_HTTP service call).

3. Communication:

    The communication between this service and JA_USER_INFO_HTTP is established through a WebClient call initiated by the JA_USER_INFO_HTTP service itself. This eliminates the need for this service to directly interact with JA_USER_INFO_HTTP.
