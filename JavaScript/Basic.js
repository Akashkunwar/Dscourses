// Assigning variable
console.log('\nAssigning variable : ')
var a = -1; 
console.log(a);

let aa = 23
console.log(a)

// Manupulating variable
console.log('\nManupulating variable : ')
b = 12
a = b
console.log(a);

// Can't reasign const
console.log('\nCan\'t reasign const : ')

const c = 2
console.log(c);
// can't do c = 4

// // Types of variable
console.log('\nTypes of variable : ')
console.log('Number variable : ')

// Number variable
var a = 34
console.log(a);

console.log('\nBolliean variable : ')
// Bolliean variable
var a = true
console.log(a);

console.log('\nStrings : ')
// Strings
var a = 'world';
var b = `Hello ${a}`
console.log(b);

// Functions
console.log('\nFunctions : ')
function getnumber() {
    return 4;
}
console.log(getnumber());

function sumone(input) {
    return input+1
}
console.log(sumone(3))

sumonef = sumone(4)
console.log(sumonef)

// Operators
console.log("\nOperators : ")

// = Assgnment operators like shown above
// + Addition operators as used in funcitons
// * Product operators used to multiply like
// / Diviton operators gives division like other operators

function mulop(a,b) {
    return a*b
}
console.log("Multiplication operator example in funciton : ",mulop(3,5))

// Example
// Find average of 4 values
function averag(a,b,c,d) {
    return (a+b+c+d)/4
}
console.log("This is example of average operator : ", averag(45,46,34,65))

// Importing functios
// Math module (We don't need to import math module because it is pre installed)
// Getting random values
console.log("Give random numebr from inbuilt function : ",Math.random())
// Getting floor value of any number 
console.log("Give random numebr from inbuilt function : ",Math.floor(32.234))
