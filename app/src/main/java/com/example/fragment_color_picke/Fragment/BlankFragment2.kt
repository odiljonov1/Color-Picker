package com.example.homework16_1.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment_color_picke.R
import com.example.fragment_color_picke.Utils.Data
import kotlinx.android.synthetic.main.fragment_blank2.view.*

private const val ARG_PARAM1 = "param1"

class BlankFragment2 : Fragment() {
    private var param1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_blank2, container, false)

        root.color_1.setOnClickListener {
            Data.color = "1"
        }

        root.color_2.setOnClickListener {
            Data.color = "2"
        }

        root.color_3.setOnClickListener {
            Data.color = "3"
        }

        root.color_4.setOnClickListener {
            Data.color = "4"
        }

        root.color_5.setOnClickListener {
            Data.color = "5"
        }

        root.color_6.setOnClickListener {
            Data.color = "6"
        }

        root.color_7.setOnClickListener {
            Data.color = "7"
        }

        root.color_8.setOnClickListener {
            Data.color = "8"
        }

        root.color_9.setOnClickListener {
            Data.color = "9"
        }

        root.color_10.setOnClickListener {
            Data.color = "10"
        }

        root.color_11.setOnClickListener {
            Data.color = "11"
        }

        root.color_12.setOnClickListener {
            Data.color = "12"
        }

        return root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            BlankFragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}