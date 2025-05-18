<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vendor Management</title>
    <link rel="stylesheet" type="text/css" href="css/vendorRegister.css">

</head>
<body>

<h1 style="text-align: center;">Vendor Registration</h1>

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

        <input type="radio" id="DressProvider" name="vendorType" value="DressProvider">
        <label for="DressProvider">Dress Providers</label><br>

        <input type="radio" id="SuitProvider" name="vendorType" value="SuitProvider">
        <label for="SuitProvider">Suit Providers</label><br>

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
            <option value="10000">10 000 or below</option>
            <option value="20000">10 000 - 20 000</option>
            <option value="30000">20 000 - 30 000</option>
            <option value="40000">30 000 - 40 000</option>
            <option value="50000">40 000 - 50 000</option>
            <option value="60000">50 000 - 60 000</option>
            <option value="70000">60 000 - 70 000</option>
            <option value="80000">70 000 - 80 000</option>
            <option value="90000">80 000 - 90 000</option>
            <option value="100000">90 000 - 100 000</option>
            <option value="200000">100 000 - 200 000</option>
            <option value="300000">200 000 - 300 000</option>
            <option value="400000">300 000 - 400 000</option>
            <option value="500000">400 000 - 500 000</option>
            <option value="above500000">Above 500 000</option>
        </select><br>

        <fieldset>
            <legend>Available Days</legend>

        <input type="checkbox" id="monday" name="availabilityDays" value="Monday">
        <label for="monday">Monday</label><br>

        <input type="checkbox" id="tuesday" name="availabilityDays" value="Tuesday">
        <label for="tuesday">Tuesday</label><br>

        <input type="checkbox" id="wednesday" name="availabilityDays" value="Wednesday">
        <label for="wednesday">Wednesday</label><br>

        <input type="checkbox" id="thursday" name="availabilityDays" value="Thursday">
        <label for="thursday">Thursday</label><br>

        <input type="checkbox" id="friday" name="availabilityDays" value="Friday">
        <label for="friday">Friday</label><br>

        <input type="checkbox" id="saturday" name="availabilityDays" value="Saturday">
        <label for="saturday">Saturday (Weekend)</label><br>

        <input type="checkbox" id="sunday" name="availabilityDays" value="Sunday">
        <label for="sunday">Sunday (Weekend)</label><br>

        </fieldset>


        <div class="time-container">
            <div class="time">
                <label for="from">From:</label>
                <input type="number" id="from" name="from" min="1" max="12" />
                <select name="fromTime" id="fromTime" style="font-size: 10px; padding: 2px 4px; width: 60px; box-sizing: border-box;" >
                    <option value="am">AM</option>
                    <option value="pm">PM</option>
                </select>
            </div>

            <div class="time">
                <label for="to">To:</label>
                <input type="number" id="to" name="to" min="1" max="12" />
                <select name="toTime" id="toTime" style="font-size: 10px; padding: 2px 4px; width: 60px; box-sizing: border-box;">
                    <option value="am">AM</option>
                    <option value="pm">PM</option>
                </select>
            </div>
        </div>




        <label for="serviceArea">Service Area:</label>
        <select name="serviceArea" id="serviceArea">
            <option value="ampara">Ampara District</option>
            <option value="anuradhapura">Anuradhapura District</option>
            <option value="badulla">Badulla District</option>
            <option value="batticaloa">Batticaloa District</option>
            <option value="colombo">Colombo District</option>
            <option value="galle">Galle District</option>
            <option value="gampaha">Gampaha District</option>
            <option value="hambantota">Hambantota District</option>
            <option value="jaffna">Jaffna District</option>
            <option value="kalutara">Kalutara District</option>
            <option value="kandy">Kandy District</option>
            <option value="kegalle">Kegalle District</option>
            <option value="kilinochchi">Kilinochchi District</option>
            <option value="kurunegala">Kurunegala District</option>
            <option value="mannar">Mannar District</option>
            <option value="matale">Matale District</option>
            <option value="matara">Matara District</option>
            <option value="monaragala">Monaragala District</option>
            <option value="mullaitivu">Mullaitivu District</option>
            <option value="nuwaraeliya">Nuwara Eliya District</option>
            <option value="polonnaruwa">Polonnaruwa District</option>
            <option value="puttalam">Puttalam District</option>
            <option value="ratnapura">Ratnapura District</option>
            <option value="trincomalee">Trincomalee District</option>
            <option value="vavuniya">Vavuniya District</option>
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
