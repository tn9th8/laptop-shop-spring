<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Update user</title>
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
                                <h3>Update a user</h3>
                                <a href="/admin/user" class="btn btn-primary">Back </a>
                            </div>
                            <hr />
                            <f:form method="post" action="/admin/user/update" modelAttribute="userView">
                                <div class="mb-3" style="display: none;">
                                    <label class="form-label">Id:</label>
                                    <f:input path="id" type="text" class="form-control" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Email:</label>
                                    <f:input path="email" type="email" class="form-control" disabled="true" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Phone number:</label>
                                    <f:input path="phone" type="text" class="form-control" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Full Name:</label>
                                    <f:input path="fullName" type="text" class="form-control" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Address:</label>
                                    <f:input path="address" type="text" class="form-control" />
                                </div>

                                <button type="submit" class="btn btn-warning">Update</button>
                            </f:form>
                        </div>

                    </div>

                </div>
            </body>

            </html>