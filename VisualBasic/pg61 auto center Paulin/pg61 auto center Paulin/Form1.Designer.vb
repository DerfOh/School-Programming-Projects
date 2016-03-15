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
        Me.PrintForm1 = New Microsoft.VisualBasic.PowerPacks.Printing.PrintForm(Me.components)
        Me.buttonAutoSales = New System.Windows.Forms.Button()
        Me.buttonServiceCenter = New System.Windows.Forms.Button()
        Me.buttonDetailShop = New System.Windows.Forms.Button()
        Me.buttonEmployment = New System.Windows.Forms.Button()
        Me.textLabelDisplay = New System.Windows.Forms.Label()
        Me.buttonPrint = New System.Windows.Forms.Button()
        Me.buttonExit = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'PrintForm1
        '
        Me.PrintForm1.DocumentName = "document"
        Me.PrintForm1.Form = Me
        Me.PrintForm1.PrintAction = System.Drawing.Printing.PrintAction.PrintToPreview
        Me.PrintForm1.PrinterSettings = CType(resources.GetObject("PrintForm1.PrinterSettings"), System.Drawing.Printing.PrinterSettings)
        Me.PrintForm1.PrintFileName = Nothing
        '
        'buttonAutoSales
        '
        Me.buttonAutoSales.AccessibleName = ""
        Me.buttonAutoSales.Location = New System.Drawing.Point(3, 1)
        Me.buttonAutoSales.Name = "buttonAutoSales"
        Me.buttonAutoSales.Size = New System.Drawing.Size(84, 55)
        Me.buttonAutoSales.TabIndex = 0
        Me.buttonAutoSales.Text = "Auto Sales"
        Me.buttonAutoSales.UseVisualStyleBackColor = True
        '
        'buttonServiceCenter
        '
        Me.buttonServiceCenter.Location = New System.Drawing.Point(93, 1)
        Me.buttonServiceCenter.Name = "buttonServiceCenter"
        Me.buttonServiceCenter.Size = New System.Drawing.Size(84, 55)
        Me.buttonServiceCenter.TabIndex = 1
        Me.buttonServiceCenter.Text = "Service Center"
        Me.buttonServiceCenter.UseVisualStyleBackColor = True
        '
        'buttonDetailShop
        '
        Me.buttonDetailShop.Location = New System.Drawing.Point(183, 1)
        Me.buttonDetailShop.Name = "buttonDetailShop"
        Me.buttonDetailShop.Size = New System.Drawing.Size(84, 55)
        Me.buttonDetailShop.TabIndex = 2
        Me.buttonDetailShop.Text = "Detail Shop"
        Me.buttonDetailShop.UseVisualStyleBackColor = True
        '
        'buttonEmployment
        '
        Me.buttonEmployment.Location = New System.Drawing.Point(273, 1)
        Me.buttonEmployment.Name = "buttonEmployment"
        Me.buttonEmployment.Size = New System.Drawing.Size(84, 55)
        Me.buttonEmployment.TabIndex = 3
        Me.buttonEmployment.Text = "Employment Opportunities"
        Me.buttonEmployment.UseVisualStyleBackColor = True
        '
        'textLabelDisplay
        '
        Me.textLabelDisplay.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.textLabelDisplay.Location = New System.Drawing.Point(3, 59)
        Me.textLabelDisplay.Name = "textLabelDisplay"
        Me.textLabelDisplay.Size = New System.Drawing.Size(354, 22)
        Me.textLabelDisplay.TabIndex = 4
        '
        'buttonPrint
        '
        Me.buttonPrint.Location = New System.Drawing.Point(3, 93)
        Me.buttonPrint.Name = "buttonPrint"
        Me.buttonPrint.Size = New System.Drawing.Size(174, 23)
        Me.buttonPrint.TabIndex = 5
        Me.buttonPrint.Text = "Print"
        Me.buttonPrint.UseVisualStyleBackColor = True
        '
        'buttonExit
        '
        Me.buttonExit.Location = New System.Drawing.Point(282, 93)
        Me.buttonExit.Name = "buttonExit"
        Me.buttonExit.Size = New System.Drawing.Size(75, 23)
        Me.buttonExit.TabIndex = 6
        Me.buttonExit.Text = "Exit"
        Me.buttonExit.UseVisualStyleBackColor = True
        '
        'MainForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(361, 128)
        Me.Controls.Add(Me.buttonExit)
        Me.Controls.Add(Me.buttonPrint)
        Me.Controls.Add(Me.textLabelDisplay)
        Me.Controls.Add(Me.buttonEmployment)
        Me.Controls.Add(Me.buttonDetailShop)
        Me.Controls.Add(Me.buttonServiceCenter)
        Me.Controls.Add(Me.buttonAutoSales)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D
        Me.Name = "MainForm"
        Me.Text = "Fredrick Paulin -- VB Autocenter"
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents PrintForm1 As Microsoft.VisualBasic.PowerPacks.Printing.PrintForm
    Friend WithEvents textLabelDisplay As System.Windows.Forms.Label
    Friend WithEvents buttonEmployment As System.Windows.Forms.Button
    Friend WithEvents buttonDetailShop As System.Windows.Forms.Button
    Friend WithEvents buttonServiceCenter As System.Windows.Forms.Button
    Friend WithEvents buttonAutoSales As System.Windows.Forms.Button
    Friend WithEvents buttonPrint As System.Windows.Forms.Button
    Friend WithEvents buttonExit As System.Windows.Forms.Button

End Class
