<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<a class="menu" href="/jrbasej_acegi_logout">
    Log out [<authz:authentication operation="username"/>]
</a>