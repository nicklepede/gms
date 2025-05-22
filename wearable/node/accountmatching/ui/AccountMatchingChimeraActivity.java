package com.google.android.gms.wearable.node.accountmatching.ui;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingChimeraActivity;
import defpackage.a;
import defpackage.atad;
import defpackage.ateo;
import defpackage.ateq;
import defpackage.ater;
import defpackage.atfb;
import defpackage.atfd;
import defpackage.atzb;
import defpackage.dhkz;
import defpackage.dhlh;
import defpackage.dhlk;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dlvj;
import defpackage.dlwl;
import defpackage.dmmw;
import defpackage.dmyk;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.fwfh;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class AccountMatchingChimeraActivity extends rxx implements dlvj {
    private atad k = null;
    public ekvi j = ektg.a;

    public static Intent k(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingActivity");
        intent.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.FragmentTag", str);
        intent.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.DeviceAddress", str2);
        intent.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.CallingPackage", str3);
        return intent;
    }

    private final dhlw o() {
        if (Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "Unregistering OnConnectionStateChangeListener for ".concat(String.valueOf(String.valueOf(this.j))));
        }
        atad atadVar = this.k;
        ekvl.y(atadVar);
        ateo ateoVar = ater.b(this, atadVar.B, "OnConnectionSetupStateChangedListener").b;
        atzb.s(ateoVar);
        dhlw jh = atadVar.jh(ateoVar, 0);
        jh.z(new dhlq() { // from class: dnov
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                AccountMatchingChimeraActivity.this.j = ektg.a;
            }
        });
        return jh;
    }

    @Override // defpackage.dlvj
    public final void a(ConnectionStateEventParcelable connectionStateEventParcelable) {
        int i = connectionStateEventParcelable.a;
        if (i < 0) {
            setResult(0);
            finish();
        } else if (i == 5 || (fwfh.a.lK().e() && i == 0)) {
            setResult(-1);
            finish();
        } else if (Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", a.j(i, "[Account Matching Activity] Ignored ConnectionStateEvent: "));
        }
    }

    public final dhlw l() {
        final String stringExtra = getIntent().getStringExtra("com.google.android.gms.wearable.node.accountmatching.ui.DeviceAddress");
        if (stringExtra == null) {
            return dhmr.c(new IllegalStateException("EXTRA_DEVICE_ADDRESS is required"));
        }
        if (stringExtra.equals(this.j.f())) {
            return dhmr.d(null);
        }
        if (this.j.h()) {
            return o().d(new dhkz() { // from class: dnoo
                @Override // defpackage.dhkz
                public final Object a(dhlw dhlwVar) {
                    return AccountMatchingChimeraActivity.this.l();
                }
            });
        }
        if (Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "Registering OnConnectionStateChangeListener for ".concat(stringExtra));
        }
        atad atadVar = this.k;
        ekvl.y(atadVar);
        final IntentFilter[] intentFilterArr = {dmyk.b("com.google.android.gms.wearable.CONNECTION_STATE_CHANGED", new Uri.Builder().scheme("wear").authority(stringExtra).path("connection-state").build(), 0)};
        final ateq b = ater.b(this, atadVar.B, "OnConnectionSetupStateChangedListener");
        atfb atfbVar = new atfb();
        atfbVar.c = b;
        atfbVar.a = new atfd() { // from class: dmtk
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                dmzj dmzjVar = (dmzj) obj;
                dmyj dmyjVar = new dmyj((dhma) obj2);
                dmwk dmwkVar = dmzjVar.f;
                dmzq dmzqVar = new dmzq(intentFilterArr);
                dmzqVar.e = b;
                dmwkVar.a(dmzjVar, dmyjVar, dlvj.this, dmzqVar);
            }
        };
        atfbVar.b = new atfd() { // from class: dmtl
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                dmzj dmzjVar = (dmzj) obj;
                dmzjVar.f.c(dmzjVar, new dmyi((dhma) obj2), dlvj.this);
            }
        };
        atfbVar.e = 24036;
        dhlw je = atadVar.je(atfbVar.a());
        je.x(new dhlk() { // from class: dnop
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                AccountMatchingChimeraActivity.this.j = ekvi.j(stringExtra);
            }
        });
        return je;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.google.android.gms.wearable.AppTheme r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingChimeraActivity.m(com.google.android.gms.wearable.AppTheme, java.lang.String, android.os.Bundle):void");
    }

    public final void n() {
        if (Log.isLoggable("Wear_AccountMatching", 5)) {
            Log.w("Wear_AccountMatching", "[Account Matching Activity] Aborting: Could not register listener for watch");
        }
        setResult(0);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("Wear_AccountMatching", "[Account Matching Activity] onCreate called!");
        setContentView(R.layout.wearable_account_matching_activity);
        this.k = dlwl.b(this);
        if (fwfh.c()) {
            l().y(new dhln() { // from class: dnor
                @Override // defpackage.dhln
                public final void gB(Exception exc) {
                    AccountMatchingChimeraActivity.this.n();
                }
            });
        }
        getWindow().addFlags(128);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        o();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        if (Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "[Account Matching Activity] New intent arrived: ".concat(String.valueOf(String.valueOf(intent))));
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        final Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalStateException("EXTRA_FRAGMENT_TAG is required");
        }
        if (Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "[Account Matching Activity] Extras:\n");
            for (String str : extras.keySet()) {
                Log.d("Wear_AccountMatching", String.format("    %s: %s", str, extras.get(str)));
            }
        }
        final String string = extras.getString("com.google.android.gms.wearable.node.accountmatching.ui.FragmentTag");
        if (string == null) {
            throw new IllegalStateException("EXTRA_FRAGMENT_TAG is required");
        }
        atad d = dlwl.d(this);
        String string2 = extras.getString("com.google.android.gms.wearable.node.accountmatching.ui.CallingPackage");
        if (string2 == null) {
            if (Log.isLoggable("Wear_AccountMatching", 5)) {
                Log.w("Wear_AccountMatching", "No calling package, using default theme.");
            }
            m(dmmw.d(), string, extras);
        } else {
            if (Log.isLoggable("Wear_AccountMatching", 3)) {
                Log.d("Wear_AccountMatching", "Calling package: ".concat(string2));
            }
            dhlw bc = d.bc(string2);
            bc.z(new dhlq() { // from class: dnos
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    AppTheme appTheme = (AppTheme) obj;
                    if (Log.isLoggable("Wear_AccountMatching", 3)) {
                        Log.d("Wear_AccountMatching", "Result: ".concat(String.valueOf(String.valueOf(appTheme))));
                    }
                    Bundle bundle = extras;
                    AccountMatchingChimeraActivity.this.m(appTheme, string, bundle);
                }
            });
            bc.y(new dhln() { // from class: dnot
                @Override // defpackage.dhln
                public final void gB(Exception exc) {
                    if (Log.isLoggable("Wear_AccountMatching", 5)) {
                        Log.w("Wear_AccountMatching", "Did not get app theme result", exc);
                    }
                    Bundle bundle = extras;
                    AccountMatchingChimeraActivity.this.m(dmmw.d(), string, bundle);
                }
            });
            bc.a(new dhlh() { // from class: dnou
                @Override // defpackage.dhlh
                public final void jX() {
                    AccountMatchingChimeraActivity.this.m(dmmw.d(), string, extras);
                }
            });
        }
        if (fwfh.c() && this.j.h()) {
            return;
        }
        l().y(new dhln() { // from class: dnoq
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                AccountMatchingChimeraActivity.this.n();
            }
        });
    }
}
