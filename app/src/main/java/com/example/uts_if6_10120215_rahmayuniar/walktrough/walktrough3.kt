package com.example.uts_if6_10120215_rahmayuniar.walktrough

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.uts_if6_10120215_rahmayuniar.MainActivity
import com.example.uts_if6_10120215_rahmayuniar.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [walktrough3.newInstance] factory method to
 * create an instance of this fragment.
 */
class walktrough3 : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var btn_masuk: Button
    private var param1: String? = null
    private var param2: String? = null

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_walktrough3, container, false)
            btn_masuk = view.findViewById<Button>(R.id.btn_masuk)
            btn_masuk.setOnClickListener {
                val intent = Intent(requireContext(), MainActivity::class.java)
                startActivity(intent)
            }

            return view
        }


            // Inflate the layout for this fragment
            companion object {
                @JvmStatic
                fun newInstance()=walktrough3()
            }
        }

    
