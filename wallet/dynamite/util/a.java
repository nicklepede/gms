package com.google.android.gms.wallet.dynamite.util;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class a implements View.OnClickListener {
    private final List a = new ArrayList();

    public final void a(View.OnClickListener onClickListener) {
        this.a.add(onClickListener);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
    }
}
