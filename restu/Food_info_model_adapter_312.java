package papon.shahi.restu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Food_info_model_adapter_312 extends PagerAdapter {
    private List<Food_Info_Model_3_1> models;
    private LayoutInflater layoutInflater;
    private Context context;

    public Food_info_model_adapter_312(List<Food_Info_Model_3_1> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.food_info_item_31,container,false);
        ImageView imageView;
        TextView tittle,desc,price;

        imageView = view.findViewById(R.id.image);
        tittle = view.findViewById(R.id.tittle);
        desc = view.findViewById(R.id.desc);
        price = view.findViewById(R.id.price);

        imageView.setImageResource(models.get(position).getImage());
        tittle.setText(models.get(position).getTittle());
        desc.setText(models.get(position).getDesc());
        price.setText(models.get(position).getPrice());

        container.addView(view, 0);


        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);


    }
}
