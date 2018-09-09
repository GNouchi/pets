<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
    .container{
        width: 100px;
        display: inline-block;
        margin-left: 100px;
    }
</style>
<title>Index</title>
</head>
<body>
    <h1>you are on the index</h1>
<div class="container">
    <h5>Make a dog</h5>
    <form action="Dogs" method="post">
            Name: 
            <input name="name" type="text"><br>
            Breed: 
            <input name="breed" type="text"><br>
            Weight(lb):
            <input name="weight" type="number"><br>
            <button type = "submit" >Submit</button>
        </form>    
</div>

<div class="container">
        <h5>Make a cat</h5>
        <form action="Cats" method="post" >
            Name: 
            <input name="name" type="text"><br>
            Breed: 
            <input name="breed" type="text"><br>
            Weight(lb):
            <input name="weight" type="number"><br>
            <button type = "submit" >Submit</button>
        </form>    
    </div>
    


</body>
</html>