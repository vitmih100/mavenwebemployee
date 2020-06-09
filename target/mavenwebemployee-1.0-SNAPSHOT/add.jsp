<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add employee</title>
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
                <h2>Add Employee Information</h2>
                <form method="post" action="add-employee" class="form-inline">
                    <div class="form-group">
                        <label for="Name">Nume:</label>
                        <input type="name" class="form-control" id="name" name="name">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="Prenume">Prenume:</label>
                        <input type="surname" class="form-control" id="surname" name="surname">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="Salariu">Salariu:</label>
                        <input type="salary" class="form-control" id="salary" name="salary">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="Data angajarii">Data angajarii:</label>
                        <input type="hireday" class="form-control" id="hireday" name="hireday">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="Data nasterii">Data nasterii:</label>
                        <input type="birthday" class="form-control" id="birthday" name="birthday">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="Genul">Genul:</label>
                        <input type="gender" class="form-control" id="gender" name="gender">
                    </div>
                    <br>
                    <button type="submit" class="btn btn-default" value="Insert">Insert</button>
                </form>
            </div>
        </div>
    </body>
</html>
