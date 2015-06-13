var tag = 0;
$("#loginLink").click(function(){
	if(tag==0){
		$("#loginForm").css({
			"padding":"15px",
			"display":"block"
		});
		tag=1;
	}else{
		$("#loginForm").hide();
		tag=0;
	}
});

