function jipo() {
  feather.replace();

  const lcd = document.getElementById("lcd-hasil");

  const input = document.querySelectorAll("button");
  input.forEach((button) => {
    button.addEventListener("click", () => {
      if (
        lcd.innerHTML === "0" ||
        lcd.innerHTML === "GKJLS :/" ||
        lcd.innerHTML === "JIPO"
      ) {
        lcd.innerHTML = "";
      }
      if (button.id === "hapus") {
        lcd.innerHTML = lcd.innerHTML.slice(0, -1);
      } else if (button.id === "hasil") {
        try {
          if (!lcd.innerHTML) {
            lcd.innerHTML = "0";
          } else {
            lcd.innerHTML = eval(lcd.innerHTML);
          }
        } catch (e) {
          lcd.innerHTML = "GKJLS :/";
        }
      } else if (button.id === "clear") {
        lcd.innerHTML = "0";
      } else {
        lcd.innerHTML += button.value;
      }
    });
  });
}
