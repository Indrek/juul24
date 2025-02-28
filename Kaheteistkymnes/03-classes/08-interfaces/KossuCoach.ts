import { Coach } from "./Coach";

export class KossuCoach implements Coach {
    getDailyWorkout(): string {
        return "Harjuta vabaviskeid";
    }

}