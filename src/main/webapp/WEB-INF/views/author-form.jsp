<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Author Form</title>
    <link rel="stylesheet" href="/styles.css">
</head>
<body>
    <h1>Author Form</h1>
    <form action="/author/update" method="post">
        <input type="hidden" name="id" value="${author.id}">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${author.name}" required>
        <br>
        <button type="submit">Save</button>
    </form>
</body>
</html>