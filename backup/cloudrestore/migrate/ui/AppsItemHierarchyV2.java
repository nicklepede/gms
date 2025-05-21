package com.google.android.gms.backup.cloudrestore.migrate.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.AbstractItemHierarchy;
import defpackage.ahoz;
import defpackage.ahpk;
import defpackage.ahpp;
import defpackage.arss;
import defpackage.bxmw;
import defpackage.bybl;
import defpackage.bybm;
import defpackage.byci;
import defpackage.bygo;
import defpackage.edhg;
import defpackage.edhl;
import defpackage.flkv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AppsItemHierarchyV2 extends AbstractItemHierarchy {
    public ahoz a;
    public final List b;
    public final ahpp c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class AppItem extends CompoundButtonItem {
        public final ahpk a;
        private final ahpp d;

        public AppItem(ahpk ahpkVar, boolean z, ahpp ahppVar) {
            this.d = ahppVar;
            d(z);
            this.e = View.generateViewId();
            F(ahpkVar.c);
            if (flkv.a.a().g()) {
                E(ahpkVar.h.name);
            } else {
                E(ahpkVar.d);
            }
            this.a = ahpkVar;
        }

        @Override // com.google.android.gms.backup.cloudrestore.migrate.ui.CompoundButtonItem, com.google.android.setupdesign.items.Item
        protected final int a() {
            return R.layout.apps_item_detailed_v2_glide;
        }

        @Override // com.google.android.gms.backup.cloudrestore.migrate.ui.CompoundButtonItem, com.google.android.setupdesign.items.Item, defpackage.edhg
        public final void b(View view) {
            super.b(view);
            if (flkv.a.a().h()) {
                View findViewById = view.findViewById(R.id.sud_items_icon_container);
                findViewById.setVisibility(0);
                ahpp ahppVar = this.d;
                String str = this.a.i;
                if (str != null && arss.b(str)) {
                    str = ahppVar.a.a(str);
                    if (ahppVar.b) {
                        str = String.valueOf(str).concat("-rw");
                    }
                }
                bygo.b(findViewById).a().a(byci.e(str, bxmw.b, bybm.a, bybl.a)).c((ImageView) view.findViewById(R.id.sud_items_icon));
            }
        }
    }

    public AppsItemHierarchyV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.app_icon_size);
        ahpp ahppVar = new ahpp();
        this.c = ahppVar;
        ahppVar.a(dimensionPixelSize);
        ahppVar.b();
    }

    @Override // defpackage.edhl
    public final int gO() {
        return this.b.size();
    }

    @Override // defpackage.edhl
    public final edhg gR(int i) {
        return (edhg) this.b.get(i);
    }

    @Override // defpackage.edhl
    public final edhl jy(int i) {
        if (i == this.e) {
            return this;
        }
        return null;
    }
}
