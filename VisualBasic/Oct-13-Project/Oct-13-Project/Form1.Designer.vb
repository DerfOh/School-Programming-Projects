<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class mainForm
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
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.num1TextBox = New System.Windows.Forms.TextBox()
        Me.num2TextBox = New System.Windows.Forms.TextBox()
        Me.answerLabel = New System.Windows.Forms.Label()
        Me.computeButton = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 15)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(87, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Enter in currency"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(12, 41)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(87, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Enter in currency"
        '
        'num1TextBox
        '
        Me.num1TextBox.Location = New System.Drawing.Point(105, 12)
        Me.num1TextBox.Name = "num1TextBox"
        Me.num1TextBox.Size = New System.Drawing.Size(189, 20)
        Me.num1TextBox.TabIndex = 2
        '
        'num2TextBox
        '
        Me.num2TextBox.Location = New System.Drawing.Point(105, 38)
        Me.num2TextBox.Name = "num2TextBox"
        Me.num2TextBox.Size = New System.Drawing.Size(189, 20)
        Me.num2TextBox.TabIndex = 3
        '
        'answerLabel
        '
        Me.answerLabel.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.answerLabel.Location = New System.Drawing.Point(194, 61)
        Me.answerLabel.Name = "answerLabel"
        Me.answerLabel.Size = New System.Drawing.Size(100, 23)
        Me.answerLabel.TabIndex = 4
        '
        'computeButton
        '
        Me.computeButton.Location = New System.Drawing.Point(219, 87)
        Me.computeButton.Name = "computeButton"
        Me.computeButton.Size = New System.Drawing.Size(75, 23)
        Me.computeButton.TabIndex = 5
        Me.computeButton.Text = "Compute"
        Me.computeButton.UseVisualStyleBackColor = True
        '
        'mainForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.CausesValidation = False
        Me.ClientSize = New System.Drawing.Size(306, 125)
        Me.Controls.Add(Me.computeButton)
        Me.Controls.Add(Me.answerLabel)
        Me.Controls.Add(Me.num2TextBox)
        Me.Controls.Add(Me.num1TextBox)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "mainForm"
        Me.Text = "Currency adder -- Fredrick Paulin"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents num1TextBox As System.Windows.Forms.TextBox
    Friend WithEvents num2TextBox As System.Windows.Forms.TextBox
    Friend WithEvents answerLabel As System.Windows.Forms.Label
    Friend WithEvents computeButton As System.Windows.Forms.Button

End Class
