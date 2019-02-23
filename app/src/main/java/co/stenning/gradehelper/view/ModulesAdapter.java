package co.stenning.gradehelper.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import co.stenning.gradehelper.R;
import co.stenning.gradehelper.data.Module;

public class ModulesAdapter extends RecyclerView.Adapter<ModulesAdapter.ViewHolder> {

    private List<Module> modules;

    public ModulesAdapter(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public ModulesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View moduleView = inflater.inflate(R.layout.list_module, parent, false);

        ViewHolder viewHolder = new ViewHolder(moduleView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ModulesAdapter.ViewHolder viewHolder, int position) {

        Module module = modules.get(position);

        TextView codeText = viewHolder.codeText;
        TextView nameText = viewHolder.nameText;
        TextView gradeText = viewHolder.gradeText;

        codeText.setText(module.getCode());
        nameText.setText(module.getName());
        gradeText.setText(module.getGrade() + "%");

    }

    @Override
    public int getItemCount() {
        return modules.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView codeText;
        public TextView nameText;
        public TextView gradeText;

        public ViewHolder(View itemView) {
            super(itemView);

            codeText = itemView.findViewById(R.id.moduleCodeText);
            nameText = itemView.findViewById(R.id.moduleNameText);
            gradeText = itemView.findViewById(R.id.moduleGrade);

        }

    }

}
