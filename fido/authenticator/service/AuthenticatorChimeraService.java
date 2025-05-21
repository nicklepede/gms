package com.google.android.gms.fido.authenticator.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.fido.authenticator.service.AuthenticatorChimeraService;
import defpackage.asot;
import defpackage.basc;
import defpackage.bbdd;
import defpackage.bbde;
import defpackage.bbdg;
import defpackage.bbdk;
import defpackage.bcni;
import defpackage.bcnl;
import defpackage.bcnn;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fnzb;
import defpackage.igm;
import defpackage.igp;
import defpackage.iln;
import j$.util.Objects;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticatorChimeraService extends Service {
    public static final asot a = bcni.a("AuthenticatorChimeraService");
    public final bbdd b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final AtomicReference e;
    private AuthenticatorBroadcastReceiver f;

    public AuthenticatorChimeraService() {
        this(new bbdd());
    }

    private final void b() {
        ((ejhf) ((ejhf) a.h()).ah((char) 3780)).x("Unregistered the broadcast receiver");
        AuthenticatorBroadcastReceiver authenticatorBroadcastReceiver = this.f;
        if (authenticatorBroadcastReceiver == null) {
            return;
        }
        unregisterReceiver(authenticatorBroadcastReceiver);
        this.f = null;
    }

    public final void a(final Intent intent) {
        final bcnl a2 = bbdk.a(intent);
        AtomicReference atomicReference = this.c;
        bbde bbdeVar = (bbde) ((eiid) atomicReference.get()).f();
        if (bbdeVar != null) {
            ((ejhf) ((ejhf) a.h()).ah((char) 3778)).x("Canceling the ongoing authenticator session..");
            if (fnzb.f()) {
                new bcnn(this).z(a2, basc.TYPE_TIMEOUT_CANCEL_PREVIOUS_INVOCATION);
            }
            this.e.set(eiid.j(intent));
            bbdeVar.a();
            return;
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 3779)).x("Starting a new authenticator session for caBLE v2.");
        atomicReference.set(eiid.j(new bbde(this, a2)));
        final bbde bbdeVar2 = (bbde) ((eiid) atomicReference.get()).c();
        bbdeVar2.b(basc.TYPE_INVOCATION_V2_GCM_RECEIVED);
        ((ejhf) ((ejhf) bbde.a.h()).ah((char) 3760)).x("Starting caBLE v2 GCM message validation stage.");
        enss a3 = igp.a(new igm() { // from class: bbcu
            @Override // defpackage.igm
            public final Object a(igk igkVar) {
                bbde bbdeVar3 = bbde.this;
                bbcx bbcxVar = new bbcx(bbdeVar3, igkVar);
                final bbdy bbdyVar = new bbdy(bbdeVar3.b, bbdeVar3.c, intent);
                Integer num = 9;
                num.getClass();
                if (bbdeVar3.d(9, bbcxVar)) {
                    return "Start caBLE v2";
                }
                ((ejhf) ((ejhf) bbde.a.h()).ah((char) 3762)).x("Starting caBLE v2 GCM message validation stage.");
                bbdeVar3.d = bbdyVar;
                ensj.t(igp.a(new igm() { // from class: bbdt
                    @Override // defpackage.igm
                    public final Object a(igk igkVar2) {
                        enss i;
                        enss f;
                        enss a4;
                        Objects.requireNonNull(igkVar2);
                        bbdu bbduVar = new bbdu(igkVar2);
                        bbdy bbdyVar2 = bbdy.this;
                        Intent intent2 = bbdyVar2.c;
                        String stringExtra = intent2.getStringExtra("version");
                        if (eiif.c(stringExtra)) {
                            bbdyVar2.b(basc.TYPE_CABLE_V2_GCM_MESSAGE_MISS_VERSION);
                        } else if (Integer.parseInt(stringExtra) > 1) {
                            bbdyVar2.b(basc.TYPE_CABLE_V2_GCM_MESSAGE_VERSION_INVALID);
                        } else {
                            bbdyVar2.b(basc.TYPE_CABLE_V2_GCM_MESSAGE_VERSION_VALID);
                            if (!eiif.c(intent2.getStringExtra("chrome_key_material"))) {
                                bbdyVar2.b(basc.TYPE_CABLE_V2_GCM_MESSAGE_KEY_MATERIAL_RECEIVED);
                                eiid a5 = bbdi.a(bbdyVar2.a);
                                if (!a5.h()) {
                                    bbdyVar2.b(basc.TYPE_CABLE_V2_CHROME_VERSION_NOT_SUPPORTED);
                                    bbduVar.a(eigb.a);
                                    return "Execute caBLE v2 GCM message validate stage.";
                                }
                                String stringExtra2 = intent2.getStringExtra("client_eid");
                                if (eiif.c(stringExtra2)) {
                                    f = ensj.i(eigb.a);
                                } else {
                                    final byte[] p = ejtk.d.p(stringExtra2);
                                    bbdm bbdmVar = bbdyVar2.b;
                                    ((ejhf) bbdm.a.h()).B("Attempting to resolve clientEid: %s", Arrays.toString(p));
                                    try {
                                        Context context = bbdmVar.b;
                                        eijr a6 = eijy.a(new vbf());
                                        dvni.f(context);
                                        Account[] a7 = vbh.a(context, new vay(context), a6);
                                        if (a7 == null || (a7.length) == 0) {
                                            ((ejhf) bbdm.a.h()).x("No accounts signed in.");
                                            i = ensj.i(eigb.a);
                                        } else {
                                            final ArrayList arrayList = new ArrayList();
                                            for (Account account : a7) {
                                                bbdn bbdnVar = bbdmVar.c;
                                                enss a8 = bbdnVar.a(p, account, bbkx.SOFTWARE_KEY, "fido:android_software_key");
                                                if (a8 != null) {
                                                    arrayList.add(a8);
                                                }
                                                if (fnxk.e() && (a4 = bbdnVar.a(p, account, bbkx.STRONGBOX_KEY, "fido:android_strongbox_key")) != null) {
                                                    arrayList.add(a4);
                                                }
                                                if (fnxk.c()) {
                                                    ((ejhf) bbdm.a.h()).B("Checking corp key for account: %s", account.name);
                                                    enss a9 = bbdnVar.a(p, account, bbkx.STRONGBOX_KEY, "fido:android_corp_strongbox_key");
                                                    if (a9 != null) {
                                                        arrayList.add(a9);
                                                    }
                                                }
                                            }
                                            i = ensj.a(arrayList).a(new Callable() { // from class: bbdl
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    bbkj bbkjVar;
                                                    asot asotVar = bbdm.a;
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        try {
                                                            bbkjVar = (bbkj) ensj.r((enss) it.next());
                                                        } catch (ExecutionException e) {
                                                            ((ejhf) ((ejhf) bbdm.a.j()).s(e)).x("Error using v2 credentials.");
                                                            bbkjVar = null;
                                                        }
                                                        if (bbkjVar != null) {
                                                            if (MessageDigest.isEqual(bbkjVar.b, p)) {
                                                                ((ejhf) bbdm.a.h()).B("Matched clientEid for account: %s", bbkjVar.f);
                                                                return eiid.j(bbkjVar);
                                                            }
                                                        }
                                                    }
                                                    return eigb.a;
                                                }
                                            }, enre.a);
                                        }
                                    } catch (RemoteException | aqum | aqun e) {
                                        ((ejhf) ((ejhf) bbdm.a.j()).s(e)).x("Error listing Google accounts on device.");
                                        i = ensj.i(eigb.a);
                                    }
                                    f = enps.f(i, new eiho() { // from class: bbdv
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj) {
                                            eiid eiidVar = (eiid) obj;
                                            int i2 = bbdy.d;
                                            return eiidVar.h() ? eiid.j(((bbkj) eiidVar.c()).f) : eigb.a;
                                        }
                                    }, enre.a);
                                }
                                ensj.t(f, new bbdw(bbdyVar2, bbduVar, a5), enre.a);
                                return "Execute caBLE v2 GCM message validate stage.";
                            }
                            bbdyVar2.b(basc.TYPE_CABLE_V2_GCM_MESSAGE_MISS_KEY_MATERIAL);
                        }
                        bbduVar.a(eigb.a);
                        return "Execute caBLE v2 GCM message validate stage.";
                    }
                }), new bbcy(bbdeVar3, bbcxVar), enre.a);
                return "Start caBLE v2";
            }
        });
        bbdg bbdgVar = new bbdg(this);
        enre enreVar = enre.a;
        ensj.t(a3, bbdgVar, enreVar);
        a3.hn(new Runnable() { // from class: bbdf
            @Override // java.lang.Runnable
            public final void run() {
                AuthenticatorChimeraService authenticatorChimeraService = AuthenticatorChimeraService.this;
                AtomicReference atomicReference2 = authenticatorChimeraService.e;
                Intent intent2 = (Intent) ((eiid) atomicReference2.get()).f();
                atomicReference2.set(eigb.a);
                if (intent2 != null) {
                    if (fnzb.f()) {
                        new bcnn(authenticatorChimeraService).z(a2, basc.TYPE_INVOCATION_V2_BUSY_RETRY);
                    }
                    authenticatorChimeraService.a(intent2);
                }
            }
        }, enreVar);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.e.set(eigb.a);
        AtomicReference atomicReference = this.c;
        if (((eiid) atomicReference.get()).h()) {
            ((bbde) ((eiid) atomicReference.get()).c()).a();
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
        iln.b(this, authenticatorBroadcastReceiver, intentFilter, 2);
        return 1;
    }

    public AuthenticatorChimeraService(bbdd bbddVar) {
        this.b = bbddVar;
        eigb eigbVar = eigb.a;
        this.c = new AtomicReference(eigbVar);
        this.d = new AtomicReference(eigbVar);
        this.e = new AtomicReference(eigbVar);
    }
}
