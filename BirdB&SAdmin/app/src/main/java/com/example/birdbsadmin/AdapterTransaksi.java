package com.example.birdbsadmin;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterTransaksi extends RecyclerView.Adapter<AdapterTransaksi.MyViewHolder>{
    List<Transaksi> mKontakList;

    public AdapterTransaksi(List <Transaksi> KontakList) {
        mKontakList = KontakList;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bird, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder,final int position){
        holder.mTextViewId.setText( mKontakList.get(position).getKeterangan());
        holder.mTextViewNama.setText(mKontakList.get(position).getKategori());
//        holder.mTextViewNomor.setText(String.valueOf(mKontakList.get(position).getHarga()));
//        Glide.with(holder.itemView.getContext())
//                .load(""+mKontakList.get(position).getGambar())
//                .into(holder.mImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), DetailTransactionActivity.class);
//                mIntent.putExtra("Id", mKontakList.get(position).getIdkategori());
//                mIntent.putExtra("Nama", mKontakList.get(position).getKategori());
//                mIntent.putExtra("Nomor", mKontakList.get(position).getKeterangan());
              view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount () {
        return mKontakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewId, mTextViewNama, mTextViewNomor;
        public ImageView mImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewId = (TextView) itemView.findViewById(R.id.textView5);
            mTextViewNama = (TextView) itemView.findViewById(R.id.textView6);
            mTextViewNomor = (TextView) itemView.findViewById(R.id.textView7);
            mImage = (ImageView) itemView.findViewById(R.id.imageView2);
        }
    }
}


