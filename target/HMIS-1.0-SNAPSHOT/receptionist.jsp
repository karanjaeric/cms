<%-- 
    Document   : receptionist
    Created on : Apr 21, 2017, 10:34:10 AM
    Author     : karanjaeric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>receptionist</title>
    </head>
    <body>
        <div style="margin:10%;">
            
        <form action="register" method="post">
            <fieldset><legend>Fill Patient Details</legend>
                Identification Number<br/>
        <input type="text" name="identificationNumber"><br/>
        
                Full Name<br/>
        <input type="text" name="fullName"><br/>
        
        
                Phone Number<br/>
        <input type="text" name="phoneNumber"><br/>
                Email Address<br/>
        <input type="text" name="emailAddress"><br/>
                Date of Birth<br/>
        <input type="text" name="dateOfBirth"><br/>
        
        
                Gender<br/>
        <input type="text" name="gender"><br/>
        
                Height<br/>
        <input type="text" name="height"><br/>
        
                Weight<br/>
        <input type="text" name="weight"><br/>
        <input type="submit" value="Register Patient">
        </fieldset>
        
        </form>
            </div>
    </body>
</html>
