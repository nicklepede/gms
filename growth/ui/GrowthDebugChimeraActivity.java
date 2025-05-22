package com.google.android.gms.growth.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.growth.ui.GrowthDebugChimeraActivity;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzf;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.auvq;
import defpackage.auvu;
import defpackage.auvv;
import defpackage.auwe;
import defpackage.auwh;
import defpackage.auwj;
import defpackage.bnei;
import defpackage.ig;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GrowthDebugChimeraActivity extends apzf {
    public static final String j = bnei.b(GrowthDebugChimeraActivity.class);
    public auvv k;
    auwj l;
    auwj m;
    auwj n;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class GrowthDebugOperation extends apzq {
        @Override // defpackage.apzq
        public final GoogleSettingsItem b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, GrowthDebugChimeraActivity.j), 2, "Growth debug", aqlc.GROWTH_DEBUG_ITEM, auiq.DEFAULT_GROWTH);
            googleSettingsItem.g = true;
            googleSettingsItem.f = false;
            return googleSettingsItem;
        }
    }

    public final void a(String str, String str2) {
        startActivity(new Intent().setClassName("com.google.android.gms", bnei.b(GrowthWebViewChimeraActivity.class)).putExtra("url", str).putExtra("account", str2).setFlags(32768));
    }

    @Override // defpackage.apzf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ig hO = hO();
        if (hO != null) {
            auvu auvuVar = new auvu(hO);
            auvuVar.a = "Growth debug";
            this.k = auvuVar.a();
        }
    }

    @Override // defpackage.apzf
    protected final void q(auwh auwhVar) {
        auwe I = auwhVar.I("For selected account");
        auwj auwjVar = new auwj(this);
        this.l = auwjVar;
        auwjVar.s("Open Google Guide");
        this.l.o(0);
        this.l.n(new auvq() { // from class: bmud
            @Override // defpackage.auvq
            public final void p(View view, auwj auwjVar2) {
                String f = frql.a.lK().f();
                GrowthDebugChimeraActivity growthDebugChimeraActivity = GrowthDebugChimeraActivity.this;
                growthDebugChimeraActivity.a(f, growthDebugChimeraActivity.k.d());
            }
        });
        auwj auwjVar2 = new auwj(this);
        this.m = auwjVar2;
        auwjVar2.s("Open Debug Page");
        this.m.o(1);
        this.m.n(new auvq() { // from class: bmue
            @Override // defpackage.auvq
            public final void p(View view, auwj auwjVar3) {
                String e = frql.a.lK().e();
                GrowthDebugChimeraActivity growthDebugChimeraActivity = GrowthDebugChimeraActivity.this;
                growthDebugChimeraActivity.a(e, growthDebugChimeraActivity.k.d());
            }
        });
        auwj auwjVar3 = new auwj(this);
        this.n = auwjVar3;
        auwjVar3.s("Open Feature Drops");
        this.n.o(2);
        this.n.n(new auvq() { // from class: bmuf
            @Override // defpackage.auvq
            public final void p(View view, auwj auwjVar4) {
                Intent className = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.growth.featuredrops.activity.FeatureDropsActivity");
                GrowthDebugChimeraActivity growthDebugChimeraActivity = GrowthDebugChimeraActivity.this;
                growthDebugChimeraActivity.startActivity(className.putExtra("account", growthDebugChimeraActivity.k.d()).putExtra("entry_point", "DEBUG_PAGE").addFlags(268468224));
            }
        });
        I.k(this.l);
        I.k(this.m);
        I.k(this.n);
    }

    @Override // defpackage.apzf
    public final void r() {
    }
}
