<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="Home.aspx.vb" Inherits="roughRiders.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            height: 23px;
        }
        .auto-style2 {
            width: 144px;
        }
        .auto-style3 {
            height: 23px;
            width: 237px;
        }
        .auto-style4 {
          height: 23px;
          width: 160px;
        }
        .auto-style5 {
          width: 160px;
        }
        .auto-style6 {
            height: 23px;
            width: 953px;
        }
        .auto-style7 {
            width: 953px;
        }
        .auto-style8 {
          width: 145px;
        }
        .auto-style9 {
          height: 23px;
          width: 145px;
        }
        .auto-style10 {
          width: 237px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Font-Bold="True" Font-Italic="True" Font-Size="XX-Large" Text="Rough Riders Rodeo"></asp:Label>
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Label2" runat="server" Font-Size="X-Large" Text="Rodeo Tickets - Order Form"></asp:Label>
        <br />
        <br />
        Number of tickets:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<asp:TextBox ID="numberOfTicketsTextBox" runat="server" Width="44px"></asp:TextBox>
        <br />
        <asp:CheckBox ID="awardsEventCheckBox" runat="server" Text="Awards Event" />
        <br />
        <br />
        <table style="width:43%;">
            <tr>
                <td class="auto-style10">Credit Card Number:</td>
                <td>
                    <asp:TextBox ID="creditCardTextBox" runat="server" Width="301px"></asp:TextBox>
                </td>
                
            </tr>
            <tr>
                <td class="auto-style10">Expiration Date:</td>
                <td>
                    <asp:TextBox ID="expirationTextBox" runat="server" Width="39px" style="margin-left: 40px"></asp:TextBox>
                </td>
                
            </tr>
            <tr>
                <td class="auto-style3">Type of Credit Card</td>
                <td class="auto-style1">
                    <asp:DropDownList ID="creditCardTypeDropDownList" runat="server">
                        <asp:ListItem>Visa</asp:ListItem>
                        <asp:ListItem>Master Card</asp:ListItem>
                        <asp:ListItem>American Express</asp:ListItem>
                        <asp:ListItem>Capital One</asp:ListItem>
                    </asp:DropDownList>
                </td>
                
            </tr>
        </table>
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Label ID="Label3" runat="server" style="font-weight: 700; font-style: italic; font-size: large" Text="Shipping Information"></asp:Label>
        <br />
        <table style="width:28%;">
            <tr>
                <td class="auto-style4">Name:</td>
                <td class="auto-style6">
                    <asp:TextBox ID="nameTextBox" runat="server" Width="323px"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style4">Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>
                <td class="auto-style6">
                    <asp:TextBox ID="addressTextBox" runat="server" Width="322px"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style4">City:</td>
                <td class="auto-style6">
                    <asp:TextBox ID="cityTextBox" runat="server" Width="322px"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style5">State:</td>
                <td class="auto-style7">
                    <asp:TextBox ID="stateTextBox" runat="server" Width="322px"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style5">Zip:</td>
                <td>
                    <asp:TextBox ID="zipTextBox" runat="server" Width="321px"></asp:TextBox>
                </td>
            </tr>
        </table>
        <br />
    
        <br />
        <asp:Button ID="submitButton" runat="server" Text="Submit" Width="85px" />
        <br />
        <br />
        <table style="width: 26%; margin-bottom: 0px;">
            <tr>
                <td class="auto-style1">Name:</td>
                <td class="auto-style8">
                    <asp:Label ID="nameLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">Date:</td>
                <td class="auto-style9">
                    <asp:Label ID="dateLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style1">Address:</td>
                <td class="auto-style9">
                    <asp:Label ID="addressLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style1">Payment Method:</td>
                <td class="auto-style8">
                    <asp:Label ID="paymentLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style1">Quantity:</td>
                <td class="auto-style8">
                    <asp:Label ID="quantityLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style1">Total:</td>
                <td class="auto-style8">
                    <asp:Label ID="totalLabel" runat="server"></asp:Label>
                </td>
            </tr>
        </table>
        <br />
        <br />
        <asp:HyperLink ID="confirmationHyperLink" runat="server" NavigateUrl="~/Confirmation.aspx" Visible="False">Confirmation</asp:HyperLink>
        <br />
    
    </div>
        <p>
            &nbsp;</p>
    </form>
</body>
</html>
