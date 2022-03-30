package com.br.databinding

import kotlin.random.Random

class Pessoa(nome: String) : Residente() {
    var nome: String = nome
        get() {
            if (field.length > 10) {
                return field.substring(0, 10) + "(...)"
            } else {
                return field
            }
        }
        set(value) {
            if (value == "") {
                field = "vazio"
            } else {
                field = value
            }
        }

    var codPin: String = ""
        get() = field
        set(value) {
            if (value.length < 3) {
                field = Random.nextInt(100, 300).toString()
            } else {
                field = value
            }
        }

    var idade: Int = 0
        get() = field
        set(value) {
            field = value
        }

    init {
        this.nome = nome // É equivalente a chamar o método set dentro da própria classe
    }

    /* Construtor secundário */
    constructor(nome: String, codPin: String) : this(nome) {
        this.codPin = codPin
    }


    /* Construtor secundário */
    constructor(nome: String, idade: Int) : this(nome) {
        this.nome = nome;
        this.idade - idade;
    }

    override fun retornarPais() : String {
        return super.retornarPais() + " - " + "BR"
    }
}