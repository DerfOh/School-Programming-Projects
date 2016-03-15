'Programmed by Fredrick Paulin
'

Option Strict On

Public Class Form1
    Dim gradeValue As String
    Dim gradeDecimal As Decimal
    Private Sub calculateButton_Click(sender As Object, e As EventArgs) Handles calculateButton.Click
        gradeValue = computeLetterGrade(gradeTextBox.Text)
        resultLabel.Text = gradeValue
    End Sub

    Private Function computeLetterGrade(g As String) As String
        Try
            gradeDecimal = CDec(g)
        Catch ex As Exception

        End Try

        'If gradeDecimal >= 90 Then
        '    gradeValue = "A"
        'ElseIf gradeDecimal >= 80 Then
        '    gradeValue = "B"
        'ElseIf gradeDecimal >= 70 Then
        '    gradeValue = "C"
        'ElseIf gradeDecimal >= 60 Then
        '    gradeValue = "D"
        'Else
        '    gradeValue = "E"
        'End If

        Select Case gradeDecimal
            Case Is >= 90
                gradeValue = "A"
            Case 80 To 90
                gradeValue = "B"
            Case 70 To 80
                gradeValue = "C"
            Case 50 To 60
                gradeValue = "D"
            Case Else
                gradeValue = "E"

        End Select

        Return gradeValue
    End Function

End Class
