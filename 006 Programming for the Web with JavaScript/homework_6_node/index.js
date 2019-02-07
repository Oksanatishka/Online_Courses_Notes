// Step 1. In the 1st terminal tab: node index.js
// Step 2. In the 2nd terminal tab: mongod --dbpath /Users/serhii/Downloads/myDatabase
// Step 3. In the 3rd terminal tab: mongo --> show dbs --> use myDatabase1 --> show collections --> db.toys.find()
// Step 4: if nothing works restart node by stopping it and starting again (see Step 1).
// Step 5: Check requests:
//          /findToy?age=1234
//          /findAnimals?species=Dog&trait=loyal&gender=female
//          /animalsYoungerThan?age=12
//          /calculatePrice?id[0]=123&qty[0]=2&id[1]=456&qty[1]=3

var express = require('express');
var app = express();

var Animal = require('./Animal.js');
var Toy = require('./Toy.js');

// app.use('/', (req, res) => {
//     res.json({ msg: 'It works!' });
// });

app.use('/findToy', (req, res) => {
    var searchID = req.query.id;
    // console.log(typeof searchID);
    Toy.findOne({ id: searchID }, (err, toy) => {
        if (err) {
            res.type('html').status(500);
            res.send('Error: ' + err);
        } else if (!toy) {
            res.type('html').status(200);
            res.send('No toys named ' + searchID);
        } else {
            res.type('json').status(200);
            res.send(toy);
        }
    });
});

app.use('/findAnimals', (req, res) => {
    var searchSpecies = req.query.species;
    var searchGender = req.query.gender;
    var searchTrait = req.query.trait;
    console.log(typeof searchID);

    if (!searchSpecies && !searchGender && !searchTrait) {
        res.type('json').status(200);
        res.send({});
    }

    var query = {};
    if (searchSpecies) query.species = searchSpecies;
    if (searchGender) query.gender = searchGender;
    if (searchTrait) query.traits = { $in: [searchTrait] };
    console.log(query);

    Animal.find(query, (err, animals) => {
        if (err) {
            res.type('html').status(500);
            res.send('Error: ' + err);
        } else if (!animals) {
            res.type('json').status(200);
            res.send({});
        } else {
            res.type('json').status(200);
            res.send(animals);
        }
    });
});

app.use('/animalsYoungerThan', (req, res) => {
    var searchAge = req.query.age;

    Animal.find({ age: { $lt: searchAge } }, (err, animals) => {
        if (err) {
            res.type('html').status(500);
            res.send('Error: ' + err);
        } else if (!animals) {
            res.type('html').status(200);
            res.send('No animals aged ' + searchAge);
        } else {
            res.type('json').status(200);
            res.send({ count: animals.length, names: animals.map(animal => animal.name) });
        }
    });
});

app.use('/calculatePrice', (req, res) => {
    console.log(req.query);

    Toy.find({ id: { $in: req.query.id } }, (err, toys) => {
        if (err) {
            res.type('html').status(500);
            res.send('Error: ' + err);
        } else if (!toys) {
            res.type('html').status(200);
            res.send('No toys ' + searchId);
        } else {
            res.type('json').status(200);
            var items = toys.map((toy, index) => {
                // console.log(req.query.qty[index]);
                var toyIdIndex = req.query.id.indexOf(toy.id);

                return {
                    item: toy.id,
                    qty: req.query.qty[toyIdIndex],
                    subtotal: Number(req.query.qty[toyIdIndex]) * Number(toy.price)
                };
            });
            items = items.filter(toy => !isNaN(toy.qty));

            // console.log(req.query.qty);

            res.send({
                items: items,
                totalPrice: items.reduce((curr, prev) => {
                    return curr + prev.subtotal;
                }, 0)
            });
        }
    });
});

app.listen(3000, () => {
    console.log('Listening on port 3000');
});

// Please do not delete the following line; we need it for testing!
module.exports = app;
