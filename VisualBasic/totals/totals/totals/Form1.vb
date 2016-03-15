'Coded by Fredrick Paulin

Public Class MainForm
    Private Function performCalculation(t1 As TextBox, t2 As TextBox, t3 As TextBox, t4 As TextBox, t5 As TextBox)
        Dim answerString As String
        Dim answerDouble As Double

        answerDouble = (CDbl(t1.Text) + CDbl(t1.Text) + CDbl(t1.Text) + CDbl(t1.Text) + CDbl(t1.Text)) / 5
        answerString = CStr(answerDouble)

        Return answerString

    End Function

    Private Sub calculateButton_Click(sender As Object, e As EventArgs) Handles calculateButton.Click
        answerLabel.Text = performCalculation(testScore1, testScore2, testScore3, testScore4, testScore5)

    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class
