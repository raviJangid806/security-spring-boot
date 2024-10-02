<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup Page</title>
    <style>
        /* Global Styling */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Arial', sans-serif;
        }

        body {
            background: linear-gradient(135deg, #3498db, #2ecc71);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        /* Signup Form Styling */
        .container {
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .signup-form {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.1);
            width: 350px;
            text-align: center;
        }

        .signup-form h2 {
            color: #333;
            margin-bottom: 20px;
        }

        .input-group {
            margin-bottom: 20px;
            text-align: left;
        }

        .input-group label {
            color: #555;
            font-size: 14px;
            margin-bottom: 5px;
            display: block;
        }

        .input-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
            transition: all 0.3s ease;
        }

        .input-group input:focus {
            border-color: #3498db;
            outline: none;
            box-shadow: 0px 0px 5px rgba(52, 152, 219, 0.5);
        }

        .btn {
            width: 100%;
            padding: 10px;
            background-color: #3498db;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="signup-form">
            <h2>Sign Up</h2>
            <form action="/user-form-submit">
                <div class="input-group">
                    <label for="username">Username</label>
                    <input type="text" id="username" name="name" required placeholder="Enter your username">
                </div>
                <div class="input-group">
                    <label for="mobile">Mobile Number</label>
                    <input type="tel" id="mobile" name="mobileNumber" required placeholder="Enter your mobile number">
                </div>
                <div class="input-group">
                    <label for="email">Gmail</label>
                    <input type="email" id="email" name="email" required placeholder="Enter your Gmail">
                </div>
                <div class="input-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required placeholder="Enter your password">
                </div>
                <button type="submit" class="btn">Sign Up</button>
            </form>
        </div>
    </div>
</body>
</html>
