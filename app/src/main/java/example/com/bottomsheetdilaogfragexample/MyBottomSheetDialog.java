package example.com.bottomsheetdilaogfragexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyBottomSheetDialog extends BottomSheetDialogFragment {

    String string;

    static MyBottomSheetDialog newInstance(String string) {
        MyBottomSheetDialog f = new MyBottomSheetDialog();
        Bundle args = new Bundle();
        args.putString("string", string);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        string = getArguments().getString("string");
        setStyle(DialogFragment.STYLE_NO_FRAME,0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_sheet_modal, container, false);
        TextView tv = (TextView) v.findViewById(R.id.text);
        getDialog().setCanceledOnTouchOutside(true);
        return v;
    }

}
