package com.google.android.gms.fido.fido2.pollux;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aqum;
import defpackage.aqun;
import defpackage.bbbn;
import defpackage.bbbp;
import defpackage.bbcd;
import defpackage.bbkj;
import defpackage.bbkk;
import defpackage.bbku;
import defpackage.bbkw;
import defpackage.bbky;
import defpackage.bbnb;
import defpackage.bbnh;
import defpackage.bbzj;
import defpackage.bbzl;
import defpackage.bcaa;
import defpackage.bcac;
import defpackage.bcaj;
import defpackage.bcay;
import defpackage.bcnj;
import defpackage.bcnk;
import defpackage.bcnl;
import defpackage.bcoc;
import defpackage.bcod;
import defpackage.dvni;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejfh;
import defpackage.esjt;
import defpackage.esju;
import defpackage.esjv;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.iln;
import defpackage.vay;
import defpackage.vbf;
import defpackage.vbh;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CableAuthenticatorChimeraService extends Service {
    public static final bcnj a = new bcnj("CableAuthenticatorChimeraService");
    public final Context b;
    public final bcod c;
    public final Set d;
    public final bbcd e;
    public bcac f;
    private BroadcastReceiver g;

    public CableAuthenticatorChimeraService() {
        this.b = this;
        this.e = new bbcd();
        this.c = (bcod) bcod.b.b();
        this.d = DesugarCollections.synchronizedSet(new HashSet());
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context.getApplicationContext(), "com.google.android.gms.fido.fido2.pollux.CableAuthenticatorService");
    }

    private final void c() {
        if (this.g == null) {
            return;
        }
        a.h("Unregistering receiver.", new Object[0]);
        this.b.unregisterReceiver(this.g);
        this.g = null;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.h("onDestroy()", new Object[0]);
        this.f = null;
        c();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        bcac bcacVar;
        fedk fedkVar;
        char c;
        eiid eiidVar;
        bcnj bcnjVar = a;
        bcnjVar.d("onStartCommand() called.", new Object[0]);
        if (this.g != null) {
            c();
        }
        if (this.g == null) {
            this.g = new TracingBroadcastReceiver() { // from class: com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService.2
                @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                public final void jz(Context context, Intent intent2) {
                    eitj eitjVar;
                    int length;
                    int i3;
                    int i4;
                    int i5 = 0;
                    CableAuthenticatorChimeraService.a.h("Broadcast receiver triggered: %s", intent2.getAction());
                    CableAuthenticatorChimeraService cableAuthenticatorChimeraService = CableAuthenticatorChimeraService.this;
                    bcac bcacVar2 = cableAuthenticatorChimeraService.f;
                    if (bcacVar2 == null || !bcacVar2.g()) {
                        String action = intent2.getAction();
                        if (action.hashCode() != 1765966489 || !action.equals("com.google.android.gms.fido.CABLE_AUTHENTICATOR")) {
                            throw new IllegalArgumentException("Unknown action in Intent to start session");
                        }
                        byte[] byteArrayExtra = intent2.getByteArrayExtra("client_eid");
                        CableAuthenticatorChimeraService.a.h("Starting authentication session...", new Object[0]);
                        Context context2 = cableAuthenticatorChimeraService.b;
                        try {
                            eijr a2 = eijy.a(new vbf());
                            dvni.f(context2);
                            Account[] a3 = vbh.a(context2, new vay(context2), a2);
                            if (a3 == null || (length = a3.length) == 0) {
                                CableAuthenticatorChimeraService.a.d("No accounts signed in", new Object[0]);
                                int i6 = eitj.d;
                                eitjVar = ejcb.a;
                            } else {
                                int i7 = eitj.d;
                                eite eiteVar = new eite();
                                int i8 = 0;
                                while (i8 < length) {
                                    Account account = a3[i8];
                                    try {
                                        try {
                                            try {
                                                List a4 = cableAuthenticatorChimeraService.c.a(account.name);
                                                if (a4.isEmpty()) {
                                                    bcnj bcnjVar2 = CableAuthenticatorChimeraService.a;
                                                    i3 = i5;
                                                    try {
                                                        Object[] objArr = new Object[1];
                                                        objArr[i3] = bcnj.q(account.name);
                                                        bcnjVar2.h("Skipping account with no active caBLE credentials: %s.", objArr);
                                                    } catch (bbnh e) {
                                                        e = e;
                                                        i4 = i3;
                                                        CableAuthenticatorChimeraService.a.g("Error loading key from ESK", e, new Object[i4]);
                                                        i8++;
                                                        i5 = i4;
                                                    } catch (bcoc e2) {
                                                        e = e2;
                                                        i4 = i3;
                                                        CableAuthenticatorChimeraService.a.g("Error checking account enrollment status", e, new Object[i4]);
                                                        i8++;
                                                        i5 = i4;
                                                    }
                                                } else {
                                                    i3 = i5;
                                                }
                                                ejfh it = ((eitj) a4).iterator();
                                                while (it.hasNext()) {
                                                    bbku bbkuVar = (bbku) it.next();
                                                    bbcd bbcdVar = cableAuthenticatorChimeraService.e;
                                                    eiig.x(bbkuVar);
                                                    Map map = bbcdVar.d;
                                                    if (!map.containsKey(bbkuVar.a())) {
                                                        throw new bbnh("Unsupported type in identifier: ".concat(String.valueOf(String.valueOf(bbkuVar))));
                                                    }
                                                    try {
                                                        bbnb f = ((bbbp) map.get(bbkuVar.a())).f(bbcdVar.b.h(bbkuVar));
                                                        if (f != null) {
                                                            eiteVar.i(new bbkk(f, eiid.j(bbkuVar), account));
                                                        }
                                                    } catch (bbbn e3) {
                                                        throw new bbnh("Key does not exist", e3);
                                                    }
                                                }
                                                i4 = i3;
                                            } catch (bcoc e4) {
                                                e = e4;
                                                i3 = i5;
                                            }
                                        } catch (bbnh e5) {
                                            e = e5;
                                            i3 = i5;
                                        }
                                    } catch (bcoc e6) {
                                        e = e6;
                                        i4 = i5;
                                    }
                                    i8++;
                                    i5 = i4;
                                }
                                eitjVar = eiteVar.g();
                            }
                        } catch (RemoteException | aqum | aqun e7) {
                            CableAuthenticatorChimeraService.a.g("Error listing Google accounts on device", e7, new Object[0]);
                            int i9 = eitj.d;
                            eitjVar = ejcb.a;
                        }
                        bcaj bcajVar = new bcaj(context2, eitjVar, cableAuthenticatorChimeraService.d);
                        bcnl a5 = bcnl.a(bcnk.PAASK);
                        if (byteArrayExtra != null) {
                            a5.c = byteArrayExtra;
                        }
                        cableAuthenticatorChimeraService.f = new bcac(cableAuthenticatorChimeraService, a5, bcajVar, new bbcd(), new bbzj(cableAuthenticatorChimeraService), false, eiid.i(byteArrayExtra));
                        cableAuthenticatorChimeraService.f.c();
                    }
                }
            };
            bcnjVar.h("Registering broadcast receiver.", new Object[0]);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.fido.CABLE_AUTHENTICATOR");
            iln.b(this.b, this.g, intentFilter, 2);
        }
        if (intent != null && intent.hasExtra("cable_session_data") && intent.hasExtra("cable_feature") && intent.hasExtra("cable_client_info") && ((bcacVar = this.f) == null || !bcacVar.k || !bcacVar.g())) {
            if (bcacVar != null && bcacVar.g()) {
                bcacVar.f();
            }
            try {
                int intExtra = intent.getIntExtra("cable_feature", 0);
                c = intExtra != 0 ? intExtra != 1 ? (char) 0 : (char) 3 : (char) 2;
            } catch (fedk e) {
                e = e;
                fedkVar = e;
                a.g("Failed to extract caBLE session data for silent flow", fedkVar, new Object[0]);
                return 1;
            }
            if (c != 0 && c != 2) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("cable_session_data");
                esju esjuVar = esju.a;
                int length = byteArrayExtra.length;
                febw febwVar = febw.a;
                feep feepVar = feep.a;
                febw febwVar2 = febw.a;
                fecp y = fecp.y(esjuVar, byteArrayExtra, 0, length, febwVar2);
                fecp.M(y);
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("cable_client_info");
                fecp y2 = fecp.y(esjt.a, byteArrayExtra2, 0, byteArrayExtra2.length, febwVar2);
                fecp.M(y2);
                String str = ((esjt) y2).c;
                esjv esjvVar = ((esju) y).b;
                if (esjvVar == null) {
                    try {
                        esjvVar = esjv.a;
                    } catch (fedk e2) {
                        fedkVar = e2;
                        a.g("Failed to extract caBLE session data for silent flow", fedkVar, new Object[0]);
                        return 1;
                    }
                }
                byte[] M = esjvVar.b.M();
                byte[] M2 = esjvVar.c.M();
                byte[] M3 = esjvVar.d.M();
                byte[] M4 = esjvVar.e.M();
                try {
                    eiidVar = eiid.j(bbkw.c("google.com", new bbky(esjvVar.f.M())));
                } catch (bbnh unused) {
                    eiidVar = eigb.a;
                }
                try {
                    bcac bcacVar2 = new bcac(this, bcnl.a(bcnk.PAASK), new bcay(new bbkj(M, M2, M3, M4, eiidVar, str)), new bbcd(), new bbzl(this), true, eigb.a);
                    this.f = bcacVar2;
                    bcacVar2.c();
                } catch (fedk e3) {
                    e = e3;
                    fedkVar = e;
                    a.g("Failed to extract caBLE session data for silent flow", fedkVar, new Object[0]);
                    return 1;
                }
                return 1;
            }
        }
        return 1;
    }

    public CableAuthenticatorChimeraService(Context context, bcaa bcaaVar, bcod bcodVar, bbcd bbcdVar) {
        this.b = context;
        this.c = bcodVar;
        this.e = bbcdVar;
        this.d = DesugarCollections.synchronizedSet(new HashSet());
    }
}
