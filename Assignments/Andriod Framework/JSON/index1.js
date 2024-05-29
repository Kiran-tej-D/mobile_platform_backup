const express = require('express')
const app = express()
const bodyParser = require("body-parser")
app.use(bodyParser.json())

let users = [];

//http://localhost:8000/register
app.post("/register", (req, res) => {
    const { username, email, password } = req.body
    users.push({ username, email, password })
    res.json({ message: "Registered successfully" })
})

app.post("/login", (req, res) => {
    const { username, password } = req.body;
    const user = users.find(user => user.username === username && user.password === password)
    if (user) {
        res.json({ message: "Logged in Successfully......!!!" })
    } else {
        res.end(" Invalid credentials, Logged failed..!!!")
    }
})

app.get("/user/:username", (req, res) => {
    const username = req.params.username;
    const user = users.find(user => user.username === username)
    if (user) {
        res.json({ username: user.username, email: user.email })
    } else {
        res.end("User not found...!!!")
    }
})

//http://localhost:8000/
app.listen(8000, () => console.log("Application started....!!!"))