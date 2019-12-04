package guerrero.erick.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var lugares = ArrayList<Lugar>()
        lugares.add(Lugar("Egipto", "https://i.imgur.com/itRz9gzl.jpg", "Descripción"))

        miRecycler.adapter = LugarAdapter(lugares = lugares, context = this)
        miRecycler.layoutManager = GridLayoutManager(this,1,GridLayoutManager.VERTICAL,true)
        miRecycler.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        miRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,true)
    }
}
