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
import defpackage.aqxo;
import defpackage.arbz;
import defpackage.arcb;
import defpackage.arcc;
import defpackage.arcm;
import defpackage.arco;
import defpackage.arwm;
import defpackage.dezt;
import defpackage.dfab;
import defpackage.dfae;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.djjq;
import defpackage.djks;
import defpackage.dkbd;
import defpackage.dkmr;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.ftjp;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class AccountMatchingChimeraActivity extends qet implements djjq {
    private aqxo k = null;
    public eiid j = eigb.a;

    public static Intent k(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingActivity");
        intent.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.FragmentTag", str);
        intent.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.DeviceAddress", str2);
        intent.putExtra("com.google.android.gms.wearable.node.accountmatching.ui.CallingPackage", str3);
        return intent;
    }

    private final dfaq o() {
        if (Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "Unregistering OnConnectionStateChangeListener for ".concat(String.valueOf(String.valueOf(this.j))));
        }
        aqxo aqxoVar = this.k;
        eiig.x(aqxoVar);
        arbz arbzVar = arcc.b(this, aqxoVar.B, "OnConnectionSetupStateChangedListener").b;
        arwm.s(arbzVar);
        dfaq iS = aqxoVar.iS(arbzVar, 0);
        iS.z(new dfak() { // from class: dldb
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                AccountMatchingChimeraActivity.this.j = eigb.a;
            }
        });
        return iS;
    }

    @Override // defpackage.djjq
    public final void a(ConnectionStateEventParcelable connectionStateEventParcelable) {
        int i = connectionStateEventParcelable.a;
        if (i < 0) {
            setResult(0);
            finish();
        } else if (i == 5 || (ftjp.a.a().e() && i == 0)) {
            setResult(-1);
            finish();
        } else if (Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", a.j(i, "[Account Matching Activity] Ignored ConnectionStateEvent: "));
        }
    }

    public final dfaq l() {
        final String stringExtra = getIntent().getStringExtra("com.google.android.gms.wearable.node.accountmatching.ui.DeviceAddress");
        if (stringExtra == null) {
            return dfbl.c(new IllegalStateException("EXTRA_DEVICE_ADDRESS is required"));
        }
        if (stringExtra.equals(this.j.f())) {
            return dfbl.d(null);
        }
        if (this.j.h()) {
            return o().d(new dezt() { // from class: dlcu
                @Override // defpackage.dezt
                public final Object a(dfaq dfaqVar) {
                    return AccountMatchingChimeraActivity.this.l();
                }
            });
        }
        if (Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "Registering OnConnectionStateChangeListener for ".concat(stringExtra));
        }
        aqxo aqxoVar = this.k;
        eiig.x(aqxoVar);
        final IntentFilter[] intentFilterArr = {dkmr.b("com.google.android.gms.wearable.CONNECTION_STATE_CHANGED", new Uri.Builder().scheme("wear").authority(stringExtra).path("connection-state").build(), 0)};
        final arcb b = arcc.b(this, aqxoVar.B, "OnConnectionSetupStateChangedListener");
        arcm arcmVar = new arcm();
        arcmVar.c = b;
        arcmVar.a = new arco() { // from class: dkhr
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                dknq dknqVar = (dknq) obj;
                dkmq dkmqVar = new dkmq((dfau) obj2);
                dkkr dkkrVar = dknqVar.f;
                dknx dknxVar = new dknx(intentFilterArr);
                dknxVar.e = b;
                dkkrVar.a(dknqVar, dkmqVar, djjq.this, dknxVar);
            }
        };
        arcmVar.b = new arco() { // from class: dkhs
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                dknq dknqVar = (dknq) obj;
                dknqVar.f.c(dknqVar, new dkmp((dfau) obj2), djjq.this);
            }
        };
        arcmVar.e = 24036;
        dfaq iP = aqxoVar.iP(arcmVar.a());
        iP.x(new dfae() { // from class: dlcv
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                AccountMatchingChimeraActivity.this.j = eiid.j(stringExtra);
            }
        });
        return iP;
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

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("Wear_AccountMatching", "[Account Matching Activity] onCreate called!");
        setContentView(R.layout.wearable_account_matching_activity);
        this.k = djks.b(this);
        if (ftjp.c()) {
            l().y(new dfah() { // from class: dlcx
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    AccountMatchingChimeraActivity.this.n();
                }
            });
        }
        getWindow().addFlags(128);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        o();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        if (Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "[Account Matching Activity] New intent arrived: ".concat(String.valueOf(String.valueOf(intent))));
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
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
        aqxo d = djks.d(this);
        String string2 = extras.getString("com.google.android.gms.wearable.node.accountmatching.ui.CallingPackage");
        if (string2 == null) {
            if (Log.isLoggable("Wear_AccountMatching", 5)) {
                Log.w("Wear_AccountMatching", "No calling package, using default theme.");
            }
            m(dkbd.d(), string, extras);
        } else {
            if (Log.isLoggable("Wear_AccountMatching", 3)) {
                Log.d("Wear_AccountMatching", "Calling package: ".concat(string2));
            }
            dfaq bd = d.bd(string2);
            bd.z(new dfak() { // from class: dlcy
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    AppTheme appTheme = (AppTheme) obj;
                    if (Log.isLoggable("Wear_AccountMatching", 3)) {
                        Log.d("Wear_AccountMatching", "Result: ".concat(String.valueOf(String.valueOf(appTheme))));
                    }
                    Bundle bundle = extras;
                    AccountMatchingChimeraActivity.this.m(appTheme, string, bundle);
                }
            });
            bd.y(new dfah() { // from class: dlcz
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    if (Log.isLoggable("Wear_AccountMatching", 5)) {
                        Log.w("Wear_AccountMatching", "Did not get app theme result", exc);
                    }
                    Bundle bundle = extras;
                    AccountMatchingChimeraActivity.this.m(dkbd.d(), string, bundle);
                }
            });
            bd.a(new dfab() { // from class: dlda
                @Override // defpackage.dfab
                public final void jH() {
                    AccountMatchingChimeraActivity.this.m(dkbd.d(), string, extras);
                }
            });
        }
        if (ftjp.c() && this.j.h()) {
            return;
        }
        l().y(new dfah() { // from class: dlcw
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                AccountMatchingChimeraActivity.this.n();
            }
        });
    }
}
