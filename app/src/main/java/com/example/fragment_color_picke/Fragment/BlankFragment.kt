import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment_color_picke.R
import com.example.fragment_color_picke.Utils.Data
import com.example.homework16_1.Fragment.BlankFragment2
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlinx.android.synthetic.main.fragment_blank.view.*

class BlankFragment : Fragment() {

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_blank, container, false)

        root.btn_next.setOnClickListener {

            val blankFragment = BlankFragment2()
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.lin_container, blankFragment)
            transaction.addToBackStack(blankFragment.toString())
            transaction.commit()
        }

        return root
    }

    @SuppressLint("ResourceAsColor")
    override fun onResume() {
        super.onResume()
        when (Data.color) {
            "1" ->  tv.setBackgroundColor(0xFFEF3B3B.toInt())
            "2" ->  tv.setBackgroundColor(0xFFEAD72F.toInt())
            "3" ->  tv.setBackgroundColor(0xFF78DA2B.toInt())
            "4" ->  tv.setBackgroundColor(0xFF5DE4CC.toInt())
            "5" ->  tv.setBackgroundColor(0xFF2C7DB8.toInt())
            "6" ->  tv.setBackgroundColor(0xFF4B35CE.toInt())
            "7" ->  tv.setBackgroundColor(0xFFBF5FE0.toInt())
            "8" ->  tv.setBackgroundColor(0xFFD43294.toInt())
            "9" ->  tv.setBackgroundColor(0xFF864343.toInt())
            "10" ->  tv.setBackgroundColor(0xFFBFA050.toInt())
            "11" ->  tv.setBackgroundColor(0xFF351A63.toInt())
            "12" ->  tv.setBackgroundColor(0xFF781189.toInt())
        }
    }
}