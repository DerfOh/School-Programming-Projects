'Programmed by Fredrick Paulin
Option Strict On
Public Class Form1


    Private Sub closeButton_Click(sender As Object, e As EventArgs) Handles closeButton.Click
        Me.Close()
    End Sub

    Private Sub clearButton_Click(sender As Object, e As EventArgs) Handles clearButton.Click
        maxCapacityBox.Text = ""
        maxMilesBox.Text = ""
    End Sub

    Private Sub calculateButton_Click(sender As Object, e As EventArgs) Handles calculateButton.Click
        resultLabel.Text = CStr((CDbl(maxMilesBox.Text) / CDbl(maxCapacityBox.Text)))
    End Sub
End Class
