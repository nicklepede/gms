package com.google.android.gms.fido.authenticator.service.cablev2;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.ausn;
import defpackage.bcvy;
import defpackage.bdhh;
import defpackage.bdno;
import defpackage.beov;
import defpackage.beoy;
import defpackage.bepa;
import defpackage.eluo;
import defpackage.emgt;
import defpackage.eqbm;
import defpackage.euzk;
import defpackage.euzo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgrt;
import defpackage.fgsd;
import defpackage.fqpa;
import defpackage.fqrd;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    private static final ausn a = beov.a("GcmReceiverService");

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
    }

    private static final void b(Context context, beoy beoyVar, bcvy bcvyVar) {
        new bepa(context).z(beoyVar, bcvyVar);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        if (intent.hasExtra("caBLE.routingID") && intent.hasExtra("caBLE.tunnelID") && intent.hasExtra("caBLE.clientPayload")) {
            ((eluo) ((eluo) a.h()).ai((char) 3788)).x("GCM message received, triggering Hybrid FCM Event");
            Intent action = new Intent().setAction("com.google.android.gms.fido.hybrid.FCM");
            action.setPackage("com.google.android.gms");
            action.putExtra("caBLE.routingID", intent.getStringExtra("caBLE.routingID"));
            action.putExtra("caBLE.tunnelID", intent.getStringExtra("caBLE.tunnelID"));
            action.putExtra("caBLE.clientPayload", intent.getStringExtra("caBLE.clientPayload"));
            sendBroadcast(action);
            return;
        }
        if (fqpa.c()) {
            ((eluo) ((eluo) a.h()).ai((char) 3787)).x("GCM message received, triggering caBLEv2 handling...");
            Intent action2 = new Intent().setAction("com.google.android.gms.fido.AUTHENTICATOR.V2");
            action2.setPackage("com.google.android.gms");
            if (fqrd.f()) {
                beoy a2 = bdhh.a(intent);
                action2.putExtra("session_id", a2.a);
                b(getApplicationContext(), a2, bcvy.TYPE_INVOCATION_FIRST_V2_GCM_RECEIVED);
                if (bdno.d(a2)) {
                    b(getApplicationContext(), a2, bcvy.TYPE_INVOCATION_FIRST_V2_GCM_RECEIVED_WITH_NATIVE_HYBRID);
                }
            }
            action2.putExtra("version", intent.getStringExtra("version"));
            action2.putExtra("chrome_key_material", intent.getStringExtra("chrome_key_material"));
            String stringExtra = intent.getStringExtra("experiments");
            ausn ausnVar = bdno.a;
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(stringExtra)) {
                byte[] p = emgt.d.p(stringExtra);
                try {
                    fgri y = fgri.y(euzo.b, p, 0, p.length, fgqp.a());
                    fgri.M(y);
                    euzo euzoVar = (euzo) y;
                    if (euzoVar.c.size() > 0) {
                        Iterator<E> it = new fgrt(euzoVar.c, euzo.a).iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((euzk) it.next()).f));
                        }
                    }
                } catch (fgsd e) {
                    ((eluo) ((eluo) bdno.a.j()).s(e)).x("Failed to parse the experimentIds from byte array");
                }
            }
            action2.putExtra("experiment_id_list", eqbm.m(arrayList));
            action2.putExtra("client_eid", intent.getStringExtra("client_eid"));
            sendBroadcast(action2);
        }
    }
}
