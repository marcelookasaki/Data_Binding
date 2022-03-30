package com.br.databinding

class Contribuinte (var codCadastro: String): Residente() {

        fun setcodCadastro(cod: String) {
            this.codCadastro = cod
        }

        fun getcodCadastro(): String {
            return this.codCadastro
        }

        init {
            this.codCadastro =
                "abc"; // É equivalente a chamar o método set dentro da própria classe
        }
    }


