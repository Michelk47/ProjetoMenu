package com.michel.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.michel.menurestaurante.databinding.ActivityDadosPedido2Binding
import com.michel.menurestaurante.databinding.ActivityMainBinding

class DadosPedidoActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityDadosPedido2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPedido2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val i = intent
        val quant_cafe = i.getStringExtra("quant_cafe").toString().toInt()
        val quant_pao = i.getStringExtra("quant_pao").toString().toInt()
        val quant_chocolate = i.getStringExtra("quant_chocolate").toString().toInt()
        val preco_cafe = i.getDoubleExtra("preco_cafe", 0.0)
        val preco_pao = i.getDoubleExtra("preco_pao", 0.0)
        val preco_chocolate = i.getDoubleExtra("preco_chocolate", 0.0)

        val texto = "Resumo do pedido: \n" +
                "Café: $quant_cafe Preço: ${quant_cafe*preco_cafe}$\n" +
                "Pão: $quant_pao Preço: ${quant_pao*preco_pao}$\n" +
                "Chocolate: $quant_chocolate Preço: ${quant_chocolate*preco_chocolate}$\n\n" +
                "Total:${quant_chocolate*preco_chocolate+quant_cafe*preco_cafe+quant_pao*preco_pao}$";

        binding.textView.setText(texto)
    }
}