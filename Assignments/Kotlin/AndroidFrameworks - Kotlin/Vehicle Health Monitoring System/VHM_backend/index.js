const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');
const Vehicle = require('./vehicleRegister')
require('dotenv').config();

const app = express();
const PORT = process.env.PORT || 3000;
const DB_NAME = process.env.DB_NAME || vhmSystem;

//Body parser middleware
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

//MongoDB connection
const URL = process.env.URL;
mongoose.connect(URL).then(() => {
    console.log("Connected to MongoDB done..!!");
}).catch(err => {
    console.log("Error in connecting MongoDB...!!", err);
    process.exit();
});

//Register Vehicle
//->   http://localhost:3000/register
app.post('/register', async (req, res) => {
    try {
        const vehicle = new Vehicle(req.body);
        await vehicle.save();
        res.status(201).json(vehicle);
    } catch (err) {
        res.status(400).json({ message: err.message });
    }
});

// Searching ID (chassis number)
//->   http://localhost:3000/id/
app.get('/id/:chassisNumber', async (req, res) => {
    const num = req.params.chassisNumber;
    const fields = 'name vehicleType registerNumber vehicleModel email';
    //                                   where('name').equals(name)
    const display = await Vehicle.findOne({ chassisNumber: num }).select(fields);
    if (!display) {
        res.json({ msg: "Data not found.....!!!" })
    } else {
        res.json({ msg: "successufully name found.....!!!", data: display })
    }
})

//login
//->   http://localhost:3000/login
app.post('/login', async (req, res) => {
    try {
        const { email, password } = req.body;

        // Find user by email
        const user = await Vehicle.findOne({ email });
        if (!user) {
            return res.status(401).json({ message: 'Invalid email or password' });
        }

        // Simple password comparison (not secure, for demonstration only)
        if (user.password === password) {
            // Login successful, send response (without password)
            res.json({ message: 'Login successful', data: { name: user.name, email: user.email } }); // Exclude password from response
        } else {
            return res.status(401).json({ message: 'Invalid email or password' });
        }
    } catch (err) {
        console.error(err);
        res.status(500).json({ message: 'Internal server error' });
    }
});
    



    //for execute purpose
    app.get("/", (req, res) => {
        res.end("Hello world")
    })
    app.get("/about", (req, res) => {
        res.end("welcome to about page")
    })
    app.get("/name/:myname", (req, res) => {
        res.end("welcome " + req.params.myname)
    })

    app.listen(PORT, () => { console.log(`Server is running on port ${PORT}`); });