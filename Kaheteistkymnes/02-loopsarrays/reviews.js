var reviews = [5, 5, 4, 3, 2];
var summa = reviews.length;
var arvudLiidetud = 0;
for (var _i = 0, reviews_1 = reviews; _i < reviews_1.length; _i++) {
    var tempReview = reviews_1[_i];
    arvudLiidetud += tempReview;
}
var keskmine;
keskmine = arvudLiidetud / summa;
console.log(keskmine);
