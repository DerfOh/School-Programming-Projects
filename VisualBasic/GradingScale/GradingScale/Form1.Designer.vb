<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
        Me.resultLabel = New System.Windows.Forms.Label()
        Me.gradeTextBox = New System.Windows.Forms.TextBox()
        Me.calculateButton = New System.Windows.Forms.Button()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(10, 15)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(89, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Enter The Grade:"
        '
        'resultLabel
        '
        Me.resultLabel.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.resultLabel.Location = New System.Drawing.Point(211, 64)
        Me.resultLabel.Name = "resultLabel"
        Me.resultLabel.Size = New System.Drawing.Size(42, 23)
        Me.resultLabel.TabIndex = 1
        Me.resultLabel.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'gradeTextBox
        '
        Me.gradeTextBox.Location = New System.Drawing.Point(105, 12)
        Me.gradeTextBox.Name = "gradeTextBox"
        Me.gradeTextBox.Size = New System.Drawing.Size(148, 20)
        Me.gradeTextBox.TabIndex = 2
        '
        'calculateButton
        '
        Me.calculateButton.Location = New System.Drawing.Point(153, 38)
        Me.calculateButton.Name = "calculateButton"
        Me.calculateButton.Size = New System.Drawing.Size(100, 23)
        Me.calculateButton.TabIndex = 3
        Me.calculateButton.Text = "Calculate Grade"
        Me.calculateButton.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(166, 65)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(39, 13)
        Me.Label2.TabIndex = 4
        Me.Label2.Text = "Grade:"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(265, 111)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.calculateButton)
        Me.Controls.Add(Me.gradeTextBox)
        Me.Controls.Add(Me.resultLabel)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Grading Scale --Fredrick Paulin"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents resultLabel As System.Windows.Forms.Label
    Friend WithEvents gradeTextBox As System.Windows.Forms.TextBox
    Friend WithEvents calculateButton As System.Windows.Forms.Button
    Friend WithEvents Label2 As System.Windows.Forms.Label

End Class
