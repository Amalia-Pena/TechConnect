<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Fibonacci"></c:param>
</c:import>

<nav id="page-options">
	<ul>

		<c:set var="numberOfItems" value="20"/>
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max"/>
		</c:url>

		<li>
			<a href="<c:out value="${fibonacciRoute}"/>"><c:out value="${ numberOfItems }"/></a>
		</li>

		<c:set var="numberOfItems" value="50"/>
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${numberOfItems}" name="max"/>
		</c:url>

		<li>
			<a href="<c:out value="${fibonacciRoute}"/>"><c:out value="${numberOfItems}"/></a>
		</li>

		<c:set var="numberOfItems" value="100"/>
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${numberOfItems}" name="max"/>
		</c:url>

		<li>
			<a href="<c:out value="${fibonacciRoute}"/>"><c:out value="${numberOfItems}"/></a>
		</li>

	</ul>

</nav>




<ul id="fibonacci">
	<c:set var="first" value="1"/>
	<li>1</li>
	<c:forEach var="second" begin="1" end="${param.max}">

		<c:set var="placeholder" value="${first}"/>
		<li>${placeholder+second}</li>
		<c:set var="first" value="${second}"></c:set>
		<c:set var="second" value="${placeholder+second}"/>
	</c:forEach>
</ul>



<%--
	REPLACE THIS COMMENT WITH YOUR UNORDERED LIST...
 --%>

<c:import url="common/footer.jsp"></c:import>