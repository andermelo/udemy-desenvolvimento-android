package engineer.anderson.whichfuel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //animação
        val ttb = AnimationUtils.loadAnimation(this,R.anim.ttb)

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
            alertDialog.setTitle("Atenção") // O Titulo da notificação
            alertDialog.setMessage("Insira valores válidos!") // a mensagem ou alerta

            alertDialog.setPositiveButton("Ok", { _, _ ->

                //Aqui sera executado a instrução a sua escolha
                //Toast.makeText(this, "Ok", Toast.LENGTH_LONG).show()

            })


            alertDialog.show()
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



        var buttonCacular = button as Button
        buttonCacular.setOnClickListener{
            calcularPreco()
            //chamarAlert()
        }




    }
}
