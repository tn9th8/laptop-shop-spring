<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Delete user</title>
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
                                <h3>Delete a user</h3>
                                <a href="/admin/user/list" class="btn btn-primary">Back </a>
                            </div>
                            <hr />
                            <f:form method="post" action="/admin/user/delete" modelAttribute="userView">
                                <div class="mb-3" style="display: none;">
                                    <f:input path="id" value="${id}" type="text" class="form-control" />
                                </div>

                                <div class="alert alert-danger" role="alert">
                                    Are you sure to delete this user id-${id} ?
                                </div>

                                <button type="submit" class="btn btn-danger">Delete</button>
                            </f:form>
                        </div>

                    </div>

                </div>
            </body>

            </html>