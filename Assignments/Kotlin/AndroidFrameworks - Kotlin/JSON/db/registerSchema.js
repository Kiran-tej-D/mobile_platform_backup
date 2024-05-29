const mongoose = require('mongoose');

const registerSchema = new mongoose.Schema({
  
    name: {
        type: String,
        required: true,
    },
    vehicleNumber: {
        type: String,
        required: true,
    },
    chassisNumber: {
        type: String,
        required: true,
    },
    registerNumber: {
        type: String,
        required: true,
    },
    vehicleModel: {
        type: String,
        required: true,
    },
    email: {
        type: String,
        required: true,
    },
    password: {
        type: String,
        required: true,
    },
});

module.exports = registerSchema;