package papon.shahi.restu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;

public class Ordered_Item_4 extends AppCompatActivity {

     TextView FdName,FdPrice,FdQuant,FdTtlPrc,allttl;

    static String FdName1,FdPrice1,FdQuant1,FdTtlPrc1="";
    static String total;
     String Alltogether;
    static int OrderCount=0;



    Button ordrnow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordered__item_4);

        FdName = (TextView) findViewById(R.id.NameOfFood);
        FdPrice = (TextView) findViewById(R.id.priceofFood);
        FdQuant = (TextView) findViewById(R.id.quantityOfFood);
        FdTtlPrc = (TextView) findViewById(R.id.totalPriceOdFood);
        allttl = (TextView) findViewById(R.id.AllTttl);



       if(OrderCount!=0)
       {
           FdName.setText(FdName1);
           FdPrice.setText(FdPrice1);
           FdQuant.setText(FdQuant1);
           FdTtlPrc.setText(FdTtlPrc1);
           allttl.setText("Total = "+total);


           Alltogether=FdName1+"\t\t"+FdQuant+"\n\n\n"+"........................................";
       }

        ordrnow = (Button) findViewById(R.id.orderNow);
        final Activity activity = this;


        ordrnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Ordered_Item_4.this,"ordered cmplect. please wait for a moment..", Toast.LENGTH_SHORT).show();


            }
        });






    }

        // }
    public void send(View v) {
        send_Data_5 send_data_5 = new send_Data_5();
        send_data_5.execute(Alltogether);
    }
}
