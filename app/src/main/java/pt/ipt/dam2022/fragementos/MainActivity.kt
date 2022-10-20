package pt.ipt.dam2022.fragementos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity : AppCompatActivity() {
    lateinit var f1:MyFragment
    lateinit var f2:MyFragment
    lateinit var f3:MyFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        f1 = MyFragment.newInstance("Ola","mundo")
        f2 = MyFragment.newInstance("OLA","mundo")
        f3 = MyFragment.newInstance("OLA","MUNDO")
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment1, f1)
        fragmentTransaction.add(R.id.fragment2, f2)
        fragmentTransaction.add(R.id.fragment3, f3)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}