<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Form</title>
    <link rel="stylesheet" href="/styles.css">
</head>
<body>
    <h1>Book Form</h1>
    <form action="/book/update" method="post">
        <input type="hidden" name="id" value="${book.id}">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" value="${book.title}" required>
        <br>
        <label for="author">Author:</label>
        <select id="author" name="authorId">
            <c:forEach var="author" items="${authors}">
                <option value="${author.id}" ${author.id == book.authorId ? 'selected' : ''}>${author.name}</option>
            </c:forEach>
        </select>
        <br>
        <label for="authors">Authors:</label>
        <select id="authors" name="authorIds" multiple>
            <c:forEach var="author" items="${authors}">
                <option value="${author.id}" ${book.authorIds.contains(author.id) ? 'selected' : ''}>${author.name}</option>
            </c:forEach>
        </select>
        <br>
        <button type="submit">Save</button>
    </form>
</body>
</html>