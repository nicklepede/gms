package com.google.android.gms.fido.authenticator.service.cablev2;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.asot;
import defpackage.basc;
import defpackage.bbdk;
import defpackage.bbjr;
import defpackage.bcni;
import defpackage.bcnl;
import defpackage.bcnn;
import defpackage.ejhf;
import defpackage.ejtk;
import defpackage.ennt;
import defpackage.esjx;
import defpackage.eskb;
import defpackage.febw;
import defpackage.fecp;
import defpackage.feda;
import defpackage.fedk;
import defpackage.fnwy;
import defpackage.fnzb;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    private static final asot a = bcni.a("GcmReceiverService");

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
    }

    private static final void b(Context context, bcnl bcnlVar, basc bascVar) {
        new bcnn(context).z(bcnlVar, bascVar);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        if (intent.hasExtra("caBLE.routingID") && intent.hasExtra("caBLE.tunnelID") && intent.hasExtra("caBLE.clientPayload")) {
            ((ejhf) ((ejhf) a.h()).ah((char) 3782)).x("GCM message received, triggering Hybrid FCM Event");
            Intent action = new Intent().setAction("com.google.android.gms.fido.hybrid.FCM");
            action.setPackage("com.google.android.gms");
            action.putExtra("caBLE.routingID", intent.getStringExtra("caBLE.routingID"));
            action.putExtra("caBLE.tunnelID", intent.getStringExtra("caBLE.tunnelID"));
            action.putExtra("caBLE.clientPayload", intent.getStringExtra("caBLE.clientPayload"));
            sendBroadcast(action);
            return;
        }
        if (fnwy.c()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 3781)).x("GCM message received, triggering caBLEv2 handling...");
            Intent action2 = new Intent().setAction("com.google.android.gms.fido.AUTHENTICATOR.V2");
            action2.setPackage("com.google.android.gms");
            if (fnzb.f()) {
                bcnl a2 = bbdk.a(intent);
                action2.putExtra("session_id", a2.a);
                b(getApplicationContext(), a2, basc.TYPE_INVOCATION_FIRST_V2_GCM_RECEIVED);
                if (bbjr.d(a2)) {
                    b(getApplicationContext(), a2, basc.TYPE_INVOCATION_FIRST_V2_GCM_RECEIVED_WITH_NATIVE_HYBRID);
                }
            }
            action2.putExtra("version", intent.getStringExtra("version"));
            action2.putExtra("chrome_key_material", intent.getStringExtra("chrome_key_material"));
            String stringExtra = intent.getStringExtra("experiments");
            asot asotVar = bbjr.a;
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(stringExtra)) {
                byte[] p = ejtk.d.p(stringExtra);
                try {
                    fecp y = fecp.y(eskb.b, p, 0, p.length, febw.a());
                    fecp.M(y);
                    eskb eskbVar = (eskb) y;
                    if (eskbVar.c.size() > 0) {
                        Iterator<E> it = new feda(eskbVar.c, eskb.a).iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((esjx) it.next()).f));
                        }
                    }
                } catch (fedk e) {
                    ((ejhf) ((ejhf) bbjr.a.j()).s(e)).x("Failed to parse the experimentIds from byte array");
                }
            }
            action2.putExtra("experiment_id_list", ennt.m(arrayList));
            action2.putExtra("client_eid", intent.getStringExtra("client_eid"));
            sendBroadcast(action2);
        }
    }
}
