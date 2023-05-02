package kg.geeks.android1kotlin

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kg.geeks.android1kotlin.databinding.FragmentDataBinding

class DataFragment : Fragment() {

    private lateinit var binding: FragmentDataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getData()
    }

    private fun getData() {
        val name = arguments?.getString("name")
        val email = arguments?.getString("email")
        val image = arguments?.getParcelable<Bitmap>("image")

        binding.imageViewData.setImageBitmap(image)
        binding.textViewNameData.text = name
        binding.textViewEmailData.text = email

    }
}
