<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Users List</title>
<link rel="stylesheet" href="/BaseCodeSlice_BankManagementSystem/static/lib/bootstrap/css/main.css" />
</head>
<body class="landing">
	<div id="page-wrapper">

		<!-- Header -->
		<header id="header" class="alt">
			<h1>
				<a href="/BaseCodeSlice_BankManagementSystem/">Bank Management System</a>
			</h1>
			<nav id="nav">
				<ul>
					<li><a href="/BaseCodeSlice_BankManagementSystem/">Home</a></li>
					
						
							<li><a href="#" class="icon fa-angle-down">Transaction</a>
								<ul>
									<li><a href="/BaseCodeSlice_BankManagementSystem/static/html/Transaction/performTransaction.html">Perform
											Transaction</a></li>
									<li><a href="/BaseCodeSlice_BankManagementSystem/static/html/Transaction/viewTransactionSearchScreen.html">View
											Transaction</a></li>
								</ul></li>
							<li><a href="#" class="icon fa-angle-down" >Home Loan</a>
								<ul>
									<li><a href="/BaseCodeSlice_BankManagementSystem/static/html/HomeLoan/applyHomeLoan.html">Apply Home Loan </a></li>
									<li><a href="/BaseCodeSlice_BankManagementSystem/static/html/HomeLoan/getHomeLoanSearchScreen.html">Search Home
											Loan</a></li>

								</ul></li>
							<li><a href="#" class="icon fa-angle-down">Education Loan</a>
								<ul>
									<li><a href="/BaseCodeSlice_BankManagementSystem/static/html/EducationLoan/applyeducationloan.html">Apply Education
											Loan </a></li>
									<li><a href="/BaseCodeSlice_BankManagementSystem/static/html/EducationLoan/geteducationloansearchscreen.html">Search
											Education Loan</a></li>

								


						</ul></li>
					
				</ul>
			</nav>
		</header>
		<!-- Form -->
		<br><br><br><br>
		
		<center><h2>Transaction Detail</h2></center>
	<table>
	<% int i = 1; %>
		<c:forEach items="${users}" var="user">
		<tr>
				<th>S.NO</th>
				<th>Customer Name</th>
				<th>Account Number</th>
				<th>Transaction Type</th>
				<th>Transaction Amount</th>
				<th>Transaction Id</th>
			
			</tr>
			<tr>
			<td><%= i %> <% i++; %></td>
				<td><c:out value="${user.customerName}" /></td>
				<td><c:out value="${user.accountNumber}" /></td>
				<td><c:out value="${user.transactionType}" /></td>
				<td><c:out value="${user.transactionAmount}" /></td>
				<td><c:out value="${user.transactionId}" /></td>
			
			</tr>
		</c:forEach>
	</table>
	<script
		src="/BaseCodeSlice_BankManagementSystem/static/lib/bootstrap/js/jquery.min.js"></script>
	<script
		src="/BaseCodeSlice_BankManagementSystem/static/lib/bootstrap/js/jquery.dropotron.min.js"></script>
	<script
		src=/BaseCodeSlice_BankManagementSystem/static/lib/bootstrap/js/jquery.scrollgress.min.js"></script>
	<script
		src="/BaseCodeSlice_BankManagementSystem/static/lib/bootstrap/js/skel.min.js"></script>
	<script
		src="/BaseCodeSlice_BankManagementSystem/static/lib/bootstrap/js/util.js"></script>
	<script
		src="/BaseCodeSlice_BankManagementSystem/static/lib/bootstrap/js/main.js"></script>
</body>
</html>