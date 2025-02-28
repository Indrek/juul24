var sportsOne = ["Golf", "Jalgpall", "Korvpall", "Tennis"];
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
for (var _i = 0, sportsOne_1 = sportsOne; _i < sportsOne_1.length; _i++) {
    var tempSport = sportsOne_1[_i];
    if (tempSport == "Jalgpall") {
        console.log(tempSport + " on minu lemmik");
    }
    else {
        console.log(tempSport);
    }
}
