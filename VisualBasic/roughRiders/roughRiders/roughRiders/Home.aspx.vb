Public Class WebForm1
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub submitButton_Click(sender As Object, e As EventArgs) Handles submitButton.Click
        confirmationHyperLink.Visible = True
        Dim addressString = CStr(addressTextBox.Text & vbCrLf & cityTextBox.Text & ", " & stateTextBox.Text & "  " & zipTextBox.Text)
        nameLabel.Text = nameTextBox.Text
        dateLabel.Text = CStr(Date.Now)
        addressLabel.Text = addressString
        quantityLabel.Text = numberOfTicketsTextBox.Text
        totalLabel.Text = CStr(CInt(15 * numberOfTicketsTextBox.Text))
    End Sub
End Class