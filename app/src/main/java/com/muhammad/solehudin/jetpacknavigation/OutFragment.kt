package com.muhammad.solehudin.jetpacknavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_liniear.*
import kotlinx.android.synthetic.main.fragment_out.*

/**
 * A simple [Fragment] subclass.
 */
class OutFragment : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_out, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        buttonHome.setOnClickListener{
            nav.navigate(R.id.action_outFragment_to_mainFragment)
        }
        buttonCoba.setOnClickListener{
            nav.navigate(R.id.action_outFragment_to_inFragment)
        }
        val hasilTangkap = arguments?.getString("args")
        text.text = hasilTangkap
    }

}
