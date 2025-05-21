package com.google.android.gms.setupservices.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.Item;
import defpackage.dcgm;
import defpackage.edhd;
import defpackage.fsae;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SectionHeaderItem extends Item implements edhd {
    private final boolean a;

    public SectionHeaderItem(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.setupdesign.items.Item, defpackage.edhg
    public final void b(View view) {
        super.b(view);
        if (this.a) {
            TextView textView = (TextView) view.findViewById(R.id.sud_items_title);
            dcgm.a(textView, R.dimen.bc_section_item_title_text_size, R.dimen.bc_section_item_title_line_spacing_extra);
            view.setMinimumHeight((int) view.getResources().getDimension(R.dimen.bc_section_item_minimum_height));
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
            LinearLayout linearLayout = (LinearLayout) textView.getParent();
            linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, linearLayout.getPaddingRight(), 0);
            boolean h = fsae.h();
            if (!h || !Objects.equals(view.getTag(R.id.tag_section_margin_added), true)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin += (int) view.getResources().getDimension(R.dimen.bc_section_item_padding_top);
                view.setLayoutParams(marginLayoutParams);
                if (h) {
                    view.setTag(R.id.tag_section_margin_added, true);
                }
            }
        }
        view.setClickable(false);
    }

    @Override // com.google.android.setupdesign.items.AbstractItem, defpackage.edhg
    public final boolean gS() {
        return true;
    }

    @Override // defpackage.edhd
    public final boolean p() {
        return false;
    }

    @Override // defpackage.edhd
    public final boolean q() {
        return false;
    }
}
