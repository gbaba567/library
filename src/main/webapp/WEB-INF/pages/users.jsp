<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <%@include file="headers.jsp" %>
    <body>

        <%@include file="navigation.jsp" %>
        <div class="container">
            <div class="col-md-8" >
                <h1>All Users</h1>

                <table class="table table-bordered table-striped">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Action</th>
                    </tr>
                    <c:forEach items="${users}" var="user">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td> ${user.phone}</td>
                            <td>${user.email}</td>
                            <td>
                                <input type="button" onClick="toggleBookTable(${user.id}, this)" value="Expand"/>      
                            </td>
                        </tr>
                        <tr id="row-${user.id}"  style="display:none;">
                            <td colspan="5" class="user-book-table" id="details-${user.id}"> 
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>