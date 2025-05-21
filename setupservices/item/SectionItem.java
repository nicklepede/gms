package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.Item;
import com.google.android.setupdesign.items.ItemGroup;
import defpackage.dcgb;
import defpackage.edeq;
import defpackage.edhl;
import defpackage.edjs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SectionItem extends ItemGroup {
    private final Item c;

    public SectionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dcgb.a);
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        int i = edjs.a;
        if (edeq.s(context)) {
            com.google.android.setupdesign.items.SectionHeaderItem sectionHeaderItem = new com.google.android.setupdesign.items.SectionHeaderItem();
            this.c = sectionHeaderItem;
            sectionHeaderItem.F(text);
            sectionHeaderItem.G(false);
        } else {
            SectionHeaderItem sectionHeaderItem2 = new SectionHeaderItem(edeq.z(context));
            this.c = sectionHeaderItem2;
            sectionHeaderItem2.D(R.layout.setupservices_items_google_services_section_header);
            sectionHeaderItem2.F(text);
            sectionHeaderItem2.G(false);
        }
        d(this.c);
    }

    private final void j() {
        Item item = this.c;
        if (item.l) {
            if (gO() == 1) {
                item.G(false);
            }
        } else if (gO() > 0) {
            item.G(true);
        }
    }

    @Override // com.google.android.setupdesign.items.ItemGroup, defpackage.edhm
    public final void d(edhl edhlVar) {
        super.d(edhlVar);
        j();
    }

    @Override // com.google.android.setupdesign.items.ItemGroup, defpackage.edhk
    public final void e(edhl edhlVar, int i, int i2) {
        super.e(edhlVar, i, i2);
        j();
    }

    @Override // com.google.android.setupdesign.items.ItemGroup, defpackage.edhk
    public final void f(edhl edhlVar, int i, int i2) {
        super.f(edhlVar, i, i2);
        j();
    }
}
