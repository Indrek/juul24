import { Coach } from "./Coach";

export class JalkaCoach implements Coach {
    getDailyWorkout(): string {
        return "Harjuta nurgalööke";
    }
    
}