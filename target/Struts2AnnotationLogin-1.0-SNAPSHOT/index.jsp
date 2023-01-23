<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>       
    </head>
    <body>
        
        <h1>Struts 2 Annotation Login Example</h1> 
        
        <s:form action="register">
            <s:textfield name="userId" label="User Id"></s:textfield>
            <s:password name="pass" label="Password"></s:password>
            <s:submit value="Login"></s:submit>
           
        </s:form>
        
        <p style="color: red;"><s:property value="msg"></s:property></p>
    </body>
</html>
