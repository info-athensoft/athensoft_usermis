<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- i18n -->
<c:set var="loc" value="zh_CN"/>
<c:if test="${!(empty param.locale)}">
  <c:set var="loc" value="${param.locale}"/>
</c:if>
<fmt:setLocale value="${loc}" />
<!-- ENDS i18n -->

   
    <div class="navbar-wrapper">
      <div class="container">

       <!--  <nav class="navbar navbar-inverse navbar-static-top  transparent_class"> --> 
        <nav class="navbar navbar-inverse navbar-fixed-top  transparent_class">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="index.jsp">Informatique Athensoft</a>
            </div>
            
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li id="home" class="active">
                	<a href="index.jsp"><spring:message code="menu.home"/></a>
                </li>
                
                <li id="ecomm" class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><spring:message code="menu.ecomm"/> <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="ecomm.do"><spring:message code="service.ecomm"/></a></li>
                    <li><a href="payment.do"><spring:message code="service.payment"/></a></li>
                  </ul>
                </li>
                
                <li id="service" class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><spring:message code="menu.service"/> <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="website.do"><spring:message code="service.website"/></a></li>
                    <li><a href="design.do"><spring:message code="service.design"/></a></li>
                    <li><a href="#"><spring:message code="service.consult"/></a></li>
                    <li><a href="training.do"><spring:message code="service.train"/></a></li>
                    <!-- 
                    <li class="divider"></li>
                    <li class="dropdown-header">Nav header</li>
                    <li><a href="#">Separated link</a></li>
                    <li><a href="#">One more separated link</a></li>
                     -->
                  </ul>
                </li>
                
                <!-- demo -->
                <li id="demo">
                	 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><spring:message code="menu.demo"/> 
                	 <span class="caret"></span></a>
                	<!-- <a href="demo.do"><spring:message code="menu.demo"/></a>   -->
                	<ul class="dropdown-menu" role="menu">
                    <li><a href="demo.do"><spring:message code="demo.canvas"/></a></li>
                    <li><a href="demo_enar.do"><spring:message code="demo.enar"/></a></li>
                  </ul>
                </li>
                <!-- end demo -->
                
                <!-- affiliate -->
                <li id="affiliate">
                	<a href="affiliate.do"><spring:message code="menu.affiliate"/></a>
                </li>
                <!-- end affiliate -->
                
                <!-- contact -->
                <li id="contact"><a href="contact.do"><spring:message code="menu.contact"/></a></li>
                <!-- end contact -->
              </ul>
              
              <ul class="nav navbar-nav navbar-right">
        		<li><a href="signin.do"><spring:message code="user.signin"/></a></li>
        		<li><a href="###"><spring:message code="user.signup"/></a></li>
        		
        		<li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><spring:message code="menu.lang"/> <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="index.jsp?locale=fr_CA"><spring:message code="lang.fr"/></a></li>
                    <li><a href="index.jsp?locale=en_US"><spring:message code="lang.en"/></a></li>
                    <li><a href="index.jsp?locale=zh_CN"><spring:message code="lang.zh_s"/></a></li>
                    <li><a href="index.jsp?locale=zh_CN"><spring:message code="lang.zh_t"/></a></li>
                    <!-- 
                    <li class="divider"></li>
                    <li class="dropdown-header">Nav header</li>
                    <li><a href="#">Separated link</a></li>
                    <li><a href="#">One more separated link</a></li>
                     -->
                  </ul>
                </li>
                
                <li id="contact">
        			<a href="view_cart.do"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>&nbsp;&nbsp;<span class="badge">0</span></a>
        		</li>
        	  </ul>
              
            </div>
            
          </div>
        </nav>
      </div>
    </div>