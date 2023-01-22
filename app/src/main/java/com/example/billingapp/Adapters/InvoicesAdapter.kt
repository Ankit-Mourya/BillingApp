package com.example.billingapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.billingapp.databinding.InvoiceItemBinding

class InvoicesAdapter(private val context: Context, private val list:ArrayList<String>):
    RecyclerView.Adapter<InvoicesAdapter.Holder>() {
    class Holder (binding:InvoiceItemBinding):RecyclerView.ViewHolder(binding.root){
        val customerid = binding.customerid
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(InvoiceItemBinding.inflate(LayoutInflater.from(context)))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.customerid.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}