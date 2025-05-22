package com.google.android.gms.backup.settings.ui.optin;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class OptInDataTypesItem extends OptInItem {
    private final View.OnClickListener a;
    private Button b;

    public OptInDataTypesItem(Context context, View.OnClickListener onClickListener) {
        super(context, R.id.opt_in_data_types_item, R.drawable.ic_backup_primary_color, R.drawable.quantum_gm_ic_backup_vd_theme_24);
        this.a = onClickListener;
        D(R.layout.item_with_button);
    }

    @Override // com.google.android.setupdesign.items.Item, defpackage.efub
    public final void b(View view) {
        super.b(view);
        Button button = (Button) view.findViewById(R.id.sud_items_button);
        this.b = button;
        button.setText(R.string.opt_in_more_details_label);
        this.b.setOnClickListener(this.a);
    }
}
