<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vendor Categories</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 2rem;
            background-color: #f9f9f9;
        }

        h2 {
            text-align: center;
            margin-bottom: 2rem;
        }

        .categories {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
            gap: 1.5rem;
            text-align: center;
        }

        .category-card {
            background-color: white;
            border-radius: 12px;
            padding: 1rem;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05);
            text-decoration: none;
            color: inherit;
            display: block;
            transition: transform 0.2s ease;
            cursor: pointer;
        }

        .category-card:hover {
            transform: scale(1.03);
        }

        .category-card img {
            width: 100%;
            height: 120px;
            object-fit: cover;
            border-radius: 8px;
            margin-bottom: 0.5rem;
        }
    </style>
</head>
<body>


<h2>Choose a Vendor Category</h2>
<div class="categories">
    <div class="category-card" onclick="location.href='vendorCategoryList?category=Photography'">
        <img src="https://via.placeholder.com/180x120?text=Photographer" alt="Photographer">
        <h4>Photographers</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Caterers'">
        <img src="https://via.placeholder.com/180x120?text=Caterer" alt="Caterer">
        <h4>Caterers</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=DJs'">
        <img src="https://via.placeholder.com/180x120?text=DJs" alt="DJs">
        <h4>DJs</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Decorators'">
        <img src="https://via.placeholder.com/180x120?text=Decorators" alt="Decorators">
        <h4>Decorators</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Wedding Planners'">
        <img src="https://via.placeholder.com/180x120?text=Wedding+Planner" alt="Wedding Planner">
        <h4>Wedding Planner</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Music/Entertainment'">
        <img src="https://via.placeholder.com/180x120?text=Music/Entertainment" alt="Music/Entertainment">
        <h4>Music/Entertainment</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Makeup Artists and Hair Stylists'">
        <img src="https://via.placeholder.com/180x120?text=Makeup+Artist+%26+Hair+Stylist" alt="Makeup Artist and Hair Stylist">
        <h4>Makeup Artist and Hair Stylist</h4>
    </div>

    <div class="category-card" onclick="location.href='vvendorCategoryList?category=Dress and Suit Providers'">
        <img src="https://via.placeholder.com/180x120?text=Dress+%26+Suit+Provider" alt="Dress and Suit Provider">
        <h4>Dress and Suit Provider</h4>
    </div>

</div>

</body>
</html>
