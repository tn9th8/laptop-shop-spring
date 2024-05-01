<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>detail user page</title>
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
                        <div class="col-md-6 col-12 mx-auto">
                            <div class="d-flex justify-content-between">
                                <h3>User Detail</h3>
                                <a href="/admin/user/list" class="btn btn-primary">Back </a>
                            </div>
                            <hr />
                            <div class="card">
                                <div class="card-header"><strong>
                                        Detail information of user-${userView.id}
                                </div></strong>
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item">Email: ${userView.email}</li>
                                    <li class="list-group-item">Full Name: ${userView.fullName}</li>
                                    <li class="list-group-item">Phone: ${userView.phone}</li>
                                    <li class="list-group-item">Address: ${userView.address}</li>
                                </ul>
                                <div class="card-footer">
                                    <a href="/admin/user/update/${userView.id}" class="btn btn-warning">Update</a>
                                    <a href="/admin/user/delete/${userView.id}" class="btn btn-danger">Delete</a>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>

            </body>

            </html>