<%@page import="com.example.FlightBookingApplication.Entity.Flight"%>
<%@page import="java.util.List" %>
<html>
<head>
<title>flight search result</title>
<body>

<%
  List<Flight> listofflight= (List<Flight>)request.getAttribute("listofsearchflight");
%>

 <%
  for(Flight flight: listofflight)
  {
%>
  <h1>Flight number is : <%=flight.getFlightno() %></h1>
  <h1>Flight Source is : <%=flight.getSource() %></h1>
  <h1>Flight Destination is : <%=flight.getDestination()%></h1>
<%
  }
  %>


</body>




</head>
</html>
