package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.IntentCompat
import com.example.sendmessage.model.Message
import kotlinx.serialization.Serializable
import kotlinx.serialization.serializer
import org.w3c.dom.Text

/**
 * Clase que crea la segunda actividad con las siguientes operaciones:
 * <ol>
 *     <li>Serializa un bundle de la primera actividad que se recoge aquí</li>
 *     <li>Muestra un sender y un content por la actividad</li>
 *     <li>El ciclo de vida de la <code>Activity</code></li>
 *     <li>Ver la pila de Actividades</li>
 * </ol>
 * @author Álvaro
 * @version 1.0
 */
class ViewMessageActivity : AppCompatActivity() {

    companion object{
        const val TAG: String = "LogMessageActivity"
    }

    /**
     * Método que crea una actividad
     * @param android.os.Bundle
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

        //Serizaliza el bundle del intent
        val message = IntentCompat.getSerializableExtra(intent, "KEY_MESSAGE", Message::class.java)
        //Busca los ids de los TextView
        val tvView = findViewById<TextView>(R.id.tvView)
        val tvSender = findViewById<TextView>(R.id.tvSender)
        //Se concatena en una variable el nombre del sender, al no dejar concatenar en el text
        val textSender = "De: ${message?.sender?.name} ${message?.sender?.surname}"
        tvSender.text = textSender
        tvView.text = message?.content ?: "No hay mensaje"
        Log.d(TAG, "ViewMessageActivity -> OnCreate()")
    }

    //region Ciclo de vida
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "ViewMessageActivity -> OnStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "ViewMessageActivity -> OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "ViewMessageActivity -> OnPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "ViewMessageActivity -> OnStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "ViewMessageActivity -> OnDestroy()")
    }
    //endregion
}