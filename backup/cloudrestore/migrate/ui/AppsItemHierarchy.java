package com.google.android.gms.backup.cloudrestore.migrate.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.AbstractItemHierarchy;
import com.google.android.setupdesign.items.SwitchItem;
import defpackage.ahpp;
import defpackage.edhg;
import defpackage.edhl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AppsItemHierarchy extends AbstractItemHierarchy {
    private final List a;
    private final ahpp b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class AppItem extends SwitchItem {
        @Override // com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item
        protected final int a() {
            throw null;
        }

        @Override // com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item, defpackage.edhg
        public final void b(View view) {
            throw null;
        }
    }

    public AppsItemHierarchy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.app_icon_size);
        ahpp ahppVar = new ahpp();
        this.b = ahppVar;
        ahppVar.a(dimensionPixelSize);
        ahppVar.b();
    }

    @Override // defpackage.edhl
    public final int gO() {
        return this.a.size();
    }

    @Override // defpackage.edhl
    public final edhg gR(int i) {
        return (edhg) this.a.get(i);
    }

    @Override // defpackage.edhl
    public final edhl jy(int i) {
        if (i == this.e) {
            return this;
        }
        return null;
    }
}
