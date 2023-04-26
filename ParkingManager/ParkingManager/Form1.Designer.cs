namespace ParkingManager
{
    partial class FormMain
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null)) {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.tbxCarNumber = new System.Windows.Forms.TextBox();
            this.btnEntry = new System.Windows.Forms.Button();
            this.btnExit = new System.Windows.Forms.Button();
            this.btnShowDetail = new System.Windows.Forms.Button();
            this.btnDelete = new System.Windows.Forms.Button();
            this.chkLongterm = new System.Windows.Forms.CheckBox();
            this.dtpExitDate = new System.Windows.Forms.DateTimePicker();
            this.tbxResult = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label1.Location = new System.Drawing.Point(12, 19);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(90, 32);
            this.label1.TabIndex = 0;
            this.label1.Text = "차량번호";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            // 
            // tbxCarNumber
            // 
            this.tbxCarNumber.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.tbxCarNumber.Location = new System.Drawing.Point(108, 22);
            this.tbxCarNumber.Name = "tbxCarNumber";
            this.tbxCarNumber.Size = new System.Drawing.Size(201, 26);
            this.tbxCarNumber.TabIndex = 0;
            // 
            // btnEntry
            // 
            this.btnEntry.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnEntry.Location = new System.Drawing.Point(108, 116);
            this.btnEntry.Name = "btnEntry";
            this.btnEntry.Size = new System.Drawing.Size(201, 35);
            this.btnEntry.TabIndex = 1;
            this.btnEntry.Text = "입차";
            this.btnEntry.UseVisualStyleBackColor = true;
            this.btnEntry.Click += new System.EventHandler(this.btnEntry_Click);
            // 
            // btnExit
            // 
            this.btnExit.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnExit.Location = new System.Drawing.Point(108, 157);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(201, 35);
            this.btnExit.TabIndex = 2;
            this.btnExit.Text = "출차";
            this.btnExit.UseVisualStyleBackColor = true;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // btnShowDetail
            // 
            this.btnShowDetail.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnShowDetail.Location = new System.Drawing.Point(108, 198);
            this.btnShowDetail.Name = "btnShowDetail";
            this.btnShowDetail.Size = new System.Drawing.Size(201, 35);
            this.btnShowDetail.TabIndex = 3;
            this.btnShowDetail.Text = "상세내역";
            this.btnShowDetail.UseVisualStyleBackColor = true;
            this.btnShowDetail.Click += new System.EventHandler(this.btnShowDetail_Click);
            // 
            // btnDelete
            // 
            this.btnDelete.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnDelete.Location = new System.Drawing.Point(108, 239);
            this.btnDelete.Name = "btnDelete";
            this.btnDelete.Size = new System.Drawing.Size(201, 35);
            this.btnDelete.TabIndex = 4;
            this.btnDelete.Text = "기록삭제";
            this.btnDelete.UseVisualStyleBackColor = true;
            // 
            // chkLongterm
            // 
            this.chkLongterm.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.chkLongterm.Location = new System.Drawing.Point(108, 54);
            this.chkLongterm.Name = "chkLongterm";
            this.chkLongterm.Size = new System.Drawing.Size(104, 24);
            this.chkLongterm.TabIndex = 5;
            this.chkLongterm.Text = "장기주차";
            this.chkLongterm.UseVisualStyleBackColor = true;
            this.chkLongterm.Visible = false;
            // 
            // dtpExitDate
            // 
            this.dtpExitDate.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.dtpExitDate.Location = new System.Drawing.Point(108, 84);
            this.dtpExitDate.Name = "dtpExitDate";
            this.dtpExitDate.Size = new System.Drawing.Size(201, 26);
            this.dtpExitDate.TabIndex = 6;
            this.dtpExitDate.Visible = false;
            // 
            // tbxResult
            // 
            this.tbxResult.Location = new System.Drawing.Point(329, 19);
            this.tbxResult.Multiline = true;
            this.tbxResult.Name = "tbxResult";
            this.tbxResult.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.tbxResult.Size = new System.Drawing.Size(363, 426);
            this.tbxResult.TabIndex = 7;
            this.tbxResult.TextChanged += new System.EventHandler(this.tbxResult_TextChanged);
            // 
            // FormMain
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.None;
            this.ClientSize = new System.Drawing.Size(704, 457);
            this.Controls.Add(this.tbxResult);
            this.Controls.Add(this.dtpExitDate);
            this.Controls.Add(this.chkLongterm);
            this.Controls.Add(this.btnDelete);
            this.Controls.Add(this.btnShowDetail);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.btnEntry);
            this.Controls.Add(this.tbxCarNumber);
            this.Controls.Add(this.label1);
            this.Name = "FormMain";
            this.Text = "주차관리시스템";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox tbxCarNumber;
        private System.Windows.Forms.Button btnEntry;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.Button btnShowDetail;
        private System.Windows.Forms.Button btnDelete;
        private System.Windows.Forms.CheckBox chkLongterm;
        private System.Windows.Forms.DateTimePicker dtpExitDate;
        private System.Windows.Forms.TextBox tbxResult;
    }
}

