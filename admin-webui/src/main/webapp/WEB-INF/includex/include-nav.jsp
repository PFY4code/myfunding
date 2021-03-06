<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <div><a class="navbar-brand" style="font-size:32px;" href="admin/to/main/page.html">DashBoard</a></div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li style="padding-top:8px;">
                    <div class="btn-group">
                        <button type="button" class="btn btn-default btn-success dropdown-toggle"
                                data-toggle="dropdown">
                            <i class="glyphicon glyphicon-user"></i>
                             <!-- principal这个对象就是SecurityAdmin 然后我们就可以直接访问了 -->
                            	<security:authentication property="principal.originalAdmin.userName"/>
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="admin/to/main/page.html"><i class="glyphicon glyphicon-cog"></i> Personal Info</a></li>
                            <li><a href="admin/to/main/page.html"><i class="glyphicon glyphicon-comment"></i> Messages</a></li>
                            <li class="divider"></li>
                            <li><a href="security/do/logout.html"><i class="glyphicon glyphicon-off"></i> Log out</a></li>
                        </ul>
                    </div>
                </li>
                <li style="margin-left:10px;padding-top:8px;">
                    <button type="button" class="btn btn-default btn-danger">
                        <span class="glyphicon glyphicon-question-sign"></span> Help
                    </button>
                </li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Inquiry">
            </form>
        </div>
    </div>
</nav>