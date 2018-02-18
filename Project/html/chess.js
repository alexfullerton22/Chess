function move(from, to) {
	var f = document.getElementById(from).classList
	document.getElementById(to).classList = f
	document.getElementById(from).classList = ""
}