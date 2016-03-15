Public Class Form1

    Dim customerRelationsName As String
    Dim marketingName As String
    Dim orderProcessingName As String
    Dim shippingName As String

    Dim customerRelationsNumber As String
    Dim marketingNumber As String
    Dim orderProcessingNumber As String
    Dim shippingNumber As String

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        customerRelationsName = "Tricia Mills"
        customerRelationsNumber = "500-1111"
        marketingName = "Michelle Rigner"
        marketingNumber = "500-2222"
        orderProcessingName = "Kenna DeVoss"
        orderProcessingNumber = "500-3333"
        shippingName = "Eric Andrews"
        shippingNumber = "500-4444"
    End Sub


    Private Sub customerRelationsButton_Click(sender As Object, e As EventArgs) Handles customerRelationsButton.Click
        If nameTextBox.Text = "" Then
            customerRelationsNameLabel.Text = customerRelationsName

        Else
            customerRelationsNameLabel.Text = nameTextBox.Text
        End If

        cusomterRelationsNumberLabel.Text = customerRelationsNumber
    End Sub

    Private Sub marketingButton_Click(sender As Object, e As EventArgs) Handles marketingButton.Click
        marketingNameLabel.Text = marketingName
        marketingNumberLabel.Text = marketingNumber
    End Sub


    Private Sub processingButton_Click(sender As Object, e As EventArgs) Handles processingButton.Click
        orderProcessingNameLabel.Text = orderProcessingName
        orderProcessingNumberLabel.Text = orderProcessingNumber
    End Sub

    Private Sub shippingButton_Click(sender As Object, e As EventArgs) Handles shippingButton.Click
        shippingNameLabel.Text = shippingName
        shippingNumberLabel.Text = shippingNumber
    End Sub

    Private Sub clearButton_Click(sender As Object, e As EventArgs) Handles clearButton.Click
        nameTextBox.Clear()
    End Sub

    Private Sub closeButton_Click(sender As Object, e As EventArgs) Handles closeButton.Click
        Me.Close()
    End Sub

    Private Sub redRadioButton_CheckedChanged(sender As Object, e As EventArgs) Handles redRadioButton.CheckedChanged
        nameTextBox.ForeColor = Color.Red
    End Sub

    Private Sub blueRadioButton_CheckedChanged(sender As Object, e As EventArgs) Handles blueRadioButton.CheckedChanged
        nameTextBox.ForeColor = Color.Blue
    End Sub

    Private Sub greenRadioButton_CheckedChanged(sender As Object, e As EventArgs) Handles greenRadioButton.CheckedChanged
        nameTextBox.ForeColor = Color.Green
    End Sub

    Private Sub orangeRadioButton_CheckedChanged(sender As Object, e As EventArgs) Handles orangeRadioButton.CheckedChanged
        nameTextBox.ForeColor = Color.Orange
    End Sub

    Private Sub printButton_Click(sender As Object, e As EventArgs) Handles printButton.Click
        PrintForm.Print()
    End Sub

    Private Sub CheckBox1_CheckedChanged(sender As Object, e As EventArgs) Handles visibleCheckBox.CheckedChanged
        PictureBox.Visible = visibleCheckbox.checked
    End Sub
End Class
