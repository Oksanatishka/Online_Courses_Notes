var waitingRoom = ['Jordan', 'Samuel', 'Jack', 'Claudia', 'Andre', 'Paul'];
//waitingRoom.length gives us the number of elements in the waitingRoom Array!
function howManyPatients() {
    document.getElementById('numberOfPatients').innerHTML = waitingRoom.length;
}
//The .push() function adds an element to the end of an array
function addPatient() {
    waitingRoom.push(document.getElementById('myPatient').value);
    printWaitingRoom();
}
//The .shift() function removes the first element of an array and decreases the index of all other elements by 1
function nextPatient() {
    var currentPatient = waitingRoom.shift();
    document.getElementById('currentPatient').innerHTML =
        'The current patient is: ' + currentPatient;
    printWaitingRoom();
}
//The printWaitingRoom() function displays the remaining patients in the waiting room
function printWaitingRoom() {
    document.getElementById('waitingRoom').innerHTML =
        ' patients in the waiting room: ' + waitingRoom;
    howManyPatients();
}
