<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<ul class="nav nav-sidebar">
  <li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
  <li><a href="#">Announcement</a></li>
  <li><a href="#">Important Date</a></li>
  <li><a href="view_item.do">Services and products</a></li>
  <li><a href="#">Reports</a></li>
  <!-- 
  <li><a href="#">Analytics</a></li>
  <li><a href="#">Export</a></li>
   -->
</ul>

 <ul class="nav nav-sidebar">
  <li class="active"><a href="#">My Profile<span class="sr-only">(current)</span></a></li>
  <li><a href="view_customerprofile.do">Basic Information</a></li>
  <li><a href="view_billaddress.do">Billing addresses</a></li>
  <li><a href="view_shipaddress.do">Shipping addresses</a></li>
</ul>

<ul class="nav nav-sidebar">
	<li class="active"><a href="#">My Projects and Services<span class="sr-only">(current)</span></a></li>
	<li><a href="view_project_list.do">Overview</a></li>
	<li><a href="track_project.do">Current projects</a></li>
	<li><a href="#">Historical projects</a></li>
	<li><a href="request_project.do">Request a new project</a></li>
	<li><a href="goto_projectreq.do">Post requirements</a></li>
  	
  	
  	
</ul>

<ul class="nav nav-sidebar">
	<li class="active"><a href="#">My Financial Info.<span class="sr-only">(current)</span></a></li>
  	<li><a href="">Orders</a></li>
  	<li><a href="view_invoice.do">Invoices</a></li>
  	<li><a href="view_credit.do">Credit</a></li>
</ul>