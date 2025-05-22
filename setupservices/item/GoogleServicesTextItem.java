package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.Item;
import defpackage.deos;
import defpackage.deqh;
import defpackage.deqs;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.evnr;
import defpackage.evnu;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GoogleServicesTextItem extends Item {
    public deos a;
    private final deos b;

    public GoogleServicesTextItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, deqh.b);
        this.a = deos.c(context, obtainStyledAttributes.getResourceId(4, 0));
        this.b = deos.c(context, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.Item, defpackage.efub
    public final void b(View view) {
        super.b(view);
        View findViewById = view.findViewById(R.id.google_services_tos);
        if (findViewById != null) {
            Context context = findViewById.getContext();
            int i = efwn.a;
            if (efrl.z(context)) {
                deqs.a((TextView) view.findViewById(R.id.sud_items_title), R.dimen.bc_text_item_tos_text_size, R.dimen.bc_text_item_tos_line_spacing_extra);
                view.findViewById(R.id.sud_items_icon_container).setVisibility(8);
            }
            if (efrl.s(findViewById.getContext())) {
                view.setPadding(0, (int) findViewById.getContext().getResources().getDimension(R.dimen.bc_expressive_text_item_tos_padding_top), 0, (int) findViewById.getContext().getResources().getDimension(R.dimen.bc_expressive_text_item_tos_padding_bottom));
            }
            findViewById.setClickable(false);
        }
    }

    public final evnu d() {
        fgrc v = evnu.a.v();
        deos deosVar = this.a;
        if (deosVar != null) {
            evnr d = deosVar.d();
            if (!v.b.L()) {
                v.U();
            }
            evnu evnuVar = (evnu) v.b;
            d.getClass();
            evnuVar.d = d;
            evnuVar.b |= 2;
        }
        deos deosVar2 = this.b;
        if (deosVar2 != null) {
            evnr d2 = deosVar2.d();
            if (!v.b.L()) {
                v.U();
            }
            evnu evnuVar2 = (evnu) v.b;
            d2.getClass();
            evnuVar2.e = d2;
            evnuVar2.b |= 4;
        }
        return (evnu) v.Q();
    }

    @Override // com.google.android.setupdesign.items.AbstractItem, defpackage.efub
    public final boolean hi() {
        return true;
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence jN() {
        deos deosVar = this.b;
        if (deosVar == null) {
            return null;
        }
        return deosVar.a;
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence l() {
        deos deosVar = this.a;
        if (deosVar == null) {
            return null;
        }
        return deosVar.a;
    }
}
