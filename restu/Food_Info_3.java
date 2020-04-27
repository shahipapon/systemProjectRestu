package papon.shahi.restu;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Food_Info_3 extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {


    Ordered_Item_4 ordered_Item;

     // for spin
    Spinner spin;    //for spin


    static int checkFoodCategory;
    String send_Food_name;
    int send_Food_price, send_Food_quantity;
    int allTtl;


    String[] FoodsQuantity = { "1", "2", "3", "4", "5","6", "7", "8", "9", "10"};

    String[] BurgerNames_1 = {
                    "Smoke BBQ Burger", "Beef Burger", "Chicken Cheese Burger", "Crispy Chiken Burger",
                    "Grilled Chiken Burger","Mega Burger", "Mushroom & Beef Burger", "Spicy Blast Burger"};

    int[] BurgerPrice_1 ={ 180, 180, 170, 150, 160, 250, 200, 200 };


    String[] Pasta_Names_3 = { "Beef Pasta","Chili Sauce Pasta","Oven Baked Pasta", "Spicy Pasta"};
    int[] Pasta_Price_3 = {250, 220, 250, 200};


    String[] Sandwitch_Names_4 = {"Chicken Cheese Sandwich", "Garden Club Sandwitch","Grilled Chicken Sandwich","Supreme  Club Sandwich", "Ultimate  Club Sandwich"};
    int[] Sandwitch_Price_4 = {300, 300, 250, 200,250};


    String text="";
    ViewPager viewPager;
    Food_info_model_adapter_312 adapter;

    List<Food_Info_Model_3_1> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator =  new ArgbEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_info_3);
        //
        //

        //



         spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the foodsNameArray list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, FoodsQuantity);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


        ////// spinner

        models = new ArrayList<>();
        ///eituku chkvlu er upr dpndnt

        /*models.add(new Food_Info_Model_3_1(R.drawable.brochure, "Brochure",""));
        models.add(new Food_Info_Model_3_1(R.drawable.sticker, "Sticker",""));
        models.add(new Food_Info_Model_3_1(R.drawable.poster, "POster",""));
        models.add(new Food_Info_Model_3_1(R.drawable.namecard, "NAmeCard",""));

        adapter =  new Food_info_model_adapter_312(models,this);*/

        ///eituku chkvlu er upr dpndnt
        if(checkFoodCategory ==1)
        {
            models.add(new Food_Info_Model_3_1(R.drawable.a_smoke_burger, "Smoke BBQ Burger","","180.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.a_beef_burger, "Beef Burger","","180.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.a_chiken_chese_burger, "Chicken Cheese Burger","","170.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.a_crispy_chiken_burger, "Crispy Chiken Burger","","150.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.a_grilled_chilen_burger, "Grilled Chiken Burger","","160.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.a_mega_burger, "Mega Burger","","250.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.a_mushroom_burger_with_beef, "Mushroom & Beef Burger","","200.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.a_spicy_blast_burger, "Spicy Blast Burger","","200.00"));



            adapter =  new Food_info_model_adapter_312(models,this);

            //app run hle  kono value nei na tai first index assign kora
            send_Food_name=BurgerNames_1[0];
            send_Food_price=BurgerPrice_1[0];
        }

        else if(checkFoodCategory ==2) //pizza
        {
            Toast.makeText(this,"Sorry! Temporary Unavailable :( ", Toast.LENGTH_SHORT).show();
            models.add(new Food_Info_Model_3_1(R.drawable.cat_others, "","","$"));
            adapter =  new Food_info_model_adapter_312(models,this);





        }

        else if(checkFoodCategory ==3) //pasta
        {


            models.add(new Food_Info_Model_3_1(R.drawable.c_beef_pasta, "Beef Pasta","","250.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.c_chili_sauce_pasta, "Chili Sauce Pasta","","220.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.c_oven_baked_pasta, "Oven Baked Pasta","","250.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.c_spicy_pasta, "Spicy Pasta","","200.00"));


            adapter =  new Food_info_model_adapter_312(models,this);


            send_Food_name=Pasta_Names_3[0];
            send_Food_price=Pasta_Price_3[0];

        }



        else if(checkFoodCategory ==4) //sandwitch
        {

            models.add(new Food_Info_Model_3_1(R.drawable.b_chicken_cheese_sandwich, "Chicken Cheese Sandwich","","300.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.b_garden_club_sandwich, "Garden Club Sandwitch","","300.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.b_grilled_chicken_club_sandwiche, "Grilled Chicken Sandwich","","250.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.b_supreme_club_sandwich, "Supreme  Club Sandwich","","200.00"));
            models.add(new Food_Info_Model_3_1(R.drawable.b_ultimate_club_sandwich, "Ultimate  Club Sandwich","","250.00"));


            adapter =  new Food_info_model_adapter_312(models,this);


            send_Food_name=Sandwitch_Names_4[0];
            send_Food_price=Sandwitch_Price_4[0];

        }
        else {
            Toast.makeText(this,"Sorry! Temporary Unavailable :( ", Toast.LENGTH_SHORT).show();
            models.add(new Food_Info_Model_3_1(R.drawable.cat_others, "","","$"));
            adapter =  new Food_info_model_adapter_312(models,this);

        }

        viewPager =  findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);


        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6),
                getResources().getColor(R.color.color7),
                getResources().getColor(R.color.color8),

        };

        colors = colors_temp;



        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

                if(i<(adapter.getCount()-1) && i<(colors.length-1))
                {
                    viewPager.setBackgroundColor(
                            (Integer) argbEvaluator.evaluate
                                    (       v,
                                            colors[i],
                                            colors[i+1]
                                    )
                    );
                }

                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }

            }

            @Override

            public void onPageSelected(int i) { // page scroled
                text  = String.valueOf(i+1);
               // Toast.makeText(Food_Info_3.this,text+" page selected", Toast.LENGTH_SHORT).show();
                spin.setSelection(0);

              if(checkFoodCategory==1) {



                  send_Food_name=BurgerNames_1[i];
                  send_Food_price=BurgerPrice_1[i];

              }
               else  if(checkFoodCategory==2) {



                }

              else  if(checkFoodCategory==3) {

                  send_Food_name=Pasta_Names_3[i];
                  send_Food_price=Pasta_Price_3[i];
              }

              else  if(checkFoodCategory==4) {
;

                  send_Food_name=Sandwitch_Names_4[i];
                  send_Food_price=Sandwitch_Price_4[i];
              }

            }



            @Override
            public void onPageScrollStateChanged(int i) {
                //  Toast.makeText(MainActivity.this,"page kola b", Toast.LENGTH_SHORT).show();


            }
        });



        Button btn = (Button) findViewById(R.id.btnOrder); //order buttopn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb=null;
                //sb
                // adapter=new MyAdapter(this, getc());


               // Toast.makeText(Food_Info_3.this,text+" button clicked", Toast.LENGTH_SHORT).show();
              //  int yy=0;//= deletelater.x;
              //  Toast.makeText(Food_Info_3.this,text+" button clicked "+String.valueOf(9), Toast.LENGTH_SHORT).show();


                //string FdName1,FdPrice1,FdQuant1,FdTtlPrc1,allttl1="";

                //send_Food_name;
                //int send_Food_price, send_Food_quantity;


                //Setting the ArrayAdapter data on the Spinner
                spin.setSelection(0); //reset spinner positin


                int ttl = send_Food_price*send_Food_quantity;
                allTtl = allTtl+ttl;
                //Toast.makeText(Food_Info_3.this,text+" button clicked "+String.valueOf(ttl), Toast.LENGTH_SHORT).show();


                    if(ordered_Item.OrderCount==0){
                        ordered_Item.OrderCount = ordered_Item.OrderCount+1;

                        ordered_Item.FdName1 =send_Food_name;

                        ordered_Item.FdPrice1 =  (String.valueOf(send_Food_price));

                        ordered_Item.FdQuant1 =(String.valueOf(send_Food_quantity));

                        ordered_Item.FdTtlPrc1 = (String.valueOf(ttl));

                        ordered_Item.total = (String.valueOf(allTtl));



                }
                else {

                        ordered_Item.OrderCount = ordered_Item.OrderCount + 1;

                    ordered_Item.FdName1 = ordered_Item.FdName1 + "\n\n\n" + send_Food_name;

                    ordered_Item.FdPrice1 = ordered_Item.FdPrice1 + "\n\n\n" + (String.valueOf(send_Food_price ));

                    ordered_Item.FdQuant1 = ordered_Item.FdQuant1 + "\n\n\n" + (String.valueOf(send_Food_quantity ));

                    ordered_Item.FdTtlPrc1 = ordered_Item.FdTtlPrc1 + "\n\n\n" + (String.valueOf(ttl));

                    ordered_Item.total = (String.valueOf(allTtl));

                }

                Toast.makeText(Food_Info_3.this,"'"+send_Food_name+"' ("+(String.valueOf(send_Food_quantity ))+")\n Added to your list", Toast.LENGTH_SHORT).show();



            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int posi, long l) { //spnner position
        //Toast.makeText(getApplicationContext(),"Hello food "+FoodsQuantity[posi] , Toast.LENGTH_LONG).show();
        send_Food_quantity=Integer.parseInt(FoodsQuantity[posi]);


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void clk(View view) { /// my ordered list
        //Toast.makeText(this,"image button clickeed" , Toast.LENGTH_LONG).show();
        Intent intent;
        intent = new Intent(Food_Info_3.this,Ordered_Item_4.class);
        //intent.putExtra("info","This is activity from card item index  "+finalI);

        startActivity(intent);

    }
}
