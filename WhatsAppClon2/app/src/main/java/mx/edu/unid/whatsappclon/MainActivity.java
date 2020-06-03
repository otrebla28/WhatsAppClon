package mx.edu.unid.whatsappclon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCantante;
    private RecyclerViewAdaptador adaptadorCantante;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewCantante=(RecyclerView)findViewById(R.id.RecyclerCantante);
        recyclerViewCantante.setLayoutManager(new LinearLayoutManager(this));
        adaptadorCantante= new RecyclerViewAdaptador(obtenerCantantes());
        recyclerViewCantante.setAdapter(adaptadorCantante);

    }
    public List<CantanteModelo> obtenerCantantes(){
            List<CantanteModelo> cantante = new ArrayList<>();
            cantante.add(new CantanteModelo("Emoji", "México", R.drawable.emoji));
            cantante.add(new CantanteModelo("Lector", "Guadalajara", R.drawable.lector));
            cantante.add(new CantanteModelo("Sonrisa", "San Luis", R.drawable.sonrisa));
            cantante.add(new CantanteModelo("Niño", "Zacatecas", R.drawable.nino));
            cantante.add(new CantanteModelo("Mono", "Norte", R.drawable.mono));

            return cantante;
    }
}
