// #todo-input 태그 불러옴
const todoInput = document.querySelector("#todo-input");
// #todo-list 태그(ul) 불러옴
const todoList = document.querySelector("#todo-list");

// localStorage.getItem("saved-items")가 JSON문자열 형태로 값을 받아옴 그걸 자바스크립트 객체로 변환하기 위한 메서드
const savedTodoList = JSON.parse(localStorage.getItem("saved-items"));
// console.log(savedTodoList);
// console.log(localStorage.getItem("saved-items"));

const savedWeatherData = JSON.parse(localStorage.getItem("saved-weather"));

const createTodo = function (storageData) {
  // 일반 추가 버튼
  let todoContents = todoInput.value.trim();

  // 저장된 데이터 불러올때
  if (storageData) {
    todoContents = storageData.contents;
  }

  // li태그 생성
  const newLi = document.createElement("li");
  // span태그 생성
  const newSpan = document.createElement("span");
  // button태그 생성
  const newBtn = document.createElement("button");

  // 새로운 버튼을 누르면 ('click' 감지)
  newBtn.addEventListener("click", () => {
    // 새로운 li태그에 complete클래스 추가(토글로)
    newLi.classList.toggle("complete");
    saveItemsFn();
  });

  newLi.addEventListener("dblclick", () => {
    newLi.remove();
    saveItemsFn();
  });

  if (storageData?.complete) {
    newLi.classList.add("complete");
  }

  // 새로운 span태그의 값에 todoInput의 값을 할당
  newSpan.textContent = todoContents;

  // 새로운 Li태그에 자식으로 newBtn 추가
  newLi.appendChild(newBtn);

  // 새로운 Li태그에 자식으로 newSpan 추가
  newLi.appendChild(newSpan);

  // todoList(ul태그)에 자식으로 newLi(li태그)추가
  todoList.appendChild(newLi);

  // todoInput(입력창)값 지움
  todoInput.value = "";
  saveItemsFn();
};

const keyCodeCheck = function () {
  if (window.event.keyCode === 13 && todoInput.value.trim() !== "") {
    createTodo();
  }
};

const deleteAll = function () {
  const liList = document.querySelectorAll("li");
  for (let i = 0; i < liList.length; i++) {
    liList[i].remove();
  }
  saveItemsFn();
};

const saveItemsFn = function () {
  const saveItems = [];
  for (let i = 0; i < todoList.children.length; i++) {
    const todoObj = {
      contents: todoList.children[i].querySelector("span").textContent,
      complete: todoList.children[i].classList.contains("complete"),
    };
    saveItems.push(todoObj);
  }

  saveItems.length === 0
    ? localStorage.removeItem("saved-items")
    : localStorage.setItem("saved-items", JSON.stringify(saveItems));
};

if (savedTodoList) {
  for (let i = 0; i < savedTodoList.length; i++) {
    createTodo(savedTodoList[i]);
  }
}

const weatherDataActive = function ({ location, weather }) {
  const weatherMainList = [
    "Clear",
    "Clouds",
    "Drizzle",
    "Rain",
    "Snow",
    "Thunderstorm",
  ];
  weather = weatherMainList.includes(weather) ? weather : "Fog";

  const locationNameTag = document.querySelector("#location-name-tag");
  locationNameTag.textContent = location;
  console.log(weather);
  document.body.style.backgroundImage = `url(./images/${weather}.jpg)`;

  if (
    !savedWeatherData ||
    savedWeatherData.location !== location ||
    savedWeatherData.weather !== weather
  ) {
    localStorage.setItem(
      "saved-weather",
      JSON.stringify({ location, weather })
    );
  }
};

const weatherSearch = function ({ latitude, longitude }) {
  const APIKEY = "ad84b46458e45294994e3c9f1ac9ce6c";
  const openWeatherRes = fetch(
    `https://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&appid=${APIKEY}`
  )
    .then((res) => {
      return res.json();
    })
    .then((json) => {
      console.log(json.name, json.weather[0].main);

      const weatherData = {
        location: json.name,
        weather: json.weather[0].main,
      };

      weatherDataActive(weatherData);
    })
    .catch((err) => {
      console.log(err);
    });

  // console.log(openWeatherRes);
};

const accessToGeo = function ({ coords }) {
  const { latitude, longitude } = coords;

  // shorthand property 키와 벨류의 이름이 같을 때
  const positionObj = {
    latitude,
    longitude,
  };
  weatherSearch(positionObj);
};

const askForLocation = function () {
  navigator.geolocation.getCurrentPosition(accessToGeo, (err) => {
    console.log(err);
  });
};

askForLocation();

const promiseTest = function () {
  return new Promise((resolver, reject) => {
    setTimeout(() => {
      resolver("안녕");
      // reject("error");
    }, 2000);
  });
};

if (savedWeatherData) {
  weatherDataActive(savedWeatherData);
}

// console.log(promiseTest());

// promiseTest().then((res) => {
//   console.log(res);
//   console.log(promiseTest());
// });
