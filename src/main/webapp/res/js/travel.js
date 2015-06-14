function doGet(url,data,successFun,errorFun){
	$.ajax({
		type: "get",
		url: url,
		dataType:"json",
	    data: data,
	    success: successFun,
	    error: errorFun
	});
}
function doPost(url,data,successFun,errorFun){
	$.ajax({
		type: "post",
		url: url,
		dataType:"json",
	    data: data,
	    success: successFun,
	    error: errorFun
	});
}

