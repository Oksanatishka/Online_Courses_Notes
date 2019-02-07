/**
 * This function should calculate the total amount of pet food that should be
 * ordered for the upcoming week.
 * @param numAnimals the number of animals in the store
 * @param avgFood the average amount of food (in kilograms) eaten by the animals
 * 				each week
 * @return the total amount of pet food that should be ordered for the upcoming
 * 				 week, or -1 if the numAnimals or avgFood are less than 0 or non-numeric
 */
function calculateFoodOrder(numAnimals, avgFood) {
    // IMPLEMENT THIS FUNCTION!
    if (numAnimals < 0 || isNaN(numAnimals) === true || avgFood < 0 || isNaN(avgFood) === true) {
        return -1;
    }

    var result = Number(numAnimals) * Number(avgFood);
    return result;
}

/**
 * Determines which day of the week had the most nnumber of people visiting the
 * pet store. If more than one day of the week has the same, highest amount of
 * traffic, an array containing the days (in any order) should be returned.
 * (ex. ["Wednesday", "Thursday"]). If the input is null or an empty array, the function
 * should return null.
 * @param week an array of Weekday objects
 * @return a string containing the name of the most popular day of the week if there is only one most popular day, and an array of the strings containing the names of the most popular days if there are more than one that are most popular
 */
function mostPopularDays(week) {
    // [{ name: 'Monday', traffic: 5 }, { name: 'Monday', traffic: 2 }, { name: 'Sunday', traffic: 3}]
    // IMPLEMENT THIS FUNCTION!
    if (week === null || week.length === 0) {
        return null;
    }

    week.sort(function(a, b) {
        if (a.traffic > b.traffic) {
            return -1;
        }
        if (a.traffic < b.traffic) {
            return 1;
        }
        return 0;
    });

    var result = [];
    var maxTraffic;

    week.forEach(function(weekDay) {
        // 5, 4, 3, // 5, 5, 5, 4, 3
        var name = weekDay.name;
        var traffic = weekDay.traffic;

        if (!maxTraffic) {
            maxTraffic = traffic;
            result.push(name);
        } else if (maxTraffic === traffic) {
            result.push(name);
        }
    });

    return result.length === 1 ? result[0] : result;
    // step 1:
    // create result object to store traffic based on weekday name

    // var result = {};

    // step 2:
    // iterate through week array and store weekday name in result with the traffic number

    // week.forEach(function(weekDay) {
    //     var name = weekDay.name;
    //     var traffic = weekDay.traffic;

    //     if (result[name] === false) { // result['Monday']
    //         result[name] = 0; // result['Monday'] = 0;
    //     }

    //     result[name] = result[name] + traffic;
    //     // first iteration: result['Monday'] = 0 + 5 = 5
    //     // second iteration: result['Monday'] = 5 + 2 = 7
    //     // third iteration: result['Sunday'] = 0 + 3 = 3
    //     // at this moment result looks like that: result = { 'Monday': 7, 'Sunday': 3 }
    // })

    // // step 3:
    // // find out biggest traffic in object result.
    // var maxTraffic = 0;
    // var finalResult = [];

    // Object.keys(result).forEach(function(key) {
    //     if (result[key] > maxTraffic) {
    //         maxTraffic = result[key];
    //     }
    // })

    // result['key1'] = 1;
    // result['key1'] = 2;

    // console.log(result); // { key1: 2 }

    // var mon = new Weekday('Monday', 13); // { name: 'Monday', traffic: 13 }
    // var tue = new Weekday('Tuesday', 5);
    // var wed = new Weekday('Wednesday', 4);
    // var thu = new Weekday('Thursday', 2);
    // var fri = new Weekday('Friday', 6);

    // libo return 'Sunday';
    // libo return ['Sunday', 'Monday'];
}

/**
 * Given three arrays of equal length containing information about a list of
 * animals - where names[i], types[i], and breeds[i] all relate to a single
 * animal - return an array of Animal objects constructed from the provided
 * info.
 * @param names the array of animal names
 * @param types the array of animal types (ex. "Dog", "Cat", "Bird")
 * @param breeds the array of animal breeds
 * @return an array of Animal objects containing the animals' information, or an
 *         empty array if the array's lengths are unequal or zero, or if any array is null.
 */
function createAnimalObjects(names, types, breeds) {
    if (!names || !types || !breeds) {
        return [];
    }
    var namesLength = names.length;
    var typesLength = types.length;
    var breedsLength = breeds.length;

    if (namesLength === 0 || typesLength === 0 || breedsLength === 0) {
        return [];
    }

    if (
        namesLength !== typesLength ||
        typesLength !== breedsLength ||
        namesLength !== breedsLength
    ) {
        return [];
    }

    var result = [];

    for (var i = 0; i < namesLength; i++) {
        var animal = new Animal(names[i], types[i], breeds[i]);

        result.push(animal);
    }

    return result;
}

/////////////////////////////////////////////////////////////////
//
//  Do not change any code below here!
//
/////////////////////////////////////////////////////////////////

/**
 * A prototype to create Weekday objects
 */
function Weekday(name, traffic) {
    this.name = name;
    this.traffic = traffic;
}

/**
 * A prototype to create Item objects
 */
function Item(name, barcode, sellingPrice, buyingPrice) {
    this.name = name;
    this.barcode = barcode;
    this.sellingPrice = sellingPrice;
    this.buyingPrice = buyingPrice;
}
/**
 * A prototype to create Animal objects
 */
function Animal(name, type, breed) {
    this.name = name;
    this.type = type;
    this.breed = breed;
}

/**
 * Use this function to test whether you are able to run JavaScript
 * from your browser's console.
 */
function helloworld() {
    return 'hello world!';
}
