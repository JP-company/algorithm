clickReset = function () {
  document.querySelector(".count").textContent = 0;
  document.querySelector(".count").style.color = "#008000";
};

clickButton = function (type) {
  let countNumber = document.querySelector(".count");
  type
    ? (document.querySelector(".count").textContent =
        Number(countNumber.textContent) + 1)
    : (document.querySelector(".count").textContent =
        countNumber.textContent - 1);

  countNumber.textContent < 0
    ? (countNumber.style.color = "#FF0000")
    : (countNumber.style.color = "#008000");
};
