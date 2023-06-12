package com.example.uts_if6_10120215_rahmayuniar.Profile

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.text.util.Linkify
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.uts_if6_10120215_rahmayuniar.Dialog.CustomDialogFragment
import com.example.uts_if6_10120215_rahmayuniar.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Profile.newInstance] factory method to
 * create an instance of this fragment.
 */
class Profile : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_profile, container, false)

        val textViewMapsLink = rootView.findViewById<TextView>(R.id.alamat)

        textViewMapsLink.setOnClickListener {
            val uri = "https://maps.app.goo.gl/ySE9rNJ81tzf6zAw7"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            val linkText = "Kopo Safira Residence Blok D5,\nMargahayu Tengah"

            textViewMapsLink.text = linkText
            Linkify.addLinks(textViewMapsLink, Linkify.WEB_URLS)
            textViewMapsLink.linksClickable = true
            textViewMapsLink.setLinkTextColor(Color.BLUE)

            startActivity(intent)
        }

        return rootView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnInstagram = view.findViewById<View>(R.id.btnInstagram)
        val btnWa = view.findViewById<View>(R.id.btnWa)
        val btnEmail = view.findViewById<View>(R.id.btnEmail)
        val showDialogButton = view.findViewById<Button>(R.id.btn_show)
        showDialogButton.setOnClickListener {
            showCustomDialog()
        }

        btnInstagram.setOnClickListener {
            openSocialMedia("https://instagram.com/rhmaynrr?igshid=NGExMmI2YTkyZg==")
        }
        btnWa.setOnClickListener {
            openWhatsApp()
        }
        btnEmail.setOnClickListener {
            openEmail()
        }
    }
    private fun showCustomDialog() {
        val dialogFragment = CustomDialogFragment()
        dialogFragment.show(parentFragmentManager, "CustomDialogFragment")
    }

    private fun openSocialMedia(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
    private fun openWhatsApp() {
        val phoneNumber = "+62 822-8196-4802" // Nomor telepon yang akan diarahkan ke WhatsApp
        val url = "https://api.whatsapp.com/send?phone=+62 822-8196-4802"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
    private fun openEmail() {
        val email = "rahma.10120215@mahasiswa.unikom.ac.id" // Alamat email yang akan dituju
        val subject = "Subject email" // Subjek email
        val uri = Uri.parse("mailto:$email?subject=${Uri.encode(subject)}")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        startActivity(intent)
    }
}

        //private companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Profile.
         */
        // TODO: Rename and change types and number of parameters
        // @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Profile().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }




