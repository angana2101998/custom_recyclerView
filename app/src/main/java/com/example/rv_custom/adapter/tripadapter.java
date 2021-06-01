package com.example.rv_custom.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rv_custom.R;
import com.example.rv_custom.models.Ads;
import com.example.rv_custom.models.item;
import com.example.rv_custom.models.news;
import com.example.rv_custom.models.trip;

import java.util.List;

public class tripadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public List<item>items;

    public tripadapter(List<item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==0){
            return new TripViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
        }
        else if(viewType==1){
            return new AdsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ads,parent,false));

        }
        else{
            return new NewsVoewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news,parent,false));

        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            trip trip = (trip) items.get(position).getObject();
            ((TripViewHolder) holder).setTripDate(trip);
        } else if (getItemViewType(position) == 1) {
            Ads ads = (Ads) items.get(position).getObject();
            ((AdsViewHolder) holder).setAdsDate(ads);
        }
        else{
             news newss = (news) items.get(position).getObject();
            ((NewsVoewHolder) holder).setnewsDate(newss);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    static class TripViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagetrip;
        private TextView textTriptitle,textTrip;
         TripViewHolder(@NonNull View itemView) {
            super(itemView);
             imagetrip=itemView.findViewById(R.id.image1);
             textTriptitle=itemView.findViewById(R.id.trip_title);
             textTrip=itemView.findViewById(R.id.trip);

        }

        public void setTripDate(trip tripp) {
            imagetrip.setImageResource(tripp.getTripimage());
            textTriptitle.setText(tripp.getTriptitle());
            textTrip.setText(tripp.getTrip());
        }
    }


    static  class AdsViewHolder extends RecyclerView.ViewHolder{
            private TextView textddtitle,textads;
         AdsViewHolder(@NonNull View itemView) {
            super(itemView);
             textddtitle=itemView.findViewById(R.id.ads_title);
             textads=itemView.findViewById(R.id.add_text);
        }

        public void setAdsDate(Ads ads) {
            textddtitle.setText(ads.getAddstitle());
            textads.setText(ads.getAdds());
        }
    }
    static  class NewsVoewHolder extends RecyclerView.ViewHolder{
        private TextView textnewstitle,textnews;
         NewsVoewHolder(@NonNull View itemView) {
            super(itemView);
             textnewstitle=itemView.findViewById(R.id.news_title);
             textnews=itemView.findViewById(R.id.news_text);
        }

        public void setnewsDate(news newss) {
            textnewstitle.setText(newss.getNewstitle());
            textnews.setText(newss.getNews());

        }
    }
}
