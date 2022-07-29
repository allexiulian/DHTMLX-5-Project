function generateTree() {
	myTree = layout.cells("a").attachTree();
	myTree.setImagesPath("static/codebase/imgs/");
	myTree.loadXML("static/data/treeStruct.xml");

	myTree.attachEvent("onSelect", function(id) { //id -the id of the selected item
		console.log(id);
		$.ajax({
			type: "GET",
			url: "timetable",
			data: id,
			success: (data) => {
				console.log(data);
				layout.cells("b").attachHTMLString(data);
				//console.log("called click");
			},

		})
		return true;
	});
}