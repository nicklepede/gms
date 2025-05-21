package com.google.android.gms.growth.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.growth.ui.GrowthDebugChimeraActivity;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxn;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asrw;
import defpackage.assa;
import defpackage.assb;
import defpackage.assk;
import defpackage.assn;
import defpackage.assp;
import defpackage.bkxr;
import defpackage.ig;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GrowthDebugChimeraActivity extends anxn {
    public static final String j = bkxr.b(GrowthDebugChimeraActivity.class);
    public assb k;
    assp l;
    assp m;
    assp n;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class GrowthDebugOperation extends anxy {
        @Override // defpackage.anxy
        public final GoogleSettingsItem b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, GrowthDebugChimeraActivity.j), 2, "Growth debug", aojj.GROWTH_DEBUG_ITEM, asew.DEFAULT_GROWTH);
            googleSettingsItem.g = true;
            googleSettingsItem.f = false;
            return googleSettingsItem;
        }
    }

    public final void a(String str, String str2) {
        startActivity(new Intent().setClassName("com.google.android.gms", bkxr.b(GrowthWebViewChimeraActivity.class)).putExtra("url", str).putExtra("account", str2).setFlags(32768));
    }

    @Override // defpackage.anxn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ig hy = hy();
        if (hy != null) {
            assa assaVar = new assa(hy);
            assaVar.a = "Growth debug";
            this.k = assaVar.a();
        }
    }

    @Override // defpackage.anxn
    protected final void q(assn assnVar) {
        assk I = assnVar.I("For selected account");
        assp asspVar = new assp(this);
        this.l = asspVar;
        asspVar.s("Open Google Guide");
        this.l.o(0);
        this.l.n(new asrw() { // from class: bknm
            @Override // defpackage.asrw
            public final void p(View view, assp asspVar2) {
                String f = foxi.a.a().f();
                GrowthDebugChimeraActivity growthDebugChimeraActivity = GrowthDebugChimeraActivity.this;
                growthDebugChimeraActivity.a(f, growthDebugChimeraActivity.k.d());
            }
        });
        assp asspVar2 = new assp(this);
        this.m = asspVar2;
        asspVar2.s("Open Debug Page");
        this.m.o(1);
        this.m.n(new asrw() { // from class: bknn
            @Override // defpackage.asrw
            public final void p(View view, assp asspVar3) {
                String e = foxi.a.a().e();
                GrowthDebugChimeraActivity growthDebugChimeraActivity = GrowthDebugChimeraActivity.this;
                growthDebugChimeraActivity.a(e, growthDebugChimeraActivity.k.d());
            }
        });
        assp asspVar3 = new assp(this);
        this.n = asspVar3;
        asspVar3.s("Open Feature Drops");
        this.n.o(2);
        this.n.n(new asrw() { // from class: bkno
            @Override // defpackage.asrw
            public final void p(View view, assp asspVar4) {
                Intent className = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.growth.featuredrops.activity.FeatureDropsActivity");
                GrowthDebugChimeraActivity growthDebugChimeraActivity = GrowthDebugChimeraActivity.this;
                growthDebugChimeraActivity.startActivity(className.putExtra("account", growthDebugChimeraActivity.k.d()).putExtra("entry_point", "DEBUG_PAGE").addFlags(268468224));
            }
        });
        I.k(this.l);
        I.k(this.m);
        I.k(this.n);
    }

    @Override // defpackage.anxn
    public final void r() {
    }
}
