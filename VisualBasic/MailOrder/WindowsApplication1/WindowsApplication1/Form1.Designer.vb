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
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.customerRelationsButton = New System.Windows.Forms.Button()
        Me.marketingButton = New System.Windows.Forms.Button()
        Me.processingButton = New System.Windows.Forms.Button()
        Me.shippingButton = New System.Windows.Forms.Button()
        Me.departmentLabel = New System.Windows.Forms.Label()
        Me.departmentContactLabel = New System.Windows.Forms.Label()
        Me.telephoneNumberLabel = New System.Windows.Forms.Label()
        Me.customerRelationsNameLabel = New System.Windows.Forms.Label()
        Me.marketingNameLabel = New System.Windows.Forms.Label()
        Me.orderProcessingNameLabel = New System.Windows.Forms.Label()
        Me.shippingNameLabel = New System.Windows.Forms.Label()
        Me.shippingNumberLabel = New System.Windows.Forms.Label()
        Me.orderProcessingNumberLabel = New System.Windows.Forms.Label()
        Me.marketingNumberLabel = New System.Windows.Forms.Label()
        Me.cusomterRelationsNumberLabel = New System.Windows.Forms.Label()
        Me.nameTextBox = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.visibleCheckBox = New System.Windows.Forms.CheckBox()
        Me.redRadioButton = New System.Windows.Forms.RadioButton()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.BackgroundWorker1 = New System.ComponentModel.BackgroundWorker()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.greenRadioButton = New System.Windows.Forms.RadioButton()
        Me.orangeRadioButton = New System.Windows.Forms.RadioButton()
        Me.blueRadioButton = New System.Windows.Forms.RadioButton()
        Me.clearButton = New System.Windows.Forms.Button()
        Me.closeButton = New System.Windows.Forms.Button()
        Me.PrintForm = New Microsoft.VisualBasic.PowerPacks.Printing.PrintForm(Me.components)
        Me.printButton = New System.Windows.Forms.Button()
        Me.PictureBox = New System.Windows.Forms.PictureBox()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.GroupBox1.SuspendLayout()
        CType(Me.PictureBox, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'customerRelationsButton
        '
        Me.customerRelationsButton.Location = New System.Drawing.Point(26, 81)
        Me.customerRelationsButton.Name = "customerRelationsButton"
        Me.customerRelationsButton.Size = New System.Drawing.Size(157, 61)
        Me.customerRelationsButton.TabIndex = 0
        Me.customerRelationsButton.Text = "Customer Relations"
        Me.customerRelationsButton.UseVisualStyleBackColor = True
        '
        'marketingButton
        '
        Me.marketingButton.Location = New System.Drawing.Point(26, 152)
        Me.marketingButton.Name = "marketingButton"
        Me.marketingButton.Size = New System.Drawing.Size(157, 61)
        Me.marketingButton.TabIndex = 1
        Me.marketingButton.Text = "Marketing"
        Me.marketingButton.UseVisualStyleBackColor = True
        '
        'processingButton
        '
        Me.processingButton.Location = New System.Drawing.Point(26, 215)
        Me.processingButton.Name = "processingButton"
        Me.processingButton.Size = New System.Drawing.Size(157, 61)
        Me.processingButton.TabIndex = 2
        Me.processingButton.Text = "Order Processing"
        Me.processingButton.UseVisualStyleBackColor = True
        '
        'shippingButton
        '
        Me.shippingButton.Location = New System.Drawing.Point(26, 282)
        Me.shippingButton.Name = "shippingButton"
        Me.shippingButton.Size = New System.Drawing.Size(157, 61)
        Me.shippingButton.TabIndex = 3
        Me.shippingButton.Text = "Shipping"
        Me.shippingButton.UseVisualStyleBackColor = True
        '
        'departmentLabel
        '
        Me.departmentLabel.AutoSize = True
        Me.departmentLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.departmentLabel.Location = New System.Drawing.Point(25, 65)
        Me.departmentLabel.Name = "departmentLabel"
        Me.departmentLabel.Size = New System.Drawing.Size(62, 13)
        Me.departmentLabel.TabIndex = 4
        Me.departmentLabel.Text = "Department"
        '
        'departmentContactLabel
        '
        Me.departmentContactLabel.AutoSize = True
        Me.departmentContactLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.departmentContactLabel.Location = New System.Drawing.Point(270, 65)
        Me.departmentContactLabel.Name = "departmentContactLabel"
        Me.departmentContactLabel.Size = New System.Drawing.Size(102, 13)
        Me.departmentContactLabel.TabIndex = 5
        Me.departmentContactLabel.Text = "Department Contact"
        '
        'telephoneNumberLabel
        '
        Me.telephoneNumberLabel.AutoSize = True
        Me.telephoneNumberLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.telephoneNumberLabel.Location = New System.Drawing.Point(558, 65)
        Me.telephoneNumberLabel.Name = "telephoneNumberLabel"
        Me.telephoneNumberLabel.Size = New System.Drawing.Size(98, 13)
        Me.telephoneNumberLabel.TabIndex = 6
        Me.telephoneNumberLabel.Text = "Telephone Number"
        '
        'customerRelationsNameLabel
        '
        Me.customerRelationsNameLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.customerRelationsNameLabel.Location = New System.Drawing.Point(270, 109)
        Me.customerRelationsNameLabel.Name = "customerRelationsNameLabel"
        Me.customerRelationsNameLabel.Size = New System.Drawing.Size(149, 33)
        Me.customerRelationsNameLabel.TabIndex = 7
        '
        'marketingNameLabel
        '
        Me.marketingNameLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.marketingNameLabel.Location = New System.Drawing.Point(270, 176)
        Me.marketingNameLabel.Name = "marketingNameLabel"
        Me.marketingNameLabel.Size = New System.Drawing.Size(149, 33)
        Me.marketingNameLabel.TabIndex = 8
        '
        'orderProcessingNameLabel
        '
        Me.orderProcessingNameLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.orderProcessingNameLabel.Location = New System.Drawing.Point(270, 243)
        Me.orderProcessingNameLabel.Name = "orderProcessingNameLabel"
        Me.orderProcessingNameLabel.Size = New System.Drawing.Size(149, 33)
        Me.orderProcessingNameLabel.TabIndex = 9
        '
        'shippingNameLabel
        '
        Me.shippingNameLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.shippingNameLabel.Location = New System.Drawing.Point(270, 310)
        Me.shippingNameLabel.Name = "shippingNameLabel"
        Me.shippingNameLabel.Size = New System.Drawing.Size(149, 33)
        Me.shippingNameLabel.TabIndex = 10
        '
        'shippingNumberLabel
        '
        Me.shippingNumberLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.shippingNumberLabel.Location = New System.Drawing.Point(558, 306)
        Me.shippingNumberLabel.Name = "shippingNumberLabel"
        Me.shippingNumberLabel.Size = New System.Drawing.Size(149, 33)
        Me.shippingNumberLabel.TabIndex = 14
        '
        'orderProcessingNumberLabel
        '
        Me.orderProcessingNumberLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.orderProcessingNumberLabel.Location = New System.Drawing.Point(558, 239)
        Me.orderProcessingNumberLabel.Name = "orderProcessingNumberLabel"
        Me.orderProcessingNumberLabel.Size = New System.Drawing.Size(149, 33)
        Me.orderProcessingNumberLabel.TabIndex = 13
        '
        'marketingNumberLabel
        '
        Me.marketingNumberLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.marketingNumberLabel.Location = New System.Drawing.Point(558, 172)
        Me.marketingNumberLabel.Name = "marketingNumberLabel"
        Me.marketingNumberLabel.Size = New System.Drawing.Size(149, 33)
        Me.marketingNumberLabel.TabIndex = 12
        '
        'cusomterRelationsNumberLabel
        '
        Me.cusomterRelationsNumberLabel.BackColor = System.Drawing.Color.SandyBrown
        Me.cusomterRelationsNumberLabel.Location = New System.Drawing.Point(558, 105)
        Me.cusomterRelationsNumberLabel.Name = "cusomterRelationsNumberLabel"
        Me.cusomterRelationsNumberLabel.Size = New System.Drawing.Size(149, 33)
        Me.cusomterRelationsNumberLabel.TabIndex = 11
        '
        'nameTextBox
        '
        Me.nameTextBox.Location = New System.Drawing.Point(884, 12)
        Me.nameTextBox.Name = "nameTextBox"
        Me.nameTextBox.Size = New System.Drawing.Size(100, 20)
        Me.nameTextBox.TabIndex = 15
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.Color.SandyBrown
        Me.Label1.Location = New System.Drawing.Point(790, 12)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(91, 13)
        Me.Label1.TabIndex = 16
        Me.Label1.Text = "Enter Your Name:"
        '
        'visibleCheckBox
        '
        Me.visibleCheckBox.AutoSize = True
        Me.visibleCheckBox.BackColor = System.Drawing.Color.SandyBrown
        Me.visibleCheckBox.Location = New System.Drawing.Point(784, 176)
        Me.visibleCheckBox.Name = "visibleCheckBox"
        Me.visibleCheckBox.Size = New System.Drawing.Size(56, 17)
        Me.visibleCheckBox.TabIndex = 17
        Me.visibleCheckBox.Text = "Visible"
        Me.visibleCheckBox.UseVisualStyleBackColor = False
        '
        'redRadioButton
        '
        Me.redRadioButton.AutoSize = True
        Me.redRadioButton.BackColor = System.Drawing.SystemColors.AppWorkspace
        Me.redRadioButton.ForeColor = System.Drawing.Color.Red
        Me.redRadioButton.Location = New System.Drawing.Point(9, 16)
        Me.redRadioButton.Name = "redRadioButton"
        Me.redRadioButton.Size = New System.Drawing.Size(110, 17)
        Me.redRadioButton.TabIndex = 18
        Me.redRadioButton.TabStop = True
        Me.redRadioButton.Text = "Red Radio Button"
        Me.redRadioButton.UseVisualStyleBackColor = False
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.BackColor = System.Drawing.Color.SandyBrown
        Me.Label2.Location = New System.Drawing.Point(790, 81)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(39, 13)
        Me.Label2.TabIndex = 19
        Me.Label2.Text = "Label2"
        '
        'GroupBox1
        '
        Me.GroupBox1.BackColor = System.Drawing.Color.SandyBrown
        Me.GroupBox1.Controls.Add(Me.greenRadioButton)
        Me.GroupBox1.Controls.Add(Me.orangeRadioButton)
        Me.GroupBox1.Controls.Add(Me.blueRadioButton)
        Me.GroupBox1.Controls.Add(Me.redRadioButton)
        Me.GroupBox1.Location = New System.Drawing.Point(784, 239)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(200, 121)
        Me.GroupBox1.TabIndex = 20
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "GroupBox1"
        '
        'greenRadioButton
        '
        Me.greenRadioButton.AutoSize = True
        Me.greenRadioButton.BackColor = System.Drawing.SystemColors.AppWorkspace
        Me.greenRadioButton.ForeColor = System.Drawing.Color.Lime
        Me.greenRadioButton.Location = New System.Drawing.Point(9, 69)
        Me.greenRadioButton.Name = "greenRadioButton"
        Me.greenRadioButton.Size = New System.Drawing.Size(119, 17)
        Me.greenRadioButton.TabIndex = 21
        Me.greenRadioButton.TabStop = True
        Me.greenRadioButton.Text = "Green Radio Button"
        Me.greenRadioButton.UseVisualStyleBackColor = False
        '
        'orangeRadioButton
        '
        Me.orangeRadioButton.AutoSize = True
        Me.orangeRadioButton.BackColor = System.Drawing.SystemColors.AppWorkspace
        Me.orangeRadioButton.ForeColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.orangeRadioButton.Location = New System.Drawing.Point(9, 92)
        Me.orangeRadioButton.Name = "orangeRadioButton"
        Me.orangeRadioButton.Size = New System.Drawing.Size(125, 17)
        Me.orangeRadioButton.TabIndex = 20
        Me.orangeRadioButton.TabStop = True
        Me.orangeRadioButton.Text = "Orange Radio Button"
        Me.orangeRadioButton.UseVisualStyleBackColor = False
        '
        'blueRadioButton
        '
        Me.blueRadioButton.AutoSize = True
        Me.blueRadioButton.BackColor = System.Drawing.SystemColors.AppWorkspace
        Me.blueRadioButton.ForeColor = System.Drawing.Color.Blue
        Me.blueRadioButton.Location = New System.Drawing.Point(9, 43)
        Me.blueRadioButton.Name = "blueRadioButton"
        Me.blueRadioButton.Size = New System.Drawing.Size(111, 17)
        Me.blueRadioButton.TabIndex = 19
        Me.blueRadioButton.TabStop = True
        Me.blueRadioButton.Text = "Blue Radio Button"
        Me.blueRadioButton.UseVisualStyleBackColor = False
        '
        'clearButton
        '
        Me.clearButton.Location = New System.Drawing.Point(884, 39)
        Me.clearButton.Name = "clearButton"
        Me.clearButton.Size = New System.Drawing.Size(75, 23)
        Me.clearButton.TabIndex = 21
        Me.clearButton.Text = "Clear"
        Me.clearButton.UseVisualStyleBackColor = True
        '
        'closeButton
        '
        Me.closeButton.Location = New System.Drawing.Point(884, 100)
        Me.closeButton.Name = "closeButton"
        Me.closeButton.Size = New System.Drawing.Size(75, 23)
        Me.closeButton.TabIndex = 22
        Me.closeButton.Text = "Close"
        Me.closeButton.UseVisualStyleBackColor = True
        '
        'PrintForm
        '
        Me.PrintForm.DocumentName = "document"
        Me.PrintForm.Form = Me
        Me.PrintForm.PrintAction = System.Drawing.Printing.PrintAction.PrintToPreview
        Me.PrintForm.PrinterSettings = CType(resources.GetObject("PrintForm.PrinterSettings"), System.Drawing.Printing.PrinterSettings)
        Me.PrintForm.PrintFileName = Nothing
        '
        'printButton
        '
        Me.printButton.AutoSize = True
        Me.printButton.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.printButton.Location = New System.Drawing.Point(884, 68)
        Me.printButton.Name = "printButton"
        Me.printButton.Size = New System.Drawing.Size(38, 23)
        Me.printButton.TabIndex = 23
        Me.printButton.Text = "Print"
        Me.printButton.UseVisualStyleBackColor = True
        '
        'PictureBox
        '
        Me.PictureBox.BackColor = System.Drawing.Color.SandyBrown
        Me.PictureBox.Image = CType(resources.GetObject("PictureBox.Image"), System.Drawing.Image)
        Me.PictureBox.InitialImage = CType(resources.GetObject("PictureBox.InitialImage"), System.Drawing.Image)
        Me.PictureBox.Location = New System.Drawing.Point(12, 8)
        Me.PictureBox.Name = "PictureBox"
        Me.PictureBox.Size = New System.Drawing.Size(982, 514)
        Me.PictureBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox.TabIndex = 24
        Me.PictureBox.TabStop = False
        Me.PictureBox.Visible = False
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(562, 381)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(145, 118)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.PictureBox1.TabIndex = 25
        Me.PictureBox1.TabStop = False
        '
        'PictureBox2
        '
        Me.PictureBox2.Image = CType(resources.GetObject("PictureBox2.Image"), System.Drawing.Image)
        Me.PictureBox2.Location = New System.Drawing.Point(713, 381)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(145, 118)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.PictureBox2.TabIndex = 26
        Me.PictureBox2.TabStop = False
        Me.PictureBox2.Visible = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ControlDarkDark
        Me.ClientSize = New System.Drawing.Size(1006, 534)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.printButton)
        Me.Controls.Add(Me.closeButton)
        Me.Controls.Add(Me.clearButton)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.visibleCheckBox)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.nameTextBox)
        Me.Controls.Add(Me.shippingNumberLabel)
        Me.Controls.Add(Me.orderProcessingNumberLabel)
        Me.Controls.Add(Me.marketingNumberLabel)
        Me.Controls.Add(Me.cusomterRelationsNumberLabel)
        Me.Controls.Add(Me.shippingNameLabel)
        Me.Controls.Add(Me.orderProcessingNameLabel)
        Me.Controls.Add(Me.marketingNameLabel)
        Me.Controls.Add(Me.customerRelationsNameLabel)
        Me.Controls.Add(Me.telephoneNumberLabel)
        Me.Controls.Add(Me.departmentContactLabel)
        Me.Controls.Add(Me.departmentLabel)
        Me.Controls.Add(Me.shippingButton)
        Me.Controls.Add(Me.processingButton)
        Me.Controls.Add(Me.marketingButton)
        Me.Controls.Add(Me.customerRelationsButton)
        Me.Controls.Add(Me.PictureBox)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.PictureBox, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents customerRelationsButton As System.Windows.Forms.Button
    Friend WithEvents marketingButton As System.Windows.Forms.Button
    Friend WithEvents processingButton As System.Windows.Forms.Button
    Friend WithEvents shippingButton As System.Windows.Forms.Button
    Friend WithEvents departmentLabel As System.Windows.Forms.Label
    Friend WithEvents departmentContactLabel As System.Windows.Forms.Label
    Friend WithEvents telephoneNumberLabel As System.Windows.Forms.Label
    Friend WithEvents customerRelationsNameLabel As System.Windows.Forms.Label
    Friend WithEvents marketingNameLabel As System.Windows.Forms.Label
    Friend WithEvents orderProcessingNameLabel As System.Windows.Forms.Label
    Friend WithEvents shippingNameLabel As System.Windows.Forms.Label
    Friend WithEvents shippingNumberLabel As System.Windows.Forms.Label
    Friend WithEvents orderProcessingNumberLabel As System.Windows.Forms.Label
    Friend WithEvents marketingNumberLabel As System.Windows.Forms.Label
    Friend WithEvents cusomterRelationsNumberLabel As System.Windows.Forms.Label
    Friend WithEvents nameTextBox As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents visibleCheckBox As System.Windows.Forms.CheckBox
    Friend WithEvents redRadioButton As System.Windows.Forms.RadioButton
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents BackgroundWorker1 As System.ComponentModel.BackgroundWorker
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents greenRadioButton As System.Windows.Forms.RadioButton
    Friend WithEvents orangeRadioButton As System.Windows.Forms.RadioButton
    Friend WithEvents blueRadioButton As System.Windows.Forms.RadioButton
    Friend WithEvents clearButton As System.Windows.Forms.Button
    Friend WithEvents closeButton As System.Windows.Forms.Button
    Friend WithEvents PrintForm As Microsoft.VisualBasic.PowerPacks.Printing.PrintForm
    Friend WithEvents printButton As System.Windows.Forms.Button
    Friend WithEvents PictureBox As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox2 As System.Windows.Forms.PictureBox
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox

End Class
