package com.kotlin.demo

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.kotlin.demo.databinding.ActivityMainBinding
import com.kotlin.demo.entity.UserEntity
import terminal.datuhongan.com.kotlindemo.ListAdapter

class MainActivity : AppCompatActivity() {
    private val url: String =
        "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1550751622809&di=995496f436ea0febe7930a743" +
                "3f17fb0&imgtype=0&src=http%3A%2F%2Fimg.cnmo-img.com.cn%2F1574_600x1000%2F1573447.jpg"

    private val mList: MutableList<UserEntity> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        for (i in 1..10) mList.add(UserEntity(url, i.toString() + "台pixel3"))

        binding.rec.layoutManager = LinearLayoutManager(this)
        binding.rec.adapter = ListAdapter(mList)
    }

}
