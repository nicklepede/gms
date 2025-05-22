package com.google.android.gms.fido.authenticator.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.fido.authenticator.service.AuthenticatorChimeraService;
import defpackage.ausn;
import defpackage.bcvy;
import defpackage.bdha;
import defpackage.bdhb;
import defpackage.bdhd;
import defpackage.bdhh;
import defpackage.beov;
import defpackage.beoy;
import defpackage.bepa;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fqrd;
import defpackage.iic;
import defpackage.iif;
import defpackage.ind;
import j$.util.Objects;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticatorChimeraService extends Service {
    public static final ausn a = beov.a("AuthenticatorChimeraService");
    public final bdha b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final AtomicReference e;
    private AuthenticatorBroadcastReceiver f;

    public AuthenticatorChimeraService() {
        this(new bdha());
    }

    private final void b() {
        ((eluo) ((eluo) a.h()).ai((char) 3786)).x("Unregistered the broadcast receiver");
        AuthenticatorBroadcastReceiver authenticatorBroadcastReceiver = this.f;
        if (authenticatorBroadcastReceiver == null) {
            return;
        }
        unregisterReceiver(authenticatorBroadcastReceiver);
        this.f = null;
    }

    public final void a(final Intent intent) {
        final beoy a2 = bdhh.a(intent);
        AtomicReference atomicReference = this.c;
        bdhb bdhbVar = (bdhb) ((ekvi) atomicReference.get()).f();
        if (bdhbVar != null) {
            ((eluo) ((eluo) a.h()).ai((char) 3784)).x("Canceling the ongoing authenticator session..");
            if (fqrd.f()) {
                new bepa(this).z(a2, bcvy.TYPE_TIMEOUT_CANCEL_PREVIOUS_INVOCATION);
            }
            this.e.set(ekvi.j(intent));
            bdhbVar.a();
            return;
        }
        ((eluo) ((eluo) a.h()).ai((char) 3785)).x("Starting a new authenticator session for caBLE v2.");
        atomicReference.set(ekvi.j(new bdhb(this, a2)));
        final bdhb bdhbVar2 = (bdhb) ((ekvi) atomicReference.get()).c();
        bdhbVar2.b(bcvy.TYPE_INVOCATION_V2_GCM_RECEIVED);
        ((eluo) ((eluo) bdhb.a.h()).ai((char) 3766)).x("Starting caBLE v2 GCM message validation stage.");
        eqgl a3 = iif.a(new iic() { // from class: bdgr
            @Override // defpackage.iic
            public final Object a(iia iiaVar) {
                bdhb bdhbVar3 = bdhb.this;
                bdgu bdguVar = new bdgu(bdhbVar3, iiaVar);
                final bdhv bdhvVar = new bdhv(bdhbVar3.b, bdhbVar3.c, intent);
                Integer num = 9;
                num.getClass();
                if (bdhbVar3.d(9, bdguVar)) {
                    return "Start caBLE v2";
                }
                ((eluo) ((eluo) bdhb.a.h()).ai((char) 3768)).x("Starting caBLE v2 GCM message validation stage.");
                bdhbVar3.d = bdhvVar;
                eqgc.t(iif.a(new iic() { // from class: bdhq
                    @Override // defpackage.iic
                    public final Object a(iia iiaVar2) {
                        eqgl i;
                        eqgl f;
                        eqgl a4;
                        Objects.requireNonNull(iiaVar2);
                        bdhr bdhrVar = new bdhr(iiaVar2);
                        bdhv bdhvVar2 = bdhv.this;
                        Intent intent2 = bdhvVar2.c;
                        String stringExtra = intent2.getStringExtra("version");
                        if (ekvk.c(stringExtra)) {
                            bdhvVar2.b(bcvy.TYPE_CABLE_V2_GCM_MESSAGE_MISS_VERSION);
                        } else if (Integer.parseInt(stringExtra) > 1) {
                            bdhvVar2.b(bcvy.TYPE_CABLE_V2_GCM_MESSAGE_VERSION_INVALID);
                        } else {
                            bdhvVar2.b(bcvy.TYPE_CABLE_V2_GCM_MESSAGE_VERSION_VALID);
                            if (!ekvk.c(intent2.getStringExtra("chrome_key_material"))) {
                                bdhvVar2.b(bcvy.TYPE_CABLE_V2_GCM_MESSAGE_KEY_MATERIAL_RECEIVED);
                                ekvi a5 = bdhf.a(bdhvVar2.a);
                                if (!a5.h()) {
                                    bdhvVar2.b(bcvy.TYPE_CABLE_V2_CHROME_VERSION_NOT_SUPPORTED);
                                    bdhrVar.a(ektg.a);
                                    return "Execute caBLE v2 GCM message validate stage.";
                                }
                                String stringExtra2 = intent2.getStringExtra("client_eid");
                                if (ekvk.c(stringExtra2)) {
                                    f = eqgc.i(ektg.a);
                                } else {
                                    final byte[] p = emgt.d.p(stringExtra2);
                                    bdhj bdhjVar = bdhvVar2.b;
                                    ((eluo) bdhj.a.h()).B("Attempting to resolve clientEid: %s", Arrays.toString(p));
                                    try {
                                        Context context = bdhjVar.b;
                                        ekww a6 = ekxd.a(new wxf());
                                        dxyi.f(context);
                                        Account[] a7 = wxh.a(context, new wwy(context), a6);
                                        if (a7 == null || (a7.length) == 0) {
                                            ((eluo) bdhj.a.h()).x("No accounts signed in.");
                                            i = eqgc.i(ektg.a);
                                        } else {
                                            final ArrayList arrayList = new ArrayList();
                                            for (Account account : a7) {
                                                bdhk bdhkVar = bdhjVar.c;
                                                eqgl a8 = bdhkVar.a(p, account, bdoo.SOFTWARE_KEY, "fido:android_software_key");
                                                if (a8 != null) {
                                                    arrayList.add(a8);
                                                }
                                                if (fqpm.e() && (a4 = bdhkVar.a(p, account, bdoo.STRONGBOX_KEY, "fido:android_strongbox_key")) != null) {
                                                    arrayList.add(a4);
                                                }
                                                if (fqpm.c()) {
                                                    ((eluo) bdhj.a.h()).B("Checking corp key for account: %s", account.name);
                                                    eqgl a9 = bdhkVar.a(p, account, bdoo.STRONGBOX_KEY, "fido:android_corp_strongbox_key");
                                                    if (a9 != null) {
                                                        arrayList.add(a9);
                                                    }
                                                }
                                            }
                                            i = eqgc.a(arrayList).a(new Callable() { // from class: bdhi
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    bdod bdodVar;
                                                    ausn ausnVar = bdhj.a;
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        try {
                                                            bdodVar = (bdod) eqgc.r((eqgl) it.next());
                                                        } catch (ExecutionException e) {
                                                            ((eluo) ((eluo) bdhj.a.j()).s(e)).x("Error using v2 credentials.");
                                                            bdodVar = null;
                                                        }
                                                        if (bdodVar != null) {
                                                            if (MessageDigest.isEqual(bdodVar.a, p)) {
                                                                ((eluo) bdhj.a.h()).B("Matched clientEid for account: %s", bdodVar.b);
                                                                return ekvi.j(bdodVar);
                                                            }
                                                        }
                                                    }
                                                    return ektg.a;
                                                }
                                            }, eqex.a);
                                        }
                                    } catch (RemoteException | asxb | asxc e) {
                                        ((eluo) ((eluo) bdhj.a.j()).s(e)).x("Error listing Google accounts on device.");
                                        i = eqgc.i(ektg.a);
                                    }
                                    f = eqdl.f(i, new ekut() { // from class: bdhs
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj) {
                                            ekvi ekviVar = (ekvi) obj;
                                            int i2 = bdhv.d;
                                            return ekviVar.h() ? ekvi.j(((bdod) ekviVar.c()).b) : ektg.a;
                                        }
                                    }, eqex.a);
                                }
                                eqgc.t(f, new bdht(bdhvVar2, bdhrVar, a5), eqex.a);
                                return "Execute caBLE v2 GCM message validate stage.";
                            }
                            bdhvVar2.b(bcvy.TYPE_CABLE_V2_GCM_MESSAGE_MISS_KEY_MATERIAL);
                        }
                        bdhrVar.a(ektg.a);
                        return "Execute caBLE v2 GCM message validate stage.";
                    }
                }), new bdgv(bdhbVar3, bdguVar), eqex.a);
                return "Start caBLE v2";
            }
        });
        bdhd bdhdVar = new bdhd(this);
        eqex eqexVar = eqex.a;
        eqgc.t(a3, bdhdVar, eqexVar);
        a3.hD(new Runnable() { // from class: bdhc
            @Override // java.lang.Runnable
            public final void run() {
                AuthenticatorChimeraService authenticatorChimeraService = AuthenticatorChimeraService.this;
                AtomicReference atomicReference2 = authenticatorChimeraService.e;
                Intent intent2 = (Intent) ((ekvi) atomicReference2.get()).f();
                atomicReference2.set(ektg.a);
                if (intent2 != null) {
                    if (fqrd.f()) {
                        new bepa(authenticatorChimeraService).z(a2, bcvy.TYPE_INVOCATION_V2_BUSY_RETRY);
                    }
                    authenticatorChimeraService.a(intent2);
                }
            }
        }, eqexVar);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.e.set(ektg.a);
        AtomicReference atomicReference = this.c;
        if (((ekvi) atomicReference.get()).h()) {
            ((bdhb) ((ekvi) atomicReference.get()).c()).a();
        }
        b();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        b();
        if (this.f != null) {
            return 1;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.fido.AUTHENTICATOR");
        intentFilter.addAction("com.google.android.gms.fido.AUTHENTICATOR.V2");
        intentFilter.addAction("com.google.android.gms.fido.hybrid.FCM");
        AuthenticatorBroadcastReceiver authenticatorBroadcastReceiver = new AuthenticatorBroadcastReceiver(this);
        this.f = authenticatorBroadcastReceiver;
        ind.b(this, authenticatorBroadcastReceiver, intentFilter, 2);
        return 1;
    }

    public AuthenticatorChimeraService(bdha bdhaVar) {
        this.b = bdhaVar;
        ektg ektgVar = ektg.a;
        this.c = new AtomicReference(ektgVar);
        this.d = new AtomicReference(ektgVar);
        this.e = new AtomicReference(ektgVar);
    }
}
