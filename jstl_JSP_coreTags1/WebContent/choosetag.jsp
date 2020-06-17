<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="subject" value="Botony"></c:set>

<c:choose>
	<c:when test="${subject=='Physics'}">
Candidate has opted for Physics
</c:when>
	<c:when test="${subject=='Chemistry'}">
Candidate has opted for Chemistry
</c:when>
	<c:when test="${subject==',Maths'}">
Candidate has opted for Maths
</c:when>

	<c:otherwise>
Candidate has not chosen any subject yet
</c:otherwise>

</c:choose>