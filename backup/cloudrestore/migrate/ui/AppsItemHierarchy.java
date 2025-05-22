package com.google.android.gms.backup.cloudrestore.migrate.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.AbstractItemHierarchy;
import com.google.android.setupdesign.items.SwitchItem;
import defpackage.ajqf;
import defpackage.efub;
import defpackage.efug;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AppsItemHierarchy extends AbstractItemHierarchy {
    private final List a;
    private final ajqf b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class AppItem extends SwitchItem {
        @Override // com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item
        protected final int a() {
            throw null;
        }

        @Override // com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item, defpackage.efub
        public final void b(View view) {
            throw null;
        }
    }

    public AppsItemHierarchy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.app_icon_size);
        ajqf ajqfVar = new ajqf();
        this.b = ajqfVar;
        ajqfVar.a(dimensionPixelSize);
        ajqfVar.b();
    }

    @Override // defpackage.efug
    public final int he() {
        return this.a.size();
    }

    @Override // defpackage.efug
    public final efub hh(int i) {
        return (efub) this.a.get(i);
    }

    @Override // defpackage.efug
    public final efug jO(int i) {
        if (i == this.e) {
            return this;
        }
        return null;
    }
}
