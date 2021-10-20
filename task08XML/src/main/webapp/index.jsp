<html>
<head>
<title>task08XML</title>
</head>
<body>
<h2>Welcome!</h2>
<p><%= new java.util.Date() %></p>
<form method="post" action="fileuploadservlet" enctype="multipart/form-data">
    <input type="file" name="file" />
    <input type="submit" value="Upload" />
</form>
<form action="xmlservlet">
    <select name="switchParser">
        <option value="DOM">DOM</option>
        <option value="SAX">SAX</option>
        <option value="StAX">StAX</option>
    </select>
    <input type="submit" value="Parse">
<form/>
</body>
</html>
