let reviews: number[] = [5,5,4,3,2];

let summa: number = reviews.length;
let arvudLiidetud: number = 0;
for(let tempReview of reviews) {
    arvudLiidetud += tempReview;

}
let keskmine: number;
keskmine = arvudLiidetud/summa;
console.log(keskmine);
