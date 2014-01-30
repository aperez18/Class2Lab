<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result JSP</title>
    </head>
    <body>
        <h1>
            <% 
                String greeting = (String)request.getAttribute("name");
                out.println(greeting);
            %>
        </h1>
    </body>
</html>
