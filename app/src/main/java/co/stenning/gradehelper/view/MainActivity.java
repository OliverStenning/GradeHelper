package co.stenning.gradehelper.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.stenning.gradehelper.R;
import co.stenning.gradehelper.data.Module;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // User interface components
    private TextView overallGradeText;
    private TextView averageGradeText;
    private Button addModuleButton;
    private RecyclerView modulesList;
    private ModulesAdapter modulesAdapter;

    // Test data
    ArrayList<Module> modules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modulesList = findViewById(R.id.modulesList);
        modules = new ArrayList<>();
        modules.add(new Module("ELEC1200", "Electronic Circuits"));
        modules.add(new Module("ELEC1202", "Programming"));
        modules.add(new Module("ELEC1204", "Digital Systems"));

        modulesAdapter = new ModulesAdapter(modules);
        modulesList.setAdapter(modulesAdapter);
        modulesList.setLayoutManager(new LinearLayoutManager(this));

    }
}
