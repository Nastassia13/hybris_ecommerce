<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="product" type="de.hybris.platform.commercefacades.product.data.ProductData" scope="request"/>
<div style="font-size: ${fontSize}px">
    <h1>Questions and Answers</h1>
    <c:if test="${empty product.questions}">
        No questions
    </c:if>
    <c:forEach var="question" items="${product.questions}" end="${numberQuestions}">
        <div class="questionCustomerName"> ${question.questionCustomer}</div>
        <div class="questionCustomerText">${question.question}</div>
        <c:if test="${not empty question.answer}">
            <div class="answerCustomerName">${question.answerCustomer}</div>
            <div class="answerCustomerText">${question.answer}</div>
        </c:if>
        <br>
    </c:forEach>
</div>