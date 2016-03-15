<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="Confirmation.aspx.vb" Inherits="roughRiders.WebForm2" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 136px;
        }
        .auto-style2 {
            width: 136px;
            height: 22px;
        }
        .auto-style3 {
            height: 22px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Font-Bold="True" Font-Italic="True" Font-Size="XX-Large" Text="Rough Riders Rodeo"></asp:Label>
        <br />
        <br />
        <h1 style="width: 378px">Thank you for your order!</h1>
        <p style="width: 378px">
            The following has been submitted for an order:</p>
        <p style="width: 378px">
            &nbsp;</p>
        <p style="width: 378px">
            <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="~/Home.aspx">Return to order form</asp:HyperLink>
        </p>
    
    </div>
    </form>
</body>
</html>
