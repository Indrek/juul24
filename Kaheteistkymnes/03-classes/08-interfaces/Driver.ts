import { Coach } from "./Coach";
import { JalkaCoach } from "./JalkaCoach";
import { KossuCoach } from "./KossuCoach";

let myJalkaCoach = new JalkaCoach();
let myKossuCoach = new KossuCoach();

//array Coachide jaoks
let theCoaches: Coach[] = [];

//lisame coachid
theCoaches.push(myJalkaCoach);
theCoaches.push(myKossuCoach);

for(let tempCoach of theCoaches) {
    console.log(tempCoach.getDailyWorkout());
}