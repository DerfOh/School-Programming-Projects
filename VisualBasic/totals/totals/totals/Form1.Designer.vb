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
        Me.testScore1Label = New System.Windows.Forms.Label()
        Me.testScore2label = New System.Windows.Forms.Label()
        Me.totalsLabel = New System.Windows.Forms.Label()
        Me.answerLabel = New System.Windows.Forms.Label()
        Me.testScore1 = New System.Windows.Forms.TextBox()
        Me.testScore2 = New System.Windows.Forms.TextBox()
        Me.calculateButton = New System.Windows.Forms.Button()
        Me.testScore4 = New System.Windows.Forms.TextBox()
        Me.testScore5 = New System.Windows.Forms.TextBox()
        Me.testScore3 = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'testScore1Label
        '
        Me.testScore1Label.AutoSize = True
        Me.testScore1Label.Location = New System.Drawing.Point(12, 40)
        Me.testScore1Label.Name = "testScore1Label"
        Me.testScore1Label.Size = New System.Drawing.Size(68, 13)
        Me.testScore1Label.TabIndex = 0
        Me.testScore1Label.Text = "Test Score 1"
        '
        'testScore2label
        '
        Me.testScore2label.AutoSize = True
        Me.testScore2label.Location = New System.Drawing.Point(12, 66)
        Me.testScore2label.Name = "testScore2label"
        Me.testScore2label.Size = New System.Drawing.Size(68, 13)
        Me.testScore2label.TabIndex = 1
        Me.testScore2label.Text = "Test Score 2"
        '
        'totalsLabel
        '
        Me.totalsLabel.AutoSize = True
        Me.totalsLabel.Location = New System.Drawing.Point(12, 172)
        Me.totalsLabel.Name = "totalsLabel"
        Me.totalsLabel.Size = New System.Drawing.Size(47, 13)
        Me.totalsLabel.TabIndex = 2
        Me.totalsLabel.Text = "Average"
        '
        'answerLabel
        '
        Me.answerLabel.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.answerLabel.Location = New System.Drawing.Point(148, 162)
        Me.answerLabel.Name = "answerLabel"
        Me.answerLabel.Size = New System.Drawing.Size(100, 23)
        Me.answerLabel.TabIndex = 3
        '
        'testScore1
        '
        Me.testScore1.Location = New System.Drawing.Point(148, 33)
        Me.testScore1.Name = "testScore1"
        Me.testScore1.Size = New System.Drawing.Size(100, 20)
        Me.testScore1.TabIndex = 4
        '
        'testScore2
        '
        Me.testScore2.Location = New System.Drawing.Point(148, 59)
        Me.testScore2.Name = "testScore2"
        Me.testScore2.Size = New System.Drawing.Size(100, 20)
        Me.testScore2.TabIndex = 5
        '
        'calculateButton
        '
        Me.calculateButton.Location = New System.Drawing.Point(289, 162)
        Me.calculateButton.Name = "calculateButton"
        Me.calculateButton.Size = New System.Drawing.Size(75, 23)
        Me.calculateButton.TabIndex = 6
        Me.calculateButton.Text = "Calculate"
        Me.calculateButton.UseVisualStyleBackColor = True
        '
        'testScore4
        '
        Me.testScore4.Location = New System.Drawing.Point(148, 111)
        Me.testScore4.Name = "testScore4"
        Me.testScore4.Size = New System.Drawing.Size(100, 20)
        Me.testScore4.TabIndex = 9
        '
        'testScore5
        '
        Me.testScore5.Location = New System.Drawing.Point(148, 137)
        Me.testScore5.Name = "testScore5"
        Me.testScore5.Size = New System.Drawing.Size(100, 20)
        Me.testScore5.TabIndex = 10
        '
        'testScore3
        '
        Me.testScore3.Location = New System.Drawing.Point(148, 85)
        Me.testScore3.Name = "testScore3"
        Me.testScore3.Size = New System.Drawing.Size(100, 20)
        Me.testScore3.TabIndex = 11
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 92)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(68, 13)
        Me.Label1.TabIndex = 12
        Me.Label1.Text = "Test Score 3"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(12, 118)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(68, 13)
        Me.Label2.TabIndex = 13
        Me.Label2.Text = "Test Score 4"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(12, 144)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(68, 13)
        Me.Label3.TabIndex = 14
        Me.Label3.Text = "Test Score 5"
        '
        'MainForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(380, 203)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.testScore3)
        Me.Controls.Add(Me.testScore5)
        Me.Controls.Add(Me.testScore4)
        Me.Controls.Add(Me.calculateButton)
        Me.Controls.Add(Me.testScore2)
        Me.Controls.Add(Me.testScore1)
        Me.Controls.Add(Me.answerLabel)
        Me.Controls.Add(Me.totalsLabel)
        Me.Controls.Add(Me.testScore2label)
        Me.Controls.Add(Me.testScore1Label)
        Me.Name = "MainForm"
        Me.Text = "Totals -- Fredrick Paulin"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents testScore1Label As System.Windows.Forms.Label
    Friend WithEvents testScore2label As System.Windows.Forms.Label
    Friend WithEvents totalsLabel As System.Windows.Forms.Label
    Friend WithEvents answerLabel As System.Windows.Forms.Label
    Friend WithEvents testScore1 As System.Windows.Forms.TextBox
    Friend WithEvents testScore2 As System.Windows.Forms.TextBox
    Friend WithEvents calculateButton As System.Windows.Forms.Button
    Friend WithEvents testScore4 As System.Windows.Forms.TextBox
    Friend WithEvents testScore5 As System.Windows.Forms.TextBox
    Friend WithEvents testScore3 As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label

End Class
