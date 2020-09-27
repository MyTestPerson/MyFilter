<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <title>LogIn</title>

</head>
<body>


    <form name="user" method="post" action="/login">

        <p>
            <label for="username">Username</label>
            <input type="email" id="username" name="email" value="root@root.root">
        </p>
        <p>
            <label for="password">Password</label>
            <input type="password" id="password" name="password" value="1111">
        </p>


        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <br>

        <button type="submit">LogIn</button>
    </form>


</body></html>