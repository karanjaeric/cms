<%-- 
    Document   : register_patient
    Created on : Apr 20, 2017, 4:59:04 PM
    Author     : karanjaeric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>patient registration</title>
    </head>
    <body>
        <form method="post" action="register">
        ID number:<br/>
       <input type="text" name="identificationNumber"><br/>
               Name:<br/>
       <input type="text" name="name"><br/>
               height:<br/>
       <input type="text" name="height"><br/>
               weight:<br/>
       <input type="text" name="weight"><br/>
       
       <input type="submit" value="register" >
      </form>
    </body>
</html>
