package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.Item;
import defpackage.dcem;
import defpackage.dcgb;
import defpackage.dcgm;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.esyb;
import defpackage.esye;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GoogleServicesTextItem extends Item {
    public dcem a;
    private final dcem b;

    public GoogleServicesTextItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dcgb.b);
        this.a = dcem.c(context, obtainStyledAttributes.getResourceId(4, 0));
        this.b = dcem.c(context, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // com.google.android.setupdesign.items.Item, defpackage.edhg
    public final void b(View view) {
        super.b(view);
        View findViewById = view.findViewById(R.id.google_services_tos);
        if (findViewById != null) {
            Context context = findViewById.getContext();
            int i = edjs.a;
            if (edeq.z(context)) {
                dcgm.a((TextView) view.findViewById(R.id.sud_items_title), R.dimen.bc_text_item_tos_text_size, R.dimen.bc_text_item_tos_line_spacing_extra);
                view.findViewById(R.id.sud_items_icon_container).setVisibility(8);
            }
            if (edeq.s(findViewById.getContext())) {
                view.setPadding(0, (int) findViewById.getContext().getResources().getDimension(R.dimen.bc_expressive_text_item_tos_padding_top), 0, (int) findViewById.getContext().getResources().getDimension(R.dimen.bc_expressive_text_item_tos_padding_bottom));
            }
            findViewById.setClickable(false);
        }
    }

    public final esye d() {
        fecj v = esye.a.v();
        dcem dcemVar = this.a;
        if (dcemVar != null) {
            esyb d = dcemVar.d();
            if (!v.b.L()) {
                v.U();
            }
            esye esyeVar = (esye) v.b;
            d.getClass();
            esyeVar.d = d;
            esyeVar.b |= 2;
        }
        dcem dcemVar2 = this.b;
        if (dcemVar2 != null) {
            esyb d2 = dcemVar2.d();
            if (!v.b.L()) {
                v.U();
            }
            esye esyeVar2 = (esye) v.b;
            d2.getClass();
            esyeVar2.e = d2;
            esyeVar2.b |= 4;
        }
        return (esye) v.Q();
    }

    @Override // com.google.android.setupdesign.items.AbstractItem, defpackage.edhg
    public final boolean gS() {
        return true;
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence jx() {
        dcem dcemVar = this.b;
        if (dcemVar == null) {
            return null;
        }
        return dcemVar.a;
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence l() {
        dcem dcemVar = this.a;
        if (dcemVar == null) {
            return null;
        }
        return dcemVar.a;
    }
}
