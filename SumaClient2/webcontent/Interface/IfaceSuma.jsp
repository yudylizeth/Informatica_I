<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
<HEAD>
<TITLE>Suma</TITLE>
</HEAD>
<BODY>
	<H1>Suma</H1>

	<FORM METHOD="POST" ACTION="IfaceSuma.jsp">

		<TABLE>
			<TR>
				<TD COLSPAN="1" ALIGN="LEFT">numero1:</TD>
				<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="numero1" SIZE=20></TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD COLSPAN="1" ALIGN="LEFT">numero2:</TD>
				<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="numero2" SIZE=20></TD>
			</TR>
		</TABLE>
		<BR> <INPUT TYPE="SUBMIT" VALUE="Suma">
	</FORM>
	<jsp:useBean id="sampleOperacionesProxyid" scope="session" class="proceso.OperacionesProxy" />
	<%
	if((request.getMethod()).equalsIgnoreCase("POST")){
		String numero1 		= request.getParameter("numero1");
		double numero1_1 	= Double.parseDouble(numero1);
		String numero2 		= request.getParameter("numero2");
		double numero2_2 	= Double.parseDouble(numero2);
		double result 		= sampleOperacionesProxyid.suma(numero1_1, numero2_2);
		String resultString = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(result));
	%>
	<span style="color: red;">
	<%=resultString	%>
	</span>
<%}%>
</BODY>
</HTML>