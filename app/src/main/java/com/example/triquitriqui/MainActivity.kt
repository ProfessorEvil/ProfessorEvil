package com.example.triquitriqui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.triquitriqui.R.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var jugador1=ArrayList<Int>()
    var jugador2=ArrayList<Int>()
    var jugadorActivo=1
    var botonGris=0
    var capitulo=1
    var x1=0
    var x2=0
    var x3=0
    var xContador=1
    var yContador=1
    var escenax=0
    var escenay=0

    var y1=0
    var y2=0
    var y3=0
    var num=0

    var movedor=1

    var ganador = 0
    var Reiniciar=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }
    fun btnEvento(view: View){
        val botonSeleccionado=view as Button
        var idCelda=0
        when (botonSeleccionado.id){
            id.button1->idCelda=1
            id.button2->idCelda=2
            id.button3->idCelda=3
            id.button4->idCelda=4
            id.button5->idCelda=5
            id.button6->idCelda=6
            id.button7->idCelda=7
            id.button8->idCelda=8
            id.button9->idCelda=9
        }
        if(capitulo==1) {
            partida(idCelda, botonSeleccionado)
        }else{
            partida2(idCelda, botonSeleccionado)
        }
        yElganadorEs()
    }
    fun partida(idCelda:Int, botonSeleccionado:Button){
        if(jugadorActivo==1){
            botonSeleccionado.text="X"
            botonSeleccionado.setBackgroundColor(Color.BLUE)
            when(xContador){
                1->x1=idCelda
                2->x2=idCelda
                3->x3=idCelda
            }
            xContador=xContador+1
            jugador1.add(idCelda)
            jugadorActivo=2

        }else{
            botonSeleccionado.text="O"
            botonSeleccionado.setBackgroundColor(Color.RED)
            when(yContador){
                1->y1=idCelda
                2->y2=idCelda
                3->y3=idCelda
            }
            yContador=yContador+1
            jugador2.add(idCelda)
            jugadorActivo=1
        }
        if(x1!=0 && x2!=0 && x3!=0 && y1!=0 && y2!=0 && y3!=0){
            capitulo=2
        }
        //botonSeleccionado.isEnabled=false
        //contadorDeMatrices()
    }
    fun partida2(idCelda: Int, botonSeleccionado: Button){
        if (movedor==1) {
            inhabilitador()
            /////si selecciono el button1
            if (botonSeleccionado.id==button1.id){
                botonGris=1
                if (button1.text == "X" || button1.text == "O") {
                     if (button1.text == "X" && jugadorActivo==1) {
                        button1.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button2.text == "X" || button2.text == "O") {

                        }else{button2.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button4.text == "X" || button4.text == "O") {

                        }else{button4.isEnabled = true}
                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button1.text == "O" && jugadorActivo==2) {
                        button1.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button2.text == "X" || button2.text == "O") {

                        }else{button2.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button4.text == "X" || button4.text == "O") {

                        }else{button4.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }
            /////si selecciono el button2
            if (botonSeleccionado.id==button2.id){
                botonGris=2
                if (button2.text == "X" || button2.text == "O") {
                    if (button2.text == "X" && jugadorActivo==1) {
                        button2.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button1.text == "X" || button1.text == "O") {

                        }else{button1.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button3.text == "X" || button3.text == "O") {

                        }else{button3.isEnabled = true}
                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button2.text == "O" && jugadorActivo==2) {
                        button2.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button1.text == "X" || button1.text == "O") {

                        }else{button1.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button3.text == "X" || button3.text == "O") {

                        }else{button3.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }
            /////si selecciono el button3
            if (botonSeleccionado.id==button3.id){
                botonGris=3
                if (button3.text == "X" || button3.text == "O") {
                    if (button3.text == "X" && jugadorActivo==1) {
                        button3.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button2.text == "X" || button2.text == "O") {

                        }else{button2.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button6.text == "X" || button6.text == "O") {

                        }else{button6.isEnabled = true}
                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button3.text == "O" && jugadorActivo==2) {
                        button3.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button2.text == "X" || button2.text == "O") {

                        }else{button2.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button6.text == "X" || button6.text == "O") {

                        }else{button6.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }
            /////si selecciono el button4
            if (botonSeleccionado.id==button4.id){
                botonGris=4
                if (button4.text == "X" || button4.text == "O") {
                    if (button4.text == "X" && jugadorActivo==1) {
                        button4.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button1.text == "X" || button1.text == "O") {

                        }else{button1.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button7.text == "X" || button7.text == "O") {

                        }else{button7.isEnabled = true}
                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button4.text == "O" && jugadorActivo==2) {
                        button4.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button1.text == "X" || button1.text == "O") {

                        }else{button1.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button7.text == "X" || button7.text == "O") {

                        }else{button7.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }
            /////si selecciono el button5
            if (botonSeleccionado.id==button5.id){
                botonGris=5
                if (button5.text == "X" || button5.text == "O") {
                    if (button5.text == "X" && jugadorActivo==1) {
                        button5.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button2.text == "X" || button2.text == "O") {

                        }else{button2.isEnabled = true}
                        if (button1.text == "X" || button1.text == "O") {

                        }else{button1.isEnabled = true}
                        if (button3.text == "X" || button3.text == "O") {

                        }else{button3.isEnabled = true}
                        if (button4.text == "X" || button4.text == "O") {

                        }else{button4.isEnabled = true}
                        if (button6.text == "X" || button6.text == "O") {

                        }else{button6.isEnabled = true}
                        if (button7.text == "X" || button7.text == "O") {

                        }else{button7.isEnabled = true}
                        if (button8.text == "X" || button8.text == "O") {

                        }else{button8.isEnabled = true}
                        if (button9.text == "X" || button9.text == "O") {

                        }else{button9.isEnabled = true}

                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button5.text == "O" && jugadorActivo==2) {
                        button5.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button2.text == "X" || button2.text == "O") {

                        }else{button2.isEnabled = true}
                        if (button2.text == "X" || button2.text == "O") {

                        }else{button2.isEnabled = true}
                        if (button1.text == "X" || button1.text == "O") {

                        }else{button1.isEnabled = true}
                        if (button3.text == "X" || button3.text == "O") {

                        }else{button3.isEnabled = true}
                        if (button4.text == "X" || button4.text == "O") {

                        }else{button6.isEnabled = true}
                        if (button6.text == "X" || button6.text == "O") {

                        }else{button6.isEnabled = true}
                        if (button7.text == "X" || button7.text == "O") {

                        }else{button7.isEnabled = true}
                        if (button8.text == "X" || button8.text == "O") {

                        }else{button8.isEnabled = true}
                        if (button9.text == "X" || button9.text == "O") {

                        }else{button9.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }
            /////si selecciono el button6
            if (botonSeleccionado.id==button6.id){
                botonGris=6
                if (button6.text == "X" || button6.text == "O") {
                    if (button6.text == "X" && jugadorActivo==1) {
                        button6.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button3.text == "X" || button3.text == "O") {

                        }else{button3.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button9.text == "X" || button9.text == "O") {

                        }else{button9.isEnabled = true}
                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button6.text == "O" && jugadorActivo==2) {
                        button6.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button3.text == "X" || button3.text == "O") {

                        }else{button3.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button9.text == "X" || button9.text == "O") {

                        }else{button9.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }
            /////si selecciono el button7
            if (botonSeleccionado.id==button7.id){
                botonGris=7
                if (button7.text == "X" || button7.text == "O") {
                    if (button7.text == "X" && jugadorActivo==1) {
                        button7.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button4.text == "X" || button4.text == "O") {

                        }else{button4.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button8.text == "X" || button8.text == "O") {

                        }else{button8.isEnabled = true}
                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button7.text == "O" && jugadorActivo==2) {
                        button7.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button4.text == "X" || button4.text == "O") {

                        }else{button4.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button8.text == "X" || button8.text == "O") {

                        }else{button8.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }
            /////si selecciono el button8
            if (botonSeleccionado.id==button8.id){
                botonGris=8
                if (button8.text == "X" || button8.text == "O") {
                    if (button8.text == "X" && jugadorActivo==1) {
                        button8.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button7.text == "X" || button7.text == "O") {

                        }else{button7.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button9.text == "X" || button9.text == "O") {

                        }else{button9.isEnabled = true}
                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button8.text == "O" && jugadorActivo==2) {
                        button8.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button7.text == "X" || button7.text == "O") {

                        }else{button7.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button9.text == "X" || button9.text == "O") {

                        }else{button9.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }
            /////si selecciono el button9
            if (botonSeleccionado.id==button9.id){
                botonGris=9
                if (button9.text == "X" || button9.text == "O") {
                    if (button9.text == "X" && jugadorActivo==1) {
                        button9.setBackgroundColor(Color.GRAY)
                        escenax=1
                        movedor = 2
                        if (button8.text == "X" || button8.text == "O") {

                        }else{button8.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button6.text == "X" || button6.text == "O") {

                        }else{button6.isEnabled = true}
                    }//else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}
                    if (button9.text == "O" && jugadorActivo==2) {
                        button9.setBackgroundColor(Color.GRAY)
                        escenay=1
                        movedor = 2
                        if (button8.text == "X" || button8.text == "O") {

                        }else{button8.isEnabled = true}
                        if (button5.text == "X" || button5.text == "O") {

                        }else{button5.isEnabled = true}
                        if (button6.text == "X" || button6.text == "O") {

                        }else{button6.isEnabled = true}
                    }//else{if(jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}

                }
            }

        }else {
            movedor=1
            if (escenax == 1 && jugadorActivo == 1) {

                if ( botonSeleccionado.isEnabled == true||botonSeleccionado.text != "X"||botonSeleccionado.text != "O") {
                    botonSeleccionado.text = "X"
                    when(botonGris){
                        1->{button1.setBackgroundResource(R.drawable.transparente)
                            button1.setText("")}
                        2->{button2.setBackgroundResource(R.drawable.transparente)
                            button2.setText("")}
                        3->{button3.setBackgroundResource(R.drawable.transparente)
                            button3.setText("")}
                        4->{button4.setBackgroundResource(R.drawable.transparente)
                            button4.setText("")}
                        5->{button5.setBackgroundResource(R.drawable.transparente)
                            button5.setText("")}
                        6->{button6.setBackgroundResource(R.drawable.transparente)
                            button6.setText("")}
                        7->{button7.setBackgroundResource(R.drawable.transparente)
                            button7.setText("")}
                        8->{button8.setBackgroundResource(R.drawable.transparente)
                            button8.setText("")}
                        9->{button9.setBackgroundResource(R.drawable.transparente)
                            button9.setText("")}
                    }
                    escenax=0
                    botonSeleccionado.setBackgroundColor(Color.BLUE)
///falta cambiar los datos de la matriz

                }
                inhabilitador()
                jugadorActivo=2
            }else{if(jugadorActivo==2){Toast.makeText(this,"Es el turno del jugador 2",Toast.LENGTH_LONG).show()}}

            if (escenay == 1 && jugadorActivo == 2) {
                if ( botonSeleccionado.isEnabled == true||botonSeleccionado.text != "X"||botonSeleccionado.text != "O") {
                    botonSeleccionado.text = "O"

                    when(botonGris){
                        1->{button1.setBackgroundResource(R.drawable.transparente)
                            button1.setText("")}
                        2->{button2.setBackgroundResource(R.drawable.transparente)
                            button2.setText("")}
                        3->{button3.setBackgroundResource(R.drawable.transparente)
                            button3.setText("")}
                        4->{button4.setBackgroundResource(R.drawable.transparente)
                            button4.setText("")}
                        5->{button5.setBackgroundResource(R.drawable.transparente)
                            button5.setText("")}
                        6->{button6.setBackgroundResource(R.drawable.transparente)
                            button6.setText("")}
                        7->{button7.setBackgroundResource(R.drawable.transparente)
                            button7.setText("")}
                        8->{button8.setBackgroundResource(R.drawable.transparente)
                            button8.setText("")}
                        9->{button9.setBackgroundResource(R.drawable.transparente)
                            button9.setText("")}
                    }
                    botonSeleccionado.setBackgroundColor(Color.RED)
                    escenay = 0
///Falta definir la matriz



                }
                inhabilitador()
                jugadorActivo=1
            }else{if (jugadorActivo==1){Toast.makeText(this,"Es el turno del jugador 1",Toast.LENGTH_LONG).show()}}
        }

    }
    fun inhabilitador(){
        if (button1.text == "X" || button1.text == "O") {button1.isEnabled=true}else{button1.isEnabled=false}
        if (button2.text == "X" || button2.text == "O") {button2.isEnabled=true}else{button2.isEnabled=false}
        if (button3.text == "X" || button3.text == "O") {button3.isEnabled=true}else{button3.isEnabled=false}
        if (button4.text == "X" || button4.text == "O") {button4.isEnabled=true}else{button4.isEnabled=false}
        if (button5.text == "X" || button5.text == "O") {button5.isEnabled=true}else{button5.isEnabled=false}
        if (button6.text == "X" || button6.text == "O") {button6.isEnabled=true}else{button6.isEnabled=false}
        if (button7.text == "X" || button7.text == "O") {button7.isEnabled=true}else{button7.isEnabled=false}
        if (button8.text == "X" || button8.text == "O") {button8.isEnabled=true}else{button8.isEnabled=false}
        if (button9.text == "X" || button9.text == "O") {button9.isEnabled=true}else{button9.isEnabled=false}
    }
    fun yElganadorEs(){

        if (button1.text=="X" && button2.text=="X" && button3.text=="X"){
            ganador = 1
        }
        if (button4.text=="X" && button5.text=="X" && button6.text=="X") {
            ganador = 1
        }
        if (button7.text=="X" && button8.text=="X" && button9.text=="X") {
            ganador = 1
        }
        if (button1.text=="X" && button4.text=="X" && button7.text=="X") {
            ganador = 1
        }
        if (button2.text=="X" && button5.text=="X" && button8.text=="X") {
            ganador = 1
        }
        if (button3.text=="X" && button6.text=="X" && button9.text=="X") {
            ganador = 1
        }
        if (button1.text=="X" && button5.text=="X" && button9.text=="X") {
            ganador = 1
        }
        if (button7.text=="X" && button5.text=="X" && button3.text=="X") {
            ganador = 1
        }
        ////////////////////////////////////
        if (button1.text=="O" && button2.text=="O" && button3.text=="O"){
            ganador = 2
        }
        if (button4.text=="O" && button5.text=="O" && button6.text=="O") {
            ganador = 2
        }
        if (button7.text=="O" && button8.text=="O" && button9.text=="O") {
            ganador = 2
        }
        if (button1.text=="O" && button4.text=="O" && button7.text=="O") {
            ganador = 2
        }
        if (button2.text=="O" && button5.text=="O" && button8.text=="O") {
            ganador = 2
        }
        if (button3.text=="O" && button6.text=="O" && button9.text=="O") {
            ganador = 2
        }
        if (button1.text=="O" && button5.text=="O" && button9.text=="O") {
            ganador = 2
        }
        if (button7.text=="O" && button5.text=="O" && button3.text=="O") {
            ganador = 2
        }





        when(ganador){
            1->Toast.makeText(this,"El ganador es el jugador XXX",Toast.LENGTH_LONG).show()
            2->Toast.makeText(this,"El ganador es el jugador OOO",Toast.LENGTH_LONG).show()
            ///////////////////////////


            //////////////////////////
        }

    }
}
