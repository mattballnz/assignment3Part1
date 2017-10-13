<%
	if( ( session.getAttribute( "Username" ) == null ) || ( session.getAttribute( "Username " ) == "" ) )
	{ %>
		You have successfully logged in <br/>
		Welcome!
	<%}
	
%>