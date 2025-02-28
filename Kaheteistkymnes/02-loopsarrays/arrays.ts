let sportsOne: string[] = ["Golf", "Jalgpall", "Korvpall", "Tennis"];

/*
for(let i = 0; i<sportsOne.length; i++) {
    console.log(sportsOne[i]);
}
*/

//simplified / enhanced for loop / for each

/*
for(let tempSport of sportsOne) {
    console.log(tempSport);
}
*/

for(let tempSport of sportsOne) {
    if(tempSport == "Jalgpall") {
        console.log(tempSport + " on minu lemmik");
    } else {
        console.log(tempSport);
    }
}