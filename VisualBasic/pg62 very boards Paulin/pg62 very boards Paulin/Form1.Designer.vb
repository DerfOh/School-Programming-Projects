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
        Me.buttonDownTown = New System.Windows.Forms.Button()
        Me.buttonMall = New System.Windows.Forms.Button()
        Me.buttonSuburbs = New System.Windows.Forms.Button()
        Me.buttonPrint = New System.Windows.Forms.Button()
        Me.buttonClose = New System.Windows.Forms.Button()
        Me.nameLabel = New System.Windows.Forms.Label()
        Me.labelDisplay = New System.Windows.Forms.Label()
        Me.PrintForm1 = New Microsoft.VisualBasic.PowerPacks.Printing.PrintForm(Me.components)
        Me.SuspendLayout()
        '
        'buttonDownTown
        '
        Me.buttonDownTown.Location = New System.Drawing.Point(31, 23)
        Me.buttonDownTown.Name = "buttonDownTown"
        Me.buttonDownTown.Size = New System.Drawing.Size(75, 23)
        Me.buttonDownTown.TabIndex = 0
        Me.buttonDownTown.Text = "Down-Town"
        Me.buttonDownTown.UseVisualStyleBackColor = True
        '
        'buttonMall
        '
        Me.buttonMall.Location = New System.Drawing.Point(112, 23)
        Me.buttonMall.Name = "buttonMall"
        Me.buttonMall.Size = New System.Drawing.Size(75, 23)
        Me.buttonMall.TabIndex = 1
        Me.buttonMall.Text = "Mall"
        Me.buttonMall.UseVisualStyleBackColor = True
        '
        'buttonSuburbs
        '
        Me.buttonSuburbs.Location = New System.Drawing.Point(193, 23)
        Me.buttonSuburbs.Name = "buttonSuburbs"
        Me.buttonSuburbs.Size = New System.Drawing.Size(75, 23)
        Me.buttonSuburbs.TabIndex = 2
        Me.buttonSuburbs.Text = "Suburbs"
        Me.buttonSuburbs.UseVisualStyleBackColor = True
        '
        'buttonPrint
        '
        Me.buttonPrint.Location = New System.Drawing.Point(31, 120)
        Me.buttonPrint.Name = "buttonPrint"
        Me.buttonPrint.Size = New System.Drawing.Size(75, 23)
        Me.buttonPrint.TabIndex = 3
        Me.buttonPrint.Text = "Print"
        Me.buttonPrint.UseVisualStyleBackColor = True
        '
        'buttonClose
        '
        Me.buttonClose.Location = New System.Drawing.Point(193, 120)
        Me.buttonClose.Name = "buttonClose"
        Me.buttonClose.Size = New System.Drawing.Size(75, 23)
        Me.buttonClose.TabIndex = 5
        Me.buttonClose.Text = "Close"
        Me.buttonClose.UseVisualStyleBackColor = True
        '
        'nameLabel
        '
        Me.nameLabel.AutoSize = True
        Me.nameLabel.Location = New System.Drawing.Point(204, 152)
        Me.nameLabel.Name = "nameLabel"
        Me.nameLabel.Size = New System.Drawing.Size(91, 13)
        Me.nameLabel.TabIndex = 6
        Me.nameLabel.Text = "by Fredrick Paulin"
        '
        'labelDisplay
        '
        Me.labelDisplay.BackColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(255, Byte), Integer))
        Me.labelDisplay.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.labelDisplay.Font = New System.Drawing.Font("Poor Richard", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.labelDisplay.Location = New System.Drawing.Point(28, 49)
        Me.labelDisplay.Name = "labelDisplay"
        Me.labelDisplay.Size = New System.Drawing.Size(240, 68)
        Me.labelDisplay.TabIndex = 7
        Me.labelDisplay.Text = "Hello! Please make a selection to view hours and location information."
        '
        'PrintForm1
        '
        Me.PrintForm1.DocumentName = "document"
        Me.PrintForm1.Form = Me
        Me.PrintForm1.PrintAction = System.Drawing.Printing.PrintAction.PrintToPreview
        Me.PrintForm1.PrinterSettings = CType(resources.GetObject("PrintForm1.PrinterSettings"), System.Drawing.Printing.PrinterSettings)
        Me.PrintForm1.PrintFileName = Nothing
        '
        'MainForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(307, 174)
        Me.Controls.Add(Me.labelDisplay)
        Me.Controls.Add(Me.nameLabel)
        Me.Controls.Add(Me.buttonClose)
        Me.Controls.Add(Me.buttonPrint)
        Me.Controls.Add(Me.buttonSuburbs)
        Me.Controls.Add(Me.buttonMall)
        Me.Controls.Add(Me.buttonDownTown)
        Me.Name = "MainForm"
        Me.Text = "Very Boards -- Fredrick Paulin"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents buttonDownTown As System.Windows.Forms.Button
    Friend WithEvents buttonMall As System.Windows.Forms.Button
    Friend WithEvents buttonSuburbs As System.Windows.Forms.Button
    Friend WithEvents buttonPrint As System.Windows.Forms.Button
    Friend WithEvents buttonClose As System.Windows.Forms.Button
    Friend WithEvents nameLabel As System.Windows.Forms.Label
    Friend WithEvents labelDisplay As System.Windows.Forms.Label
    Friend WithEvents PrintForm1 As Microsoft.VisualBasic.PowerPacks.Printing.PrintForm

End Class
