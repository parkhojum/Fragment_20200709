package com.example.fragment_20200709.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment_20200709.R
import kotlinx.android.synthetic.main.activity_fragmentfirst.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.activity_fragmentfirst,container,false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        changeMessageBtn.setOnClickListener {

            welcomMessageTxt.text = "버튼 실행이 잘 되었습니다."
        }
    }
}