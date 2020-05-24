<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View employees</title>
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Nume</th>
                            <th>Prenume</th>
                            <th>Salariu</th>
                            <th>Data angajarii</th>
                            <th>Data nasterii</th>
                            <th>Gen</th>
                            <th>Edit</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${contactList}" var="val">
                            <tr>
                                <td><c:out value="${val.value.name}" /></td>
                                <td><c:out value="${val.value.surName}" /></td>
                                <td><c:out value="${val.value.salary}" /></td>
                                <td><c:out value="${val.value.hireDay}" /></td>
                                <td><c:out value="${val.value.birthDay}" /></td>
                                <td><c:out value="${val.value.gender}" /></td>
                                <td><a href="update-employee?id=${val.key}"
                                       class="btn btn-info" role="button">Update</a></td>
                                <td><a href="delete-employee?id=${val.key}"
                                       class="btn btn-info" role="button">Delete</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    
                </table> 
            </div>
            
        </div>
    </body>
</html>
