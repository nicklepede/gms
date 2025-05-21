package com.google.android.gms.wallet.ui.component.table;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TableRow;
import defpackage.efec;
import defpackage.efed;
import defpackage.efej;
import defpackage.efem;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TableRowView extends TableRow implements View.OnClickListener, efed {
    final efec a;

    public TableRowView(Context context) {
        super(context);
        this.a = new efec();
        setOnClickListener(this);
    }

    @Override // defpackage.efel
    public final efej a() {
        return null;
    }

    @Override // defpackage.efed
    public final efem b() {
        return this.a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.a();
    }

    public TableRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new efec();
        setOnClickListener(this);
    }
}
