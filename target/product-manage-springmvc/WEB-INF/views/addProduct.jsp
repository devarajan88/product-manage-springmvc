<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<head>
    <title>Add Product Form</title> 
    <style>
    .error
    {
        color: #ff0000;
        font-weight: bold;
    }
    </style>
</head>
 
<body>
    <h2><spring:message code="lbl.page" text="Add New Product" /></h2>
    <br/>
    <form:form method="post" modelAttribute="product">
        <%-- <form:errors path="*" cssClass="error" /> --%>
        <table>
            <tr>
                <td><spring:message code="lbl.productId" text="Product ID" /></td>
                <td><form:input path="productId" /></td>
                <td><form:errors path="productId" cssClass="error" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.productName" text="Product Name" /></td>
                <td><form:input path="productName" /></td>
                <td><form:errors path="productName" cssClass="error" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.productPrice" text="Product Price" /></td>
                <td><form:input path="productPrice" /></td>
                <td><form:errors path="productPrice" cssClass="error" /></td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit" value="Add Product"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>