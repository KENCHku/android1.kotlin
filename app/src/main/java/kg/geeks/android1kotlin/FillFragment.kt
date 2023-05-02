package kg.geeks.android1kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kg.geeks.android1kotlin.databinding.FragmentFillBinding

class FillFragment : Fragment() {

    private lateinit var binding: FragmentFillBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFillBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUI()
        sendData()
    }

    private fun setUI() {
       Glide.with(binding.imageViewFf)
           .load("https://uploads.visitseattle.org/2023/01/11122537/Banner_rachael-jones-media_aerial-destination-photos-24_3.jpg")
           .into(binding.imageViewFf)
    }

    private fun sendData() {
        val fragment = DataFragment()
        val bundle = Bundle()
        bundle.putString("name", binding.editTextNameFf.text.toString())
        bundle.putString("email", binding.editTextEmailFf.text.toString())
        bundle.putString("image", binding.imageViewFf.toString())
        fragment.arguments = bundle

    }
}