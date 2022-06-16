package dev.kanini.calculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilfirstnumber: TextInputLayout
    lateinit var etfirstnumber: TextInputEditText
    lateinit var tilsecondnumber: TextInputLayout
    lateinit var etsecondnumber: TextInputEditText
    lateinit var btnadd: Button
    lateinit var btnminus: Button
    lateinit var btnmodulus: Button
    lateinit var btndivide: Button
    lateinit var tvtotal: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilfirstnumber = findViewById(R.id.tilfirstnumber)
        tilsecondnumber = findViewById(R.id.tilsecondnumber)
        etfirstnumber = findViewById(R.id.etfirstnumber)
        etsecondnumber = findViewById(R.id.etsecondnumber)
        btnadd = findViewById(R.id.btnadd)
        btnminus = findViewById(R.id.btnminus)
        btnmodulus = findViewById(R.id.btnmodulus)
        btndivide = findViewById(R.id.btndivide)
        tvtotal = findViewById(R.id.tvtotal)
        btnadd.setOnClickListener {
            val Number1 = etfirstnumber.text.toString()
            val Number2 = etsecondnumber.text.toString()

            if (Number1.isBlank()) {
                etfirstnumber.error = "Number is required"
                return@setOnClickListener
            }
            if (Number2.isBlank()) {
                etsecondnumber.error = "Number is required"
                return@setOnClickListener
            }
            addition(Number1.toInt(), Number2.toInt())
        }
        btnminus.setOnClickListener {
            val Number1 = etfirstnumber.text.toString()
            val Number2 = etsecondnumber.text.toString()
            if (Number1.isBlank()) {
                etfirstnumber.error = "Number is required"
                return@setOnClickListener
            }
            if (Number2.isBlank()) {
                etsecondnumber.error = "Number is required"
                return@setOnClickListener
            }
            substraction(Number1.toInt(), Number2.toInt())

        }
        btndivide.setOnClickListener {
            val Number1 = etfirstnumber.text.toString()
            val Number2 = etsecondnumber.text.toString()
            if (Number1.isBlank()) {
                etfirstnumber.error = "Number is required"
                return@setOnClickListener
            }
            if (Number2.isBlank()) {
                etsecondnumber.error = "Number is required"
                return@setOnClickListener
            }
            division(Number1.toInt(), Number2.toInt())
        }
        btnmodulus.setOnClickListener {
            val Number1 = etfirstnumber.text.toString()
            val Number2 = etsecondnumber.text.toString()
            if (Number1.isBlank()) {
                etfirstnumber.error = "Number is required"
                return@setOnClickListener
            }
            if (Number2.isBlank()) {
                etsecondnumber.error = "Number is required"
                return@setOnClickListener
            }
            modulus(Number1.toInt(), Number2.toInt())
        }


    }

    fun addition(Number1: Int, Number2: Int) {
        val add = Number1 + Number2
        tvtotal.text = add.toString()

    }

    fun substraction(Number1: Int, Number2: Int) {
        val minus = Number1 - Number2
        tvtotal.text = minus.toString()
    }

    fun division(Number1: Int, Number2: Int) {
        val divide= Number1 / Number2
        tvtotal.text = divide.toString()
    }

    fun modulus(Number1: Int, Number2: Int) {
        val modulus = Number1 % Number2
        tvtotal.text = modulus.toString()
    }
}
