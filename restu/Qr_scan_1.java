package papon.shahi.restu;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Qr_scan_1 extends AppCompatActivity {
    private Button scan_btn;
    final Context context = this;


    String  table1="73EEBE65267230368D95D5D09083F310",
            table2="0AE6A74416214CE37E4D6B2D7D5033AF",
            table3="53CE88E30A587008F230B77A325A517B",
            table4="B04EDEE26D7C25F4E0FA5D3B5435FDFE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_scan_activity);

        //Intent rIntent = new Intent(Qr_scan_1.this, Food_Category_2.class);
       // startActivity(rIntent);


        scan_btn = (Button) findViewById(R.id.scan_btn);
        final  Activity activity = this;
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("Scanning..");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(true);
                integrator.setBarcodeImageEnabled(false);

               // PlanarYUVLuminanceSource source = activity.getCameraManager().buildLuminanceSource(rotatedData, width, height);
               // camera.setDisplayOrientation(90);
                integrator.initiateScan();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents()==null){
                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            }
            else {
                //Toast.makeText(this, "bla bla bla "+result.getContents(),Toast.LENGTH_LONG).show();
                String kk =  result.getContents();
               // Toast.makeText(this, cat_others,Toast.LENGTH_LONG).show();
                System.out.println(kk);

                call(kk);

                // Intent rIntent = new Intent(this, demo.class);
                //startActivity(rIntent);
            }
        }
        else {
            Toast.makeText(this, "how maw khaw ",Toast.LENGTH_LONG).show();
            super.onActivityResult(requestCode, resultCode, data);

        }
    }

    private void call(String kk) {

        //Toast.makeText(this, "on intent ..",Toast.LENGTH_LONG).show();
        if(
                kk.equals("73EEBE65267230368D95D5D09083F310") ||
                kk.equals("0AE6A74416214CE37E4D6B2D7D5033AF") ||
                kk.equals("53CE88E30A587008F230B77A325A517B") ||
                kk.equals("B04EDEE26D7C25F4E0FA5D3B5435FDFE") ) {
            doit(kk);

        }
        else {
            Toast.makeText(this, "Oops!! Scan only the code which are assigned with your table .",Toast.LENGTH_LONG).show();

        }


    }

    private void doit(String kk) {
        String TableNo="";

       if ( kk.equals("73EEBE65267230368D95D5D09083F310") ) { TableNo="1";}
       if ( kk.equals("0AE6A74416214CE37E4D6B2D7D5033AF") ) { TableNo="2";}
       if ( kk.equals("53CE88E30A587008F230B77A325A517B") ) { TableNo="3";}
       if ( kk.equals("B04EDEE26D7C25F4E0FA5D3B5435FDFE") ) { TableNo="4";}

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle("Welcome..");

        // set dialog message
        alertDialogBuilder
                .setMessage("You are in table "+TableNo+". Please don't change your table.\n\n\n \t\t\t\t\t\t\t\t Thankyou.  :) ")
                .setCancelable(false)
                .setPositiveButton("OK!",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
                        //MainActivity.this.finish();
                        Intent rIntent = new Intent(Qr_scan_1.this, Food_Category_2.class);
                        startActivity(rIntent);
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();



    }
}
