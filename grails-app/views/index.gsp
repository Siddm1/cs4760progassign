<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="site"/>
    <title>Book Store Home</title>
</head>

<body>
<div class="jumbotron jumb-margin">
    <div class="container">
        <h1 class="text-center">Book Store</h1>
    </div>

    <!-- Simple Ajax link to show time -->
    <g:link controller="Home" action="showTime" elementId="timeLink">Show the time!</g:link>
    <div id="time"> time </div>


    <!-- Simple Ajax link to show the last added book -->
    <g:link controller="Home" action="showLastBook" elementId="lastBookLink">Most Recent Book</g:link>
    <div id="lastBook"> Latest Book </div>


</div>

<p>Under construction</p>
<p>
    <g:link controller="controllerList">Go to ControllerList</g:link>
</p>

</body>
</html>