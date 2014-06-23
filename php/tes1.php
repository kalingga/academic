<?php
//error_reporting(1);


function draw($n){
	for ($i=0;$i<$n;$i++){
		for ($j=0;$j<$i;$j++){
			echo "*";
			}
		echo "<br>";
	}
	for ($i=1;$i<$n;$i++){
		for ($j=$n-($i*$i);$j>$i;$j--){
			echo "*";
			}
		echo "<br>";
	}

}

$n = $_POST['angka'];
?>

<form enctype="multipart/form-data" action="" method="POST">
<input name="angka" type="text" />
<input type="submit" value="Hajar" />
 </form> 

<?php  draw($n); ?>
