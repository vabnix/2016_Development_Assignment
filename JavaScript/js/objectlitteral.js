/*var batwing = {
	status: "Ready",
	rescueBatman: function(){
	document.write("Locating his transponder... initiating launch..");
	}
}

if(batwing.status === "Ready")
{
	batwing.rescueBatman();
}

var utilities = {
	printAllMember: function(targetObject){
		for(i in targetObject){
			document.write("<br/>" + targetObject[i]);
		}
	}
}

utilities.printAllMember(batwing);*/

/*var i_am_empty = {};
utilities.printAllMember(i_am_empty);*/

var planet = {
	id: 34,
	name: "Vaibhav",
	faction: {
			factionId: 2,
			name: "Pallabi",
			notification: function(){
							document.write("Nex alliance... unite!");
		}
	},
	cities: [
				{ locationId: 15, name: "Roanoke"},
				{ locationId: 16, name: "NewYork"},
				{ locationId: 17, name: "Dallas"}
			]
};

document.write("<br/>" + planet.id);
document.write("<br/>" + planet.name);
document.write("<br/>" + planet.faction.factionId+"<br/>" );
planet.faction.notification();
document.write("<br/>" + planet.cities[1].name);

function car(make,model,year){
	this.make = make;
	this.model = model;
	this.year = year;
}

var myCar = new car("Honda", "Accord EX", 2016);
var myWifeCar = new car("Truck", "Ram", 2017);

alert(myCar.model);
alert(myWifeCar.model);



