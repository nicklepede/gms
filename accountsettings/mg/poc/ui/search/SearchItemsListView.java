package com.google.android.gms.accountsettings.mg.poc.ui.search;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.R;
import defpackage.atzb;
import defpackage.tkh;
import defpackage.ucs;
import defpackage.uct;
import defpackage.ucz;
import defpackage.uda;
import defpackage.uff;
import defpackage.ufm;
import defpackage.ufn;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SearchItemsListView extends ucs {
    public ucz ag;
    public ufm ah;
    public uct ai;
    public uda aj;
    public tkh ak;

    public SearchItemsListView(Context context) {
        super(context);
    }

    public final int a() {
        return getResources().getDimensionPixelSize(R.dimen.as_search_list_vertical_item_padding);
    }

    public final void aF(List list) {
        atzb.s(this.ak);
        ufm ufmVar = new ufm(getContext(), list, new ufn(this), this.ak);
        this.ah = ufmVar;
        ufmVar.C(this.ai, this.aj);
        ah(this.ah);
    }

    public SearchItemsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x(new uff(a()));
    }
}
