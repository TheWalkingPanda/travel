<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Super Panda</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html;charset=UTF-8">
    
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
	<link rel="stylesheet" type="text/css" href="../../css/welcome.css">

  </head>
  
  <body>
    <!-- 顶部导航条
	===================================== -->
	
	<div class="navbar navbar-fixed-top">
    	<div class="navbar-inner">
    		<div class="container">
    			<a class="brand" href="#"><span class="sp-logo">Super Panda</span></a>
    			<ul class="nav pull-right">
    				<li><a href="#">登录 | 注册</a></li>
    			</ul>
    		</div>
    	</div>
    </div>
    
    <div class="container">
    	<div class="row-fluid">
    		<div class="span1"></div>
	    	<div class="span10">
	    		<div class="row-fluid">
	    			<div class="span7">
	    				<div class="sp-welcome sp-corner sp-shadow">
	    					<strong>欢迎来到Super Panda。</strong>
	    				</div>
	    			</div>
	    			<div class="span5">
	    				<div class="sp-login sp-corner sp-shadow">
	    					<form action="loginStudentAction.action" method="post">
		    					<div class="row-fluid">
	    							<div class="input-prepend">
				   						<span class="add-on"><i class="icon-envelope"></i></span>
				   						<input type="email"  name="stu.stuEmail" style="width: 234px" placeholder="邮箱地址" required/>
				   					</div>
		    					</div>
		    					
		    					<div class="row-fluid">
		    						<div class="span9">
		    							<div class="input-prepend">
					   						<span class="add-on"><i class="icon-lock"></i></span>
					   						<input type="password" name="stu.stuPwd" style="width: 165px" class="span10" placeholder="密码" required/>
					   					</div>
		    						</div>
		    						<div class="span3">
		    							<button type="submit" class="btn btn-info pull-right"><strong>登 录</strong></button>
		    						</div>
		    					</div>
		    					
		    					<div class="row-fluid">
			   						<div class="span3">
			   							<label class="checkbox">
											<input type="checkbox"/> 记住我 
										</label>
									</div>
									<div class="span9">
					 					<a href="#">忘记密码?</a>
			   						</div>
				   				</div>
	    					</form>
	    				</div>
	    				<div class="sp-reg sp-corner sp-shadow">
	    					
	    					<div class="row-fluid">
	    						<div class="span12">
	    							<span style="font-size: larger;">新来 Super Panda? 注册</span>
	    						</div>
	    					</div>
	    					
	    					<form action="regStudentAction.action" method="post">
	    						<div class="row-fluid">
	    							<div class="input-prepend">
				   						<span class="add-on"><i class="icon-user"></i></span>
				   						<input type="text" name="stu.stuName" style="width: 234px" placeholder="输入真实姓名，让同学们更容易找到你。" required/>
				   					</div>
		    					</div>
		    					
		    					<div class="row-fluid">
	    							<div class="input-prepend">
				   						<span class="add-on"><i class="icon-envelope"></i></span>
				   						<input type="email" name="stu.stuEmail" style="width: 234px" placeholder="你的邮件地址是什么?" required/>
				   					</div>
		    					</div>
		    					
		    					<div class="row-fluid">
	    							<div class="input-prepend">
				   						<span class="add-on"><i class="icon-lock"></i></span>
				   						<input type="password" name="stu.stuPwd" style="width: 234px" placeholder="6个或更多字符! 要复杂些。" required/>
				   					</div>
		    					</div>
		    					
		    					<div class="row-fluid">
	    							<label class="radio inline">
										<input type="radio" name="stu.stuSex" value="男" checked/> 男
									</label>
									<label class="radio inline">
										<input type="radio" name="stu.stuSex" value="女"/> 女
									</label>
		    					</div><br/>
	    						
	    						<div class="row-fluid">
	    							<div class="span4"></div>
		    						<div class="span8">
		    							<button type="submit" class="btn btn-warning pull-right"><strong>注册 Super Panda</strong></button>
		    						</div>
	    						</div>
    						</form>
	    				</div>
	    			</div>
	    		</div>
	    	</div>
	    	<div class="span1"></div>
    	</div>
    </div>
    
    
    <!-- 引入jquery、bootstrap的js文件
	===================================== -->
	<script type="text/javascript" src="../../plugin/jquery/js/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="../../plugin/bootstrap/js/bootstrap.js"></script>
	
  </body>
</html>





