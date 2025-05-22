package com.google.android.gms.setupservices.item;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.Item;
import com.google.android.setupdesign.items.ItemGroup;
import defpackage.deqh;
import defpackage.efrl;
import defpackage.efug;
import defpackage.efwn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SectionItem extends ItemGroup {
    private final Item c;

    public SectionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, deqh.a);
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        int i = efwn.a;
        if (efrl.s(context)) {
            com.google.android.setupdesign.items.SectionHeaderItem sectionHeaderItem = new com.google.android.setupdesign.items.SectionHeaderItem();
            this.c = sectionHeaderItem;
            sectionHeaderItem.F(text);
            sectionHeaderItem.G(false);
        } else {
            SectionHeaderItem sectionHeaderItem2 = new SectionHeaderItem(efrl.z(context));
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
            if (he() == 1) {
                item.G(false);
            }
        } else if (he() > 0) {
            item.G(true);
        }
    }

    @Override // com.google.android.setupdesign.items.ItemGroup, defpackage.efuh
    public final void d(efug efugVar) {
        super.d(efugVar);
        j();
    }

    @Override // com.google.android.setupdesign.items.ItemGroup, defpackage.efuf
    public final void e(efug efugVar, int i, int i2) {
        super.e(efugVar, i, i2);
        j();
    }

    @Override // com.google.android.setupdesign.items.ItemGroup, defpackage.efuf
    public final void f(efug efugVar, int i, int i2) {
        super.f(efugVar, i, i2);
        j();
    }
}
