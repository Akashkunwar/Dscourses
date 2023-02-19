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
console.log("Give random numebr from inbuilt function : ", Math.random())
// Getting floor value of any number 
console.log("Give random numebr from inbuilt function : ", Math.floor(32.234))

// Conditionals
// Equal to ===
// Not equal to !==

console.log('\nConditionals : ')
function same(a,b) {
    if(a===b) {
        console.log("Variable", a, "and", b, "are same")
    }
    else {
        console.log("Variables",a,'and',b, "are not same")
    }
}

same(2,2)
same(2,4)

// Else can be skipptd
console.log('\nElse can be skipped : ')
function notsame(a,b) {
    if(a!==b) {
        return true
    }
    return false
}
console.log(notsame(3,3))
console.log(notsame(3,2))

console.log('\nWhat to eat with multiple conditions using else if')
// Else if for multiple cases
function whateat(a) {
    if(a==='hot'){
        console.log("In",a,"Eat Icecream")
    }
    else if(a==='cold'){
        console.log("In",a,"Drink hot soup")
    }
    else if(a==='rain'){
        console.log("In",a,"tea and snacks")
    }
    else{
        console.log("In",a,"Eat anythink you like")
    }
}
whateat('hot')
whateat('cold')
whateat('rain')
whateat('spring')
