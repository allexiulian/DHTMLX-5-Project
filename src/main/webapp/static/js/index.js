dhtmlxEvent(window, "load", function() {
	layout = new dhtmlXLayoutObject(document.body, "2U");
	layout.cells("a").setText("Colleage");
	layout.cells("b").setText("Timetable");
	layout.cells("a").setWidth(312);
	
	
	toolbar = layout.attachToolbar();
	toolbar.setIconsPath("static/icons/");
	toolbar.loadXML("static/data/toolbar.xml")
	toolbar.attachEvent("onXLE", function() {
		toolbar.addSpacer("home");
	});

	
	
	toolbar.attachEvent("onclick", function(id) { 
		if (id == "home") {
			location.href = "/contact_manager/";
		};
	});
	
	toolbar.attachEvent("onclick", function(id) { 
		if (id == "login") {
			location.href = "login";
		};
	});

	generateTree();
	
});