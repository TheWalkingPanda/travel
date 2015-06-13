<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Super Panda</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
	<link rel="stylesheet" type="text/css" href="../../css/reg.css">

  </head>
  
  <body>
    <!-- 顶部导航条
	===================================== -->
	
	<div class="navbar navbar-fixed-top">
    	<div class="navbar-inner">
    		<div class="container">
    			<a class="brand" href="#"><span class="sp-logo">Super Panda</span></a>
    			<ul class="nav pull-right">
    				<li>
    					<a id="loginLink" class="dropdown-toggle" data-toggle="dropdown" href="#">
    						<small>已有账号?</small> 登录 <b class="caret"></b>
    					</a>
   						<form action="loginStudentAction.action" method="post" id="loginForm" class="dropdown-menu" aria-labelledby="login" aria-hidden="true">
   							<label><small>邮箱地址</small></label>
   							<input type="email" name="stu.stuEmail" required/>
   							<label><small>密码</small></label>
   							<input type="password" name="stu.stuPwd" required/>
   							
   							<div class="row-fluid">
   								<div class="span6">
   									<button type="submit" class="btn"><strong>登 录</strong></button>
   								</div>
   								<div class="span6">
   									<label class="checkbox pull-right" style="margin-top: 10px;">
										<input type="checkbox"/> 记住我 
									</label>
   								</div>
   							</div><br>
   							<div class="row-fluid">
   								<div class="span6">
   									<a href="#"><small>忘记密码?</small></a>
   								</div>
   								<div class="span6"></div>
   							</div>
   							
   							
   						</form>
    				</li>
    			</ul>
    		</div>
    	</div>
    </div>
    
    <div class="container">
    	<div class="row-fluid">
    		<div class="span1"></div>
	    	<div class="span10">
	    		<div class="sp-regPage sp-corner">
	    			<div class="sp-login-error sp-topCorner">
		    			<form action="regStudentAction.action" method="post" class="form-horizontal">
		    				<fieldset>
		    					<legend><h3>现在就加入 Super Panda。</h3></legend>
		    					<div class="row-fluid">
		    						<div class="span1"></div>
		    						<div class="span10">
		    							<div class="row-fluid sp-formMargin">
		    								<div class="span7">
		    									<label><strong>您的姓名</strong></label>
				    							<input type="text" name="stu.stuName" class="span12" required/>
		    								</div>
		    								<div class="span5 sp-regHelp">
		    									<small class="help-block">输入真实姓名，让同学们更容易找到你。</small>
		    								</div>
		    							</div>
		    							<div class="row-fluid sp-formMargin">
		    								<div class="span7">
		    									<label><strong>邮箱地址</strong></label>
				    							<input type="email" name="stu.stuEmail" class="span12" required/>
		    								</div>
		    								<div class="span5 sp-regHelp">
		    									<small class="help-block">你的邮件地址是什么?</small>
		    								</div>
		    							</div>
		    							<div class="row-fluid sp-formMargin">
		    								<div class="span7">
		    									<label><strong>创建密码</strong></label>
				    							<input type="password" name="stu.stuPwd" class="span12" required/>
		    								</div>
		    								<div class="span5 sp-regHelp">
		    									<small class="help-block">6个或更多字符! 要复杂些。</small>
		    								</div>
		    							</div>
		    							<div class="row-fluid sp-formMargin">
		    								<div class="span7">
				    							<label class="radio inline">
													<input type="radio" name="stu.stuSex" value="男" checked/> 男
												</label>
												<label class="radio inline">
													<input type="radio" name="stu.stuSex" value="女"/> 女
												</label>
		    								</div>
		    								<div class="span5"></div>
		    							</div>
		    							<div class="row-fluid sp-formMargin">
		    								<div class="span7">
				    							<label class="checkbox">
													<input type="checkbox" checked/> <small>在这台电脑上保持我的登录状态。</small>
												</label>
		    								</div>
		    								<div class="span5"></div>
		    							</div><br/>
		    							
		    							<div class="row-fluid sp-formMargin">
		    								<div class="span7">
				    							<button type="submit" class="btn btn-warning btn-block"><strong>创建我的账号</strong></button>
		    								</div>
		    								<div class="span5"></div>
		    							</div>
		    							
		    						</div>
		    						<div class="span1"></div>
		    					</div>
		    				</fieldset>
		    			</form>
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
	<script type="text/javascript" src="../../js/reg.js"></script>
	
  </body>
</html>




