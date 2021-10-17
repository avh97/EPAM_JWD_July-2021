<html>
<head>
<title>task08XML</title>
</head>
<body>
<h2>Welcome!</h2>
  <form method="post" action="fileuploadservlet" enctype="multipart/form-data">
    <input type="file" name="file" />
    <input type="submit" value="Upload" />
  </form>
<form action="parser" method="post" enctype="multipart/form-data">
<select name="parserType" title="Parser type">
<option selected="selected" value="dom">DOM<option/>
<option value="sax" value="sax">SAX<option/>
<option value="stax" value="stax">StAX<option/>
</select>
<input type="submit" value="Parse!"
<form/>
</body>
</html>
