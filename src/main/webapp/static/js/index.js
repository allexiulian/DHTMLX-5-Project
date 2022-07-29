dhtmlxEvent(window, "load", function() {
	layout = new dhtmlXLayoutObject(document.body, "2U");
	layout.cells("a").setText("Colleage");
	layout.cells("b").setText("Timetable");
	layout.cells("a").setWidth(312);

	generateTree();

});