window.onload = function(){
	var clickMeButton = document.getElementById('clickMe');
	clickMeButton.onclick = runTheExample;
}

/*
function runTheExample(){
	alert('running the example');
}*/

function runTheExample()
{
	var myElement = document.getElementById('second');
	var myNodeName = myElement.nodeName;
	alert(myNodeName);
	if(myElement != null)
	{
		alert(myElement.innerHTML);
	}

	document.getElementById('second').innerHTML = "See how i set the text here";

//this will give the number of time P tag has been used
     var listOfParagraph = document.getElementsByTagName('p');
     alert(listOfParagraph.length + " Paragraphs");

//gettting the parent element of any perticular node
    alert(myElement.parentNode.nodeName);

    //Getting the first child and the last child of the element
    myElement.childNodes[0];
    myElement.firstChild;
    myElement.lastChild;

    myElement.nextSibling;
    myElement.previousSibling;

//here we are trying to get the information about hyperlink or anchor tag 
    var anchor = document.getElementById('myAnchor');
    var anchorDestination = anchor.href;
    alert(anchorDestination);
    anchor.href = "http://www.wix.com";

    confirm('This is an example of using JS to create some interaction on a website. Click OK to continue!');

    prompt("What is your name");

    // Here is an example of using the greater than (>) operator.
console.log(15 > 4); // 15 > 4 evaluates to true, so true is printed.

// Fill in with >, <, === so that the following print out true:
console.log("Xiao Hui".length  122);
console.log("Goody Donaldson".length  8);
console.log(8*2  16);
}
