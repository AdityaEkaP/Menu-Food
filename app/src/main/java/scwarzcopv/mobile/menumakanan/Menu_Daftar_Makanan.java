package scwarzcopv.mobile.menumakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu_Daftar_Makanan extends AppCompatActivity {

    ListView lvItem;
    ListViewAdapterCall adapter;
    ArrayList<ListViewAdapterMenu> arraylist = new ArrayList<ListViewAdapterMenu>();

    int[] Gambar;
    String[] NamaItem;
    String[] HargaItem;
    String[] Deskripsi;
    String[] NomorHP;
    String[] Lat;
    String[] Long;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_daftar_makanan);

        lvItem		= (ListView)findViewById(R.id.listView1);


        Gambar		= new int[]{
                R.drawable.icon_makanan,
                R.drawable.icon_makanan,
                R.drawable.icon_makanan,
                R.drawable.icon_makanan,
                R.drawable.icon_makanan,};

        NamaItem 	= new String[]{
                "Burger Lvl 1",
                "Burger Lvl 2",
                "Burger Lvl 3",
                "Burger Lvl 4",
                "Burger Lvl"};

        HargaItem 	= new String[]{
                "Rp 20.000,-",
                "Rp 25.000,-",
                "Rp 30.000,-",
                "Rp 35.000,-",
                "Rp 40.000,-"};

        Deskripsi 	= new String[]{
                "Burger (Lvl. 1), adalah makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard.",

                "Burger (Lvl. 2), adalah makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard.",

                "Burger (Lvl. 3), adalah makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard.",

                "Burger (Lvl. 4), adalah makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard.",

                "Burger (Lvl. 5), adalah makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard."};
				
				
		//Nomor HP harus dimulai dengan kode negara yaitu : +62
        NomorHP  = new String[]{
                "+62821534458610",
                "+62821534458610",
                "+62821534458610",
                "+62821534458610",
                "+62821534458610"
        };

        Lat  = new String[]{
                "-10.1760821",
                "-10.1768035",
                "-10.171799",
                "-10.1748536",
                "-10.1747994"
        };

        Long  = new String[]{
                "123.6235399",
                "123.6229451",
                "123.6285576",
                "123.6262513",
                "123.6261514"
        };


        for (int i = 0; i < NamaItem.length; i++)
        {
            ListViewAdapterMenu wp = new ListViewAdapterMenu(NamaItem[i], HargaItem[i], Deskripsi[i], Gambar[i], NomorHP[i], Lat[i], Long[i]);
            arraylist.add(wp);
        }

        adapter = new ListViewAdapterCall(this, arraylist);
        lvItem.setAdapter(adapter);

    }

    void showToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
