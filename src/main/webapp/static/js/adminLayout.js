dhtmlxEvent(window, "load", function() {
	layout = new dhtmlXLayoutObject(document.body, "3W");
	layout.cells("a").setText("Colleage");
	layout.cells("b").setText("Timetable");
	layout.cells("c").setText("Manage");
	layout.cells("a").setWidth(250);
	layout.cells("c").setWidth(350);
	
	toolbar = layout.attachToolbar();
	
	
	toolbar.setIconsPath("static/icons/");
	toolbar.loadXML("static/data/toolbarAdmin.xml")
	toolbar.attachEvent("onXLE", function() {
		toolbar.addSpacer("teachermanage");
	});
	
	
	generateTree();

});