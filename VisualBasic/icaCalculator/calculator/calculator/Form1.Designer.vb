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
        Me.addButton = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.numTextBox1 = New System.Windows.Forms.TextBox()
        Me.numTextBox2 = New System.Windows.Forms.TextBox()
        Me.resultLabel = New System.Windows.Forms.Label()
        Me.intDivisionButton = New System.Windows.Forms.Button()
        Me.modulusButton = New System.Windows.Forms.Button()
        Me.divideButton = New System.Windows.Forms.Button()
        Me.multiplyButton = New System.Windows.Forms.Button()
        Me.subtractButton = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'addButton
        '
        Me.addButton.Location = New System.Drawing.Point(118, 68)
        Me.addButton.Name = "addButton"
        Me.addButton.Size = New System.Drawing.Size(75, 23)
        Me.addButton.TabIndex = 0
        Me.addButton.Text = "Add"
        Me.addButton.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(8, 15)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(79, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Enter a number"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(8, 45)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(79, 13)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Enter a number"
        '
        'numTextBox1
        '
        Me.numTextBox1.Location = New System.Drawing.Point(93, 12)
        Me.numTextBox1.Name = "numTextBox1"
        Me.numTextBox1.Size = New System.Drawing.Size(100, 20)
        Me.numTextBox1.TabIndex = 3
        '
        'numTextBox2
        '
        Me.numTextBox2.Location = New System.Drawing.Point(93, 42)
        Me.numTextBox2.Name = "numTextBox2"
        Me.numTextBox2.Size = New System.Drawing.Size(100, 20)
        Me.numTextBox2.TabIndex = 4
        '
        'resultLabel
        '
        Me.resultLabel.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.resultLabel.Location = New System.Drawing.Point(8, 301)
        Me.resultLabel.Name = "resultLabel"
        Me.resultLabel.Size = New System.Drawing.Size(185, 30)
        Me.resultLabel.TabIndex = 5
        '
        'intDivisionButton
        '
        Me.intDivisionButton.Location = New System.Drawing.Point(119, 213)
        Me.intDivisionButton.Name = "intDivisionButton"
        Me.intDivisionButton.Size = New System.Drawing.Size(75, 23)
        Me.intDivisionButton.TabIndex = 6
        Me.intDivisionButton.Text = "Int Divide"
        Me.intDivisionButton.UseVisualStyleBackColor = True
        '
        'modulusButton
        '
        Me.modulusButton.Location = New System.Drawing.Point(118, 184)
        Me.modulusButton.Name = "modulusButton"
        Me.modulusButton.Size = New System.Drawing.Size(75, 23)
        Me.modulusButton.TabIndex = 7
        Me.modulusButton.Text = "Mod"
        Me.modulusButton.UseVisualStyleBackColor = True
        '
        'divideButton
        '
        Me.divideButton.Location = New System.Drawing.Point(118, 155)
        Me.divideButton.Name = "divideButton"
        Me.divideButton.Size = New System.Drawing.Size(75, 23)
        Me.divideButton.TabIndex = 8
        Me.divideButton.Text = "Divide"
        Me.divideButton.UseVisualStyleBackColor = True
        '
        'multiplyButton
        '
        Me.multiplyButton.Location = New System.Drawing.Point(119, 126)
        Me.multiplyButton.Name = "multiplyButton"
        Me.multiplyButton.Size = New System.Drawing.Size(75, 23)
        Me.multiplyButton.TabIndex = 9
        Me.multiplyButton.Text = "Multiply"
        Me.multiplyButton.UseVisualStyleBackColor = True
        '
        'subtractButton
        '
        Me.subtractButton.Location = New System.Drawing.Point(119, 97)
        Me.subtractButton.Name = "subtractButton"
        Me.subtractButton.Size = New System.Drawing.Size(75, 23)
        Me.subtractButton.TabIndex = 10
        Me.subtractButton.Text = "Subtract"
        Me.subtractButton.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(206, 340)
        Me.Controls.Add(Me.subtractButton)
        Me.Controls.Add(Me.multiplyButton)
        Me.Controls.Add(Me.divideButton)
        Me.Controls.Add(Me.modulusButton)
        Me.Controls.Add(Me.intDivisionButton)
        Me.Controls.Add(Me.resultLabel)
        Me.Controls.Add(Me.numTextBox2)
        Me.Controls.Add(Me.numTextBox1)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.addButton)
        Me.Name = "Form1"
        Me.Text = "Programmed by Fredrick Paulin"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents addButton As System.Windows.Forms.Button
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents numTextBox1 As System.Windows.Forms.TextBox
    Friend WithEvents numTextBox2 As System.Windows.Forms.TextBox
    Friend WithEvents resultLabel As System.Windows.Forms.Label
    Friend WithEvents intDivisionButton As System.Windows.Forms.Button
    Friend WithEvents modulusButton As System.Windows.Forms.Button
    Friend WithEvents divideButton As System.Windows.Forms.Button
    Friend WithEvents multiplyButton As System.Windows.Forms.Button
    Friend WithEvents subtractButton As System.Windows.Forms.Button

End Class
