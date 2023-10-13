changeColor = function () {
  const backgroundColor = document.querySelector("body");
  var randomColor = "#" + Math.round(Math.random() * 0xffffff).toString(16);
  backgroundColor.style.backgroundColor = randomColor;
  const colorText = document.querySelector(".color");
  colorText.textContent = randomColor;
};
