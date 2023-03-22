package com.example.easycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.easycalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import org.mariuszgromada.math.mxparser.Expression
import javax.xml.xpath.XPathExpression


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)




        binding.btn1.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "1")
        }

        binding.btn2.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "2")
        }

        binding.btn3.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "3")
        }
        binding.btn4.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "4")
        }

        binding.btn5.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "5")
        }

        binding.btn6.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "6")
        }

        binding.btn7.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "7")
        }

        binding.btn8.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "8")
        }

        binding.btn9.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "9")
        }

        binding.btn0.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "0")
        }

        /*Operators*/

        binding.btnAdd.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "+")
        }

        binding.btnSubtract.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "-")
        }

        binding.btnMultiply.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "*")
        }

        binding.btnDiv.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + "/")
        }
        binding.btnBrackOpen.setOnClickListener{
            binding.inputTv.text =(binding.inputTv.text.toString() + "(")
        }
        binding.btnBrackClose.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + ")")
        }

        binding.btnDot.setOnClickListener {
            binding.inputTv.text =(binding.inputTv.text.toString() + ".")
        }

        binding.btnAc.setOnClickListener {
            binding.inputTv .text =""
            binding.soulutoinTv.text =""
        }

        binding.btnC.setOnClickListener {




                var num = binding.inputTv.text.toString().toInt()
                num =  num/10

                binding.inputTv.text = num.toString()



        }

        binding.btnEqual.setOnClickListener {



                val text = binding.inputTv.text.toString()
                val expression = ExpressionBuilder(text).build()

                val result = expression.evaluate()
                val longResult = result.toLong()
                if (result == longResult.toDouble()) {
                    binding.soulutoinTv.text = longResult.toString()
                } else {
                    binding.soulutoinTv.text = result.toString()
               }




        }


    }
}






