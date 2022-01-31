<html>
<head>
    %{--<meta name="layout" content="site"/>--}%
    <title>Book Store Authors</title>
</head>

<body>
<h1> AUTHORS </h1>
<ul>
    <g:each in="${authorList}">
        <li> ${it.author} </li>

        <ul>
            <g:each in="${it.book}">
                <li> ${it.properties.values().first()} </li>
            </g:each>
        </ul>
    </g:each>
</ul>
</body>
</html>






