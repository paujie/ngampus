function kirim() {
  var nama = document.getElementById("nama").value;
  var nim = document.getElementById("nim").value;
  var nilai = document.getElementById("nilai").value;

  if (nilai >= 80) {
    nilai = "A";
  } else if (nilai >= 70) {
    nilai = "B";
  } else if (nilai >= 60) {
    nilai = "C";
  } else if (nilai >= 50) {
    nilai = "D";
  } else {
    nilai = "E";
  }

  document.write("Nama : " + nama + "<br>");
  document.write("NIM : " + nim + "<br>");
  document.write("Nilai : " + nilai + "<br>");
}
