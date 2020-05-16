package engineer.anderson.whichfuel
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //animação
        val ttb = AnimationUtils.loadAnimation(this,R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(this,R.anim.stb)
        val btn = AnimationUtils.loadAnimation(this,R.anim.btn)

        //1
        val textoWelcome = findViewById(R.id.textoWelcome) as TextView
        val imagemResultado = findViewById(R.id.imagemResultado) as ImageView
        //2
        val editTextGasolina = findViewById(R.id.editTextGasolina) as EditText
        val editTextEtanol= findViewById(R.id.editTextEtanol) as EditText
        val button = findViewById(R.id.button) as Button

        textoWelcome.startAnimation(ttb)
        imagemResultado.startAnimation(ttb)

        editTextGasolina.startAnimation(stb)
        editTextEtanol.startAnimation(stb)
        button.startAnimation(btn)



        fun calcularMelhorPreco(precoGasolina: String, precoEtanol: String){

            val valorGasolina = precoGasolina.toDouble()
            val valorEtanol = precoEtanol.toDouble()

            val resultadoPreco = valorEtanol/valorGasolina

            if (resultadoPreco >= 7.0){
                textoWelcome.text = "Recomendamos o uso de Gasolina"
                imagemResultado.setImageResource(R.drawable.ic_icone_combustivel_gasolina)
            }else{
                textoWelcome.text = "Recomendamos o uso de Etanol"
                imagemResultado.setImageResource(R.drawable.ic_icone_combustivel_etanol)
            }

        }

        fun validarCampos(precoGasolina: String, precoEtanol: String) : Boolean{

            var camposValidados: Boolean = true
            if (precoGasolina == null || precoGasolina.equals("")){
                camposValidados = false
            }else if (precoEtanol == null || precoEtanol.equals("")){
                camposValidados = false
            }

            return camposValidados
        }

        fun chamarAlert() {

            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Atenção")
            alertDialog.setMessage("Insira valores válidos!")

            alertDialog.setPositiveButton("Ok", { _, _ ->

                //Toast.makeText(this, "Ok", Toast.LENGTH_LONG).show()

            })


            alertDialog.show()
        }

        fun fecharTeclado(){
            val view = this.currentFocus
            if(view != null){
                val hideMe = getSystemService( Context.INPUT_METHOD_SERVICE) as InputMethodManager
                hideMe.hideSoftInputFromWindow(view.windowToken, 0)
            }
            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        }

        fun calcularPreco() {

            //val precoGasolina = findViewById<EditText>(R.id.editTextGasolina)
            val precoGasolina = editTextGasolina.text.toString()
            val precoEtanol = editTextEtanol.text.toString()

            val validaCampos = validarCampos(precoGasolina, precoEtanol)

            if (validaCampos){
                calcularMelhorPreco(precoGasolina, precoEtanol)
            }else{
                chamarAlert()
            }

        }

        fun botaoCheck(editText: EditText) {
            editText.setOnKeyListener(View.OnKeyListener{v, keyCode, event ->
                if (keyCode  == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP){
                    calcularPreco()
                    fecharTeclado()
                    return@OnKeyListener  true
                }
                false
            })
        }

        botaoCheck(editTextGasolina)
        botaoCheck(editTextEtanol)

        var buttonCacular = button as Button
        buttonCacular.setOnClickListener{
            calcularPreco()
            fecharTeclado()
            //chamarAlert()
        }

    }
}
