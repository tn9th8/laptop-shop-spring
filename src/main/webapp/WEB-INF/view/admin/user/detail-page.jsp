<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
            <html lang="en">

            <head>
                <!-- Template -->
                <meta charset="utf-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
                <meta name="description" content="Hỏi Dân IT - Dự án laptopshop" />
                <meta name="author" content="Hỏi Dân IT" />
                <title>Dashboard - Hỏi Dân IT</title>
                <link href="/css/styles.css" rel="stylesheet" />
                <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
            </head>

            <body>
                <jsp:include page="../layout/header.jsp" />
                <div id="layoutSidenav">
                    <jsp:include page="../layout/sidebar.jsp" />
                    <div id="layoutSidenav_content">
                        <main>
                            <div class="container-fluid px-4">
                                <h1 class="mt-4">Manage Users</h1>
                                <ol class="breadcrumb mb-4">
                                    <li class="breadcrumb-item"><a href="/admin">Dashboard</a></li>
                                    <li class="breadcrumb-item active">Users</li>
                                </ol>

                                <div class="container mt-5">
                                    <div class="row">
                                        <div class="col-md-6 col-12 mx-auto">
                                            <div class="d-flex justify-content-between">
                                                <h3>User Detail</h3>
                                                <a href="/admin/user" class="btn btn-primary">Back </a>
                                            </div>
                                            <hr />
                                            <div class="card">
                                                <div class="card-header"><strong>
                                                        Detail information of user-${userView.id}
                                                </div></strong>
                                                <ul class="list-group list-group-flush">
                                                    <li class="list-group-item">Email: ${userView.email}</li>
                                                    <li class="list-group-item">Full Name: ${userView.fullName}</li>
                                                    <li class="list-group-item">Role: ${userView.role.name}</li>
                                                    <li class="list-group-item">Phone: ${userView.phone}</li>
                                                    <li class="list-group-item">Address: ${userView.address}</li>
                                                </ul>
                                                <div class="card-footer">
                                                    <a href="/admin/user/update/${userView.id}"
                                                        class="btn btn-warning">Update</a>
                                                    <a href="/admin/user/delete/${userView.id}"
                                                        class="btn btn-danger">Delete</a>
                                                </div>
                                            </div>
                                        </div>

                                    </div>

                                </div>

                            </div>
                        </main>
                        <jsp:include page="../layout/footer.jsp" />
                    </div>
                </div>

                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    crossorigin="anonymous"></script>
                <script src="/js/scripts.js"></script>
            </body>

            </html>