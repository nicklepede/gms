package com.google.android.gms.backup.cloudrestore.migrate.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.Item;
import defpackage.ahoz;
import defpackage.rpq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CompoundButtonItem extends Item implements CompoundButton.OnCheckedChangeListener {
    public boolean b;
    public ahoz c;

    public CompoundButtonItem() {
    }

    @Override // com.google.android.setupdesign.items.Item
    protected int a() {
        return R.layout.sud_items_switch;
    }

    @Override // com.google.android.setupdesign.items.Item, defpackage.edhg
    public void b(View view) {
        super.b(view);
        CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.sud_items_compound_button);
        compoundButton.setOnCheckedChangeListener(null);
        compoundButton.setChecked(this.b);
        compoundButton.setOnCheckedChangeListener(this);
        compoundButton.setEnabled(gQ());
    }

    public final void d(boolean z) {
        if (this.b != z) {
            this.b = z;
            r();
            ahoz ahozVar = this.c;
            if (ahozVar != null) {
                ahozVar.x(this, z);
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.b = z;
        ahoz ahozVar = this.c;
        if (ahozVar != null) {
            ahozVar.x(this, z);
        }
    }

    public CompoundButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpq.b);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
