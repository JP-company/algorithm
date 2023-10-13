// var user = {
//   name: "Jaenam",
//   gender: "male",
// };

// var changeName = function (user, newName) {
//   return {
//     name: newName,
//     gender: user.gender,
//   };
// };

// var copyObject = function (target) {
//   var result = {};
//   for (var prop in target) {
//     result[prop] = target[prop];
//     console.log("prop: ", prop);
//   }
//   return result;
// };

// var user2 = copyObject(user);
// user2.name = "jjp";

// console.log(user);
// console.log(user2);

var copyObjectDeep = function (target) {
  var result = {};
  if (typeof target === "object" && target !== null) {
    for (var prop in target) {
      result[prop] = copyObjectDeep(target[prop]);
    }
  } else {
    result = target;
  }
  return result;
};

var obj = {
  a: 1,
  b: {
    c: null,
    d: [1, 2],
  },
};

var obj2 = copyObjectDeep(obj);

obj2.a = 3;
obj2.b.c = 4;
obj.b.d[1] = 3;

console.log(obj);
console.log(obj2);

console.log(typeof null);
