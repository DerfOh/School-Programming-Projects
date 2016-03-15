Public Class MainForm


    Private Sub MainForm_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    'method to handle what to do when the light bulb is clicked
    Private Sub lightSwitch()
        If pictureLightOff.Visible Then
            pictureLightOn.Visible = True
            pictureLightOff.Visible = False
            labelUserMessage.Text = "Turn off the light, " + textBoxName.Text

        ElseIf pictureLightOn.Visible Then
            pictureLightOn.Visible = False
            pictureLightOff.Visible = True
            labelUserMessage.Text = "Turn on the light, " + textBoxName.Text
        End If
    End Sub

    'function for changing the font color of the entire program
    Private Sub changeColors(c As Color)
        labelCredits.ForeColor = c
        labelUserMessage.ForeColor = c
        colorPickerButtonGroup.ForeColor = c
        labelName.ForeColor = c
        buttonPrint.ForeColor = c
        buttonExit.ForeColor = c
        textBoxName.ForeColor = c
    End Sub


    'implement button listeners
    Private Sub buttonExit_Click(sender As Object, e As EventArgs) Handles buttonExit.Click
        Me.Close()

    End Sub

    'button prints the form to a preview
    Private Sub buttonPrint_Click(sender As Object, e As EventArgs) Handles buttonPrint.Click
        PrintForm.Print()

    End Sub

    'handles when the not currently lit light is clicked on
    Private Sub pictureLightOff_Click(sender As Object, e As EventArgs) Handles pictureLightOff.Click
        lightSwitch()
    End Sub

    'handles when the lit light is clicked on
    Private Sub pictureLightOn_Click(sender As Object, e As EventArgs) Handles pictureLightOn.Click
        lightSwitch()
    End Sub

    'changes the font colors of the entire form to black
    Private Sub radioButtonBlack_CheckedChanged(sender As Object, e As EventArgs) Handles radioButtonBlack.CheckedChanged
        changeColors(Color.Black)
    End Sub

    'changes the font colors of the entire form to blue
    Private Sub radioButtonBlue_CheckedChanged(sender As Object, e As EventArgs) Handles radioButtonBlue.CheckedChanged
        changeColors(Color.Blue)
    End Sub

    'changes the font colors of the entire form to red
    Private Sub radioButtonRed_CheckedChanged(sender As Object, e As EventArgs) Handles radioButtonRed.CheckedChanged
        changeColors(Color.Red)
    End Sub

    'changes the font colors of the entire form to green
    Private Sub radioButtonGreen_CheckedChanged(sender As Object, e As EventArgs) Handles radioButtonGreen.CheckedChanged
        changeColors(Color.Green)
    End Sub
End Class
