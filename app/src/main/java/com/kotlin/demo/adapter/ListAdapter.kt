package terminal.datuhongan.com.kotlindemo

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.kotlin.demo.R
import com.kotlin.demo.databinding.ItemBinding
import com.kotlin.demo.entity.UserEntity

/**
 * Created by wangming on 2018/6/19.
 */
class ListAdapter(private val items: List<UserEntity>) : RecyclerView.Adapter<ListAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item, parent, false)

        return VH(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(items[position])
        Glide.with(holder.itemView.context).load(items[position].url).into(holder.iv)
    }


    class VH(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val iv = binding.iv
        fun bind(data: UserEntity) {
            binding.data = data
            binding.executePendingBindings()
        }
    }
}