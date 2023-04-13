<?php

// Soal 1
// Looping 1 - 20
// Ganjil & Genap

echo "<h1>Looping 1 - 20</h1>";

for ($i = 1; $i <= 20; $i++) {
    if ($i % 2 == 0) {
        echo $i . " - Genap<br>";
    } else {
        echo $i . " - Ganjil<br>";
    }
}

// Soal 2 
// Tampilkan Isi Array Numeric

echo "<h1>Array</h1>";

$mahasiswa = array(
    array("Nama" => "Fauzi Ramadhani", "NIM" => "2100654", "Jurusan" => "RPL Kopo"),
    array("Nama" => "Farrel Fadilah", "NIM" => "2100", "Jurusan" => "RPL Kopo"),
    array("Nama" => "Salman Rachmawan", "NIM" => "2100", "Jurusan" => "RPL Kopo"),
    array("Nama" => "Fakhra Aufia", "NIM" => "2100", "Jurusan" => "RPL Kopo")
);

$i = 1;

foreach ($mahasiswa as $mhs) {

    echo
        "<b>Mahasiswa Geng Kopo [" . $i . "] </b> <br>",
        "<b>Nama</b>: " . $mhs["Nama"] . "<br>",
        "<b>NIM</b>: " . $mhs["NIM"] . "<br>",
        "<b>Jurusan</b>: " . $mhs["Jurusan"] . "<br><br>";

    $i++;
}

?>