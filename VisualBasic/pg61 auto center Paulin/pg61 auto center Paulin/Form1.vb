'Coded by Fredrick Paulin 9/12/2014
'CSC-175 Visual Basic Programming
'Code purpose is to create a form that will display the current specials for an auto dealership


Public Class MainForm
    'declaring strings that will be used in the interaction
    Dim autoSalesSpecial As String
    Dim serviceCenterSpecial As String
    Dim detailShopSpecial As String
    Dim employmentInfo As String

    Private Sub MainForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'set the welcome text for the user
        setText("Welcome! Please make a selection!")

        'strings are initialized here so that they can be changed easily when the specials are changed
        autoSalesSpecial = "Family Wagon, immaculate condition $12,995"
        serviceCenterSpecial = "Lube, oil, filter $25.99"
        detailShopSpecial = "Complete detail $79.95 for most cars"
        employmentInfo = "Sales position, contact Mr.Mann 551-2134 x475"
    End Sub


    'pass a string into the method to set the text of the label
    Private Sub setText(s As String)
        textLabelDisplay.Text = s
    End Sub



    'click listeners to set the text accordingly to each button
    'to set the text of the text label pass a string into the setText method
    Private Sub buttonAutoSales_Click(sender As Object, e As EventArgs) Handles buttonAutoSales.Click
        setText(autoSalesSpecial)
    End Sub

    Private Sub buttonServiceCenter_Click(sender As Object, e As EventArgs) Handles buttonServiceCenter.Click
        setText(serviceCenterSpecial)
    End Sub

    Private Sub buttonDetailShop_Click(sender As Object, e As EventArgs) Handles buttonDetailShop.Click
        setText(detailShopSpecial)
    End Sub

    Private Sub buttonEmployment_Click(sender As Object, e As EventArgs) Handles buttonEmployment.Click
        setText(employmentInfo)
    End Sub



    'these buttons handle events with printing and closing the application
    Private Sub buttonPrint_Click(sender As Object, e As EventArgs) Handles buttonPrint.Click
        PrintForm1.Print()
    End Sub

    Private Sub buttonExit_Click(sender As Object, e As EventArgs) Handles buttonExit.Click
        Me.Close()
    End Sub


End Class
