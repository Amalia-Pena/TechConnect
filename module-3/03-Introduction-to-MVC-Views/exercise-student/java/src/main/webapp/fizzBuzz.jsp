<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="FizzBuzz"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fizzBuzzRoute" value="fizzBuzz.jsp">
			<c:param value="${ numberOfItems }" name="number" />
		</c:url>
		<li><a href="<c:out value="${ fizzBuzzRoute }" />"><c:out value="${ numberOfItems }" /></a></li>
	</ul>
</nav>



<ul class="${numClassAttribute}">
	<c:choose>
		<c:when test="${ number % 15 == 0 }">

			<li class="fizzbuzz"><c:out value= "FizzBuzz!" /></li>
		</c:when>

		<c:when test="${ number % 3 == 0 }">
			<li class="fizz"><c:out value= "Fizz!" />
		</c:when>

		<c:when test="${ number % 5 == 0 }">
			<li class="buzz"><c:out value= "Buzz!" />
		</c:when>

		<c:otherwise>
			<li><c:out value= "${number}"/> </li>
		</c:otherwise>

	</c:choose>

</ul>

<%--
	REPLACE THIS COMMENT WITH YOUR UNORDERED LIST...
	I know it is not fully correct.
	Still working on it. Had a hard time.
	Not fully sure if I apprached this the right way.
	Missing when test (5)
 --%>

<c:import url="common/footer.jsp"></c:import>
