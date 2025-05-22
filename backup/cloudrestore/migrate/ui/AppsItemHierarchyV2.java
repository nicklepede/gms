package com.google.android.gms.backup.cloudrestore.migrate.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.AbstractItemHierarchy;
import defpackage.ajpp;
import defpackage.ajqa;
import defpackage.ajqf;
import defpackage.atvh;
import defpackage.bzvm;
import defpackage.cakd;
import defpackage.cake;
import defpackage.cala;
import defpackage.capg;
import defpackage.efub;
import defpackage.efug;
import defpackage.focf;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AppsItemHierarchyV2 extends AbstractItemHierarchy {
    public ajpp a;
    public final List b;
    public final ajqf c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class AppItem extends CompoundButtonItem {
        public final ajqa a;
        private final ajqf d;

        public AppItem(ajqa ajqaVar, boolean z, ajqf ajqfVar) {
            this.d = ajqfVar;
            d(z);
            this.e = View.generateViewId();
            F(ajqaVar.c);
            if (focf.a.lK().g()) {
                E(ajqaVar.h.name);
            } else {
                E(ajqaVar.d);
            }
            this.a = ajqaVar;
        }

        @Override // com.google.android.gms.backup.cloudrestore.migrate.ui.CompoundButtonItem, com.google.android.setupdesign.items.Item
        protected final int a() {
            return R.layout.apps_item_detailed_v2_glide;
        }

        @Override // com.google.android.gms.backup.cloudrestore.migrate.ui.CompoundButtonItem, com.google.android.setupdesign.items.Item, defpackage.efub
        public final void b(View view) {
            super.b(view);
            if (focf.a.lK().h()) {
                View findViewById = view.findViewById(R.id.sud_items_icon_container);
                findViewById.setVisibility(0);
                ajqf ajqfVar = this.d;
                String str = this.a.i;
                if (str != null && atvh.b(str)) {
                    str = ajqfVar.a.a(str);
                    if (ajqfVar.b) {
                        str = String.valueOf(str).concat("-rw");
                    }
                }
                capg.b(findViewById).a().a(cala.e(str, bzvm.b, cake.a, cakd.a)).c((ImageView) view.findViewById(R.id.sud_items_icon));
            }
        }
    }

    public AppsItemHierarchyV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.app_icon_size);
        ajqf ajqfVar = new ajqf();
        this.c = ajqfVar;
        ajqfVar.a(dimensionPixelSize);
        ajqfVar.b();
    }

    @Override // defpackage.efug
    public final int he() {
        return this.b.size();
    }

    @Override // defpackage.efug
    public final efub hh(int i) {
        return (efub) this.b.get(i);
    }

    @Override // defpackage.efug
    public final efug jO(int i) {
        if (i == this.e) {
            return this;
        }
        return null;
    }
}
