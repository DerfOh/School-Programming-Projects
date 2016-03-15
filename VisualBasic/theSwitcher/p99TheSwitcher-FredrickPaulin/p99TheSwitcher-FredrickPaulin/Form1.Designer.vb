<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class MainForm
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(MainForm))
        Me.textBoxName = New System.Windows.Forms.TextBox()
        Me.labelName = New System.Windows.Forms.Label()
        Me.colorPickerButtonGroup = New System.Windows.Forms.GroupBox()
        Me.radioButtonGreen = New System.Windows.Forms.RadioButton()
        Me.radioButtonRed = New System.Windows.Forms.RadioButton()
        Me.radioButtonBlue = New System.Windows.Forms.RadioButton()
        Me.radioButtonBlack = New System.Windows.Forms.RadioButton()
        Me.pictureLightOff = New System.Windows.Forms.PictureBox()
        Me.pictureLightOn = New System.Windows.Forms.PictureBox()
        Me.labelUserMessage = New System.Windows.Forms.Label()
        Me.buttonPrint = New System.Windows.Forms.Button()
        Me.buttonExit = New System.Windows.Forms.Button()
        Me.labelCredits = New System.Windows.Forms.Label()
        Me.ToolTip = New System.Windows.Forms.ToolTip(Me.components)
        Me.PrintForm = New Microsoft.VisualBasic.PowerPacks.Printing.PrintForm(Me.components)
        Me.colorPickerButtonGroup.SuspendLayout()
        CType(Me.pictureLightOff, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.pictureLightOn, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'textBoxName
        '
        Me.textBoxName.Location = New System.Drawing.Point(223, 25)
        Me.textBoxName.Name = "textBoxName"
        Me.textBoxName.Size = New System.Drawing.Size(270, 20)
        Me.textBoxName.TabIndex = 0
        '
        'labelName
        '
        Me.labelName.AutoSize = True
        Me.labelName.Location = New System.Drawing.Point(167, 25)
        Me.labelName.Name = "labelName"
        Me.labelName.Size = New System.Drawing.Size(38, 13)
        Me.labelName.TabIndex = 1
        Me.labelName.Text = "Name:"
        '
        'colorPickerButtonGroup
        '
        Me.colorPickerButtonGroup.Controls.Add(Me.radioButtonGreen)
        Me.colorPickerButtonGroup.Controls.Add(Me.radioButtonRed)
        Me.colorPickerButtonGroup.Controls.Add(Me.radioButtonBlue)
        Me.colorPickerButtonGroup.Controls.Add(Me.radioButtonBlack)
        Me.colorPickerButtonGroup.Location = New System.Drawing.Point(12, 72)
        Me.colorPickerButtonGroup.Name = "colorPickerButtonGroup"
        Me.colorPickerButtonGroup.Size = New System.Drawing.Size(134, 155)
        Me.colorPickerButtonGroup.TabIndex = 2
        Me.colorPickerButtonGroup.TabStop = False
        Me.colorPickerButtonGroup.Text = "Choose a Color"
        '
        'radioButtonGreen
        '
        Me.radioButtonGreen.AutoSize = True
        Me.radioButtonGreen.ForeColor = System.Drawing.Color.Green
        Me.radioButtonGreen.Location = New System.Drawing.Point(7, 117)
        Me.radioButtonGreen.Name = "radioButtonGreen"
        Me.radioButtonGreen.Size = New System.Drawing.Size(54, 17)
        Me.radioButtonGreen.TabIndex = 3
        Me.radioButtonGreen.TabStop = True
        Me.radioButtonGreen.Text = "Gr&een"
        Me.radioButtonGreen.UseVisualStyleBackColor = True
        '
        'radioButtonRed
        '
        Me.radioButtonRed.AutoSize = True
        Me.radioButtonRed.ForeColor = System.Drawing.Color.Red
        Me.radioButtonRed.Location = New System.Drawing.Point(7, 93)
        Me.radioButtonRed.Name = "radioButtonRed"
        Me.radioButtonRed.Size = New System.Drawing.Size(45, 17)
        Me.radioButtonRed.TabIndex = 2
        Me.radioButtonRed.TabStop = True
        Me.radioButtonRed.Text = "Re&d"
        Me.radioButtonRed.UseVisualStyleBackColor = True
        '
        'radioButtonBlue
        '
        Me.radioButtonBlue.AutoSize = True
        Me.radioButtonBlue.ForeColor = System.Drawing.Color.Blue
        Me.radioButtonBlue.Location = New System.Drawing.Point(7, 69)
        Me.radioButtonBlue.Name = "radioButtonBlue"
        Me.radioButtonBlue.Size = New System.Drawing.Size(46, 17)
        Me.radioButtonBlue.TabIndex = 1
        Me.radioButtonBlue.TabStop = True
        Me.radioButtonBlue.Text = "Bl&ue"
        Me.radioButtonBlue.UseVisualStyleBackColor = True
        '
        'radioButtonBlack
        '
        Me.radioButtonBlack.AutoSize = True
        Me.radioButtonBlack.Location = New System.Drawing.Point(7, 45)
        Me.radioButtonBlack.Name = "radioButtonBlack"
        Me.radioButtonBlack.Size = New System.Drawing.Size(52, 17)
        Me.radioButtonBlack.TabIndex = 0
        Me.radioButtonBlack.TabStop = True
        Me.radioButtonBlack.Text = "Bl&ack"
        Me.radioButtonBlack.UseVisualStyleBackColor = True
        '
        'pictureLightOff
        '
        Me.pictureLightOff.Image = CType(resources.GetObject("pictureLightOff.Image"), System.Drawing.Image)
        Me.pictureLightOff.Location = New System.Drawing.Point(364, 72)
        Me.pictureLightOff.Name = "pictureLightOff"
        Me.pictureLightOff.Size = New System.Drawing.Size(129, 134)
        Me.pictureLightOff.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.pictureLightOff.TabIndex = 3
        Me.pictureLightOff.TabStop = False
        Me.ToolTip.SetToolTip(Me.pictureLightOff, "Click to turn the light on")
        '
        'pictureLightOn
        '
        Me.pictureLightOn.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.pictureLightOn.Image = CType(resources.GetObject("pictureLightOn.Image"), System.Drawing.Image)
        Me.pictureLightOn.Location = New System.Drawing.Point(364, 72)
        Me.pictureLightOn.Name = "pictureLightOn"
        Me.pictureLightOn.Size = New System.Drawing.Size(129, 134)
        Me.pictureLightOn.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.pictureLightOn.TabIndex = 4
        Me.pictureLightOn.TabStop = False
        Me.ToolTip.SetToolTip(Me.pictureLightOn, "Click to turn the light off")
        Me.pictureLightOn.Visible = False
        '
        'labelUserMessage
        '
        Me.labelUserMessage.AutoSize = True
        Me.labelUserMessage.Location = New System.Drawing.Point(355, 209)
        Me.labelUserMessage.Name = "labelUserMessage"
        Me.labelUserMessage.Size = New System.Drawing.Size(0, 13)
        Me.labelUserMessage.TabIndex = 5
        '
        'buttonPrint
        '
        Me.buttonPrint.Location = New System.Drawing.Point(350, 258)
        Me.buttonPrint.Name = "buttonPrint"
        Me.buttonPrint.Size = New System.Drawing.Size(75, 23)
        Me.buttonPrint.TabIndex = 6
        Me.buttonPrint.Text = "&Print"
        Me.buttonPrint.UseVisualStyleBackColor = True
        '
        'buttonExit
        '
        Me.buttonExit.Location = New System.Drawing.Point(431, 258)
        Me.buttonExit.Name = "buttonExit"
        Me.buttonExit.Size = New System.Drawing.Size(75, 23)
        Me.buttonExit.TabIndex = 7
        Me.buttonExit.Text = "E&xit"
        Me.buttonExit.UseVisualStyleBackColor = True
        '
        'labelCredits
        '
        Me.labelCredits.AutoSize = True
        Me.labelCredits.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.labelCredits.ForeColor = System.Drawing.SystemColors.ControlText
        Me.labelCredits.Location = New System.Drawing.Point(9, 268)
        Me.labelCredits.Name = "labelCredits"
        Me.labelCredits.Size = New System.Drawing.Size(158, 15)
        Me.labelCredits.TabIndex = 8
        Me.labelCredits.Text = "Programmed by: Fredrick Paulin"
        '
        'PrintForm
        '
        Me.PrintForm.DocumentName = "document"
        Me.PrintForm.Form = Me
        Me.PrintForm.PrintAction = System.Drawing.Printing.PrintAction.PrintToFile
        Me.PrintForm.PrinterSettings = CType(resources.GetObject("PrintForm.PrinterSettings"), System.Drawing.Printing.PrinterSettings)
        Me.PrintForm.PrintFileName = Nothing
        '
        'MainForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(545, 339)
        Me.Controls.Add(Me.labelCredits)
        Me.Controls.Add(Me.buttonExit)
        Me.Controls.Add(Me.buttonPrint)
        Me.Controls.Add(Me.labelUserMessage)
        Me.Controls.Add(Me.pictureLightOff)
        Me.Controls.Add(Me.colorPickerButtonGroup)
        Me.Controls.Add(Me.labelName)
        Me.Controls.Add(Me.textBoxName)
        Me.Controls.Add(Me.pictureLightOn)
        Me.Name = "MainForm"
        Me.Text = "The Switcher -- Fredrick Paulin"
        Me.colorPickerButtonGroup.ResumeLayout(False)
        Me.colorPickerButtonGroup.PerformLayout()
        CType(Me.pictureLightOff, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.pictureLightOn, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents textBoxName As System.Windows.Forms.TextBox
    Friend WithEvents labelName As System.Windows.Forms.Label
    Friend WithEvents colorPickerButtonGroup As System.Windows.Forms.GroupBox
    Friend WithEvents radioButtonGreen As System.Windows.Forms.RadioButton
    Friend WithEvents radioButtonRed As System.Windows.Forms.RadioButton
    Friend WithEvents radioButtonBlue As System.Windows.Forms.RadioButton
    Friend WithEvents radioButtonBlack As System.Windows.Forms.RadioButton
    Friend WithEvents pictureLightOff As System.Windows.Forms.PictureBox
    Friend WithEvents pictureLightOn As System.Windows.Forms.PictureBox
    Friend WithEvents labelUserMessage As System.Windows.Forms.Label
    Friend WithEvents buttonPrint As System.Windows.Forms.Button
    Friend WithEvents buttonExit As System.Windows.Forms.Button
    Friend WithEvents labelCredits As System.Windows.Forms.Label
    Friend WithEvents ToolTip As System.Windows.Forms.ToolTip
    Friend WithEvents PrintForm As Microsoft.VisualBasic.PowerPacks.Printing.PrintForm

End Class
