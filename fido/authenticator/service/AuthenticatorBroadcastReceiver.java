package com.google.android.gms.fido.authenticator.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aqum;
import defpackage.aqun;
import defpackage.asot;
import defpackage.basc;
import defpackage.bbdd;
import defpackage.bbde;
import defpackage.bbdh;
import defpackage.bbdk;
import defpackage.bcni;
import defpackage.bcnk;
import defpackage.bcnl;
import defpackage.bcnn;
import defpackage.dvni;
import defpackage.eiid;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fnwy;
import defpackage.fnxe;
import defpackage.fnzb;
import defpackage.igm;
import defpackage.igp;
import defpackage.vay;
import defpackage.vbf;
import defpackage.vbh;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticatorBroadcastReceiver extends TracingBroadcastReceiver {
    private static final asot a = bcni.a("AuthenticatorBroadcastReceiver");
    private final AuthenticatorChimeraService b;

    public AuthenticatorBroadcastReceiver(AuthenticatorChimeraService authenticatorChimeraService) {
        super("fido");
        this.b = authenticatorChimeraService;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        String action;
        char c;
        enss a2;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 3773)).B("Broadcast receiver triggered: %s", intent.getAction());
        int hashCode = action.hashCode();
        if (hashCode == -1547868113) {
            if (action.equals("com.google.android.gms.fido.AUTHENTICATOR.V2")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 634196310) {
            if (hashCode == 1740800315 && action.equals("com.google.android.gms.fido.AUTHENTICATOR")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.fido.hybrid.FCM")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            fnxe.a.a().a();
            return;
        }
        if (c == 1) {
            if (fnzb.f()) {
                bcnl a3 = bbdk.a(intent);
                intent.putExtra("session_id", a3.a);
                new bcnn(context).z(a3, basc.TYPE_INVOCATION_INITIAL_V2_GCM_RECEIVED);
            }
            if (fnwy.c()) {
                this.b.a(intent);
                return;
            }
            return;
        }
        if (c != 2) {
            return;
        }
        AuthenticatorChimeraService authenticatorChimeraService = this.b;
        AtomicReference atomicReference = authenticatorChimeraService.d;
        final bbde bbdeVar = (bbde) ((eiid) atomicReference.get()).f();
        int i = bbdk.a;
        bcnl a4 = bcnl.a(bcnk.HYBRID_FCM_EVENT);
        a4.b = new int[]{3};
        if (bbdeVar == null) {
            bbdd bbddVar = authenticatorChimeraService.b;
            atomicReference.set(eiid.j(new bbde(authenticatorChimeraService, a4)));
            bbdeVar = (bbde) ((eiid) atomicReference.get()).c();
        }
        bbdeVar.b(basc.TYPE_INVOCATION_V2_GCM_RECEIVED_BY_LINKED_HYBRID);
        bbdeVar.h = true;
        bbdeVar.f = intent.getStringExtra("caBLE.routingID") + intent.getStringExtra("caBLE.tunnelID") + intent.getStringExtra("caBLE.clientPayload");
        final Account account = null;
        try {
            Context context2 = bbdeVar.b;
            eijr a5 = eijy.a(new vbf());
            dvni.f(context2);
            Account[] a6 = vbh.a(context2, new vay(context2), a5);
            if (a6 != null && a6.length != 0) {
                account = a6[0];
            }
        } catch (RemoteException | aqum | aqun e) {
            ((ejhf) ((ejhf) ((ejhf) bbde.a.j()).s(e)).ah((char) 3758)).x("Error listing Google accounts on device.");
        }
        if (account == null) {
            ((ejhf) ((ejhf) bbde.a.j()).ah((char) 3770)).x("No account found on the device");
            a2 = ensj.i(5);
        } else {
            a2 = igp.a(new igm() { // from class: bbcv
                @Override // defpackage.igm
                public final Object a(igk igkVar) {
                    bbde bbdeVar2 = bbde.this;
                    bbdeVar2.c(new bbds(bbdeVar2.b, bbdeVar2.c, account.name, 2), new bbcw(bbdeVar2, igkVar));
                    return "Start linked hybrid";
                }
            });
        }
        ensj.t(a2, new bbdh(authenticatorChimeraService), enre.a);
    }
}
