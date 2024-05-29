require('dotenv').config();
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const express = require('express');

const app = express()
const PORT = process.env.PORT || 3000;

//Body parser Middlewares
app.use(bodyParser.json())
app.use(bodyParser.urlencoded({ extended: false }))

//MONGOdb CONNECTION
const MONGO_URI = process.env.MONGO_URI;
mongoose.connect(MONGO_URI, {useNewUrlParser: true, useUnifiedTopology: true})
    .then(() => console.log('MongoDB Connected Successfully...!!!'))
    .catch(err => console.error('not connected', err));

//VEHICLE DB FILE
const Vehicle = require('./db/registerSchema');

// VEHICLE ENDPOINTS ROUTE
app.post('/register', async (req,res) =>{
    const {name, vehicleType, chassisNumber, registerNumber, vehicleModel, email, password} = req.body;
    try{
        const newVehicle = new Vehicle({name, vehicleType, chassisNumber, registerNumber, vehicleModel, email, password});
        const vehicle = await newVehicle.save();
        res.json(vehicle)
    } catch (err) {
        console.error(err.message);
        res.status(500).send('Server error connect again');
    }
});

//for execute purpose
app.get("/", (req, res) => {
    res.end("Hello world")
})

app.get("/about", (req, res) => {
    res.end("welcome to about page")
})

// http://localhost:8080/name/aaryan
app.get("/name/:myname", (req, res) => {
    res.end("welcome " + req.params.myname)
})

app.listen(PORT, () => console.log(`Application listening on port ${PORT}!`))


//working API link ( https://nodejs-kzcp.onrender.com ) 
