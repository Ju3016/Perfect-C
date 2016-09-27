


<html>
<body>
	<h2> p.91 실습1 코드를 작성하라.(replace 함수를 사용하지말고, 한 문자씩 스캔하여 처리하라)</h2>
	
	<h3> 주어진 문자열 "active server pages"에서 'a'를 찾아서 'z'로 바꾸어 출력되도록 하여라.</h3>
	<% 
		str = "active server pages"
		
   	%>

    	문자열 : <% = str %> <br><br>

	<%
	Response.charset = "utf-8"
	Response.ContentType="text/html"
	Session.CodePage=65001
	
	ch = ""
	for i = 1 to len(str)
		if mid(str,i,1) = "a" then
		ch = ch & "z"
		else
		ch = ch & mid(str,i,1)
		end if
	next
	
	response.write ch
	%>
	
</body>
 </html>
