'Programmed by Fredrick Paulin
Option Strict On
Public Class Form1

    Private Sub performCalculation(b As String)
        Dim answerDouble As Double

        Try
            If b = "add" Then
                answerDouble = CDbl(numTextBox1.Text) + CDbl(numTextBox2.Text)

            ElseIf b = "subtract" Then
                answerDouble = CDbl(numTextBox1.Text) - CDbl(numTextBox2.Text)

            ElseIf b = "multiply" Then
                answerDouble = CDbl(numTextBox1.Text) * CDbl(numTextBox2.Text)

            ElseIf b = "divide" Then
                answerDouble = CDbl(numTextBox1.Text) / CDbl(numTextBox2.Text)

            ElseIf b = "mod" Then
                answerDouble = CDbl(numTextBox1.Text) Mod CDbl(numTextBox2.Text)

            ElseIf b = "intDivide" Then
                answerDouble = CLng(numTextBox1.Text) \ CLng(numTextBox2.Text)
            End If

        Catch ex As Exception
            MessageBox.Show("Please reenter numbers", "Error occured:")
        End Try

        resultLabel.Text = CStr(answerDouble)

    End Sub

    Private Sub addButton_Click(sender As Object, e As EventArgs) Handles addButton.Click
        performCalculation("add")

    End Sub

    Private Sub subtractButton_Click(sender As Object, e As EventArgs) Handles subtractButton.Click
        performCalculation("subtract")
    End Sub

    Private Sub multiplyButton_Click(sender As Object, e As EventArgs) Handles multiplyButton.Click
        performCalculation("multiply")
    End Sub

    Private Sub divideButton_Click(sender As Object, e As EventArgs) Handles divideButton.Click
        performCalculation("divide")
    End Sub

    Private Sub modulusButton_Click(sender As Object, e As EventArgs) Handles modulusButton.Click
        performCalculation("mod")
    End Sub

    Private Sub intDivisionButton_Click(sender As Object, e As EventArgs) Handles intDivisionButton.Click
        performCalculation("intDivide")
    End Sub
End Class
