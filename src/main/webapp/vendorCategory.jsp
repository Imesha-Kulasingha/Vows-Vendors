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
            background-image: url('Pictures/tempwall.jpg');
            background-size: 105%; /* Shrinks the background image */
            background-repeat: no-repeat;
            background-position: center;
        }

        h2 {
            text-align: center;
            margin-bottom: 2rem;
            font-size: 2rem;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: white;
            position: relative;
        }

        h2::after {
            content: "";
            display: block;
            width: 60px;
            height: 4px;
            background-color: #667eea; /* Indigo underline */
            margin: 0.5rem auto 0;
            border-radius: 2px;
        }


        .categories {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
            gap: 1.5rem;
            text-align: center;
            display: flex;
            flex-wrap: wrap;
            gap: 1rem;
            justify-content: center;
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
            width: 300px;
            text-align: center;
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
        <img src="${pageContext.request.contextPath}/Pictures/photographer.jpg" alt="Photographer">
        <h4>Photographers</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Catering'">
        <img src="${pageContext.request.contextPath}/Pictures/Catering.jpg" alt="Catering">
        <h4>Caterers</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Decorators'">
        <img src="${pageContext.request.contextPath}/Pictures/decorations.jpg" alt="Decorators">
        <h4>Decorators</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Wedding Planners'">
        <img src="${pageContext.request.contextPath}/Pictures/planner.jpg" alt="Wedding Planner">
        <h4>Wedding Planner</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Music/Entertainment'">
        <img src="${pageContext.request.contextPath}/Pictures/musicWed.jpg" alt="Music/Entertainment">
        <h4>Music/Entertainment</h4>
    </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Makeup Artists and Hair Stylists'">
        <img src="${pageContext.request.contextPath}/Pictures/makeup.jpg" alt="Makeup Artist and Hair Stylist">
        <h4>Makeup Artist and Hair Stylist</h4>
    </div>

    <div class="categories">
        <div class="category-card" onclick="location.href='vendorCategoryList?category=DressProvider'">
            <img src="${pageContext.request.contextPath}/Pictures/dress.jpg" alt="Dress Provider">
            <h4>Dress Providers</h4>
        </div>

        <div class="category-card" onclick="location.href='vendorCategoryList?category=SuitProvider'">
            <img src="${pageContext.request.contextPath}/Pictures/suit.jpg" alt="Suit Provider">
            <h4>Suit Providers</h4>
        </div>

    <div class="category-card" onclick="location.href='vendorCategoryList?category=Florists'">
        <img src="${pageContext.request.contextPath}/Pictures/florist.jpg" alt="Florists">
        <h4>Florists</h4>
    </div>

</div>

</body>
</html>
