namespace Week5_Homework
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
            this.Lab_name = new System.Windows.Forms.Label();
            this.Lab_age = new System.Windows.Forms.Label();
            this.Lab_code = new System.Windows.Forms.Label();
            this.txt_name = new System.Windows.Forms.TextBox();
            this.txt_age = new System.Windows.Forms.TextBox();
            this.txt_sub = new System.Windows.Forms.TextBox();
            this.txt_code = new System.Windows.Forms.TextBox();
            this.Lab_sub = new System.Windows.Forms.Label();
            this.Btn_result = new System.Windows.Forms.Button();
            this.Lab_result = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // Lab_name
            // 
            this.Lab_name.AutoSize = true;
            this.Lab_name.Location = new System.Drawing.Point(67, 61);
            this.Lab_name.Name = "Lab_name";
            this.Lab_name.Size = new System.Drawing.Size(29, 12);
            this.Lab_name.TabIndex = 0;
            this.Lab_name.Text = "이름";
            // 
            // Lab_age
            // 
            this.Lab_age.AutoSize = true;
            this.Lab_age.Location = new System.Drawing.Point(67, 91);
            this.Lab_age.Name = "Lab_age";
            this.Lab_age.Size = new System.Drawing.Size(29, 12);
            this.Lab_age.TabIndex = 1;
            this.Lab_age.Text = "나이";
            // 
            // Lab_code
            // 
            this.Lab_code.AutoSize = true;
            this.Lab_code.Location = new System.Drawing.Point(376, 94);
            this.Lab_code.Name = "Lab_code";
            this.Lab_code.Size = new System.Drawing.Size(29, 12);
            this.Lab_code.TabIndex = 2;
            this.Lab_code.Text = "학번";
            // 
            // txt_name
            // 
            this.txt_name.Location = new System.Drawing.Point(158, 58);
            this.txt_name.Name = "txt_name";
            this.txt_name.Size = new System.Drawing.Size(100, 21);
            this.txt_name.TabIndex = 3;
            // 
            // txt_age
            // 
            this.txt_age.Location = new System.Drawing.Point(158, 85);
            this.txt_age.Name = "txt_age";
            this.txt_age.Size = new System.Drawing.Size(100, 21);
            this.txt_age.TabIndex = 4;
            // 
            // txt_sub
            // 
            this.txt_sub.Location = new System.Drawing.Point(158, 112);
            this.txt_sub.Name = "txt_sub";
            this.txt_sub.Size = new System.Drawing.Size(352, 21);
            this.txt_sub.TabIndex = 5;
            // 
            // txt_code
            // 
            this.txt_code.Location = new System.Drawing.Point(411, 88);
            this.txt_code.Name = "txt_code";
            this.txt_code.Size = new System.Drawing.Size(100, 21);
            this.txt_code.TabIndex = 6;
            // 
            // Lab_sub
            // 
            this.Lab_sub.AutoSize = true;
            this.Lab_sub.Location = new System.Drawing.Point(67, 115);
            this.Lab_sub.Name = "Lab_sub";
            this.Lab_sub.Size = new System.Drawing.Size(53, 12);
            this.Lab_sub.TabIndex = 7;
            this.Lab_sub.Text = "수강과목";
            // 
            // Btn_result
            // 
            this.Btn_result.Location = new System.Drawing.Point(69, 147);
            this.Btn_result.Name = "Btn_result";
            this.Btn_result.Size = new System.Drawing.Size(441, 24);
            this.Btn_result.TabIndex = 8;
            this.Btn_result.Text = "변환";
            this.Btn_result.UseVisualStyleBackColor = true;
            this.Btn_result.Click += new System.EventHandler(this.Btn_result_Click);
            // 
            // Lab_result
            // 
            this.Lab_result.BackColor = System.Drawing.Color.White;
            this.Lab_result.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.Lab_result.Location = new System.Drawing.Point(67, 196);
            this.Lab_result.Name = "Lab_result";
            this.Lab_result.Size = new System.Drawing.Size(443, 199);
            this.Lab_result.TabIndex = 9;
            this.Lab_result.Text = "label1";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(574, 433);
            this.Controls.Add(this.Lab_result);
            this.Controls.Add(this.Btn_result);
            this.Controls.Add(this.Lab_sub);
            this.Controls.Add(this.txt_code);
            this.Controls.Add(this.txt_sub);
            this.Controls.Add(this.txt_age);
            this.Controls.Add(this.txt_name);
            this.Controls.Add(this.Lab_code);
            this.Controls.Add(this.Lab_age);
            this.Controls.Add(this.Lab_name);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label Lab_name;
        private System.Windows.Forms.Label Lab_age;
        private System.Windows.Forms.Label Lab_code;
        private System.Windows.Forms.TextBox txt_name;
        private System.Windows.Forms.TextBox txt_age;
        private System.Windows.Forms.TextBox txt_sub;
        private System.Windows.Forms.TextBox txt_code;
        private System.Windows.Forms.Label Lab_sub;
        private System.Windows.Forms.Button Btn_result;
        private System.Windows.Forms.Label Lab_result;
    }
}

