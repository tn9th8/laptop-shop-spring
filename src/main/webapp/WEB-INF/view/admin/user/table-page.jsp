<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>List user</title>
                <!-- Bootstrap CSS -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
                <!-- Bootstrap JavaScript -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
                <!-- Jquery -->
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
                <!-- My CSS -->
                <!-- <link href="/css/loading.css" rel="stylesheet"> -->
            </head>

            <body>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-12 mx-auto">
                            <div class="d-flex justify-content-between">
                                <h3>Table users</h3>
                                <a href="/admin/user/create" class="btn btn-primary">Create a user</a>
                            </div>

                            <hr />
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Email</th>
                                        <th>Full Name</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <c:forEach var="user" items="${usersView}">
                                        <tr>
                                            <th>${user.id}</th>
                                            <td>${user.email}</td>
                                            <td>${user.fullName}</td>
                                            <td>
                                                <a href="/admin/user/${user.id}" class="btn btn-success">Detail</a>
                                                <a href="/admin/user/update/${user.id}"
                                                    class="btn btn-warning">Update</a>
                                                <a href="/admin/user/delete/${user.id}"
                                                    class="btn btn-danger">Delete</a>
                                            </td>
                                        </tr>
                                    </c:forEach>


                                </tbody>
                            </table>
                        </div>

                    </div>

                </div>

            </body>

            </html>