package com.example.billingapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.billingapp.Adapters.InvoicesAdapter
import com.example.billingapp.R
import com.example.billingapp.databinding.FragmentInvoicingBinding


class FragmentInvoicing : Fragment() {
    val list = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
       val view = inflater.inflate(R.layout.fragment_invoicing,container,false)
        val binding = FragmentInvoicingBinding.bind(view)
        list.add("Customer 1")
        list.add("Customer 2")
        list.add("Customer 3")
        list.add("Customer 4")
        list.add("Customer 5")
        list.add("Customer 6")
        list.add("Customer 7")

        binding.todayInvoices.setHasFixedSize(true)
        binding.todayInvoices.layoutManager = LinearLayoutManager(requireContext())
        binding.todayInvoices.adapter = InvoicesAdapter(requireContext(),list)

        binding.allInvoices.setHasFixedSize(true)
        binding.allInvoices.layoutManager = LinearLayoutManager(requireContext())
        binding.allInvoices.adapter = InvoicesAdapter(requireContext(),list)

        return view
    }


}