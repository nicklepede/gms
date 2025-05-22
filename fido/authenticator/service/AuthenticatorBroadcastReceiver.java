package com.google.android.gms.fido.authenticator.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.ausn;
import defpackage.bcvy;
import defpackage.bdha;
import defpackage.bdhb;
import defpackage.bdhe;
import defpackage.bdhh;
import defpackage.beov;
import defpackage.beox;
import defpackage.beoy;
import defpackage.bepa;
import defpackage.dxyi;
import defpackage.ekvi;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fqpa;
import defpackage.fqpg;
import defpackage.fqrd;
import defpackage.iic;
import defpackage.iif;
import defpackage.wwy;
import defpackage.wxf;
import defpackage.wxh;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticatorBroadcastReceiver extends TracingBroadcastReceiver {
    private static final ausn a = beov.a("AuthenticatorBroadcastReceiver");
    private final AuthenticatorChimeraService b;

    public AuthenticatorBroadcastReceiver(AuthenticatorChimeraService authenticatorChimeraService) {
        super("fido");
        this.b = authenticatorChimeraService;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        String action;
        char c;
        eqgl a2;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        ((eluo) ((eluo) a.h()).ai((char) 3779)).B("Broadcast receiver triggered: %s", intent.getAction());
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
            fqpg.a.lK().a();
            return;
        }
        if (c == 1) {
            if (fqrd.f()) {
                beoy a3 = bdhh.a(intent);
                intent.putExtra("session_id", a3.a);
                new bepa(context).z(a3, bcvy.TYPE_INVOCATION_INITIAL_V2_GCM_RECEIVED);
            }
            if (fqpa.c()) {
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
        final bdhb bdhbVar = (bdhb) ((ekvi) atomicReference.get()).f();
        int i = bdhh.a;
        beoy a4 = beoy.a(beox.HYBRID_FCM_EVENT);
        a4.b = new int[]{3};
        if (bdhbVar == null) {
            bdha bdhaVar = authenticatorChimeraService.b;
            atomicReference.set(ekvi.j(new bdhb(authenticatorChimeraService, a4)));
            bdhbVar = (bdhb) ((ekvi) atomicReference.get()).c();
        }
        bdhbVar.b(bcvy.TYPE_INVOCATION_V2_GCM_RECEIVED_BY_LINKED_HYBRID);
        bdhbVar.h = true;
        bdhbVar.f = intent.getStringExtra("caBLE.routingID") + intent.getStringExtra("caBLE.tunnelID") + intent.getStringExtra("caBLE.clientPayload");
        final Account account = null;
        try {
            Context context2 = bdhbVar.b;
            ekww a5 = ekxd.a(new wxf());
            dxyi.f(context2);
            Account[] a6 = wxh.a(context2, new wwy(context2), a5);
            if (a6 != null && a6.length != 0) {
                account = a6[0];
            }
        } catch (RemoteException | asxb | asxc e) {
            ((eluo) ((eluo) ((eluo) bdhb.a.j()).s(e)).ai((char) 3764)).x("Error listing Google accounts on device.");
        }
        if (account == null) {
            ((eluo) ((eluo) bdhb.a.j()).ai((char) 3776)).x("No account found on the device");
            a2 = eqgc.i(5);
        } else {
            a2 = iif.a(new iic() { // from class: bdgs
                @Override // defpackage.iic
                public final Object a(iia iiaVar) {
                    bdhb bdhbVar2 = bdhb.this;
                    bdhbVar2.c(new bdhp(bdhbVar2.b, bdhbVar2.c, account.name, 2), new bdgt(bdhbVar2, iiaVar));
                    return "Start linked hybrid";
                }
            });
        }
        eqgc.t(a2, new bdhe(authenticatorChimeraService), eqex.a);
    }
}
