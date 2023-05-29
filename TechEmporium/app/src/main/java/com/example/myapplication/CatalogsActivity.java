package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class CatalogsActivity extends AppCompatActivity {

    private ListView catalogsListView;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogs);

        catalogsListView = findViewById(R.id.listViewCatalogs);
        logoutButton = findViewById(R.id.buttonLogout);

        // Criar uma lista de itens do catálogo
        List<String> itemList = new ArrayList<>();
        itemList.add("Smartphone");
        itemList.add("Laptop");
        itemList.add("Fones de ouvido");
        itemList.add("Câmeras digitais");
        itemList.add("Smartwatches");
        itemList.add("Consoles de Videogame");
        itemList.add("Jogos");


        CatalogAdapter adapter = new CatalogAdapter(this, itemList);


        // Definir o adaptador no ListView
        catalogsListView.setAdapter(adapter);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para voltar à tela de login
                Intent intent = new Intent(CatalogsActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Fecha a atividade atual para impedir que o usuário retorne a ela ao pressionar o botão Voltar
            }
        });
        // Dentro do método onCreate() da sua classe Java
        Button buyButton = findViewById(R.id.buttonBuy);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para iniciar a nova atividade em branco
                Intent intent = new Intent(CatalogsActivity.this, BlankActivity.class);
                startActivity(intent);
            }
        });


    }
}
