namespace week9
{
    partial class Form1
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
            if (disposing && (components != null))
            {
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
            this.components = new System.ComponentModel.Container();
            this.pnlMain = new System.Windows.Forms.Panel();
            this.btnMakeBlack = new System.Windows.Forms.Button();
            this.btnMakeRed = new System.Windows.Forms.Button();
            this.btnUp = new System.Windows.Forms.Button();
            this.btnDown = new System.Windows.Forms.Button();
            this.btnLeft = new System.Windows.Forms.Button();
            this.btnRight = new System.Windows.Forms.Button();
            this.tmrRed = new System.Windows.Forms.Timer(this.components);
            this.SuspendLayout();
            // 
            // pnlMain
            // 
            this.pnlMain.BackColor = System.Drawing.Color.Pink;
            this.pnlMain.Location = new System.Drawing.Point(13, 13);
            this.pnlMain.Name = "pnlMain";
            this.pnlMain.Size = new System.Drawing.Size(396, 409);
            this.pnlMain.TabIndex = 0;
            // 
            // btnMakeBlack
            // 
            this.btnMakeBlack.Location = new System.Drawing.Point(13, 449);
            this.btnMakeBlack.Name = "btnMakeBlack";
            this.btnMakeBlack.Size = new System.Drawing.Size(75, 100);
            this.btnMakeBlack.TabIndex = 0;
            this.btnMakeBlack.Text = "BLACK";
            this.btnMakeBlack.UseVisualStyleBackColor = true;
            this.btnMakeBlack.Click += new System.EventHandler(this.btnMakeBlack_Click);
            // 
            // btnMakeRed
            // 
            this.btnMakeRed.Location = new System.Drawing.Point(334, 449);
            this.btnMakeRed.Name = "btnMakeRed";
            this.btnMakeRed.Size = new System.Drawing.Size(75, 100);
            this.btnMakeRed.TabIndex = 1;
            this.btnMakeRed.Text = "RED";
            this.btnMakeRed.UseVisualStyleBackColor = true;
            this.btnMakeRed.Click += new System.EventHandler(this.btnMakeRed_Click);
            // 
            // btnUp
            // 
            this.btnUp.Location = new System.Drawing.Point(172, 449);
            this.btnUp.Name = "btnUp";
            this.btnUp.Size = new System.Drawing.Size(75, 48);
            this.btnUp.TabIndex = 2;
            this.btnUp.Text = "UP";
            this.btnUp.UseVisualStyleBackColor = true;
            this.btnUp.Click += new System.EventHandler(this.btnUp_Click);
            // 
            // btnDown
            // 
            this.btnDown.Location = new System.Drawing.Point(172, 501);
            this.btnDown.Name = "btnDown";
            this.btnDown.Size = new System.Drawing.Size(75, 48);
            this.btnDown.TabIndex = 2;
            this.btnDown.Text = "DOWN";
            this.btnDown.UseVisualStyleBackColor = true;
            this.btnDown.Click += new System.EventHandler(this.btnDown_Click);
            // 
            // btnLeft
            // 
            this.btnLeft.Location = new System.Drawing.Point(91, 475);
            this.btnLeft.Name = "btnLeft";
            this.btnLeft.Size = new System.Drawing.Size(75, 48);
            this.btnLeft.TabIndex = 3;
            this.btnLeft.Text = "LEFT";
            this.btnLeft.UseVisualStyleBackColor = true;
            this.btnLeft.Click += new System.EventHandler(this.btnLeft_Click);
            // 
            // btnRight
            // 
            this.btnRight.Location = new System.Drawing.Point(253, 475);
            this.btnRight.Name = "btnRight";
            this.btnRight.Size = new System.Drawing.Size(75, 48);
            this.btnRight.TabIndex = 4;
            this.btnRight.Text = "RIGHT";
            this.btnRight.UseVisualStyleBackColor = true;
            this.btnRight.Click += new System.EventHandler(this.btnRight_Click);
            // 
            // tmrRed
            // 
            this.tmrRed.Interval = 500;
            this.tmrRed.Tick += new System.EventHandler(this.tmrRed_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Control;
            this.ClientSize = new System.Drawing.Size(421, 597);
            this.Controls.Add(this.btnRight);
            this.Controls.Add(this.btnLeft);
            this.Controls.Add(this.btnDown);
            this.Controls.Add(this.btnUp);
            this.Controls.Add(this.btnMakeRed);
            this.Controls.Add(this.btnMakeBlack);
            this.Controls.Add(this.pnlMain);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel pnlMain;
        private System.Windows.Forms.Button btnMakeBlack;
        private System.Windows.Forms.Button btnMakeRed;
        private System.Windows.Forms.Button btnUp;
        private System.Windows.Forms.Button btnDown;
        private System.Windows.Forms.Button btnLeft;
        private System.Windows.Forms.Button btnRight;
        private System.Windows.Forms.Timer tmrRed;
    }
}

