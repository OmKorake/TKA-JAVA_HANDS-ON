<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #8EC5FC, #E0C3FC);
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        animation: fadeIn 1s ease-in;
    }
    @keyframes fadeIn {
        from { opacity: 0; }
        to { opacity: 1; }
    }
    .profile-container {
        background: white;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.3);
        max-width: 600px;
        text-align: center;
        transition: transform 0.3s ease-in-out, box-shadow 0.3s ease-in-out;
    }
    .profile-container:hover {
        transform: scale(1.05);
        box-shadow: 0px 0px 30px rgba(0, 0, 0, 0.4);
    }
    h1 {
        color: #d4145a;
    }
    .profile-details {
        text-align: left;
        margin-top: 20px;
    }
    .profile-details h3 {
        margin: 10px 0;
        font-size: 18px;
        color: #333;
        transition: color 0.3s ease;
    }
    .profile-details h3:hover {
        color: #d4145a;
    }
</style>

<div class="profile-container">
    <h1>Employee Profile</h1>

    <div class="profile-details">
        <h3>First Name: ${fname}</h3>
        <h3>Last Name: ${lname}</h3>
        <h3>Gender: ${gender}</h3>
        <h3>Date of Birth: ${dob}</h3>
        <h3>Contact Number: ${connum}</h3>
        <h3>Email: ${email}</h3>
        <h3>City: ${city}</h3>
        <h3>State: ${state}</h3>
        <h3>Salary: ${sal}</h3>
        <h3>Join Date: ${joindate}</h3>
        <h3>Role: ${role}</h3>
        <h3>Type of Work: ${typeofwork}</h3>
    </div>
</div>

</body>
</html>
