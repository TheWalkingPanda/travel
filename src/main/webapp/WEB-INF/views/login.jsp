<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Super Panda</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <link rel="stylesheet" type="text/css" href="../../res/css/style.css">
	<link rel="stylesheet" type="text/css" href="../../res/css/login.css">

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
	    		<div class="alert alert-error">
	    			<button type="button" class="close" data-dismiss="alert">&times;</button>
	    			<strong>登录失败：</strong>错误的用户名与密码组合！
	    		</div>
	    		<div class="sp-loginPage sp-topCorner">
	    			<form action="loginStudentAction.action" method="post" class="form-horizontal">
	    				<fieldset>
	    					<legend><h3>登录 Super Panda</h3></legend>
	    					<div class="row-fluid">
	    						<div class="span2"></div>
	    						<div class="span8">
	    							<input type="email"  name="stu.stuEmail" class="input-xlarge" placeholder="邮箱地址" required/><br/><br/>
	    							<input type="password" name="stu.stuPwd" class="input-xlarge"  placeholder="密码" required/><br/><br/><br/>
	    							
	    							<div class="row-fluid">
	    								<div class="span2">
	    									<button type="submit" class="btn btn-info btn-block"><strong>登 录</strong></button>
	    								</div>
	    								<div class="span2" style="margin-top:5px;">
	    									<label class="checkbox">
												<input type="checkbox"/> <small>记住我</small>
											</label>
	    								</div>
	    								<div class="span2" style="margin-top:5px;">
	    									<a href="#"><small>忘记密码?</small></a>
	    								</div>
	    								<div class="span6"></div>
	    							</div>
	    						</div>
	    						<div class="span2"></div>
	    					</div>
	    				</fieldset>
	    			</form>
	    		</div>
	    		<div class="sp-bottomCorner" style="height: 50px;background-color: #E2E2E2;padding: 20px;">
	    			<div class="row-fluid">
	    				<div class="span2"></div>
		    			<div class="span8">
		    				<small>新来Super Panda? &nbsp;<a href="reg.html">现在注册 >></a></small>
		    			</div>
		    			<div class="span2"></div>
	    			</div>
	    		</div>
	    	</div>
	    	<div class="span1"></div>
    	</div>
    </div>
    
    
    <!-- 引入jquery、bootstrap的js文件
	===================================== -->
	<script type="text/javascript" src="../../res/plugin/jquery/js/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="../../res/plugin/bootstrap/js/bootstrap.js"></script>
	
  </body>
</html>



