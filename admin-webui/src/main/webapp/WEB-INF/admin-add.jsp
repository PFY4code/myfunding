<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="/WEB-INF/includex/include-head.jsp" %>
<body>
<%@include file="/WEB-INF/includex/include-nav.jsp" %>
<div class="container-fluid">
    <div class="row">
        <%@include file="/WEB-INF/includex/include-sidebar.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <ol class="breadcrumb">
                <li><a href="admin/to/main/page.html">Main</a></li>
                <li><a href="admin/get/page.html">Data List</a></li>
                <li class="active">Add New</li>
            </ol>
            <div class="panel panel-default">
                <div class="panel-heading">Data<div style="float:right;cursor:pointer;" data-toggle="modal" data-target="#myModal"><i class="glyphicon glyphicon-question-sign"></i></div></div>
                <div class="panel-body">
                    <form action="admin/save.html" method="post" role="form">
                        <p><font color="red">${requestScope.exception.message}</font></p>
                        <div class="form-group">
                            <label for="exampleInputLoginAcct1">Account</label>
                            <input type="text" class="form-control" name="loginAcct" id="exampleInputLoginAcct1" placeholder="Input Account">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label>
                            <input type="password" class="form-control" name="userPswd" id="exampleInputPassword1" placeholder="Input Password">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputUserName1">Name</label>
                            <input type="text" class="form-control" name="userName" id="exampleInputUserName1" placeholder="Input Name">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Email</label>
                            <input type="email" class="form-control" name="email" id="exampleInputEmail1" placeholder="Input Email">
                            <p class="help-block label label-warning">Format: XXX@xxxx.com</p>
                        </div>
                        <button type="submit" class="btn btn-success"><i class="glyphicon glyphicon-plus"></i> Add new</button>
                        <button type="reset" class="btn btn-danger"><i class="glyphicon glyphicon-refresh"></i> reset</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
