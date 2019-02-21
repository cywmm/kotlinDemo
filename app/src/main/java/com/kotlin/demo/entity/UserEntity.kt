package com.kotlin.demo.entity

import android.databinding.BaseObservable

/**
 *  author: wangming
 *  email:  cy_wangming@163.com
 *  date:   2019/2/21 下午1:42
 */
data class UserEntity(
    val url: String,
    val name: String
) : BaseObservable()