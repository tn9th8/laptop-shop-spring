<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Create user</title>
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
                            <h3>Create a user</h3>
                            <hr />
                            <f:form method="POST" action="/admin/user/create" modelAttribute="userView">
                                <div class="mb-3">
                                    <label class="form-label">Email:</label>
                                    <f:input path="email" type="email" class="form-control" />
                                </div>
                                <div class="mb-3">
                                    <label class="form-label">Password:</label>
                                    <f:input path="password" type="password" class="form-control" />
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

                                <button type="submit" class="btn btn-primary">Create</button>
                            </f:form>
                        </div>

                    </div>

                </div>
            </body>

            </html>