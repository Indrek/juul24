"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const JalkaCoach_1 = require("./JalkaCoach");
const KossuCoach_1 = require("./KossuCoach");
let myJalkaCoach = new JalkaCoach_1.JalkaCoach();
let myKossuCoach = new KossuCoach_1.KossuCoach();
//array Coachide jaoks
let theCoaches = [];
//lisame coachid
theCoaches.push(myJalkaCoach);
theCoaches.push(myKossuCoach);
for (let tempCoach of theCoaches) {
    console.log(tempCoach.getDailyWorkout());
}
