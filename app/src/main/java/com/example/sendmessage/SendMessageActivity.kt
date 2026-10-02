package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.sendmessage.model.Message
import com.example.sendmessage.model.Person
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * Esta es la primera Actividad de la aplicación que realiza la operaciones:
 * <ol>
 *     <li>Crear un componente <code>EditText</code> y <code>Button</code> en XML</li>
 *     <li>Lanzar un evento en un componente Visual</li>
 *     <li>Crea el <code>Intent</code> junto con el <code>Bundle</code> para pasar a otra actividad</li>
 *     <li>El ciclo de vida de la <code>Activity</code></li>
 *     <li>Ver la pila de Actividades</li>
 * </ol>
 *
 * @author Álvaro
 * @version 1.0
 * @see android.widget.Button
 * @see android.widget.EditText
 * @see Intent
 * @see android.os.Bundle
 */
class SendMessageActivity : AppCompatActivity() {
    lateinit var etMessageText: EditText
    lateinit var btSend: Button
    companion object{
        const val TAG: String = "LogMessageActivity"
    }

    /**
     * Método llamado al crear la actividad. Se encarga de inicializar la interfaz de usuario,
     * enlazar los componentes visuales y configurar los eventos de clic.
     *
     * Como medida de aprendizaje, aquí se muestra cómo pasar datos dato a dato utilizando un [Bundle]:
     * ```kotlin
     * val intent = Intent(this, ViewMessageActivity::class.java)
     * val bundle = Bundle()
     * bundle.putString("KEY_MESSAGE", etMessageText.text.toString())
     * intent.putExtras(bundle)
     * startActivity(intent)
     * ```
     *
     * @param savedInstanceState Estado guardado previamente de la actividad, si lo hubiera.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_message)

        //Se obtiene el objeto view de la vista que se ha inflado
        etMessageText = findViewById(R.id.etMessageText)
        btSend = findViewById(R.id.btSend)

        //Se indica que el botón conecte al view message
        btSend.setOnClickListener {
            sendMessage()
        }
        //Se escriben mensajes de depuración en la consola LogCat
        Log.d(TAG, "SendMessageActivity -> OnCreate()")
    }

    /**
     * Función que crea un mensaje con la información de la persona que la envia y la persona que recoge el mensaje
     */
    private fun sendMessage(){
        //1. Crear el Intent
        val intent = Intent(this, ViewMessageActivity::class.java)
        //2. Crear el Bundle
        val bundle = Bundle()
        //3. La información del mensaje
        val sender = Person("123456789A","Álvaro","José")
        val receiver = Person("987654321A","Mata","Báez")
        val message = Message(1, etMessageText.text.toString(), sender, receiver)
        bundle.putSerializable("KEY_MESSAGE", message)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    //region Ciclo de vida
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "SendMessageActivity -> onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "SendMessageActivity -> OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "SendMessageActivity -> OnPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "SendMessageActivity -> OnStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "SendMessageActivity -> OnDestroy()")
    }
    //endregion
}
