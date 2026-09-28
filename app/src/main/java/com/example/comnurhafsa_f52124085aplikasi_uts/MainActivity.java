package com.example.comnurhafsa_f52124085aplikasi_uts;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] title = {
            "Rumah Tongkonan",
            "Rumah Laikas",
            "Rumah Walewangko",
            "Rumah Dulohupa",
            "Rumah Boyang",
            "Rumah Saoraja"
    };
    String[] description = {
            "Sulawesi Selatan - Rumah panggung ikonik Suku Toraja dengan atap melengkung seperti perahu.",
            "Sulawesi Tenggara - Rumah panggung besar tempat bermusyawarah khas Suku Tolaki.",
            "Sulawesi Utara - Rumah panggung kayu tradisional khas Suku Minahasa.",
            "Gorontalo - Rumah adat panggung dengan pilar-pilar kayu bermotif khas daerah.",
            "Sulawesi Barat - Rumah panggung khas Suku Mandar bertiang kayu tinggi.",
            "Sulawesi Selatan - Rumah panggung bangsawan Suku Bugis bermotif ukiran indah."
    };
    int[] images = {
            R.drawable.tongkonan,
            R.drawable.laikas,
            R.drawable.walewangko,
            R.drawable.dulohupa,
            R.drawable.boyang,
            R.drawable.saoraja
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, title, description, images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(MainActivity.this, "Kamu memilih: " + title[position], Toast.LENGTH_SHORT).show();
        });
    }
}