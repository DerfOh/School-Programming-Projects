'Coded by Fredrick Paulin 9/12/2014
'CSC-175 Visual Basic Programming
'Code purpose is to display address and hour info for different locations of an auto dealership

Public Class MainForm
    Dim downTownHours As String
    Dim downTownAddress As String

    Dim mallHours As String
    Dim mallAddress As String

    Dim suburbsHours As String
    Dim suburbsAddress As String

    Private Sub MainForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'strings are initialized here so that they can be changed easily when the specials are changed
        'each store location should have a variable hours and a variable for the address
        downTownHours = "11:00 am to 10:00 pm"
        downTownAddress = "123 Abc Ln." + Environment.NewLine _
                        + "Somewheresville, MI 12345"

        mallHours = "9:30 am to 8:00"
        mallAddress = "456 Def Rd." + Environment.NewLine _
                    + "Anotherplace, MI 45678"

        suburbsHours = "9:00 am to 11:00 pm"
        suburbsAddress = "789 Ghi Dr." + Environment.NewLine _
                        + "Otherland, MI 78912"
    End Sub



    'method for displaying the store hours and address in the text label with proper formatting
    'to use this method pass in the two corresponding variables for the store hours and the store address
    Private Sub setText(hours As String, address As String)
        labelDisplay.Text = hours + Environment.NewLine + address
    End Sub



    'button listeners for locations, printing, and closing the application
    Private Sub buttonDownTown_Click(sender As Object, e As EventArgs) Handles buttonDownTown.Click
        setText(downTownHours, downTownAddress)
    End Sub

    Private Sub buttonMall_Click(sender As Object, e As EventArgs) Handles buttonMall.Click
        setText(mallHours, mallAddress)
    End Sub

    Private Sub buttonSuburbs_Click(sender As Object, e As EventArgs) Handles buttonSuburbs.Click
        setText(suburbsHours, suburbsAddress)
    End Sub

    Private Sub buttonPrint_Click(sender As Object, e As EventArgs) Handles buttonPrint.Click
        PrintForm1.Print()
    End Sub

    Private Sub buttonClose_Click(sender As Object, e As EventArgs) Handles buttonClose.Click
        Me.Close()
    End Sub


End Class
