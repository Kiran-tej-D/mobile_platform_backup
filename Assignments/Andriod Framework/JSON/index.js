const express = require('express')
const app = express()
const bodyParser = require("body-parser")

app.use(bodyParser.json())

//GET request

//http://localhost:8000/
app.get("/", (req, res) =>{
    res.end("Hello Kiran")
})

//http://localhost:8000/about
app.get("/about", (req, res) =>{
    res.end("He completed his degree in 2022 with 8 CPGA")
})

//http://localhost:8000/about
app.get("/name/:myname", (req, res) =>{
    res.end("Hi " + req.params.myname)
})

//POST request

app.post("/login", (req, res) => {
    const body = req.body;
    const username = body.username;
    const pass = body.pass;

    if(username === "Kiran" && pass === 123){
        res.end("Logged in successfully....!!")
    }else{
        res.end("Logged in failed")
    }
})

//http://localhost:8000
app.listen(8000, () => console.log("Application started"))

