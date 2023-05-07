package com.example.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ExpensesAdapter extends RecyclerView.Adapter<ExpensesAdapter.MyViewHolder> {
    private Context context;
    private OnItemsClick onItemsClick;
    private List<ExpenseModal> expenseModalList;

    public ExpensesAdapter(Context context, OnItemsClick onItemsClick) {
        this.context = context;
        expenseModalList = new ArrayList<>();
        this.onItemsClick = onItemsClick;
    }

    public void add(ExpenseModal expenseModal) {
        expenseModalList.add(expenseModal);
        notifyDataSetChanged();
    }

    public void clear() {
        expenseModalList.clear();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expense_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ExpenseModal expenseModal = expenseModalList.get(position);
        holder.note.setText(expenseModal.getNote());
        holder.amount.setText(String.valueOf(expenseModal.getAmount()));
        holder.category.setText(expenseModal.getCategory());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemsClick.onClick(expenseModal);
            }
        });
    }

    @Override
    public int getItemCount() {
        return expenseModalList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView note, category, amount, date;

        public MyViewHolder(@NotNull View itemView) {
            super(itemView);
            note = itemView.findViewById(R.id.note);
            category = itemView.findViewById(R.id.category);
            amount = itemView.findViewById(R.id.amount);
            date = itemView.findViewById(R.id.date);
        }
    }

}
