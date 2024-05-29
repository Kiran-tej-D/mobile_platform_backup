const bodyParser = require('body-parser');
const express = require('express');
const { todos, users } = require('./db/user');
const app = express()
const PORT = process.env.PORT || 3000;

//Middlewares
app.use(bodyParser.json())
app.use(bodyParser.urlencoded({extended: true}))

// TODO ENDPOINTS
// app.post('/create', async (req, res) => {
//     const todoBody = req.body;

//     const todo = await todos.create({
//         name: todoBody.name,
//         email: todoBody.email,
//         pass: todoBody.pass,
//     });

//     todo ? res.status(201).json({msg: "Success", data: todo}) : res.status(500).json({msg: "Error", data: todo})
// })
// USERS ENDPOINTS

//
app.post('/user/register', async (req, res) => {
    const user = req.body;
    const newUser = await users.create(user);

    newUser ? res.status(201).json({msg: "Successfully Register", data: newUser}) 
            : res.status(500).json({msg: "Error", data: newUser})
})

// User LOGIN...
app.post("/login", (req, res) => {
    const body = req.body;
    const username = body.email;
    const pass = body.pass;

    if(username === "aryan" && pass === 123)
        res.json({
            data: "success",
        })
    else 
        res.end("Incorrect creds")
})


app.delete('/delete/:id', async (req, res) => {
    const todoId = req.params.id;
    const deletedTodo = await todos.deleteOne({_id: todoId})

    deletedTodo ? res.status(200).json({msg: "Success", data: deletedTodo}) 
                : res.status(500).json({msg: "Error", data: deletedTodo}) 
})

app.put('/update/:id', async (req, res) => {
    const todoId = req.params.id;
    const updatedTodo = req.body;

    //                                         id            newtodo
    const todo = await todos.findOneAndUpdate({_id: todoId}, updatedTodo);

    todo ?  res.status(200).json({msg: "Success", data: todo}) 
                : res.status(500).json({msg: "Error", data: todo}) 
})

app.put('/enable/:id', async (req, res) => {
    const todoId = req.params.id;
    const todo = await todos.findOneAndUpdate({_id: todoId}, {active: true});

    todo ? res.status(200).json({msg: "Success", data: todo}) 
                : res.status(500).json({msg: "Error", data: todo}) 
})

app.put('/disable/:id', async (req, res) => {
    const todoId = req.params.id;
    const todo = await todos.findOneAndUpdate({_id: todoId}, {active: false});

    todo ? res.status(200).json({msg: "Success", data: todo}) 
                : res.status(500).json({msg: "Error", data: todo}) 
})



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

// app.get('/count', async (req, res) =>{
//     res.json({count: await user.countDocuments()})
// })

app.listen(PORT, () => console.log(`Application listening on port ${PORT}!`))


//working API link ( https://nodejs-kzcp.onrender.com ) 