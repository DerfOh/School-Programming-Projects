'Programmed by Fredrick Paulin

Option Strict On

Public Class mainForm
    Dim number1, number2, answer As Decimal
    Private Sub computeButton_Click(sender As Object, e As EventArgs) Handles computeButton.Click
        number1 = CDec(num1TextBox.Text)
        number2 = CDec(num2TextBox.Text)
        If number1 >= number2 Then
            answerLabel.Text = "Num1 is Greater"

        ElseIf number1 <= number2 Then
            answerLabel.Text = "Num2 is Greater"
        Else
            answerLabel.Text = "Not valid"
        End If
        'answer = number1 + number2
        'answerLabel.Text = answer.ToString("c2")




    End Sub
End Class
