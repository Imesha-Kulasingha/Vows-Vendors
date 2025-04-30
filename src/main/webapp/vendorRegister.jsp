<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vendor Management</title>
    <link rel="stylesheet" type="text/css" href="css/vendorRegister.css">

</head>
<body>

<h1 style="text-align: center;">Vendor Management System</h1>

<form action = "addVendor" method="post">

    <fieldset>
        <legend>Vendor Information</legend>
        <label for="vendorNIC">Vendor NIC: </label>
        <input type="text" id="vendorNIC" name="vendorNIC"><br>

        <label for="vendorName">Vendor Name:</label>
        <input type="text" id="vendorName" name="vendorName"><br>

        <label for="vemail">Vendor Email:</label>
        <input type="text" id="vemail" name="vemail"><br>

        <label for="vpassword">Password: </label>
        <input type="text" id="vpassword" name="vpassword"><br>

        <label for="contactPerson">Contact Person:</label>
        <input type="text" id="contactPerson" name="contactPerson"><br>

        <label for="contactNumber">Contact Number:</label>
        <input type="tel" id="contactNumber" name="contactNumber"><br>

    </fieldset>

    <fieldset>
        <legend>Business Details</legend>

        <label for="businessName">Business Name:</label>
        <input type="text" id="businessName" name="businessName"><br>

        <label for="address">Business Address:</label>
        <input type="text" id="address" name="bizAddress"><br>

        <p>Choose your business category:</p>
        <input type="radio" id="WeddingPlanner" name="vendorType" value="Wedding Planner">
        <label for="WeddingPlanner">Wedding Planner</label><br>

        <input type="radio" id="Venue" name="vendorType" value="Venue">
        <label for="Venue">Venue</label><br>

        <input type="radio" id="Catering" name="vendorType" value="Catering">
        <label for="Catering">Catering</label><br>

        <input type="radio" id="MusicEntertainment" name="vendorType" value="Music/Entertainment">
        <label for="MusicEntertainment">Music/Entertainment</label><br>

        <input type="radio" id="MakeupArtist" name="vendorType" value="Makeup Artist and Hair Stylist">
        <label for="MakeupArtist">Makeup Artist and Hair Stylist</label><br>

        <input type="radio" id="DressSuitProvider" name="vendorType" value="Dress and Suit Provider">
        <label for="DressSuitProvider">Dress and Suit Provider</label><br>

        <input type="radio" id="Photography" name="vendorType" value="Photography">
        <label for="Photography">Photography</label><br>

        <input type="radio" id="Florists" name="vendorType" value="Florists">
        <label for="Florists">Florists</label><br>

        <label for="license">Business License Number:</label>
        <input type="text" id="license" name="license"><br>

        <label for="socialMedia">Social Media Links:</label><br>
        <textarea id="socialMedia" name="socialMedia" rows="5" cols="40" placeholder="Enter your social media links"></textarea><br>

    </fieldset>

    <fieldset>
        <legend>Services</legend>
        <label for="serviceDescription">Description of Services Offered:</label><br>
        <textarea id="serviceDescription" name="serviceDescription" rows="5" cols="40" placeholder="Enter a detailed description about your services"></textarea><br>

        <label for="priceRange">Price Range:</label>
        <select name="priceRange" id="priceRange">
            <option value="below10k">10,000 or below</option>
            <option value="10">10000</option>
        </select><br>

        <label for="availabilityDays">Availability (Dates and Times):</label><br>
        <input type="checkbox" id="availabilityDays" name="monday" value="monday">
        <label for="availabilityDays">Monday</label><br>

        <label for="from">From:</label>
        <input type="number" id ="from"name="from" min="1" max="12">
        <select name="fromTime">
            <option value="am">AM</option>
            <option value="pm">PM</option>
        </select>

        <label for="to">To:</label>
        <input type="number" id ="to" name="to" min="1" max="12">
        <select name="toTime">
            <option value="am">AM</option>
            <option value="pm">PM</option>
        </select><br>

        <label for="serviceArea">Service Area:</label>
        <select name="serviceArea" id="serviceArea">
            <option value="colombo">Colombo District</option>
            <option value="kandy">Kandy District</option>
        </select><br>

        <label for="specialPackages">Special Packages or Discounts:</label><br>
        <textarea id="specialPackages" name="specialPackages" rows="5" cols="40" placeholder="Enter offer details"></textarea><br>
    </fieldset>

    <fieldset>
        <legend>Portfolio</legend>
        <label for="portfolio">Choose file to upload:</label>
        <input type="file" id="portfolio" name="portfolio"><br>

        <label for="TnC">Terms and Conditions Agreement:</label>
        <input type="file" id="TnC" name="TnC"><br>
    </fieldset>

    <fieldset>
        <legend>Additional Information</legend>
        <label for="specialReq">Special Requirements or Requests:</label><br>
        <textarea id="specialReq" name="specialReq" rows="5" cols="30" placeholder="Any requests from clients?"></textarea>
    </fieldset>

    <center><button type="submit">Submit the form</button></center>
</form>

</body>
</html>
