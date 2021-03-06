package com.example.assetsmanagement1

//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;


class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

//        button.setOnClickListener(){
        // finding the edit text
        val inputFirstName = findViewById<EditText>(R.id.editFirstName)
        val inputMiddleName = findViewById<EditText>(R.id.editMiddleName)
        val inputLastName = findViewById<EditText>(R.id.editLastName)
        val inputDepartment = findViewById<EditText>(R.id.editDepartment)
        val inputPassword = findViewById<EditText>(R.id.editPassword)
        val inputConfirmPassword = findViewById<EditText>(R.id.editConfirmPassword)
        val inputUsername = findViewById<EditText>(R.id.editUsername)

        val showButton = findViewById<Button>(R.id.Create)
        val showHideBtn = findViewById<Button>(R.id.showHideBtn)


        // initially setting the password to hide mode
        inputPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
        inputConfirmPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()

        showButton.setOnClickListener {

            // Getting the user input
            val textFirstName = inputFirstName.text
            val textMiddleName = inputMiddleName.text
            val textLastName = inputLastName.text
            val textDepartment = inputDepartment.text
            val textPassword = inputPassword.text
            val textConfirmPassword = inputConfirmPassword.text
            val textUsername = inputUsername.text

            // Showing the user input
            Toast.makeText(this, textFirstName, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, textMiddleName, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, textLastName, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, textDepartment, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, textPassword, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, textConfirmPassword, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, textUsername, Toast.LENGTH_SHORT).show()

        }


        showHideBtn.setOnClickListener {
            if(showHideBtn.text.toString().equals("Show")){
                inputPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                inputConfirmPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                showHideBtn.text = "Hide"
            } else{
                inputPassword.transformationMethod = PasswordTransformationMethod.getInstance()
                inputConfirmPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                showHideBtn.text = "Show"
            }
        }



    }
}
