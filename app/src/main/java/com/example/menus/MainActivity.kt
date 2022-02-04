package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*
import com.example.menus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var contViews:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        contViews= ActivityMainBinding.inflate(layoutInflater)

        setContentView(contViews.root)

        registerForContextMenu(contViews.txtContext)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflador=menuInflater
        inflador.inflate(R.menu.menu_a,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        val inflador=menuInflater
        inflador.inflate(R.menu.menu_a,menu)

        menu?.add("Item Adicional")

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.itemHome-> {
                Log.i("result","Touch en el Item Home")
                return true
            }
            R.id.itemPost-> {
                Log.i("result","Touch en el Item Post")
                return true
            }
            R.id.itemPrivate->{
                Log.i("result","Touch en el Item Private")
                return true
            }
            else ->super.onOptionsItemSelected(item)

        }

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.itemHome-> {
                Log.i("result","Touch en el ItemContext Home")
                return true
            }
            R.id.itemPost-> {
                Log.i("result","Touch en el ItemContext Post")
                return true
            }
            R.id.itemPrivate->{
                Log.i("result","Touch en el ItemContext Private")
                return true
            }
            else ->super.onContextItemSelected(item)

        }

    }


}