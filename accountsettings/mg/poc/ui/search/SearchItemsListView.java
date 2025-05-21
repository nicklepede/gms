package com.google.android.gms.accountsettings.mg.poc.ui.search;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.R;
import defpackage.arwm;
import defpackage.rqy;
import defpackage.sil;
import defpackage.sim;
import defpackage.sis;
import defpackage.sit;
import defpackage.sks;
import defpackage.skz;
import defpackage.sla;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SearchItemsListView extends sil {
    public sis ag;
    public skz ah;
    public sim ai;
    public sit aj;
    public rqy ak;

    public SearchItemsListView(Context context) {
        super(context);
    }

    public final int a() {
        return getResources().getDimensionPixelSize(R.dimen.as_search_list_vertical_item_padding);
    }

    public final void aF(List list) {
        arwm.s(this.ak);
        skz skzVar = new skz(getContext(), list, new sla(this), this.ak);
        this.ah = skzVar;
        skzVar.C(this.ai, this.aj);
        ah(this.ah);
    }

    public SearchItemsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x(new sks(a()));
    }
}
