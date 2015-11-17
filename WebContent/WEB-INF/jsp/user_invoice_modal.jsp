<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Button trigger modal -->
​
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Today: 2015-11-16</h4>
      </div>
      <div class="modal-body">
      
      <!-- header -->
      <div class="row">
      	<div class="col-md-8">
        <h2>Informatique Athensoft</h2>
        <h4><i>Professional Software and IT Services Provider</i></h4>
      	</div>
      	<div class="col-md-4">
          <h1>INVOICE</h1>
      	</div>
      </div>
      <!-- end of header -->
      
      <!-- address -->
      <div class="row">
      	<div class="col-md-8">
          <p>
          8-6460 Rue Sherbrooke Ouest.<br/>
          Montreal QC H4B 1N2<br/>
          Tel: (514)746-9188 <br/>
          Email: support@athensoft.com<br/>
          Website: www.athensoft.com
          </p>
      	</div>
      	<div class="col-md-4">
          <p>
          DATE: 15 August 2015<br/>
          INVOICE # 510003<br/><br/>
          Terms: Due on receipt<br/>
          Due Date: 15 August 2015
          </p>
      	</div>
      </div>
      <!-- end of address -->
 
      <!-- invoice to -->
      <div class="row">
      	<div class="col-md-6">
          <p>
          Invoice To:<br/>
          Micro Technology Land<br/>
          1550 de Mainsonneuve O., Suite 023<br/>
          Montreal, QC H3G 1N2<br/>
          +1 (514)759-0598
          </p>
      	</div>
      	<div class="col-md-6">
          <p>
          Ship to:<br/>
          n/a
          </p>
      	</div>
      </div>
      <!-- end of invoice to --> 
      
      <!-- invoice detail -->
      <div class="row">
      	<div class="col-md-12">
           <table border="1" style="width:100%">
	           	<thead>
	           		<tr>
	           			<th>ASSIGNMENT DESCRIPTION </th>
	           			<th>QTY</th>
	           			<th>RATE</th>
	           			<th>AMOUNT</th>
	           		</tr>
	           </thead>
	           <tbody>
	           		<tr>
	           			<td>Consulting Service<br/>
	 						Phase I of e-commerce solution for microtechland.com</td>
	           			<td>1</td>
	           			<td>$100.00</td>
	           			<td>$100.00</td>
	           		</tr>
	           		<tr style="text-align:right">
	           		   <td colspan="3">SUBTOTAL<br/>
	           		   DISCOUNT<br/>
	           		   TOTAL<br/><br/>	           		   
	           		   GST @ 5%<br/>
	           		   QST @ 9.975%<br/><br/>
	           		   GRAND TOTAL
	           		   </td>
	           		   <td>$100.00<br/>
	           		   0<br/>
	           		   $100.00<br/><br/>
	           		   $5.00<br/>
	           		   $9.98<br/><br/>
	           		   $114.98
	           		   </td>
	           		</tr>
	           </tbody>
          </table>
      	</div>
      </div>
      <!-- end of invoice detail -->      
      
      <!-- footer -->
      <div class="row">
      	<div class="col-md-12">
      	<br/>
          Make all checks payable to INFORMATIQUE ATHENSOFT<br/><br/>
			GST: 80905 8399 RT001<br/>
			QST: 4104703590<br/><br/>
		 Total due in 15 days. Overdue accounts subject to a service charge of 1% per month.<br/>
      	</div>
      </div>
      <!-- end of footer -->            
      
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Print</button>
        <button type="button" class="btn btn-primary">Download</button>
      </div>
    </div>
  </div>
</div><!-- end of Modal -->
