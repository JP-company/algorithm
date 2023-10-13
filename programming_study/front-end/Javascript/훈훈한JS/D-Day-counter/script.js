const messageContainer = document.querySelector("#d-day-message");
const container = document.querySelector("#d-day-container");
const saveDate = localStorage.getItem("saved-date");
const intervalIdArr = [];

// 입력칸에 입력된 년, 월, 일을 반환
const dateFormMaker = function () {
  // 각 년, 월, 일 입력칸의 값을 불러옴
  const inputYear = document.querySelector("#target-year-input").value;
  const inputMonth = document.querySelector("#target-month-input").value;
  const inputDate = document.querySelector("#target-date-input").value;

  //
  // const dateFormat = inputYear + '-' + inputMonth + '-' + inputDate;
  const dateFormat = `${inputYear}-${inputMonth}-${inputDate}`;

  // console.log(inputYear, inputMonth, inputDate);
  return dateFormat;
};

const counterMaker = function (data) {
  if (data !== saveDate) {
    localStorage.setItem("saved-date", data);
  }
  const nowDate = new Date();
  const targetDate = new Date(data).setHours(0, 0, 0, 0); // 시간 단위: ms
  const remaining = (targetDate - nowDate) / 1000;
  // 만약 remaining이 0이라면 타이머가 종료되었습니다. 출력
  if (remaining <= 0) {
    container.style.display = "none";
    messageContainer.innerHTML = "<h3>타이머가 종료되었습니다.</h3>";
    messageContainer.style.display = "flex";
    setClearInterval();
    return;
  } else if (isNaN(remaining)) {
    container.style.display = "none";
    messageContainer.innerHTML = "<h3>유효한 시간대가 아닙니다.</h3>";
    messageContainer.style.display = "flex";
    setClearInterval();
    return;
  }

  const remainingObj = {
    remainingDate: Math.floor(remaining / 3600 / 24),
    remainingHours: Math.floor(remaining / 3600) % 24,
    remainingMin: Math.floor(remaining / 60) % 60,
    remainingSec: Math.floor(remaining) % 60,
  };

  const documentArr = ["days", "hours", "min", "sec"];
  const timeKeys = Object.keys(remainingObj);

  const format = function (time) {
    if (time < 10) {
      return "0" + time;
    }
    return time;
  };

  let i = 0;
  for (let tag of documentArr) {
    const remainingTime = format(remainingObj[timeKeys[i]]);
    document.getElementById(tag).textContent = remainingTime;
    i++;
  }
};

const starter = function (targetDateInput) {
  // 매개변수 targetDateInput가 null 없으면 dateFormMaker()을 할당
  // 처음 버튼 눌렸으면 바로 실행
  // 입력칸에 입력된 년, 월, 일을 반환해서 할당
  if (!targetDateInput) {
    targetDateInput = dateFormMaker();
  }

  container.style.display = "flex";
  messageContainer.style.display = "none";
  setClearInterval();
  counterMaker(targetDateInput);
  const intervalId = setInterval(() => counterMaker(targetDateInput), 1000);
  console.log(intervalId);
  intervalIdArr.push(intervalId);
  localStorage.setItem("intervalIdArr", intervalIdArr);
};

const setClearInterval = function () {
  for (let i = 0; i < intervalIdArr.length; i++) {
    clearInterval(intervalIdArr[i]);
  }
};

const resetTimer = function () {
  container.style.display = "none";
  messageContainer.style.display = "flex";
  messageContainer.innerHTML = "<h2>D-day를 입력해 주세요.</h2>";
  localStorage.removeItem("saved-date");
  setClearInterval();
};

// 처음 열렸을때?
if (saveDate) {
  starter(saveDate);
} else {
  container.style.display = "none";
  messageContainer.innerHTML = "<h2>D-day를 입력해 주세요.</h2>";
}
