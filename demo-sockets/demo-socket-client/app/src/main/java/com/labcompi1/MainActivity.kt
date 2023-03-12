package com.labcompi1

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Formatter
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.labcompi1.message.SimpleMessage
import com.labcompi1.task.AsyncResponse
import com.labcompi1.task.MyTask
import java.net.Inet4Address
import java.net.NetworkInterface

class MainActivity : AppCompatActivity(), AsyncResponse {

    // TODO: make the ip dynamic
    val ipServer: String = "192.168.10.101"
    val portServer: Int = 9090

    var textView: TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editor: EditText = findViewById(R.id.etInput)
        textView = findViewById(R.id.tvResult)
        val backButton: Button = findViewById(R.id.btnClear)
        val sendButton: Button = findViewById(R.id.btnSend)

        sendButton.setOnClickListener(View.OnClickListener {
            // TODO: write your code here
            val text = editor.text.toString()
            this.sendMessage(text)
        })

        backButton.setOnClickListener(View.OnClickListener {
            // TODO: write your code here
            editor.setText("")
        })
    }

    private fun sendMessage(message: String) {
        val simpleMessage = SimpleMessage(message)
        val task = MyTask(ipServer, portServer, simpleMessage)
        task.delegate = this
        task.execute()
    }

    override fun processResponse(output: String?) {
        if (output != null) {
            textView?.text = output
        } else {
            textView?.text = "Something went wrong"
        }
    }

    private fun getIp(): String {
        NetworkInterface.getNetworkInterfaces().toList().map {
            it.inetAddresses.toList().find {
                !it.isLoopbackAddress && it is Inet4Address
            }?.let {
                return it.hostAddress
            }
        }

        return ""
    }

    private fun getWifiIp(): String {
        val context = this.applicationContext;
        val wifiManager: WifiManager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        val ip: String = Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
        return ip;
    }
}
